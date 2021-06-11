package my.company.autotests.steps;

import my.company.autotests.pages.StorePageSecondTab;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.Map;

public class StoreSecondTabSteps {

    @Step("Заполнение полей в форме")
    public void fillFields(String field, String value) throws Exception {
        new StorePageSecondTab().fillField(field, value);

    }

    @Step("Проверка заполнения полей")
    public void checkFields(Map<String, String> data) throws Exception {

        StorePageSecondTab page = new StorePageSecondTab();

        for (Map.Entry<String, String> entry : data.entrySet()) {
            String value = entry.getKey();
            String element = entry.getValue();
            page.checkFillField(element, value);
        }
    }

    @Step("Отправка формы с данными")
    public void selectContinue() {
        new StorePageSecondTab().selectContinueButton();
    }

    @Step("Проверка предупреждений на странице")
    public void checkWarnings(Map<String, String> data) throws Exception {

        StorePageSecondTab page = new StorePageSecondTab();

        for (Map.Entry<String, String> entry : data.entrySet()) {
            String value = entry.getKey();
            String element = entry.getValue();
            page.checkWarningField(element, value);
        }
    }

}
