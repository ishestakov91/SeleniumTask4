package my.company.autotests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import my.company.autotests.steps.BaseSteps;

public class PersonPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='Страхование']")
    public WebElement menuInsurance;

    @FindBy(xpath = "//a[text()='Все страховые программы']")
    public WebElement allPrograms;

    public PersonPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuInsurance(){
        menuInsurance.click();
    }

    public void selectAllPrograms(){

        allPrograms.click();
    }
}
