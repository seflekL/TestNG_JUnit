package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestOtomasyonuPage {
    /*
        Page class'i bir URL'e gidildiginde
        kullanilabilecek tum webelementleri locate edip
        kaydedecegimiz class'dir

        Page class'lari TestNG tarafindan ozel tasarlanmistir
        ve locate yaparken @FindBy kullanilir
     */

    public TestOtomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // arama kutusu
    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    // urun sonuc yazi elementi
    @FindBy(className = "product-count-text")
    public WebElement aramaSonucuElementi;

    // bulunan urunleri bir liste olarak
    @FindBy(className = "prod-img")
    public List<WebElement> bulunanUrunElementleriList;

    // ilk urune tiklandiginda urun isim elementi
    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasiIsimElementi;

    @FindBy(xpath = "(//*[text()='Account'])[1]")
    public WebElement accountLinki;

    @FindBy(id = "email")
    public WebElement loginEmailKutusu;

    @FindBy(id = "password")
    public WebElement loginPasswordKutusu;

    @FindBy(id = "submitlogin")
    public WebElement loginSignInButonu;

    @FindBy(xpath = "(//*[text()='Logout'])[2]")
    public WebElement logoutButonu;

    @FindBy(xpath = "(//*[@class='cart-count basket-count'])[1]")
    public WebElement yourCartLinki;

    @FindBy(xpath = "//button[@class='add-to-cart']")
    public WebElement urunSayfasiAddToCartButonu;

    @FindBy(xpath = "//*[@*='product-title text-center']")
    public WebElement sepettekiUrunIsimElementi;

    @FindBy (xpath = "//*[text()='0 Products Found']")
    public WebElement resultZeroProductTextElementi;





}