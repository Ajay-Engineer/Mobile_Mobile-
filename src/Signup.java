import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Signup{
    WebDriver driver;
    @BeforeMethod
    public void verify( )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ajay.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
         driver.close();
    }
    @Test(dataProvider = "datasets")
    public void testdata(String Fname,String Lname,String Email,String passwrd,String number,String date,String bio) throws InterruptedException
    {
    driver.findElement(By.cssSelector("#myName")).sendKeys(Fname);
    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lname);
    driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys(Email);
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwrd);
    driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys(number);
    driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
    driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.switchTo().alert().accept();
    driver.quit();
    }
    @DataProvider(name = "datasets")
    public Object[][] datasets(){
        Object[][] data = {
        				{"Ajay","S ","AjayS@gmail.com","S A@123","323789832","12/2/2022","sasdswdeedopasdfghjkl"},
                           {"aj","aj","ajays@12gmail","aj","asdfgnchv","8/4/2001",""},
                           {"jhjkbwjhgcwuhbdcuyvduc","xjsxhbsuvxkjakswhvdwyvduwdde","ajays@gmail","svxhgsvyxt121213!@!#jhbhh","ajayz221@gmail.com","4/2/2001","9886908"},
                           {"ajayselvan","S S","ajayselvan@gmail.com","K K@123","123445566666","05/20/2022","hello team,"},
                           {"ajay","S","@gmail.com","S A@123","0987654321","02/03/2000","hello team,"},
                           {"ajays","S","ajays@gmail.com","gk@","98342556177","02/02/2001","hello team,"},
                           {"ajays","S","ajays@gmail.com","gk@wh33h","98342556177","6/02/2022","hello team,"},
                           {"ajays","S","ajays@gmail.com","s","98342556177","06/02/2021","hello team,"},
                           {"ajays","S","ajays@gmail.com","aj@de2@!subhsun","98342556177","06/02/2021","hello team,"},
                           {"ajays","S","ajays@gmail.com","aj@","6381726853","06/02/2021","hello team,"},
                           {"ajays","S","ajays@gmail.com","aj@","63817267352","06/02/2021","hello team,"},
                           {"ajays","S","ajays@gmail.com","aj@","6381726853","06/02/2021","hello team,"},
                           {"ajays","S","ajays@gmail.com","aj@","9876775235426123","06/02/2021","hello team,"},
                           {"ajays","S","ajays@gmail.com","aj@","897212@#!98","06/02/2021","hello team,"}
        };                               
        return data;
    }
}