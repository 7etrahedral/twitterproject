package testcasses;

import common.classes.Parammeter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created by Danny.Krestianto on 24/02/2017.
 */
public class loginSteps extends Parammeter{

    public loginSteps(WebDriver driver) {
        super(driver);
    }

    private By button = By.linkText("Log in");
    private By fieldName = By.name("session[username_or_email]");
    private String email = "dannyo_sama@yahoo.co.id";
    private By fieldPass = By.name("session[password]");
    private String pass = "twitt3r";
    private By checkbox = By.name("remember_me");
    private By click = By.xpath("//div[@class='LoginDialog-form']/form/input[1]");


    @Step("click LogIn Button")
    public void open() {
        userClick(button);
    }

    @Step("fill Name")
    public void filling1() {
        userSendText(fieldName, email);
    }

    @Step("fill Pass")
    public void filling2() {
        userSendText(fieldPass, pass);
    }

    @Step("unchecked box")
    public void unchecked() {
        userClick(checkbox);
    }

    @Step("login")
    public void loginbutton() {
        userClick(click);
    }

}
