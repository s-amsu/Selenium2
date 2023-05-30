package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","C:\\Program Files\\Google");
        WebDriver driver = new ChromeDriver();

        driver.get("https://account.publix.com/372cde5e-efa2-4da5-9b62-9ee9fd9c4bb8/b2c_1a_publix_v2_signin/oauth2/v2.0/authorize?client_id=42e3d574-4d38-4d73-88da-1b894afb50ca&redirect_uri=https%3A%2F%2Fwww.publix.com&response_mode=form_post&response_type=code%20id_token&scope=openid%20offline_access%20https%3A%2F%2Faccount.publix.com%2F42e3d574-4d38-4d73-88da-1b894afb50ca%2Fpublix.read&state=OpenIdConnect.AuthenticationProperties%3DJFFjj2IQGr_pAIm9TZQ_kbLjgjLCJz97vS6oMXSuBSoG16NkNSuwBszJlbe1FaSniohCKPSiS4SmltrIKNQ_Ox8_kMbFt8N1Y98MVDK6m-p4mBZyjNjhMlBxrVk7umeC_n9QgoyIfTeq8CaSvDym3T9ckROedvYexfIVagSL6soCOfqojABo2s3vZMAO1k2VeZOgLg&nonce=638208282050832055.NDJkMDE3YjItMTk3ZS00ODk1LWE2YzItNTgwOWNiNGJiMzZkM2UyMDU0YzgtOTRlOS00MWI2LTgxMDQtNTkwMWNlYWJhNGMz&x-client-SKU=ID_NET451&x-client-ver=5.2.2.0");
        driver.manage().window().maximize();

        //Tag & Id
        //driver.findElement(By.cssSelector("#email")).sendKeys("David");
        driver.findElement(By.cssSelector("input#signInName")).sendKeys("samsulislam@gmail.com");

        driver.findElement(By.cssSelector("input#password")).sendKeys("12345");

        driver.findElement(By.xpath("//*[@id=\"localAccountForm\"]/div[3]/div[4]/label")).click();

        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();

    }
}
