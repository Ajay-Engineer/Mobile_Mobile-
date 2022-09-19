import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Signin {
    @Test
	public void signIn() throws InterruptedException
{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ajay.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        String name =  "ajay100@gmail.com";
        String password = "ajay123";
        landingpage.goTo();
        landingpage.character3(name, password);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
	public void signIn02() throws InterruptedException
    {
        String name =  "ajay@123";
        String password = "ajay123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character20(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL=driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
	public void signIn03() throws InterruptedException
    {
        String name =  "Aj";
        String password = "ajay123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL= driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
        
    }
    @Test
	public void signIn04() throws InterruptedException
    {
        String name =  "ajayselvanajayselvanajay";
        String password = "ajay123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character21(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL=driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
	public void signIn05() throws InterruptedException
    {
        String name =  "";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.validemail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL=driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
	public void signIn06() throws InterruptedException
    {
        String name =  "aj@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.unregisteremail(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL= driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
	public void signIn07() throws InterruptedException
    {
        String name =  "ajay";
        String password = "ajay@123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.validdetails(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL=driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
	public void signIn08() throws InterruptedException
    {
        String name =  "ajay";
        String password = "aja";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.pass2(name, password);
        landingpage.goTo();
        landingpage.character3(name, password);
        String ExpectedURL="Error message should shown";
        String ActualURL=driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    
}