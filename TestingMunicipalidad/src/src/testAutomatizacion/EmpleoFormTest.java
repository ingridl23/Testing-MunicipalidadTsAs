package src.testAutomatizacion;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class EmpleoFormTest {
private  WebDriverWait wait; 
private  WebElement  btnform;



private void darClickbtnForm(WebDriver driver) {

    By searchform = By.xpath("	//*[@id=\"navbarResponsive\"]/ul/li[4]/a");

    // Esperar a que el botÃ³n sea clickeable
    btnform = wait.until(ExpectedConditions.elementToBeClickable(searchform));

    // Scroll hacia el botÃ³n
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnform);

    try {
        btnform.click();
        System.out.println("encontre el boton de entrar al formulario y le di click");
    } catch (Exception e) {
        System.out.println("Click normal fallÃ³, intentando con JS...");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnform);
    }
  
}



	  public void enviarFormularioComoEmpresa(WebDriver driver) {
		  
		  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		  driver.get("https://emprendedores.tresarroyos.gov.ar");
		  
		  
	
		  
		  System.out.println("Listo para buscar el formulario");
		  darClickbtnForm(driver);

		  completarCamposBase(driver);
		  
		// Seleccionar â€œSoy una empresaâ€�
		  WebElement radioEmpresa = wait.until(ExpectedConditions.elementToBeClickable(By.id("esEmpresa")));

		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioEmpresa);

		  try {
		      radioEmpresa.click();
		      System.out.println("âœ” Radio 'Soy una empresa' marcado correctamente.");
		  } catch (Exception e) {
		      System.out.println("â�Œ Click normal fallÃ³, probando con JS...");
		      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioEmpresa);
		  }

		  
		  //completar campos adicionales
		  
		  
		  
		   // Completar campos adicionales
	        driver.findElement(By.id("descripcion")).sendKeys("Busco personal para el Ã¡rea administrativa.");
	        driver.findElement(By.id("nombre_empresa")).sendKeys("Prueba de envio opcion1 form");

	        enviarFormulario(driver);
	        
  
	  }
	  
	  
	  public void completarFormularioComoEmprendedor(WebDriver driver) {
		  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		  driver.get("https://emprendedores.tresarroyos.gov.ar");
		  
	        darClickbtnForm(driver);
	        completarCamposBase(driver);

	      
	        
	     // Seleccionar â€œSoy un emprendedorâ€�
			  WebElement radioEmprendedor = wait.until(ExpectedConditions.elementToBeClickable(By.id("esEmprendedor")));

			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioEmprendedor);

			  try {
			      radioEmprendedor.click();
			      System.out.println("âœ” Radio 'Soy un emprendedor' marcado correctamente.");
			  } catch (Exception e) {
			      System.out.println("â�Œ Click normal fallÃ³, probando con JS...");
			      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioEmprendedor);
			  }

			  
			  //completar campos adicionales
			 
	        /************************************************************/

	        // Esperar grupo emprendedor visible
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grupo-emprendedor")));

	        // Completar campos especÃ­ficos
	        driver.findElement(By.id("descripcion")).sendKeys("Deseo inscribirme al club de emprendedores.");
	        WebElement radioClub=  wait.until(ExpectedConditions.elementToBeClickable(By.id("club-no")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioClub);

			  try {
			      radioClub.click();
			      System.out.println("âœ” Radio 'No quiero ser del club' marcado correctamente.");
			  } catch (Exception e) {
			      System.out.println("â�Œ Click normal fallÃ³, probando con JS...");
			      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioClub);
			  }

	        enviarFormulario(driver);
	  }
	  
	  public void enviarFormularioComoBuscoEmpleo(WebDriver driver) {
		  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		  driver.get("https://emprendedores.tresarroyos.gov.ar");
		  
		   darClickbtnForm(driver);
	        completarCamposBase(driver);

	        // Seleccionar â€œBusco empleoâ€�
	        
			  WebElement radioEmpleo = wait.until(ExpectedConditions.elementToBeClickable(By.id("buscaEmpleo")));

			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioEmpleo);

			  try {
			      radioEmpleo.click();
			      System.out.println("âœ” Radio 'Busco empleo' marcado correctamente.");
			  } catch (Exception e) {
			      System.out.println("â�Œ Click normal fallÃ³, probando con JS...");
			      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioEmpleo);
			  }

	        
	        /***********************************************************************************************************/

	        // Esperar grupo visible
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grupo-empleo"))); //remplazo de thread.sleep

	        // Completar campos del grupo empleo
	        driver.findElement(By.id("descripcion")).sendKeys("Estoy en bÃºsqueda activa de trabajo.");
	        driver.findElement(By.id("edad")).sendKeys("29");
	        driver.findElement(By.id("dni")).sendKeys("40222333");
	        new Select(driver.findElement(By.id("ciudad"))).selectByVisibleText("Tres Arroyos");
	        new Select(driver.findElement(By.id("localidadesDeLaCiudad"))).selectByIndex(1);

	        driver.findElement(By.id("formacion-primario")).click();
	        driver.findElement(By.id("referencia-laboral")).sendKeys("Supermercado El Sol");
	        driver.findElement(By.id("referencia-rubro")).sendKeys("Ventas");
	        driver.findElement(By.id("referencia-actividad")).sendKeys("AtenciÃ³n al cliente");
	        driver.findElement(By.id("contratista")).sendKeys("Carlos LÃ³pez");
	        driver.findElement(By.id("referencia-telefonica")).sendKeys("2983123456");
	        driver.findElement(By.id("cud-false")).click();
	        driver.findElement(By.id("dependencia-false")).click();

	        // Subir CV (archivo de prueba)
	        WebElement inputFile = driver.findElement(By.id("cv"));
	        inputFile.sendKeys("F:\\Downloads\\Automation.pdf");
	  
	        enviarFormulario(driver);
	    }
	  
	  
	  // ----- MÃ©todos auxiliares -----

	    private void completarCamposBase(WebDriver driver) {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Juan PÃ©rez 3");
	        driver.findElement(By.id("asunto")).sendKeys("opcion buscaempleo prueba");
	        driver.findElement(By.id("email")).sendKeys("juanperez@example.com");
	        driver.findElement(By.id("phone")).sendKeys("2983456789");
	    }

	    private void enviarFormulario(WebDriver driver) {
	     
	        
	   
			  By enviar = By.id("submitButton");
		      btnform= wait.until(ExpectedConditions.elementToBeClickable(enviar));

			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnform);

			  try {
			      btnform.click();
			      System.out.println("boton enviar formulario clickeado correctamente.");
			  } catch (Exception e) {
			      System.out.println("â�Œ Click normal fallÃ³, probando con JS...");
			      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnform);
			  }

	        // Esperar mensaje de Ã©xito o redirecciÃ³n
	        try {
	            WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
	            System.out.println("âœ… Formulario enviado con Ã©xito: " + mensaje.getText());
	        } catch (TimeoutException e) {
	            System.out.println("âš ï¸� No se encontrÃ³ el mensaje de Ã©xito. Verificar respuesta del servidor.");
	        }
	    }
	  
	  
	  
	  
	  
	  

}
