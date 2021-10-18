
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {
    private WebDriver driver;

    public SeleniumConfig(){
        Capabilities capabilities = DesiredCapabilities.chrome();
        driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    static {
        System.setProperty("webdriver.chrome.driver","D:\\Documentos\\Facultad\\Facultad 4°Año\\Taller Programación Avanzada\\ingSoftTP7\\bin\\chromedriver.exe");

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
