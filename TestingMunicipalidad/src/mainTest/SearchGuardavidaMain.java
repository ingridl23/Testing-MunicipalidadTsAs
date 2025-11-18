package mainTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import testAutomatizacion.Guardavidas;

public class SearchGuardavidaMain {

    private WebDriver driver;
    private Guardavidas guardavidaLogin;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        driver = new ChromeDriver(options);
       // driver.get("https://gestion-guardavidas.tresarroyos.gov.ar");
          driver.get("http://127.0.0.1:8000");
        // Instancia del Page Object
        guardavidaLogin = new Guardavidas(driver);
    }

  

    @Test(priority = 1)
    public void login() {
        System.out.println("Listo para hacer login e iniciar sesión");
       guardavidaLogin.login("guardavida@gmail.com", "123456789");
    }
    
   
    @Test (priority = 2)
    public void listadoGuardavidas() {
    	guardavidaLogin.listarTodos();
    }
    
    @Test (priority = 3)
    
    public void listadoAsistencias() {
    	guardavidaLogin.listadoAsistencias();
    }
    
  
    @Test (priority = 4)
    
    public void listadoTurnos() {
    	guardavidaLogin.listadoTurnos();
    }
    
    
    /*
    @Test (priority = 5)
    
    public void novedadMateriales() {
    	guardavidaLogin.materiales();
    }
    */
    
    @Test (priority = 6)
    
    public void intervenciones() {
    	guardavidaLogin.intervenciones();
    }
    
    @Test (priority = 7)
    	public void seccionBanderas() {
    		guardavidaLogin.banderas();
    	}
    	
    
   @Test (priority = 8)
    
    public void miPerfil() {
    	guardavidaLogin.profile();
    }
  
   
    @Test (priority = 9)
    
    public void misAsistencias() {
    	guardavidaLogin.miListadoAsistencias();
    }
    
    /*
    @Test (priority = 10)
    
    public void descargarGuardavidas() {
    	guardavidaLogin.descargarExcelGuardavidas();
    	
    }
    */
    /*
    @Test (priority = 11)
                  //tambien descarga licencias en el mismo excel
    public void descargarAsistencias() {
    	guardavidaLogin.descargarAsistencias();
    }
    */
    
    //cargar un guardavida
    /*
    @Test (priority =12)
    
    public void updateGuardavida() {
    	guardavidaLogin.updateGuardavida();
    }*/
    
    
    
    
    /*
    //ver estado del mar y bandera listado
    @Test (priority=13)
    public void  listStatusMaryBandera() {
    	guardavidaLogin.listadoBanderasyEstadomar();
    }
    */
    /*
    //ver estado del mar y bandera balneario al que pertenece el perfil de guardavida
    @Test (priority =14)
    public void estadoBanderaYmar() {
    	guadavidaLogin.verEstadoBandyMar();
    }
    */
    /*
    //cargar estado del mar y bandera
    @Test (priority=15)
    public void altaStatusBanderaMar() {
    	guardavidaLogin.createStatusBandYmar();
    }
    */
    /*
    //cambiar turno no encontre seccion
    @Test(priority=16)
    public void updateTurnoGuardavida() {
    	guardavidaLogin.updateTurno();
    }
    
    */
    /*
    // empezar escaneo
    @Test(priority=17)
    public void escaneoPuesto() {
    	guardavidaLogin.escanear();
    }
   *//*
    //agregar material  endpoit = /novedad-de-material/create
    @Test (priority=18)
    public void cargarMaterial() {
    	guardavidaLogin.addMaterial();
    }*/
    
    
    
    
    
    @Test (priority = 19)
    
    public void cerrarSesion() {
    	guardavidaLogin.logout();
    }
    
    
    
}
