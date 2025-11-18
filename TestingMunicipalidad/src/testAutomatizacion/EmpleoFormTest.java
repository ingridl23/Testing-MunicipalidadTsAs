package testAutomatizacion;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class EmpleoFormTest {
private  WebDriverWait wait; 
	  public void enviarFormularioComoEmpresa(WebDriver driver) {
		  
		  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		  driver.get("https://www.tresarroyos.gov.ar/oficina-de-empleo");//es ejemplo hay que cambiar con el real cuando se suba el sitio
		  
		  completarCamposBase(driver);
		  
		  //Seleccionar soy una empresa
		  
		  driver.findElement(By.id("esEmpresa")).click();
		  
		  //esperar a que se muestre grupo empresa
		  
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grupoempresa")));
		  
		  //completar campos adicionales
		  
		  
		  
		   // Completar campos adicionales
	        driver.findElement(By.id("descripcion")).sendKeys("Busco personal para el área administrativa.");
	        driver.findElement(By.id("nombre_empresa")).sendKeys("TechSolutions SRL");

	        enviarFormulario(driver);
	        
  
	  }
	  
	  
	  public void completarFormularioComoEmprendedor(WebDriver driver) {
		  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	        driver.get("https://www.tresarroyos.gov.ar/oficina-de-empleo"); //es ejemplo hay que cambiar con el real cuando se suba el sitio

	        completarCamposBase(driver);

	        // Seleccionar “Soy un emprendedor”
	        driver.findElement(By.id("esEmprendedor")).click();

	        // Esperar grupo emprendedor visible
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grupo-emprendedor")));

	        // Completar campos específicos
	        driver.findElement(By.id("descripcion")).sendKeys("Deseo inscribirme al club de emprendedores.");
	        driver.findElement(By.id("club-no")).click(); // o club-no

	        enviarFormulario(driver);
	  }
	  
	  public void enviarFormularioComoBuscoEmpleo(WebDriver driver) {
	        wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	        driver.get("https://www.tresarroyos.gov.ar/oficina-de-empleo");//es ejemplo hay que cambiar con el real cuando se suba el sitio

	        completarCamposBase(driver);

	        // Seleccionar “Busco empleo”
	        driver.findElement(By.id("buscaEmpleo")).click();

	        // Esperar grupo visible
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grupo-empleo"))); //remplazo de thread.sleep

	        // Completar campos del grupo empleo
	        driver.findElement(By.id("descripcion")).sendKeys("Estoy en búsqueda activa de trabajo.");
	        driver.findElement(By.id("edad")).sendKeys("29");
	        driver.findElement(By.id("dni")).sendKeys("40222333");
	        new Select(driver.findElement(By.id("ciudad"))).selectByVisibleText("Tres Arroyos");
	        new Select(driver.findElement(By.id("localidadesDeLaCiudad"))).selectByIndex(1);

	        driver.findElement(By.id("formacion-primario")).click();
	        driver.findElement(By.id("referencia-laboral")).sendKeys("Supermercado El Sol");
	        driver.findElement(By.id("referencia-rubro")).sendKeys("Ventas");
	        driver.findElement(By.id("referencia-actividad")).sendKeys("Atención al cliente");
	        driver.findElement(By.id("contratista")).sendKeys("Carlos López");
	        driver.findElement(By.id("referencia-telefonica")).sendKeys("2983123456");
	        driver.findElement(By.id("cud-false")).click();
	        driver.findElement(By.id("dependencia-false")).click();

	        // Subir CV (archivo de prueba)
	        WebElement inputFile = driver.findElement(By.id("cv"));
	        inputFile.sendKeys("F:\\Downloads\\Automation.pdf");
	  
	        enviarFormulario(driver);
	    }
	  
	  
	  // ----- Métodos auxiliares -----

	    private void completarCamposBase(WebDriver driver) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Juan Pérez");
	        driver.findElement(By.id("asunto")).sendKeys("Consulta");
	        driver.findElement(By.id("email")).sendKeys("juanperez@example.com");
	        driver.findElement(By.id("phone")).sendKeys("2983456789");
	    }

	    private void enviarFormulario(WebDriver driver) {
	        driver.findElement(By.id("submitButton")).click();

	        // Esperar mensaje de éxito o redirección
	        try {
	            WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
	            System.out.println("✅ Formulario enviado con éxito: " + mensaje.getText());
	        } catch (TimeoutException e) {
	            System.out.println("⚠️ No se encontró el mensaje de éxito. Verificar respuesta del servidor.");
	        }
	    }
	  
	  
	  
	  
	  
	  

}
