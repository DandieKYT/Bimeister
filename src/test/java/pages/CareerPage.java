package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;

public class CareerPage {
    private SelenideElement
            careerOpen = $x("//*[contains(@class, 'header__links')]/a[3]"),
            openHhVacations = $x("//*[contains(@class, 'page-lead__widget')]//*[contains(@class, 'widget-job__link')]/div[3]"),
            regionVacations = $x("//span[text()='Вакансии в других регионах']"),
            QaVacation = $x("//span[text()='Тестировщик']");

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

    public CareerPage regionVacations() {
        step("Открытие вакансий в других регионах", () -> {
            regionVacations.click();
        });
        return this;
    }

    public CareerPage QaVacation() {
        step("Проверка наличия вакансии Тестировщик", () -> {
            QaVacation.shouldBe(Condition.visible);
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }

}
