package Review13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Constants;

import java.util.List;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {
        List<Map<String, String>> empData = ExcelReader.readData(Constants.EXCEL_FILE_PATH, "Sheet2");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22%22");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement Loginbtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        Loginbtn.click();

        for (Map<String, String> map : empData) {
            WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();
            WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmp.click();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("LastName"));
            WebElement saveButton = driver.findElement(By.xpath(" //input[@id='btnSave']"));
            saveButton.click();
            WebElement editButton = driver.findElement(By.xpath("//input[@value='Edit']"));
            editButton.click();
            WebElement EmployeeID = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
            EmployeeID.sendKeys(map.get("EmployeeID"));
            WebElement OtherID = driver.findElement(By.xpath("//input[@name='personal[txtOtherID]']"));
            OtherID.sendKeys(map.get("OtherID"));
            WebElement DL = driver.findElement(By.xpath("//input[@name='personal[txtLicenNo]']"));
            DL.sendKeys(map.get("DriversLicenseNumber"));
            WebElement calender = driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
            calender.click();
            WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select Year = new Select(year);
            Year.selectByVisibleText("2022");
            WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select Month = new Select(month);
            Month.selectByValue("5");
            List<WebElement> date = driver.findElements(By.xpath("//table/tbody/tr/td"));
            for (WebElement dates : date) {
                String currentdate = dates.getText();
                if (currentdate.equals("5")) {
                    dates.click();
                    break;
                }
            }
            WebElement SSN = driver.findElement(By.xpath("//input[@id='personal_txtNICNo']"));
            SSN.sendKeys(map.get("SSN"));
            WebElement SIN = driver.findElement(By.xpath(" //input[@id='personal_txtSINNo']"));
            SIN.sendKeys(map.get("SINNumber"));
            WebElement Gender = driver.findElement(By.xpath(" //input[@id='personal_optGender_1']"));
            Gender.click();
            WebElement maritalstatus = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
            Select ms = new Select(maritalstatus);
            ms.selectByVisibleText("Married");
            WebElement nationality = driver.findElement(By.xpath("//select[@name='personal[cmbNation]']"));
            Select nation = new Select(nationality);
            nation.selectByVisibleText("Pakistani");
            WebElement DOB=driver.findElement(By.xpath("//input[@name='personal[DOB]']"));
            DOB.click();
            WebElement DOY=driver.findElement(By.xpath(" //select[@class='ui-datepicker-year']"));
            Select doy=new Select(DOY);
            doy.selectByVisibleText("2015");
            WebElement DOM=driver.findElement(By.xpath(" //select[@class='ui-datepicker-month']"));
            Select dom=new Select(DOM);
            dom.selectByVisibleText("May");
            List<WebElement>  dateofbirth=driver.findElements(By.xpath("//table/tbody/tr/td"));
            for(WebElement datesbirth:dateofbirth){
                String currentbirthdate=datesbirth.getText();
                if(currentbirthdate.equals("15")){
                    datesbirth.click();
                    break;
                }
            }
          WebElement nickname=driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']"));
            nickname.sendKeys(map.get("NickName"));
          WebElement smoker=driver.findElement(By.xpath(" //input[@id='personal_chkSmokeFlag']"));
          smoker.click();
          WebElement military=driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']"));
          military.sendKeys(map.get("MilitaryService"));

        }
    }
}
