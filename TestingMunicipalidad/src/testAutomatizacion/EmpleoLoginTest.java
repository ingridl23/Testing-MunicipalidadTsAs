package testAutomatizacion;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmpleoLoginTest {
	  private final WebDriver driver;
      private final WebDriverWait wait;
      private final Duration time;
      private WebElement useremail, password, loginBtn,/* passBtn, loginBtn2,*/ initSession;
      
      
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
          loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"submitButton\"]")));
          loginBtn.click();                
          
          
        /*  loginBtn2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()));
          loginBtn2.click();  */              


  }
      
}
