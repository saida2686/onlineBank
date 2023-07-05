import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bankingProject extends Main{
@Test

public void getWeb() {
    driver.get("https://parabank.parasoft.com/parabank/index.htm");

}

    @Test
    public void registerButton() throws InterruptedException {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.name("customer.lastName")).sendKeys("Doe");
        driver.findElement(By.id("customer.address.street")).sendKeys("778 Webster ave");
        driver.findElement(By.name("customer.address.city")).sendKeys("Brooklyn");
        Thread.sleep(300);
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11994");
        driver.findElement(By.xpath("//input[@name='customer.phoneNumber']")).sendKeys("221-444-0000");
        driver.findElement(By.name("customer.ssn")).sendKeys("111-00-0000");
        Thread.sleep(200);
        driver.findElement(By.id("customer.username")).sendKeys("Dj.Doe");
        driver.findElement(By.id("customer.password")).sendKeys("Samarqand");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Samarqand");
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
    }

    @Test
    public void customerLogIn() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Dj.Doe");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Samarqand");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
    @Test
    public void admnPage(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.cssSelector("#headerPanel > ul.leftmenu > li:nth-child(6) > a")).click();
        driver.findElement(By.xpath("(//button[@class='button'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='accessMode1']")).click();
    }
}



}
