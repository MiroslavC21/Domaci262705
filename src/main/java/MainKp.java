import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainKp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\ITBootcamp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kupujemprodajem.com/");



        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]"));
        element1.click();// ovim smo ugasili pop up za prijavljivanje koji iskace kad odemo na stranicu
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"searchKeywordsInput\"]"));
        element2.sendKeys("iphone 13");
        element2.submit();
        WebElement element = driver.findElement(By.xpath("//*[@id='adDescription7321776']/div/section[2]/div[1]/div[1]/a"));
        element.sendKeys(Keys.ENTER);






        driver.close();

    }


}


