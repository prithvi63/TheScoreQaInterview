package org.prithvi.score;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.android.LaunchScreen;
import pageObjects.android.LeaguesScreen;

public class TheScoreQaTest extends BaseTest {
    @Test(dataProvider = "getData")
    public void leagueLeaderBoardTest(String targetLeague, String targetLeagueHeader) {
        LaunchScreen launch = new LaunchScreen(driver);
        launch.setUpApp();
        LeaguesScreen League = new LeaguesScreen(driver);
        League.clickLeaguesTable();
        League.chooseLeague(targetLeague);

        Assert.assertEquals(League.getLeagueHeaderText(targetLeagueHeader), "NBA");
        League.clickLeadersTable();

        Assert.assertEquals(League.getLeaderTagText(), "LEADER");
        League.goBack();

        Assert.assertEquals(League.getLeaguesSectionText(), "LEAGUES");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{"NBA Basketball", "NBA"}};
    }
}