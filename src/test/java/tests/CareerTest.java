package tests;

import org.junit.jupiter.api.Test;

public class CareerTest extends TestBase {
    @Test
    public void qaVacation() {
        basePage.openPage();
        careerPage.careerOpen();
        careerPage.openHhVacations();
        careerPage.regionVacations();
        careerPage.QaVacation();
    }
}
