package pages.desktop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MortgagePage {
    private final By IF_INCOME_IS_LOWER_LINK = By.xpath("//div[contains(text(),\"Если доход ниже\")]");
    private final By WHO_IS_CO_BORROWER_LINK = By.cssSelector("[href*=\"sozaemschik-po-ipoteke-eto-kto/ \"]");
    private final By IF_INCOME_IS_LOWER_MODAL = By.cssSelector("[data-testid=\"modal\"]");
    private final By BLOCK_TITLE = By.cssSelector("[class*=\"styled__GridContainer\"] [class*=\"styled__SmartText\"]");

    @Step("Открыть модальное окно \"Если доход ниже\"")
    public MortgagePage openIfIncomeIsLowerModalWindow() {
        Selenide.sleep(6000);
        $(BLOCK_TITLE, 0).scrollIntoView(true);
        $(IF_INCOME_IS_LOWER_LINK, 0).shouldBe(Condition.visible, Condition.interactable);
        $(IF_INCOME_IS_LOWER_LINK, 0).click();
        return this;
    }

    @Step("Перейти по ссылке \"Созаемщики по ипотеке\" в модальном окне")
    public MortgagePage viewIfIncomeIsLowerModalWindow() {
        $(IF_INCOME_IS_LOWER_MODAL).shouldBe(Condition.visible);
        $(WHO_IS_CO_BORROWER_LINK).shouldBe(Condition.interactable);
        $(WHO_IS_CO_BORROWER_LINK).click();
        return this;
    }
}
