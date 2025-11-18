package testAutomatizacion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageMunitTest {

	
	
	  @FindBy(name = "q") 
	    private WebElement q;
	    
	    @FindBy(name = "btnK") 
	    private WebElement btnK;
	    
	    private WebDriver driver;
	    
	    // Constructor
	    public SearchPageMunitTest(WebDriver driver) {
	            this.driver = driver;
	        PageFactory.initElements(this.driver, this);
	    }


	    public void buscar(String busqueda) {
	        q.sendKeys(busqueda);


	        // en caso que no cargue los elementos a tiempo habra que hacer alguna de las siguientes esperas
	        
	        // espera ocupada (faltan las exceptions)
	        //TimeUnit.SECONDS.sleep(3);
	        
	        
	        // o usamos la espera de Selenium
	        Duration time=Duration.ofMillis(8000);
	        WebDriverWait wait = new WebDriverWait(driver, time);                                                                         
	        //Esperamos a que cargue el boton                
	        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
	        element.click();
	        
	        //btnK.click();
	    }
	
	
	
}
