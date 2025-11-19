package testAutomatizacion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;

public class Guardavidas {
	private final WebDriver driver;
	private final WebDriverWait wait;
	private final Duration time;
	private WebElement useremail, password, loginBtn, passBtn, initSession, btnGuard, btnAsist, btnLic, btnTurn, btnMaterl, btnInterv, 
	btnBand,btnNav,btnLogout, btnProfile, miAsist, btnVolver, descargar,btnDatos, btnRol,btnBandera, btnEscaneo;

	public Guardavidas(WebDriver driver) {
		  this.driver = driver;
          time=Duration.ofMillis(8000);
          wait = new WebDriverWait(this.driver, time);
	}

	
	
	/**********************************************************************************************************************************/
	public void login(String user, String pass) {
	    System.out.println("Listo para iniciar sesion");

	    By btnIniciarSesion = By.xpath("//a[contains(text(),'Iniciar Sesión')]");

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


	    // completar formulario
	    useremail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
	    useremail.sendKeys(user);

	    password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	    password.sendKeys(pass);

	    By iniciarBtn2=By.xpath("//*[@id=\"botonEnviarLogin\"]");
	    passBtn = wait.until(ExpectedConditions.elementToBeClickable(iniciarBtn2));
	    
	    try {
	    	passBtn.click();

		    System.out.println("Botón de iniciar sesión presionado");
	    	
	    }catch(Exception e) {
	    	System.out.println("intentando hacer click con js en boton iniciar sesion");
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", passBtn);
	    }
	    
	}
	
	
/*****************************************************************************************************************************************/	
	public void listarTodos() {
		By btnGuardavidas = By.xpath("/html/body/div[1]/aside/div/ul[2]/li[2]/a/span");
		
		btnGuard = wait.until(ExpectedConditions.elementToBeClickable(btnGuardavidas));
		
		try {
			 btnGuard.click();
			 System.out.println("encontre y presione el boton del listado bien");
		}catch(Exception e) {
			System.out.println("No encontre o no pude presionar el boton del listado");
			  System.out.println("intentando presionar con js");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnGuard);
		}
		
	}
	
/*********************************************************************************************************************************************/	
	public void listadoAsistencias() {
       By btnAsistencias = By.xpath("/html/body/div[1]/aside/div/ul[2]/li[3]/a/span");
		
		btnAsist = wait.until(ExpectedConditions.elementToBeClickable(btnAsistencias));
		
		try {
			 btnGuard.click();
			 System.out.println("encontre y presione el boton del listado bien");
		}catch(Exception e) {
			System.out.println("No encontre o no pude presionar el boton del listado");
			  System.out.println("intentando presionar con js");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnAsist);
		}
		
	}
	
/************************************************************************************************************************************/	
	public void listadoLicencias() {
	       By btnLicencias = By.xpath("/html/body/div[1]/aside/div/ul[2]/li[4]/a/span");
			
			btnLic = wait.until(ExpectedConditions.elementToBeClickable(btnLicencias));
			
			try {
				 btnLic.click();
				 System.out.println("encontre y presione el boton del listado2 bien");
			}catch(Exception e) {
				System.out.println("No encontre o no pude presionar el boton del listado2");
				  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnLic);
			}
			
		}
	
/***************************************************************************************************************************************/
	public void listadoTurnos() {
	       By btnTurnos = By.xpath("/html/body/div[1]/aside/div/ul[2]/li[5]/a/span");
			
			btnTurn = wait.until(ExpectedConditions.elementToBeClickable(btnTurnos));
			
			try {
				 btnTurn.click();
				 System.out.println("encontre y presione el boton del listado3 bien");
			}catch(Exception e) {
				System.out.println("No encontre o no pude presionar el boton del listado3");
				  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnTurn);
			}
			
		}
	

/****************************************************************************************************************************************/	
	public void materiales() {
		By materiales = By.xpath("/html/body/div[1]/aside/div/ul[1]/li[5]/a/span");
		
		btnMaterl = wait.until(ExpectedConditions.elementToBeClickable(materiales));
		
		try {
			btnMaterl.click();
			System.out.println("encontre el boton de materiales y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnMaterl);
		}
	}
/*******************************************************************************************************************************************/	
	public void intervenciones() {
		By intervenciones = By.xpath("/html/body/div[1]/aside/div/ul[1]/li[4]/a/span[1]");
		
		btnInterv= wait.until(ExpectedConditions.elementToBeClickable(intervenciones));
		
		try {
			btnInterv.click();
			System.out.println("encontre el boton itervenciones y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnInterv);
		}
		
	}
/*******************************************************************************************************************************************/	
	public void banderas() {
		By banderas = By.xpath("/html/body/div[1]/aside/div/ul[1]/li[3]/a/span[1]");
		
		btnBand= wait.until(ExpectedConditions.elementToBeClickable(banderas));
		try {
			btnBand.click();
			System.out.println("encontre el boton banderas y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnBand);
		}
	}
	
/********************************************************************************************************************************************/	
	public void logout () {
		By navegacion = By.xpath("/html/body/nav[1]/div[1]/div/div[2]/div/div[1]/button");
		btnNav= wait.until(ExpectedConditions.elementToBeClickable(navegacion));
		
		try {
			btnNav.click();
			System.out.println("encontre el boton de la navegacion y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnNav);
		}
		
		By logout = By.xpath("/html/body/nav[1]/div[1]/div/div[2]/div/div[2]/div/form/a");
		btnLogout= wait.until(ExpectedConditions.elementToBeClickable(logout));
		try {
			btnLogout.click();
			System.out.println("encontre el boton de cerrar sesion y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnLogout);
		}
		
		
		
	}
	
	
/******************************************************************************************************************************************/	
	public void profile() {
		By navegacion = By.xpath("/html/body/nav[1]/div[1]/div/div[2]/div/div[1]/button");
		btnNav= wait.until(ExpectedConditions.elementToBeClickable(navegacion));
		
		try {
			btnNav.click();
			System.out.println("encontre el boton de la navegacion y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnNav);
		}
		By profile = By.xpath("/html/body/nav[1]/div[1]/div/div[2]/div/div[2]/div/a[1]");
		btnProfile= wait.until(ExpectedConditions.elementToBeClickable(profile));
		
		try {
			btnProfile.click();
			System.out.println("encontre el boton de mi perfil y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnProfile);
		}
	}
	/*By btnNav = By.xpath("/html/body/nav[1]/div[1]/div/div[2]/div/div[1]/button");

	
	*/
/****************************************************************************************************************************************/	
	
	public void miListadoAsistencias() {

		By navegacion = By.xpath("/html/body/nav[1]/div[1]/div/div[2]/div/div[1]/button");
		btnNav= wait.until(ExpectedConditions.elementToBeClickable(navegacion));
		
		try {
			btnNav.click();
			System.out.println("encontre el boton de la navegacion y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnNav);
		}
		
		
		By misAsistencias = By.xpath("/html/body/nav[1]/div[1]/div/div[2]/div/div[2]/div/a[2]");
	    miAsist= wait.until(ExpectedConditions.elementToBeClickable(misAsistencias));
		
		try {
			miAsist.click();
			System.out.println("encontre el boton de mis asistencias y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",miAsist);
		}
		
		By volver = By.xpath("/html/body/div[1]/div[1]/button");
		
		btnVolver =  wait.until(ExpectedConditions.elementToBeClickable(volver));
		
		try {
			btnVolver.click();
			System.out.println("encontre el boton de volver y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnVolver);
		}
	}
	
/*******************************************************************************************************************************************/	
	public void descargarExcelGuardavidas() {
		
		//lamamos a nuestra funcion donde lista los guarrdavidas
		listarTodos();
		
		
		//buscamos el boton de descargar listado guardavidas
		By Aexcel = By.xpath("/html/body/div[2]/main/div[1]/div[2]/div[1]/a");
		descargar = wait.until(ExpectedConditions.elementToBeClickable(Aexcel));
		try {
			descargar.click();
			System.out.println("encontre el boton de descargar excel y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",descargar);
		}
	}
	
/******************************************************************************************************************************************/	
	public void descargarAsistencias() {
		
		listadoAsistencias();
		
		
		By Asexcel =By.xpath("/html/body/div[2]/main/div/div/div[2]/div[2]/a");
		descargar =  wait.until(ExpectedConditions.elementToBeClickable(Asexcel));
		try {
			descargar.click();
			System.out.println("encontre el boton de descargar excel asistencias y lo presione");
		}catch(Exception e) {
			  System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();",descargar);
		}
		
		//clickear input de fechas y seleccionar alguna fecha
		
		WebElement fechaInicio = driver.findElement(By.id("fecha_inicio"));
		fechaInicio.sendKeys("2025-11-17"); // Formato YYYY-MM-DD

		WebElement fechaFin = driver.findElement(By.id("fecha_fin"));
		fechaFin.sendKeys("2025-12-17");

       By descargarExcel = By.xpath("/html/body/div[2]/main/div/div/div[2]/form/div/div[3]/button");
   	descargar =  wait.until(ExpectedConditions.elementToBeClickable(descargarExcel));
	try {
		descargar.click();
		System.out.println("encontre el boton de descargar excel asistencias y lo presione");
	}catch(Exception e) {
		  System.out.println("No encontre el boton o no pude presionarlo");
		  System.out.println("intentando presionar con js");
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",descargar);
	}
       
		
		
	}
	
/********************************************************************************************************************************************/	
	
	
	public void updateGuardavida() {
		
		//clickeo el boton de guardavidas y llego al listado 
		listarTodos();
		
		//busco el boton agregar guardavida y lo clickeo
		By crearGuard = By.xpath("");
		btnGuard = wait.until(ExpectedConditions.elementToBeClickable(crearGuard));
		
		try {
			btnGuard.click();
			System.out.println("Encontre el boton de agregar y le di click");
			
			
		}catch(Exception e) {
			 System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnGuard);
		}
		
		
		//completo el formulario de alta de guardavida
		
		//**************SECCION DATOS **********************************************
		
		//busco el boton para entrar al formulario primera seccion
		By datos = By.xpath("");
		btnDatos = wait.until(ExpectedConditions.elementToBeClickable(datos));
		
		try {
			btnDatos.click();
			System.out.println("Encontre el boton de seccion datos en formulario");
		}catch(Exception e) {
			System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnDatos);
		}
		
		
		//************************************
		//**informacion personal** :         *
		//************************************
		
		WebElement dni = driver.findElement(By.id(""));
		dni.sendKeys("12567899"); 

		WebElement tel = driver.findElement(By.id(""));
		tel.sendKeys("2983778899");
		
		WebElement direccion = driver.findElement(By.id(""));
		direccion.sendKeys("colon");
		
		WebElement nro = driver.findElement(By.id(""));
		nro.sendKeys("123");
		
		WebElement pisoDpto = driver.findElement(By.id(""));
		pisoDpto.sendKeys("");
		
		//*************************************
		//**informacion profesional** :       *
		//*************************************
		
		WebElement playa = driver.findElement(By.id(""));
		playa.sendKeys("Dunamar");
		
		WebElement puesto = driver.findElement(By.id(""));
		puesto.sendKeys("Foca");
		
		WebElement funcion = driver.findElement(By.id(""));
		funcion.sendKeys("encargado");
		
		WebElement turno = driver.findElement(By.id(""));
		turno.sendKeys("M"); // T valores de mañana o tarde
		
		
		//*********************SECCION PERFIL ***************************
		By profile = By.xpath("");
		btnProfile =  wait.until(ExpectedConditions.elementToBeClickable(profile));
		
		try {
			btnProfile.click();
			System.out.println("Encontre el boton de seccion perfil en formulario");
		}catch(Exception e) {
			System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnProfile);
		}

		//**************************
		//** iformacion de perfil  *
	   //***************************
		
	
		WebElement inputName =  driver.findElement(By.id(""));
		inputName.sendKeys("Mariana");
		
		
	
		WebElement inputApellido =  driver.findElement(By.id(""));
		inputName.sendKeys("Gomez");

		WebElement inputemail =  driver.findElement(By.id(""));
		inputName.sendKeys("guardavidaGomez@gmail.com");
		
	
		WebElement inputPass =  driver.findElement(By.id(""));
		inputPass.sendKeys("123456789");
		
		
		WebElement inputconfirmarPass =  driver.findElement(By.id(""));
		inputconfirmarPass.sendKeys("123456789");
		
		
		//*******************************SECCION ROL ****************************************
		//busco el boton de la seccion del formulario rol
		By seccionrol = By.xpath("");
		btnRol =  wait.until(ExpectedConditions.elementToBeClickable(seccionrol));
		try {
			btnRol.click();
			System.out.println("Encontre el boton de seccion rol en formulario");
		}catch(Exception e) {
			System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnRol);
		}
	
	
	//selecciono el rol en el formulario
	

	WebElement inputRol =  driver.findElement(By.id(""));
	 inputRol.sendKeys("admin");//valores posibles : guardavida- encargado-admin
	 
	 
	 enviarFormulario(driver);
}
	
	
	
	
	/*********************************************************************************************************************************/
	
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
	
	
   /*********************************************************************************************************************************/	
	
	
	public void createStatusBandYmar() {
		//busco el botn que me abre el formulario
		By bandera = By.xpath("");
		btnBandera =  wait.until(ExpectedConditions.elementToBeClickable(bandera));
		try {
			btnBandera.click();
			System.out.println("Encontre el boton de seccion formulario bandera");
		}catch(Exception e) {
			System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnBandera);
		}
		
		//***********inputs para registrar bandera
		

		WebElement inputPlaya =  driver.findElement(By.id(""));
		 inputPlaya.sendKeys("1");//valores posibles : 1-2-3-4-5
		 

			WebElement inputFechaHora =  driver.findElement(By.id(""));
			 inputFechaHora.sendKeys("2025-11-18 10:30");// Formato YYYY-MM-DD HH-MN
			 

				WebElement inputBandera =  driver.findElement(By.id(""));
				 inputBandera.sendKeys("2");//valores posibles : 1 bueno-2 dudoso-3 peligroso-4 rayos-5 prohibido bañarse-6 niño perdido
				 

					WebElement inputDetalles =  driver.findElement(By.id(""));
					 inputDetalles.sendKeys("nueva actualizacion");
					 
					 enviarFormulario(driver);
	
	}
	
	
	
	public void addMaterial() {
		
		//encontrar el boton que ingresa al formulario
		By material = By.xpath("");
		btnMaterl =  wait.until(ExpectedConditions.elementToBeClickable(material));
		try {
			btnMaterl.click();
			System.out.println("Encontre el boton de seccion formulario material");
		}catch(Exception e) {
			System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnMaterl);
		}
		
		/************************************/
		/**REGISTRAR NOVEDAD DE MATERIALES **/
		/************************************/
		
		
		WebElement inputPlaya =  driver.findElement(By.id(""));
		 inputPlaya.sendKeys("1");//valores posibles : 1-2-3-4-5
		 

			WebElement inputFechaHora =  driver.findElement(By.id(""));
			 inputFechaHora.sendKeys("2025-11-18 10:30");// Formato YYYY-MM-DD HH-MN
			 

				WebElement inputMaterial =  driver.findElement(By.id(""));
				 inputMaterial.sendKeys("");//valores posibles : 
				 

					WebElement inputTipoNovedad =  driver.findElement(By.id(""));
					 inputTipoNovedad.sendKeys("");// valores posibles : Daño-Falla-Faltante-Pérdida-Rotura
					 
					 
						WebElement inputDetalles =  driver.findElement(By.id(""));
						 inputDetalles.sendKeys("nueva actualizacion material");
			        //enviar formulario completo
					 enviarFormulario(driver);
		
	}
	
	
	public void escanear() {
		
		By iniciarCamara = By.xpath("/html/body/nav[2]/div/div/a[3]");
		btnEscaneo =wait.until(ExpectedConditions.elementToBeClickable(iniciarCamara));
		try {
			btnBandera.click();
			System.out.println("Encontre el boton de inicio de escaneo");
		}catch(Exception e) {
			System.out.println("No encontre el boton o no pude presionarlo");
			  System.out.println("intentando presionar con js");
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnEscaneo);
		} 
	}
	
	
	
	
	
}
		
		
		
	
		
		
		
             