package src.mainTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testAutomatizacion.EmpleoLoginTest;

public class SitioOficinaEmpleo {
	private WebDriver driver; 
    private EmpleoLoginTest EmpleoLogIn;
    
    @BeforeClass
    public void initPageFactory() {
    	   ChromeOptions options = new ChromeOptions();
           options.addArguments("--disable-blink-features=AutomationControlled");

           driver = new ChromeDriver(options);
           EmpleoLogIn = PageFactory.initElements(driver, EmpleoLoginTest.class);
           driver.navigate().to("https://emprendedores.tresarroyos.gov.ar");
           String titulo = driver.getTitle();
           String expectedTitle = "Tres Arroyos"; //Bienvenidos a la Oficina de Empleo y Capacitación de 
   
           System.out.println(titulo);
           System.out.println("Entre al sitio oficial de la oficina");
           //Comprobamos que realmente estamos en el sitio esperado!!!
           assertEquals(titulo, expectedTitle);
        
        
    }
    
    
    
    
   /* @BeforeClass
    public void initPageFactory() {
            driver = new ChromeDriver();
            EmpleoLogIn = PageFactory.initElements(driver, EmpleoLoginTest.class);
           
    }
    
//primero tengo que encontrar el sitio  del municipio de tres arroyos 
    @Test (priority=1)
    public void loadPage() {
            driver.navigate().to("https://emprendedores.tresarroyos.gov.ar");
            String titulo = driver.getTitle();
            String expectedTitle = "Tres Arroyos"; //Bienvenidos a la Oficina de Empleo y Capacitación de 
    
            System.out.println(titulo);
            System.out.println("Entre al sitio oficial de la oficina");
            //Comprobamos que realmente estamos en Spotify. Buena Practica!!!
            assertEquals(titulo, expectedTitle);
           // SPFYSearchSong.sacarCookies();
    }
    */
    
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
  /* 

@Test(priority = 6)
public void testFormularioBuscoEmpleo() {
	  Empleoform = new EmpleoFormTest();
      Empleoform.enviarFormularioComoBuscoEmpleo(driver);
}
  */  
/*
 @Test(priority= 7)
 public void seccionProgramas() {
	 EmpleoLogIn.programas();
 }
 */ 
    
  /*  
    
  @Test(priority= 8)
  public void seccionNoticias() {
	  EmpleoLogIn.seccionNoticias();
  }
  
  */
  
  
  @Test (priority= 8)
  public void seccionEmprendedores() {
	  EmpleoLogIn.emprendedores();
  }
  
  
  
    
}
