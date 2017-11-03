package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class SearchPage extends PageObject{
    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(id="hplogo")
    private WebElement googleLogo;

    //you can write
    //private WebElement hplogo; 
    //default search strategy by id and name!!!

    
    public SearchPage(WebDriver driver){
        super(driver);
    }

    public boolean isInitialized(){
        return googleLogo.isDisplayed();
    }

    public ResultsPage searchFor(String text){
        searchBox.sendKeys(text);
        searchBox.submit();
        return new ResultsPage(driver);
    }
}








