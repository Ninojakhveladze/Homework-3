import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    @BeforeTest
    public static void baseURL() throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        //open facebook
        Selenide.open("https://www.facebook.com/");
    }
}
