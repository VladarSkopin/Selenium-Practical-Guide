import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\SeleniumProjectsQA\\geckodriver.exe");

        /*
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setPlatform(Platform.ANY);
        dc.setCapability("marionatte", false);

        FirefoxOptions opt = new FirefoxOptions();
        opt.merge(dc);

        WebDriver driver = new FirefoxDriver(opt);
        */

        WebDriver driver = new FirefoxDriver();

        driver.get("https://en.wikipedia.org/wiki/Apple_Inc.");

        WebElement element = driver.findElement(By.xpath("//a[@href=\"/wiki/Cupertino,_California\"]"));
        System.out.println(element.getText());
        System.out.println(element.getAttribute("href"));

        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("Alicia is my dear Kitty!");
        //searchBox.sendKeys(Keys.chord(Keys.SHIFT, "Alicia is my dear Kitty!"));
        searchBox.sendKeys(Keys.chord(Keys.LEFT_SHIFT, "Alicia is my dear Kitty!"));
        searchBox.submit();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // clear textbox in a new window
        WebElement searchBox2 = driver.findElement(By.name("q"));
        searchBox2.clear();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        searchBox2.sendKeys("Rick and Morty", Keys.ENTER);

        String s = new String("Sasha");

    }
}
