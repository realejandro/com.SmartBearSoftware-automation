package SmartBearSoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //task1: Navigate to the website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");

        //Task 2: input username "Tester"
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");

        //Task 3 input password "Test"
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        userPassword.sendKeys("test");

        //Task 4: Click Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();

        //task 5: find the links for: View all orders, View all products, Orders.
        List <WebElement> allOrdersLink = driver.findElements(By.xpath("/html/body/form/table/tbody/tr/td/ul/li/a"));
        for (WebElement element : allOrdersLink){
            System.out.println(element.getText());
        }


        //Validate href values are equals to: Default.aspx Products.aspx Process.aspx
        for(int i = 0; i < allOrdersLink.size(); i++){
            if(allOrdersLink.get(0).getAttribute("href").endsWith("Default.aspx")){
                System.out.println(true);
            }

            if(allOrdersLink.get(1).getAttribute("href").endsWith("Products.aspx")){
                System.out.println(true);
            }

            if(allOrdersLink.get(2).getAttribute("href").endsWith("Process.aspx")){
                System.out.println(true);
            }


            break;
        }


    }
}
