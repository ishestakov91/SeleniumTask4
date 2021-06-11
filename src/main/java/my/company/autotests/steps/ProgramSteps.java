package my.company.autotests.steps;

import my.company.autotests.pages.ProgramPage;
import org.openqa.selenium.Keys;
import ru.yandex.qatools.allure.annotations.Step;

public class ProgramSteps {

    @Step("На странице присутствует h3 заголовок \"Страхование для путешественников\"")
    public void checkLabelH3() {
        ProgramPage programPage = new ProgramPage();
        programPage.isElementDisplayed(programPage.getLabelTravelers());
    }

    @Step("Страница прокручена до кнопки выбора опции \"Страхование для путешественников\"")
    public void scrollPageToButton() {
        new ProgramPage().getButtonTravelers().sendKeys(Keys.DOWN);
    }

    @Step("Нажата кнопка \"Страхование для путешественников\" - \"Оформить онлайн\"")
    public void submitButton() {
        new ProgramPage().selectButtonTravelers();
    }

}
