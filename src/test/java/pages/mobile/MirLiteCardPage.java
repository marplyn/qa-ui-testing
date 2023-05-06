package pages.mobile;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MirLiteCardPage {
    private final By ORDER_FORM_PHONE_NUM = By.cssSelector("input[type=\"tel\"]");
    private final By ORDER_FORM_CONTINUE_BTN = By.cssSelector("[class*=\"styled__WrapperButton\"] [data-testid=\"button\"]");
    private final By ORDER_FORM_HINT = By.xpath("//div[contains(text(),\"Введите верный номер\")]");

    public MirLiteCardPage fillPhoneField(String phoneNumber) {
        $(ORDER_FORM_PHONE_NUM).sendKeys(phoneNumber);
        $(ORDER_FORM_CONTINUE_BTN).click();
        return this;
    }

    public MirLiteCardPage checkCorrectNumberHint() {
        $(ORDER_FORM_HINT).shouldBe(Condition.visible);
        return this;
    }
}
