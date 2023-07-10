package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ContactPage {
    private SelenideElement
    contactPageOpen = $x("//*[contains(@class, 'header__links')]/a[5]"),
    checkAddress = $x("//*[contains(@class, 'address')]"),
    checkNumberPhone = $x("//a[text()='+7 (495) 795 77 45']"),
    checkEmail = $x("//a[text()='info@bimeister.com']");

    public ContactPage contactPageOpen() {
        step("Открытие страницы Контакты", () -> {
            contactPageOpen.click();
        });
        return this;
    }
    public ContactPage checkAddress() {
        step("Проверка адреса", () -> {
            checkAddress.shouldBe(Condition.text("125284, г. Москва, Ленинградский\n" + "проспект д.35, стр.1"));
        });
        return this;
    }
    public ContactPage checkNumberPhone() {
        step("Проверка номера телефона", () -> {
            checkNumberPhone.shouldBe(Condition.text("+7 (495) 795 77 45"));
        });
        return this;
    }
    public ContactPage checkEmail() {
        step("Проверка адреса электронной почты", () -> {
            checkEmail.shouldBe(Condition.text("info@bimeister.com"));
        });
        return this;
    }
}
