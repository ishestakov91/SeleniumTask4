package my.company.autotests.steps;

import my.company.autotests.pages.PersonPage;
import ru.yandex.qatools.allure.annotations.Step;

public class PersonSteps {

    @Step("Выполнено нажатие на меню Страхование")
    public void selectInsurance() {
        new PersonPage().selectMenuInsurance();
    }

    @Step("Выбран пункт меню \"Все программы\"")
    public void selectPrograms() {
        new PersonPage().selectAllPrograms();
    }

}
