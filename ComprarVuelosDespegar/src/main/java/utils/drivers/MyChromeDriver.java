package utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriver {

    private static ChromeOptions Options;
    private static WebDriver chromeDriver;

    public MyChromeDriver(WebDriver driver){this.chromeDriver = driver;}

    public static MyChromeDriver inicializarNavegador(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        Options = new ChromeOptions();
        Options.addArguments("--start-maximized");
        chromeDriver = new ChromeDriver(Options);
        return new MyChromeDriver(chromeDriver);
    }

    public WebDriver onUrl(String url) {chromeDriver.get(url); chromeDriver.manage().window().maximize();return chromeDriver;}
}
