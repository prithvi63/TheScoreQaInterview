package org.prithvi.score;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.time.Duration;

public abstract class BaseTest {
    static AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        ConfigUIUtil.init(
                System.getProperty("user.dir") + "/src/test/resources/local.properties");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File app = new File(new File("src/test/resources"), ConfigUIUtil.getValue("APP"));

        // Configure test device and App
        capabilities.setCapability(SupportsDeviceNameOption.DEVICE_NAME_OPTION, ConfigUIUtil.getValue("DEVICE_NAME"));
        capabilities.setCapability(SupportsAppOption.APP_OPTION, app.getAbsolutePath());
        capabilities.setCapability(SupportsFullResetOption.FULL_RESET_OPTION, ConfigUIUtil.getValue("FULL_RESET"));
        capabilities.setCapability("appPackage", "com.fivemobile.thescore");
        capabilities.setCapability("appActivity", "com.thescore.startup.activity.StartupActivity");
        capabilities.setCapability(SupportsAutomationNameOption.AUTOMATION_NAME_OPTION, ConfigUIUtil.getValue("AUTOMATION_NAME"));
        capabilities.setCapability(SupportsNewCommandTimeoutOption.NEW_COMMAND_TIMEOUT_OPTION, ConfigUIUtil.getValue("NEW_COMMAND_TIMEOUT"));

        driver = new AndroidDriver(new URL(ConfigUIUtil.getValue("URL")), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
