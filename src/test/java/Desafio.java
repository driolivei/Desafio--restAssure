
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Story;

//@Epic("")
//@Feature("")

public class Desafio {

	public void main(String[] args) throws InterruptedException {
		abrirChrome();
		
		

	}
    
	
	@Test
	//@Story("Acessa a página da GFT com sucesso")
    //@Description("Clica em vagas e pesquisa QA com sucesso")
	public void abrirChrome() throws InterruptedException {
		File file = new File("C:\\Users\\mavn\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.gft.com/br/pt");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
	    //validar se existe a frase 
		//driver.findElement(By.xpath("//*[contains(text(),'Open API Framework')]")).getText();
		//assertThat("Open API Framework".equals("Open API Framework"));
		
		
		Thread.sleep(20000);
		
		
		//clicar em Mostrar Mais
		//String xPath = "//[@id=\"main\"]/div[1]/div[1]/div/div/div[1]/div/div[8]/div/div[5]/div[2]/a";
		//By.xpath(xPath);
		
		
        //clicar no Menu 
		driver.findElement(By.xpath("//*[name()='use'][contains(@*, '#menu')]")).click();
		
	
		
		//driver.findElement(By.className("//div[@class='tracking-wider uppercase text-medium-gray")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/div[2]/div/a/div[1]/div[1]")).click();
		
		//WebElement clica = driver.findElement(By.className("tracking-wider"));
		//clica.click();
		
	   //String className= "tracking-wider";
	   //By.className(className);
		
		
		//String xPathU = "//*[@id=\"header\"]/nav/div/div[2]/div[2]/div/a/div[1]/div[2]";
		//By.xpath(xPathU);
		
		//*[@id="header"]/nav/div/div[2]/div[2]/div/a/div[1]/div[2]
		 
		//tiraram o link que ia para a página de pesquisa direto
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/div[2]/div/a/div[1]/div[2]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/div[1]/div[3]/div/div[1]/ul/li[3]/")).click();
		
		//String xPath = "//*[@id=\"header\"]/nav/div/div[2]/div[1]/div[3]/div/div[1]/ul/li[3]/";
		//By.xpath(xPath);
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath1)));
		//Thread.sleep(20000);
		//By.xpath(xPath1);
		//driver.findElement(By.xpath(cssSelector)).click();
		
	
		//By.cssSelector(cssSelector);
		
		
		//driver.findElemen
	   //By ele = By.xpath("//*[contains(@*, '#chevron-right')]");
	   //wait.until(ExpectedConditions.elementToBeClickable(ele));
	   
	  //t(By.xpath("//*[contains(@*, '#chevron-right')]")).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	  //wait.until(ExpectedConditions.elementToBeClickable(ele));
	  //driver.findElement(ele).click();
		
		//WebElement ele = driver.findElement(By.xpath("//*[contains(@*, '#chevron-right')]"));
		//Thread.sleep(3000);
		//ele.click();
		
		
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/div[1]/div[2]/div/a/div[2]/svg/use"));
		//Actions builder = new Actions(driver);
		//Thread.sleep(3000);
		//element.click();

		// Store the current window handle
		//String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window

		// Close the new window, if that window no more required
		//driver.close();

		// Switch back to original browser (first window)
		//driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)
		
        
    
		
		//builder.moveToElement(element).click(element);
		//builder.perform();
		
		//Thread.sleep(20000);
		//driver.findElement(By.xpath("//*[@id='search-wrapper']/div[1]/form/div/div[1]/div[1]/input")).sendKeys("QA");
		//driver.findElement(By.cssSelector("//input[@type='text'")).sendKeys("QA");
		//driver.findElement(By.cssSelector("//input[@class='keywordsearch-q columnized-search'")).sendKeys("QA");
		//driver.findElement(By.cssSelector("#search-wrapper > div.well.well-small.searchwell > form > div > div:nth-child(1) > div.col-md-5.rd-keywordsearch > input"));
		//*[@id="header"]/nav/div/div[2]/div[1]/div[2]/div/a/div[2]/svg/use
		
		//driver.findElement(By.xpath("//input[@class='input.keywordsearch-q columnized-search']")).sendKeys("QA");
		
		//driver.executeScript("window.scrollTo(0, document.body.scrollHeight");
		
		//driver.findElement(By.id("title")).sendKeys("QA");
		
		//driver.findElement(By.id("searchfilter-submit")).click();
		
		//searchfilter-submit
				
		
		//("#header > nav > div > div.overflow-hidden.absolute.top-0.left-0.pt-20.w-full.bg-black.pointer-events-auto.lg\\:flex.lg\\:pt-0.lg\\:h-screen.h-auto > div.flex.flex-col.justify-between.pb-20.lg\\:pb-0.lg\\:w-3\\/4.lg\\:pt-36.pl-container-wide.lg\\:relative.lg\\:overflow-y-auto > div.-ml-9.lg\\:hidden > div > a")


	}

	
		
	}
	
