package my.company.autotests.steps;

import my.company.autotests.pages.StorePageFirstTab;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class StoreFirstTabSteps {

    @Step("Страница прокручена до выбора опции страховой защиты")
    public void pageScrollToOption() {
        WebDriver driver = BaseSteps.getDriver();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
                new StorePageFirstTab().getMinimalInsurance());
    }

    @Step("Выбрана опция минимальной страховой защиты")
    public void selectMinInsurance() {
        new StorePageFirstTab().selectMinimalInsurance();
    }

    @Step("Страница прокручена до кнопки Оформить")
    public void pageScrollToPageBottom() {
        WebDriver driver = BaseSteps.getDriver();
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Step("Нажата кнопка Оформить")
    public void applyMinInsurance() {
        new StorePageFirstTab().selectApplyEnsurance();
    }
}
