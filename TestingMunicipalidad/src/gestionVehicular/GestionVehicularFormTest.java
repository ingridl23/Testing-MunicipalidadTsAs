package gestionVehicular;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GestionVehicularFormTest {
	  private final WebDriver driver;
      private final WebDriverWait wait;
      private final Duration time;
      private WebElement useremail, password, loginBtn, /*initSession,*/btnseccion;
      
      
	  public GestionVehicularFormTest(WebDriver driver) {
		super();
		this.driver = driver;
		  time=Duration.ofMillis(8000);
          wait = new WebDriverWait(this.driver, time);
	  }
	  
	  public void login(String userEmail, String pass) {
          // en este caso esperamos a que se carguen porque puede fallar sino        
         // initSession=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));
         // initSession.click();
          
          //encontrar input de ingreso de email
          useremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
          useremail.sendKeys(userEmail);
          
         /* passBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));
          passBtn.click();        
          */
          
          //encontrar input de ingreso de password
          password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
          password.sendKeys(pass);
          
          //encontrar boton para ingresar a la sesion y loguearse
          By btn = By.xpath("/html/body/div/div/div/form/button");
         loginBtn= wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
          try{
        	  loginBtn.click();     
        	   System.out.println("Botón de iniciar sesión presionado");
          }catch (Exception e) {
  	        System.out.println("Click normal falló, intentando con JS...");
  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginBtn);
  	    }

	  }   
	  
        public void loginVengeta(String UserEmail, String pass) {
        	
        	 //encontrar input de ingreso de email
            useremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
            useremail.sendKeys(UserEmail);
            //encontrar y completar el input oculto 
            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement oculto = driver.findElement(By.name("oculto"));
            Assert.assertNotNull(oculto);
            
            js.executeScript("arguments[0].value='ABC123';", oculto);
            
            //encontrar input de ingreso de password
            password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
            password.sendKeys(pass);
            
            
            
          //encontrar boton para ingresar a la sesion y loguearse
            By btn = By.xpath("/html/body/div/div/div/form/button");
           loginBtn= wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
            try{
          	  loginBtn.click();     
          	   System.out.println("Botón de iniciar sesión presionado");
            }catch (Exception e) {
    	        System.out.println("Click normal falló, intentando con JS...");
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginBtn);
    	    }
            
            if(oculto != null) {
            	 System.out.println("Complete el formulario incluso el input oculto");  
            }
        }


  
	  public void vehiculos() {
			
		  By btn = By.xpath("/html/body/div/aside/nav/a[2]");
		  btnseccion = wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
		  
		  try {
			  btnseccion.click();
			  System.out.println("hice click en el boton del listado vehiculos");
		  }catch(Exception e) {
			   System.out.println("Click normal fallo, probando con jS");
			   ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btnseccion);
		  }
		  
		  
	  }
	  
	  
      public void SelectVehiculos() {
    	  //llamamos al test anterior para entrar a la seccion de vehiculos
    	  
    	 vehiculos();
    	 
    	 System.out.println("Comenzamos la seleccion de vehiculo");
    	  By card = By.xpath("/html/body/div/div/main/div[1]/div/div[2]/div[1]");
    	 

        WebElement cardElement = wait.until(
           ExpectedConditions.elementToBeClickable(card)
           );

        cardElement.click();

        System.out.println("Entré al detalle del vehículo");
		 
		 //retrocedemos
		
		 By back = By.xpath("/html/body/div/div/main/div[1]/div[1]/div/div/button");
		 
	     WebElement flecha = wait.until(
				ExpectedConditions.visibilityOfElementLocated(back));
		
		 flecha.click();
    	  
		 System.out.println("seleccionamos un vehiculo y ya nos fuimos");
		 
      }
      
      
      
      
}
