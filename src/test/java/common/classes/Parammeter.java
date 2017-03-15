package common.classes;

import common.classes.SettingUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Danny.Krestianto on 23/02/2017.
 */
public class Parammeter extends SettingUp{

    protected WebDriverWait wait;

    public Parammeter(WebDriver driver) {
        this.wd = driver;
    }


    public void userWait(By byparameter) {
        wait = new WebDriverWait(wd, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(byparameter));
    }

    public void userClick(By byparameter) {
        userWait(byparameter);
        wd.findElement(byparameter).click();
    }

    public void userSendText(By byparameter, String text) {
        userClick(byparameter);
        wd.findElement(byparameter).clear();
        wd.findElement(byparameter).sendKeys(text);
    }
}