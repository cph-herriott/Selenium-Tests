import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver; 

public class AmazonCart {

    static WebDriver driver = new ChromeDriver();

    //method to launch the browser
    public void launchChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // the link to visit
        driver.get("https://www.amazon.com/");
    }

    //method to search for item
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
    }

    public void addToCart(){
        //wait
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //click on first item in search
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        
        //wait
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //add item to cart
        driver.findElement(By.id("add-to-cart-button")).click();
        
        //wait
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //say no to protection plan
        driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input")).click();
        
    }

    public void goToCart(){

        //wait
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //xpath for close side sheet
        //driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
        //close side sheet
        driver.findElement(By.id("attach-close_sideSheet-link")).click();
        //go to cart
        driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();
        
    }


    public static void main(String[] args) {

        AmazonCart cart = new AmazonCart();
        //launch google chrome and visit amazon.com
        cart.launchChrome();
        //call search method
        cart.searchAmazon();
        //call add to cart 
        cart.addToCart();
        //call go to cart
        cart.goToCart();

        //close browser if needed
        //driver.quit();

    }
}


