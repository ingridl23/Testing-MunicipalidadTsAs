package mainTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import gestionVehicular.GestionVehicularFormTest;

public class SearchSitioGestionVehicular {

	private WebDriver driver; 
   
    
    private GestionVehicularFormTest Gestionform;
    
    @BeforeClass
    public void initPageFactory() {
            driver = new ChromeDriver();
          Gestionform = PageFactory.initElements(driver, GestionVehicularFormTest.class);
           
    }
    
//primero tengo que encontrar el sitio  del municipio de tres arroyos 
    @Test (priority=1)
    public void loadPage() {
            driver.navigate().to("http://127.0.0.1:8000/");
            String titulo = driver.getTitle();
            String expectedTitle = "Login - Gestión Vehicular";
            System.out.println(titulo);
            System.out.println("Entre al sitio oficial de la gestion vehicular del municipio");
            //Comprobamos que realmente estamos. Buena Practica!!!
            assertEquals(titulo, expectedTitle);
           // SPFYSearchSong.sacarCookies();
    }
    
    
    //buscar el boton de la opcion de oficina de empleo o empleo
    
    @Test (priority=2)
    public void clickBtnEmpleo() {
    	 System.out.println("ya estoy listo para buscar el boton del sitio de gestion vehicular");
    }
    
 

    @Test (priority=3) 
    public void login() {     //cuenta de prueba para login de admin
    	Gestionform.login("computos@tresarroyos.gov.ar", "Computos2026");
    }
  /*
    @Test (priority=4) 
    public void vehiculos() {     //cuenta de prueba para login de admin
    	Gestionform.vehiculos();
    }
    */
    
    /*
    @Test (priority=5) 
    public void loginTrol() {
    	Gestionform.loginVengeta("computos@tresarroyos.gov.ar", "Computos2026");
    }
*/
    @Test (priority=6)
    public void apartadoVehiculos() {
    	Gestionform.SelectVehiculos();
    }
    
}
