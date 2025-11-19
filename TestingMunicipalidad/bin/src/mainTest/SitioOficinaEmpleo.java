package mainTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testAutomatizacion.EmpleoFormTest;
import testAutomatizacion.EmpleoLoginTest;

public class SitioOficinaEmpleo {
	private WebDriver driver; 
    private EmpleoLoginTest EmpleoLogIn;
    
    private EmpleoFormTest Empleoform;
    
    @BeforeClass
    public void initPageFactory() {
            driver = new ChromeDriver();
            EmpleoLogIn = PageFactory.initElements(driver, EmpleoLoginTest.class);
           
    }
    
//primero tengo que encontrar el sitio  del municipio de tres arroyos 
    @Test (priority=1)
    public void loadPage() {
            driver.navigate().to("https://emprendedores.tresarroyos.gov.ar");
            String titulo = driver.getTitle();
            String expectedTitle = "Bienvenidos a la Oficina de Empleo y Capacitación de Tres Arroyos"; 
    
            System.out.println(titulo);
            System.out.println("Entre al sitio oficial de la oficina");
            //Comprobamos que realmente estamos en Spotify. Buena Practica!!!
            assertEquals(titulo, expectedTitle);
           // SPFYSearchSong.sacarCookies();
    }
    
    
    //buscar el boton de la opcion de oficina de empleo o empleo
    /*
    @Test (priority=2)
    public void clickBtnEmpleo() {
    	 System.out.print("ya estoy listo para buscar el boton de la oficina de empleo");
    }
   */ 
    
/*
    @Test (priority=3) 
    public void login() {     //cuenta de prueba para login no son reales
            EmpleoLogIn.login("adminempleo@tresarroyos.gov.ar", "AdminE016");
    }

*/
    
   /* @Test (priority=4)
     //ya lo probe y anda
    public void testFormularioEmpresa() {
    	Empleoform = new EmpleoFormTest();
        Empleoform.enviarFormularioComoEmpresa(driver);
    }
 */   
    
    
    /*
   @Test(priority = 5)
   //ya probado y funciona
public void testFormularioEmprendedor() {
	   
	   Empleoform = new EmpleoFormTest();
       Empleoform.completarFormularioComoEmprendedor(driver);
}
   */
   

@Test(priority = 6)
public void testFormularioBuscoEmpleo() {
	  Empleoform = new EmpleoFormTest();
      Empleoform.enviarFormularioComoBuscoEmpleo(driver);
}
    


}
