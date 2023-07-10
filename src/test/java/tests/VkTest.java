package tests;

import org.junit.jupiter.api.Test;

public class VkTest extends TestBase {
    @Test
    public void vkPage() {
        basePage.openPage();
        vkPage.vkIcon();
        vkPage.VkTitleCheck();
    }
}
