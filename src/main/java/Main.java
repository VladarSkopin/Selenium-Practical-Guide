import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {
    public static void main(String[] args) {

        System.out.println("setting property...");
        System.setProperty("webdriver.gecko.driver","D:\\SeleniumProjectsQA\\geckodriver.exe");

        System.out.println("setting DesiredCapabilities...");
        DesiredCapabilities dc = new DesiredCapabilities();
        //DesiredCapabilities dc = new DesiredCapabilities().firefox();
        dc.setPlatform(Platform.ANY);
        dc.setCapability("marionatte", false);

        System.out.println("merging FirefoxOptions...");
        FirefoxOptions opt = new FirefoxOptions();
        opt.merge(dc);

        System.out.println("initializing FirefoxDriver with options...");
        WebDriver driver = new FirefoxDriver(opt);

        System.out.println("maximizing window...");
        driver.manage().window().maximize();

        System.out.println("going to google web page...");
        driver.get("https://www.google.com/");

        System.out.println("Application opened");
        System.out.println("Page Title is : "+driver.getTitle());
        //driver.quit();
    }
}

