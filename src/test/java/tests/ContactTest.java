package tests;

import org.junit.jupiter.api.Test;

public class ContactTest extends TestBase{
    @Test
    public void checkContacts(){
    basePage.openPage();
    contactPage.contactPageOpen();
    contactPage.checkAddress();
    contactPage.checkNumberPhone();
    contactPage.checkEmail();
    }
}
