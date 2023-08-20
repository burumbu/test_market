package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


class QQ {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita.Rozhkov\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        // ввел время ожидания страницы
        driver.manage().window().maximize();
        // размер экрана браузера
        driver.get("https://ya.ru/");

        driver.findElement(By.xpath("//div[@class = 'search3__input-wrapper']//input[@id = 'text']")).click();
        driver.findElement(By.xpath("//div[@class = 'services-suggest__item-title']")).click();
        //зашли в маркет, вероятно, нужно было использовать @Findby и вводить свои классы далее
        driver.findElement(By.xpath("//div[@data-zone-name = 'catalog']//button")).click();
        driver.findElement(By.xpath("//a[@class = 'egKyN _1mqvV _1wg9X']['Смартфоны']")).click();
        driver.findElement(By.xpath("//div[@data-zone-name = 'all-filters-button']//button")).click();
        driver.findElement(By.xpath("//div[@data-zone-name = 'catalog']//button")).click();
        driver.findElement(By.xpath("//a[@class = 'egKyN _1mqvV _1wg9X']['Смартфоны']")).click();
        driver.findElement(By.xpath("//div[@class = 'yXKAc _1H_kO']//input[@data-auto = 'range-filter-input-max']")).click();
        driver.findElement(By.xpath("//div[@class = 'yXKAc _1H_kO']//input[@data-auto = 'range-filter-input-max']")).sendKeys("20000");
        // xpath, вероятно, не совсем корректен, но другие варианты, не вводя никаких классов/переменных и пр., не нашел
        driver.findElement(By.xpath("//div[@class = '_3918R _2GwyK']//button[@aria-controls = '14805766']")).click();
        driver.findElement(By.xpath("//div[@class = 'yXKAc _1H_kO']//input[@wfd-id = 'id454']")).click();
        driver.findElement(By.xpath("//div[@class = 'yXKAc _1H_kO']//input[@wfd-id = 'id454']")).sendKeys("3");
        // на странице было 2 варианта ввода диагонали. если выбирать через чекбоксы, то нужно было вводить проверку по минимальному значению чекобокса и если он не подпадает под нужное значение - сразу переходить к точному вводу диагонали
        driver.findElement(By.xpath("//input[@value = 'Apple']")).click();
        driver.findElement(By.xpath("//input[@value = 'Blackview']")).click();
        driver.findElement(By.xpath("//input[@value = 'BQ']")).click();
        driver.findElement(By.xpath("//input[@value = 'HONOR']")).click();
        driver.findElement(By.xpath("//input[@value = 'HUAWEI']")).click();
        //тут также, вероятно, надо было иначе решить с массовым проставлением чек-боксов
        driver.findElement(By.xpath("//*[@data-auto = 'result-filters-link']")).click();
        driver.findElement(By.xpath("//*[@data-autotest-id = 'dprice']")).click();
        driver.findElement(By.xpath("//span[@class = '_1E10J _2o124 _1zh3_']")).click();
        driver.quit();



    }

}


