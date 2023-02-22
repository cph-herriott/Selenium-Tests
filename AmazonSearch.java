import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; 

public class AmazonSearch {
    static WebDriver driver = new ChromeDriver();

    public void launchChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // the link to visit
        driver.get("https://www.amazon.com/");
    }

    public void searchAmazon(){
        //sleep to allow site to load, shouldn't be necessary
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //go to search box and search item
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("3090 graphics card");
        //click search button
        driver.findElement(By.id("nav-search-submit-button")).click();
        //Thread.sleep(2000);
    }

    public static void main(String[] args) {

        AmazonSearch search = new AmazonSearch();
        //launch google chrome and visit amazon.com
        search.launchChrome();
        //call search method
        search.searchAmazon();
        //close browser
        driver.quit();

    }
}
