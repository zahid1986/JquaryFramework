package homepage.pageobject;

//import common.WebAPI;
import homepage.webelement.HomePageWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends HomePageWebElement {

    @FindBy(how = How.XPATH, using = dagableXp)
    public static WebElement dagable;
    public static WebElement getDagable(){return dagable;}
    public static void clickdagable(){getDagable().click();}
}
