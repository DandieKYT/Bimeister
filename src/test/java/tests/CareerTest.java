package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CareerTest extends TestBase {
    @Test
    @Tag("qaVacation")
    @Feature("Проверка вакансии тестировщик")
    @Story("Открытие страницы на HH с поиском вакансии QA")
    public void qaVacation() {
        basePage.openPage();
        careerPage.careerOpen();
        careerPage.openHhVacations();
        careerPage.activeVacation();
        careerPage.QaVacation();
        careerPage.checkQaVacation();
    }
}
