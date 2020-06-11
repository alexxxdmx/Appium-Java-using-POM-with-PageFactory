package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private AndroidDriver driver;

    public HomePage(){

    }

    public HomePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(id = "jp.co.c_lis.ccl.morelocale:id/locale_header_tv_custom_locale")
    private AndroidElement customLocale;

    @FindBy(id = "jp.co.c_lis.ccl.morelocale:id/custom_locale_et_language")
    private AndroidElement lang;

    @FindBy(id = "jp.co.c_lis.ccl.morelocale:id/custom_locale_et_country")
    private AndroidElement country;

    @FindBy(id = "jp.co.c_lis.ccl.morelocale:id/custom_locale_btn_set")
    private AndroidElement buttonSet;

    public void tapCustomLocale(){
        customLocale.isDisplayed();
        customLocale.click();
    }

    public void inputLang(String bahasa){
        lang.isDisplayed();
        lang.clear();
        lang.sendKeys(bahasa);
    }

    public void inputCountry(String negara){
        country.isDisplayed();
        country.clear();
        country.sendKeys(negara);
    }

    public void tapSet(){
        buttonSet.isDisplayed();
        buttonSet.click();
    }
}