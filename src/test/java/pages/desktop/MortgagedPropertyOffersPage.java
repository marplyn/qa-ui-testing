package pages.desktop;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MortgagedPropertyOffersPage {
    private final By OFFERS_AMOUNT = By.cssSelector(".sort-offers__heading h3");

    public MortgagedPropertyOffersPage checkAmountOfOffers(String expectedValue) {
        $(OFFERS_AMOUNT).shouldHave(Condition.text(expectedValue));
        return this;
    }
}