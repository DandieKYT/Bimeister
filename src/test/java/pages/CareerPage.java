package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;
import static java.awt.SystemColor.window;

public class CareerPage {
    private SelenideElement
            careerOpen = $x("//*[contains(@class, 'header__links')]/a[3]"),
            openHhVacations = $x("//*[contains(@class, 'page-lead__widget')]//*[contains(@class, 'widget-job__link')]/div[3]"),
            activeVacation = $x("//*[contains(@class, 'employer-sidebar-content')]/div[2]/a/span"),

            QaVacation = $x("//*[@id='a11y-search-input']"),
            checkQaVacation = $x("//h1[contains(text(), 'По запросу «» ничего не найдено')]");

    public CareerPage careerOpen() {
        step("Открытие страницы c вакансиями компании", () -> {
            careerOpen.click();
        });
        return this;
    }

    public CareerPage openHhVacations() {
        step("Открытие страницы c вакансиями на HH", () -> {
            openHhVacations.click();
            switchTo().window(1);
        });
        return this;
    }

    public CareerPage activeVacation() {
        step("Нажатие на ссылку активные вакансии", () -> {
            activeVacation.click();
        });
        return this;
    }

    public CareerPage QaVacation() {
        step("Ввод в поиске QA", () -> {
            QaVacation.setValue("QA");
        });
        return this;
    }
    public CareerPage checkQaVacation() {
        step("Проверка наличия вакансии Тестировщик", () -> {
            checkQaVacation.shouldNotBe(Condition.visible);
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }

}
