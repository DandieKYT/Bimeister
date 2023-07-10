package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ProductsAndCompanyTest extends TestBase {
    @Tag("BizoneTest")
    @Tag("CareerAndCompanyTest")
    @CsvSource(value = {
            "Продукты и услуги ,      Программные продукты",
            "О компании,             О компании",
    })
    @Owner("Kudryavtsev")
    @Feature("Продукты и Компания")
    @Story("Открытие страниц Продукты и Компания")
    @ParameterizedTest
    public void careerAndCompany(String param, String expectedText) {
        basePage.openPage();
        productsAndCompanyPage.openTitle(param);
        productsAndCompanyPage.checkTitle(expectedText);
    }
}
