package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends PageObject {
     @FindBy(id = "logocont")
     private WebElement logo;

     @FindBy(css = ".srg>.g>div>div>h3>a")
     private WebElement searchResult;

    public ResultsPage(WebDriver driver){
        super(driver);
    }

    public boolean resultsDisplayed(){
        return searchResult.isDisplayed();
    }

    public String firstResult(){
        return searchResult.getText();
    }

}





