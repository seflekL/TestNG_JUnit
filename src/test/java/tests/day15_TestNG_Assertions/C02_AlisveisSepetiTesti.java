package tests.day15_TestNG_Assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_AlisveisSepetiTesti {

    @Test
    public void alisverisSepetiTesti(){
        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- belirlenmis arama kelimesi icin arama yapin
        TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();

        testOtomasyonuPage.aramaKutusu
                .sendKeys(ConfigReader.getProperty("toAranacakKelime") + Keys.ENTER);
        //3- Listelenen sonuclardan ilkini tiklayin
        testOtomasyonuPage.bulunanUrunElementleriList
                .get(0)
                .click();
        //4- urun ismini kaydedin
        String ilkUrunIsmi = testOtomasyonuPage.ilkUrunSayfasiIsimElementi.getText();
        ReusableMethods.getWebelementScreenshot(testOtomasyonuPage.ilkUrunSayfasiIsimElementi,"SecilenUrunIsmi");
        // ve urunu sepete ekleyin
        testOtomasyonuPage.urunSayfasiAddToCartButonu
                .click();

        //5- your cart linkine tiklayin

        testOtomasyonuPage.yourCartLinki
                .click();

        //6- kaydettiginiz urun ismi ile sepetteki urun isminin ayni oldugunu test edin
        String sepettekiUrunIsmi = testOtomasyonuPage.sepettekiUrunIsimElementi
                .getText();
        ReusableMethods.getWebelementScreenshot(testOtomasyonuPage.ilkUrunSayfasiIsimElementi,"SepettekiUrunIsmi");


        Assert.assertEquals(sepettekiUrunIsmi,ilkUrunIsmi);
        // urun ismi ile sepetteki urun ismi ayni degil
        // bug bulundu

        //7- sayfayi kapatin
        Driver.quitDriver();
    }
}