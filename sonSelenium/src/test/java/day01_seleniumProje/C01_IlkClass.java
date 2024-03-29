package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /* En ilkel haliyle bir otomasyon yapmak icin
           Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
           bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz
           method 2 parametre istemektedir
           ilki kullanacagimiz driver : webdriver.chrome.driver
           ikincisi ise bu driverin fiziki yolu :
         */
        System.setProperty("webdriver.chrome.driver","/Users/durmuserkaraman/IdeaProjects/Selenium/com.Batch59Selenium/src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
    //şimdi githubda iki ayrı dosya açıp ikisinide ayrı ayrı gönderin birleştirmeden

    }
}