package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ProductsAndCompanyPage  {
    CareerAndCompanyLocators locators = new CareerAndCompanyLocators();

    public ProductsAndCompanyPage openTitle(String param) {
        step("Открытие вкладки", () -> {
            locators.openTitle(param).click();
        });
        return null;
    }

    public ProductsAndCompanyPage checkTitle(String expectedText) {
        step("Проверка содержимого вкладки", () -> {
            locators.checkTitle(expectedText).shouldBe(text(expectedText));
        });
        return null;
    }


    public class CareerAndCompanyLocators {
        public SelenideElement openTitle(String param) {
            return $(byTagAndText("a", (param)));
        }

        public SelenideElement checkTitle(String expectedText) {
            return $((byTagAndText("h1", (expectedText))));
        }
    }
}
