package SmartBearSoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        //task1: Navigate to the website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");

        //Task 2: input username "Tester"
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");

        //Task 3 input password "Test"
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        userPassword.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();

        WebElement orderButton = driver.findElement(By.xpath("//a[contains(text(), 'Order')]"));
        orderButton.click();

        WebElement product = driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select selectProduct = new Select(product);
        selectProduct.selectByValue("ScreenSaver");

        WebElement quantity = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantity.sendKeys("5");


        //Customer section
        WebElement customerInput = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        customerInput.sendKeys("Techtorial Academy");

        WebElement street = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        street.sendKeys("2200 E devon");

        WebElement city = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        city.sendKeys("Chicago");

        WebElement state = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        state.sendKeys("Illinois");

        WebElement zipCode = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipCode.sendKeys("60062");

        WebElement masterCardPayment = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_1']"));
        masterCardPayment.click();

        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        cardNumber.sendKeys("444993876233");

        WebElement expirationDate = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        expirationDate.sendKeys("03/22");

        WebElement processButton = driver.findElement(By.xpath("//a[contains(text(), 'Process')]"));
        processButton.click();
        Thread.sleep(1500);

        WebElement message = driver.findElement(By.xpath("//strong"));

        System.out.println("is displayed? :"+ message.isDisplayed());//true

        WebElement allOrdersButton = driver.findElement(By.xpath("//a[contains(text(),'View all orders')]"));
        allOrdersButton.click();

        List<WebElement> allOrderList = driver.findElements(By.xpath("//table[@class='SampleTable']//tbody//tr//td[2]"));
        for (WebElement e: allOrderList){
            if(e.getText().trim().equals("Techtorial Academy")){
                System.out.println(true);
            }
        }







    }
}
