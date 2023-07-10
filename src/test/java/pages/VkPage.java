package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class VkPage {
    private SelenideElement
            vkIcon = $(".socials #vk1 > svg > use"),
            VkTitleCheck = $x("//h1[text()='Bimeister']");

    public VkPage vkIcon() {
        step("Открытие страницы компании в ВК", () -> {
            vkIcon.click();
            switchTo().window(1);
        });
        return this;
    }

    public VkPage VkTitleCheck() {
        step("Проверка заголовка на странице", () -> {
            VkTitleCheck.shouldBe(text("Bimeister"));
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }
}
