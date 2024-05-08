package pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeaguesScreen {
    public AndroidDriver driver;
    @AndroidFindBy(xpath = "//*[@text='LEAGUES']")
    private WebElement leaguesSection;
    @AndroidFindBy(xpath = "//*[@text='LEADER']")
    private WebElement leaderTag;
    @AndroidFindBy(accessibility = "Leagues")
    private WebElement leaguesTable;
    @AndroidFindBy(accessibility = "Leaders")
    private WebElement leadersTable;
    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;
    public LeaguesScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebElement getLeague(String leagueName) {
        return driver.findElement(By.xpath("//*[@text='" + leagueName + "']"));
    }

    public WebElement getLeagueHeader(String leagueHeader) {
        return driver.findElement(By.xpath("//*[@text='" + leagueHeader + "']"));
    }

    public void clickLeaguesTable() {
        leaguesTable.click();
    }

    public void chooseLeague(String leagueName) {
        getLeague(leagueName).click();
    }

    public void clickLeadersTable() {
        leadersTable.click();
    }

    public void goBack() {
        backButton.click();
    }

    public String getLeaguesSectionText() {
        return leaguesSection.getText();
    }

    public String getLeagueHeaderText(String leagueHeader) {
        return getLeagueHeader(leagueHeader).getText();
    }

    public String getLeaderTagText() {
        return leaderTag.getText();
    }
}
