package testcasses;

import common.classes.SettingUp;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Danny.Krestianto on 24/02/2017.
 */
@Features("login feature")

public class logIn extends SettingUp{

    private loginSteps steps;

    @Stories("As a user I want to be able to login")
    @TestCaseId("TC_TWIT_001_001")
    @Title("Verify user is able to login")
    @Test(priority = 0)
    public void logIn () throws InterruptedException {
        steps = new loginSteps(wd);
        steps.open();
        steps.filling1();
        steps.filling2();
        steps.unchecked();
        steps.loginbutton();
    }
}
