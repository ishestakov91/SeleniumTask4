package my.company.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import my.company.autotests.steps.BaseSteps;

import static org.junit.Assert.assertTrue;

public class BasePage {

   public BasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void isElementDisplayed(WebElement webElement) {
        assertTrue(webElement.isDisplayed());
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void wait(int ms) throws Exception {
        Thread.sleep(ms);
    }


}
