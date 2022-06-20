package SmartBearSoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Task 1: navigate to: http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");

        //Task 2: Validate if the title is equals to "Web Orders Login"
        String currentTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";
        if(currentTitle.trim().equals(expectedTitle)){
            System.out.println("pass");
        } else {
            System.out.println("Not passed");
        }


        //Task 3: input username "Tester"
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");
        //Task 4 input password "Test"
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        userPassword.sendKeys("test");
        //Task 5: Click Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();

        //Task 6: Validate "Web Orders" title
        String currentTitleWebOrders = driver.getTitle();
        String expectedTitleWebOrders = "Web Orders".trim();

        if(currentTitleWebOrders.trim().equals(expectedTitleWebOrders)){
            System.out.println("Is the same title");
        } else {
            System.out.println("false");
        }

        //Task 7: headers equals to "List of All Orders"

        WebElement header = driver.findElement(By.xpath("//h2"));
        String currentHeader = header.getText().trim();
        String expectedHeader =  "List of All Orders".trim();

        if(currentHeader.equals(expectedHeader)){
            System.out.println("header pass");
        } else {
            System.out.println("header not pass");
        }
















    }
}
