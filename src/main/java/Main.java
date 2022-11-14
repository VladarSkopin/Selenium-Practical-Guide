import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\SeleniumProjectsQA\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");
    }
}

