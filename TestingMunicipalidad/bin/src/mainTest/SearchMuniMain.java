package mainTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import testAutomatizacion.SearchPageMunitTest;

public class SearchMuniMain {
	private static WebDriver driver;
    
    public static void main(String[] args) {
                // creamos opciones para que no nos haga completar el captcha, no lo elimina por completo
            ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-blink-features=AutomationControlled");
                // creamos una instancia del driver con ciertas opciones
                driver = new ChromeDriver(options);
        driver.get("https://google.com.ar");
    
        // creamos la instancia
        SearchPageMunitTest searchPage = new SearchPageMunitTest(driver);
        // buscamos algo
        searchPage.buscar("municipalidad tres arroyos");
        // cerramos el driver
        //driver.close();
    }
}
