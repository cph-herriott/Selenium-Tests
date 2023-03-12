import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.Keys;

public class Search {
    static WebDriver driver = new ChromeDriver();

    public void launchChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // the link to visit
        driver.get("https://google.com/");
    }
    
    
    public void searchSite(){
        //sleep to allow site to load, shouldn't be necessary
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //go to search box, enter text, and search
        driver.findElement(By.name("q")).sendKeys("This is a Selenium test",Keys.ENTER);
    }

    public static void main(String[] args) {

        Search googleSearch = new Search();
        //launch google chrome and visit test site
        googleSearch.launchChrome();
        //call method
        googleSearch.searchSite();

        //close browser if needed
        //driver.quit();

    }
}