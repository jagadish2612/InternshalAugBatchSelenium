package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {

    WebDriver driver; //step 1

    private By googleSearchButton = By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]/center/input[1]"); //step 2

    @FindBy(xpath = "//textarea[@id=\"APjFqb\"]")
    WebElement googleSearchField;

    @FindBy(xpath = "//a[text()='About']")
    WebElement aboutButton;

    public GooglePage(WebDriver driver) //step 3
    {
        this.driver=driver;
    }

    public void googleSearch(String data) {  //step 4
        googleSearchField.sendKeys(data);
    }

    public String getaboutLinkText()
    {
       return aboutButton.getText();
    }

    public boolean checkGoogleSearchButton()
    {
        return driver.findElement(googleSearchButton).isEnabled();
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }


}
