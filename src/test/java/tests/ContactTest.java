package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ContactTest extends TestBase{
    @Test
    @Tag("checkContacts")
    @Feature("Проверка контактов страницы")
    @Story("Открытие страницы контактов и проверка ее содержимого")
    public void checkContacts(){
    basePage.openPage();
    contactPage.contactPageOpen();
    contactPage.checkAddress();
    contactPage.checkNumberPhone();
    contactPage.checkEmail();
    }
}
