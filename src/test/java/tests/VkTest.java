package tests;

import org.junit.jupiter.api.Test;

public class VkTest extends TestBase {
    @Test
    public void VkPage() {
        basePage.openPage();
        vkPage.vkIcon();
        vkPage.VkTitleCheck();
    }
}
