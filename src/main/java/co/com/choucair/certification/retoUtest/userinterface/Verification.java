package co.com.choucair.certification.retoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Verification {
    public static final Target VERIFICATION_BUTTON= Target.the("When do you click to go to page Last step")
            .located(By.xpath("//a[@id='laddaBtn']//span[contains(text(),'Complete Setup')]"));
}
