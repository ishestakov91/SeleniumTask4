package my.company.autotests.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class AllScenarioSteps {

    PersonSteps personSteps = new PersonSteps();
    ProgramSteps programSteps = new ProgramSteps();
    StoreFirstTabSteps storeFirstTabSteps = new StoreFirstTabSteps();
    StoreSecondTabSteps storeSecondTabSteps = new StoreSecondTabSteps();

    @When("^Выбран пункт меню Страхование$")
    public void selectMenuItem() {
        personSteps.selectInsurance();
    }

    @When("^Выбран пункт меню Все программы$")
    public void selectPrograms() {
        personSteps.selectPrograms();
    }

    @Then("^На странице присутствует h3 заголовок Страхование для путешественников$")
    public void checkLabelH3() {
        programSteps.checkLabelH3();
    }

    @When("^Страница прокручена до кнопки выбора опции Страхование для путешественников$")
    public void scrollPageToButton() {
        programSteps.scrollPageToButton();
    }

    @When("^Нажата кнопка Страхование для путешественников - Оформить онлайн$")
    public void submitButton() {
        programSteps.submitButton();
    }

    @When("^Страница прокручена до выбора опции страховой защиты$")
    public void pageScrollToOption() {
        storeFirstTabSteps.pageScrollToOption();
    }

    @When("^Выбрана опция минимальной страховой защиты$")
    public void selectMinInsurance() {
        storeFirstTabSteps.selectMinInsurance();
    }

    @When("^Страница прокручена до кнопки Оформить$")
    public void pageScrollToPageBottom() {
        storeFirstTabSteps.pageScrollToPageBottom();
    }

    @Then("^Нажата кнопка Оформить$")
    public void applyMinInsurance() {
        storeFirstTabSteps.applyMinInsurance();
    }

    @When("^Заполнение полей в форме:$")
    public void fillForm(DataTable fields) throws Exception {

        Map<String, String> data = fields.asMap(String.class, String.class);

        for (Map.Entry<String, String> entry : data.entrySet()) {
            String element = entry.getKey();
            String value = entry.getValue();
            storeSecondTabSteps.fillFields(element, value);
        }
    }

    @Then("^Проверка заполнения полей:$")
    public void checkFields(DataTable fields) throws Exception {
        Map<String, String> data = fields.asMap(String.class, String.class);
        storeSecondTabSteps.checkFields(data);
    }

    @Then("^Отправка формы с данными$")
    public void selectContinue() {
        storeSecondTabSteps.selectContinue();
    }

    @Then("^Проверка предупреждений на странице:$")
    public void checkWarnings(DataTable fields) throws Exception {

        Map<String, String> data = fields.asMap(String.class, String.class);
        storeSecondTabSteps.checkWarnings(data);
    }

    @Then("^Ждем 2 секунды$")
    public void waitTwoSeconds() throws Exception {
        Thread.sleep(2000);
    }

    @Then("^Ждем 5 секунд$")
    public void waitFiveSeconds() throws Exception {
        Thread.sleep(5000);
    }

}






