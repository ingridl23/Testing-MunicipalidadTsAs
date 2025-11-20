package testAutomatizacion;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmpleoLoginTest {
	  private final WebDriver driver;
      private final WebDriverWait wait;
      private final Duration time;
      private WebElement useremail, password, loginBtn,/* passBtn,*/ btnVolver, initSession, programas,emprendedores,noticias;
      
      
      public EmpleoLoginTest(WebDriver driver) {
          this.driver = driver;
          time=Duration.ofMillis(8000);
          wait = new WebDriverWait(this.driver, time);
  }
      public void login(String user, String pass) {
          // en este caso esperamos a que se carguen porque puede fallar sino        
          initSession=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div/nav/div/div/div/a[4]/div/i")));
          initSession.click();
          
          //encontrar input de ingreso de email
          useremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/form/div[1]/input")));
          useremail.sendKeys(user);
          
         /* passBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));
          passBtn.click();        
          */
          
          //encontrar input de ingreso de password
          password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/form/div[2]/input")));
          password.sendKeys(pass);
          
          //encontrar boton para ingresar a la sesion y loguearse
      
                   
           
          System.out.println("Listo para iniciar sesion");

  	    By btnIniciarSesion = By.xpath("/html/body/div[2]/div[2]/div/form/div[4]/button");

  	    // Esperar a que el botón sea clickeable
  	    loginBtn = wait.until(ExpectedConditions.elementToBeClickable(btnIniciarSesion));

  	    // Scroll hacia el botón
  	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginBtn);

  	    try {
  	        loginBtn.click();
  	    } catch (Exception e) {
  	        System.out.println("Click normal falló, intentando con JS...");
  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginBtn);
  	    }

             By volverhome =By.xpath("/html/body/div[1]/header/div/nav/div/div/ul/li/a");
             btnVolver = wait.until(ExpectedConditions.elementToBeClickable(volverhome));

       	    // Scroll hacia el botón
       	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnVolver);

       	    try {
       	        loginBtn.click();
       	        System.out.println("Encontre el boton de volver y le di clic");
       	    } catch (Exception e) {
       	        System.out.println("Click normal falló, intentando con JS...");
       	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnVolver);
       	    }



  }
      
      
      
	  public void programas() {
		
		  By programa = By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[1]/a");
		  programas = wait.until(ExpectedConditions.elementToBeClickable(programa));

     	    // Scroll hacia el botón
     	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", programas);

     	    try {
     	        programas.click();
     	        System.out.println("Encontre el boton de la secion de programas y le di clic");
     	    } catch (Exception e) {
     	        System.out.println("Click normal falló, intentando con JS...");
     	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", programas);
     	    }
		  
		
     	    btnVolver();
	  }
	  public void seccionNoticias() {
		  By noticia = By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[2]/a");
		  noticias = wait.until(ExpectedConditions.elementToBeClickable(noticia));

     	    // Scroll hacia el botón
     	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", noticias);

     	    try {
     	    	noticias.click();
     	        System.out.println("Encontre el boton de la secion de noticias y le di clic");
     	    } catch (Exception e) {
     	        System.out.println("Click normal falló, intentando con JS...");
     	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", noticias);
     	    }
     	    
     	    //ahora vuelvo al inicio
     	    
     	   btnVolver();
    	    
		
	  }
	  
	  
	  
	  
	  public void emprendedores() {
		  By emprendedor = By.id("");
		  emprendedores = wait.until(ExpectedConditions.elementToBeClickable(emprendedor));

     	    // Scroll hacia el botón
     	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", programas);

     	    try {
     	 	  emprendedores.click();
     	        System.out.println("Encontre el boton de la secion de  emprendedores y le di clic");
     	    } catch (Exception e) {
     	        System.out.println("Click normal falló, intentando con JS...");
     	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", 	  emprendedores);
     	    }
     	    
     	    
     	    
  //ahora vuelvo al inicio
     	    btnVolver();
     	
	  }
	  
	  
	  private void btnVolver() {
		    By volver = By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[1]/a");
    	     btnVolver = wait.until(ExpectedConditions.elementToBeClickable(volver));

   	    // Scroll hacia el botón
   	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnVolver);

   	    try {
   	    	btnVolver.click();
   	        System.out.println("Encontre el boton de volver y le di clic");
   	    } catch (Exception e) {
   	        System.out.println("Click normal falló, intentando con JS...");
   	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnVolver);
   	    }
   	    
	  }
      
}
