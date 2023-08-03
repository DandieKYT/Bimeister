package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class NewsTest extends TestBase {
    @Test
    @Tag("newsControlAndSafetyTest")
    @Feature("Проверка страницы Медиа-центр")
    @Story("Открытие страницы Медиа-центр и проверка новостей по дате и категории")
    @DisplayName("Проверка страницы Медиа-центр")
    public void newsControlAndSafetyTest(){
        basePage.openPage();
        newsTestPage.mediaCenterOpen();
        newsTestPage.yearSelect();
        newsTestPage.yearVar2022();
        newsTestPage.varControlSafety();
        newsTestPage.controlSafetyResult();
    }
}
