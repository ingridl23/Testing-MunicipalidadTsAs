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
      private WebElement useremail, password, loginBtn,/* passBtn,*/ btnVolver, initSession;
      
      
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
       	    } catch (Exception e) {
       	        System.out.println("Click normal falló, intentando con JS...");
       	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnVolver);
       	    }



  }
      
}
