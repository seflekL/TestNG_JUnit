package tests.day13_TestNG_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_TestNGIlkTest {


    WebDriver driver;

    @BeforeClass

    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void test01(){

        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //phone icin arama yapin
        WebElement aramaKutusu= driver.findElement(By.xpath("//*[@id='global-search']"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin
        String unExpectedSonucYazisi = "0 Products Found";
        String actualSonucYazisi = driver.findElement(By.className("product-count-text"))
                .getText();

        Assert.assertNotEquals(unExpectedSonucYazisi,actualSonucYazisi);



    }
}
