import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class UITesting extends ChromeRunner {
    @Test
    public void TestMethod1() throws InterruptedException {

        //Login with wrong username & pass

        $(byName("email")).setValue("iuewskjdwesdok");
        $(byName("pass")).setValue("Aa1234");
        Thread.sleep(5000);
        $(byName("login")).click();

        //Check error class visibility

        $("._9ay7").waitUntil(Condition.visible, 6000);
        String errorText = $("._9ay7").getText();
        Assert.assertEquals("The email or phone number you’ve entered doesn’t match any account. Sign up for an account.", errorText);

    }
}