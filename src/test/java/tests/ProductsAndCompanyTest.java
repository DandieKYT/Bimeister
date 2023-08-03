package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ProductsAndCompanyTest extends TestBase {
    @Tag("productsAndCompany")
    @CsvSource(value = {
            "Продукты и услуги ,      Программные продукты",
            "О компании,             О компании",
    })
    @Owner("Kudryavtsev")
    @Feature("Продукты и Компания")
    @Story("Открытие страниц Продукты и Компания и проверка их содержимого")
    @ParameterizedTest
    @DisplayName("Продукты и Компания")
    public void productsAndCompany(String param, String expectedText) {
        basePage.openPage();
        productsAndCompanyPage.openTitle(param);
        productsAndCompanyPage.checkTitle(expectedText);
    }
}
