import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; 

public class LogIn {
    static WebDriver driver = new ChromeDriver();

    public void launchChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // the link to visit
        driver.get("https://www.saucedemo.com/");
    }
    
    
    public void logIntoSite(){
        //sleep to allow site to load, shouldn't be necessary
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //go to username box and enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //wait a bit
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //go to password box and enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click login button
        driver.findElement(By.id("login-button")).click();
    }

    public static void main(String[] args) {

        LogIn credentials = new LogIn();
        //launch google chrome and visit test site
        credentials.launchChrome();
        //call method
        credentials.logIntoSite();

        //close browser if needed
        //driver.quit();

    }
}