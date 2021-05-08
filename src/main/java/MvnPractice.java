import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MvnPractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/afmhoque/IdeaProjects/MvnShipon/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());

    }
    @Test
    void go_to_the_amazon(){

        System.setProperty("webdriver.chrome.driver","/Users/afmhoque/IdeaProjects/MvnShipon/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());


    }

}
