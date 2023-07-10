package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;

public class NewsTestPage {
    private SelenideElement
            mediaCenterOpen = $x("//*[contains(@class, 'header__links')]/a[4]"),
            yearSelect = $x("//*[contains(@class, 'select-filter__main')]"),
            yearVar2022 = $x("//div[text()='2022']"),
            varControlSafety = $x("//div[text()='Контроль безопасности']"),
            controlSafetyResult = $x("//div[contains(text(), 'Bimeister внедрила решение для контроля безопасности ПО Solar appScreener компании «РТК-Солар»')]");

    public NewsTestPage mediaCenterOpen() {
        step("Открытие страницы медиа-центр", () -> {
            mediaCenterOpen.click();
        });
        return this;
    }

    public NewsTestPage yearSelect() {
        step("Активация плашки выбора года", () -> {
            yearSelect.click();
        });
        return this;
    }

    public NewsTestPage yearVar2022() {
        step("Нажатие на 2022 год", () -> {
            yearVar2022.click();
        });
        return this;
    }

    public NewsTestPage varControlSafety() {
        step("Выбор категории - Контроль безопасности", () -> {
            varControlSafety.click();
        });
        return this;
    }

    public NewsTestPage controlSafetyResult() {
        step("Проверка результата выдачи", () -> {
            controlSafetyResult.shouldBe(Condition.text("Bimeister внедрила решение для контроля безопасности ПО Solar appScreener компании «РТК-Солар»"));
        });
        return this;
    }
}
