import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice {

    WebDriver driver;

    @BeforeMethod
  //  @Test

    void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/afmhoque/IdeaProjects/MvnShipon/drivers/chromedriver");
        driver = new ChromeDriver();

    }

    @Test
    void go_to_facebook() {
       // setup();
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());

    }

    @Test
    void go_to_the_amazon() {
       // setup();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());

    }

    @Test
    void go_to_ebay(){
        driver.get("https://eBay.com");
        System.out.println(driver.getTitle());
    }

    @Test
    void selectCatagory_on_amazo0n(){
        driver.get("https://amazon.com");
        WebElement catagories = driver.findElement(By.cssSelector("#searchDropdownBox"));
        Select select = new Select(catagories);
        select.selectByIndex(7);
    }

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();

    }

}