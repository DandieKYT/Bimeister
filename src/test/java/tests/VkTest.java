package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class VkTest extends TestBase {
    @Test
    @Tag("vkPage")
    @Feature("Открытие страницы в ВК")
    @Story("Открытие и проверка содержимого страницы ВК")
    public void vkPage() {
        basePage.openPage();
        vkPage.vkIcon();
        vkPage.VkTitleCheck();
    }
}
