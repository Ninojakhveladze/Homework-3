import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;

public class UITesting{
    @Test
    public void test() throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.google.com/");
        Thread.sleep(3000);
        $(".gLFyf").setValue("Nemo").sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        closeWindow();
    }
}
