package co.com.choucair.certification.retoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage {
    public static final Target JOIN_TODAY_BTN = Target.the("Buttons that show the login form")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
