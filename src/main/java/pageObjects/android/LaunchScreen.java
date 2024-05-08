package pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LaunchScreen {
    public AndroidDriver driver;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/grant_dialog")
    private WebElement notificationPopUp;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    private WebElement dontAllowNotificationsButton;
    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_get_started")
    private WebElement getStartedButton;
    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_next")
    private WebElement nextButton;
    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_disallow")
    private WebElement mayBeLaterButton;
    @AndroidFindBy(id = "com.fivemobile.thescore:id/btn_allow")
    private WebElement doneButton;
    public LaunchScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void setUpApp() {
        if (notificationPopUp.isDisplayed()) {
            dontAllowNotificationsButton.click();
        }
        getStartedButton.click();
        nextButton.click();
        mayBeLaterButton.click();
        nextButton.click();
        doneButton.click();
    }
}
