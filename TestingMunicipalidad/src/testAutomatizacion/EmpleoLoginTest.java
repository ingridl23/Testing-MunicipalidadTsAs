package testAutomatizacion;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmpleoLoginTest {
	  private final WebDriver driver;
      private final WebDriverWait wait;
      private final Duration time;
      private WebElement useremail, password, loginBtn,/* passBtn, loginBtn2,*/ initSession,btnseccion;
      
      
      public EmpleoLoginTest(WebDriver driver) {
          this.driver = driver;
          time=Duration.ofMillis(8000);
          wait = new WebDriverWait(this.driver, time);
  }
      public void login(String user, String pass) {
          // en este caso esperamos a que se carguen porque puede fallar sino        
          initSession=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbarResponsive\"]/div/a[4]")));
          initSession.click();
          
          //encontrar input de ingreso de email
          useremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
          useremail.sendKeys(user);
          
         /* passBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));
          passBtn.click();        
          */
          
          //encontrar input de ingreso de password
          password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
          password.sendKeys(pass);
          
          //encontrar boton para ingresar a la sesion y loguearse
          By btn = By.xpath("//*[@id=\"submitButton\"]");
         loginBtn= wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
          try{
        	  loginBtn.click();     
        	   System.out.println("Botón de iniciar sesión presionado");
          }catch (Exception e) {
  	        System.out.println("Click normal falló, intentando con JS...");
  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginBtn);
  	    }

          
          
        /*  loginBtn2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));
          loginBtn2.click();  */              


  }
	  public void programas() {
		
		  By btn = By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[1]/a");
		  btnseccion = wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
		  
		  try {
			  btnseccion.click();
			  System.out.println("hice click en el boton programas");
		  }catch(Exception e) {
			   System.out.println("Click normal fallo, probando con jS");
			   ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btnseccion);
		  }
		  
	  }
	  public void seccionNoticias() {
		
		  //entra a la seccion y elije la primera
		  
		  By btn = By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[2]/a");
		  btnseccion = wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
		  
		  try {
			  btnseccion.click();
			  System.out.println("hice click en el boton noticias");
		  }catch(Exception e) {
			   System.out.println("Click normal fallo, probando con jS");
			   ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btnseccion);
		  }
		  
		  
		  //hago scroll y busco la primer noticia
		  
		  By noticia = By.xpath("//*[@id=\"page-top\"]/div[5]/div/div/div/div/button/a");
		  btnseccion = wait.until(ExpectedConditions.visibilityOfElementLocated(noticia));
		  // Scroll hacia el botón
		   // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnseccion);

		  try {
			  btnseccion.click();
			  System.out.println("Encontre el boton de la noticia y le di click");
		  }catch(Exception e){
			  System.out.println("CLick normal fallo, probando con JS");
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btnseccion);
			  
		  }
		
	  }
	  public void emprendedores() {
		
 //entra a la seccion y elije 
		  
		  By btn = By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[3]/a");
		  btnseccion = wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
		  
		  try {
			  btnseccion.click();
			  System.out.println("hice click en el boton emprendedores");
		  }catch(Exception e) {
			   System.out.println("Click normal fallo, probando con jS");
			   ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btnseccion);
		  }
		  
		  
		  //hago scroll y busco el primer emprendimiento modal
		  
		  By emprendimiento = By.xpath("//*[@id=\"carousel-1\"]/div/div[1]/a/div/div/i");
		  WebElement card = wait.until(ExpectedConditions.visibilityOfElementLocated(emprendimiento));
		  // Scroll hacia el botón
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnseccion);

		  try {
			  card.click();
			  System.out.println("Encontre el modal del emprendimiento y le di click");
		  }catch(Exception e){
			  System.out.println("CLick normal fallo, probando con JS");
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", card);
			  
		  }
		  
		  
		  //le doy a ampliar emprendimiento 
		  
		  By emprendimiento2 = By.xpath("//*[@id=\"portfolioModal1\"]/div/div/div[2]/div/div/div/button/a");
		  btnseccion = wait.until(ExpectedConditions.visibilityOfElementLocated(emprendimiento2));
		  // Scroll hacia el botón
		   // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnseccion);

		  try {
			  btnseccion.click();
			  System.out.println("Encontre el boton del emprendimiento y le di click");
		  }catch(Exception e){
			  System.out.println("CLick normal fallo, probando con JS");
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", btnseccion);
			  
		  }
		  
		
	  }
      
}
