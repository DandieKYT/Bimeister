package tests;

import org.junit.jupiter.api.Test;

public class NewsTest extends TestBase {
    @Test
    public void newsControlAndSafetyTest(){
        basePage.openPage();
        newsTestPage.mediaCenterOpen();
        newsTestPage.yearSelect();
        newsTestPage.yearVar2022();
        newsTestPage.varControlSafety();
        newsTestPage.controlSafetyResult();
    }
}
