package Review11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticalExamples {
    public static void main(String[] args) {

            WebDriver webDriver = new ChromeDriver();
                webDriver.get("https://www.amazon.com/");
                webDriver.findElement(By.xpath("//a[@id='nav-hamburger-menu']//span[contains(text(),'All')]")).click();
                List<WebElement> allATags = webDriver.findElements(By.xpath("//a[@class='hmenu-item']/div"));
                for (WebElement e : allATags) {
                    if (!e.getText().isEmpty()) {//will remove all the tags that are not empty
                        System.out.println(e.getText());
                    }
                }

                webDriver.close();
            }
        }



