import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class FbRegistration extends ChromeRunner {
    @Test
    public void Registration() throws InterruptedException {

        $("#u_0_2").click();
        Thread.sleep(3000);

        //User information
        $(byName("firstname")).setValue("Nino");
        $(byName("lastname")).setValue("Jakhveladze");
        $(byName("reg_email__")).setValue("nino.jakhveladze.1@iliauni.edu.ge");
        $(byName("reg_email_confirmation__")).setValue("nino.jakhveladze.1@iliauni.edu.ge");
        $("#password_step_input").setValue("Aa12345678");

        //Select Options
        $(byName("birthday_month")).selectOption("Sep");
        $(byName("birthday_day")).selectOption("29");
        $(byName("birthday_year")).selectOption("1995");

        //Select Gender
        $(byText("Custom")).click();

        //Check some fields visibility
        $(byName("preferred_pronoun")).shouldBe(Condition.visible);
        $(byName("custom_gender")).shouldBe(Condition.visible);
        Thread.sleep(1000);

        //Select first options by int
        $(byName("preferred_pronoun")).selectOption(1);
        Thread.sleep(2000);

        //Select Gender
        $(byText("Female")).click();
        Thread.sleep(3000);

        //Check some dissapear fields
        $(byName("preferred_pronoun")).shouldBe(Condition.disappear);
        $(byName("custom_gender")).shouldBe(Condition.disappear);


    }
}
