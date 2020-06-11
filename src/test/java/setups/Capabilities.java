package setups;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    public DesiredCapabilities localAndroid(){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", "/Users/itworker/Documents/GITHUB/Appium-Java-using-POM/app/MoreLocale_2.apk");
        capabilities.setCapability("appPackage", "jp.co.c_lis.ccl.morelocale");
        capabilities.setCapability("clearSystemFiles", "true");
        capabilities.setCapability("autoGrantPermissions","true");

        return capabilities;
    }
}