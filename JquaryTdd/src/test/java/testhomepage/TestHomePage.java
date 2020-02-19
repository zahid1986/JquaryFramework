package testhomepage;

import homepage.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    public static void getInitElements(){
        PageFactory.initElements(driver,HomePage.class);}

        @Test(priority = 1)
    public static void testDragable() throws InterruptedException {
        getInitElements();
        sleepFor(4);
            clickdagable();
        }



}
