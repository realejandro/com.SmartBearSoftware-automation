package SmartBearSoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {
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

        //task 5: Click "View All products" button
        WebElement allProductsViewButton = driver.findElement(By.xpath("//a[contains(text(), 'View all products')]"));
        allProductsViewButton.click();
        Thread.sleep(5000);

        //Task 6: Validate "View all products" is selected
        /*if(allProductsViewButton.isEnabled()){
            System.out.println(allProductsViewButton.isSelected());
        } else {
            System.out.println(false);
        }*/

        //Task 7: validate "List of Products" header
        WebElement headerListOfProducts = driver.findElement(By.xpath("//h2[contains(text(), 'List of Products')]"));
        String currentHeaderListOfProducts = headerListOfProducts.getText();
        String expectedHeader = "List of Products";
        if(currentHeaderListOfProducts.trim().equals(expectedHeader)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 8: Validate Url has "Products" keyword
        String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx";
        if(url.contains("Products")){
            System.out.println("url: " + true);
        } else {
            System.out.println("url: " + false);
        }








    }
}
