package pages.desktop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SecurityRulesPage {
    private final By TASK_1_ANSWER = By.cssSelector("[data-fieldset=\"quiz-1\"] input[data-weight=\"1\"]");
    private final By TASK_1_RESULT = By.cssSelector("[data-fieldset=\"quiz-1\"] [class=\"quiz__question-result\"]");
    private final By TASK_1_BTN = By.cssSelector("button[class=\"slide__btn quiz__btn\"][data-parent-fieldset=\"quiz-1\"]");

    private final By TASK_2_ANSWER = By.cssSelector("[data-fieldset=\"quiz-2\"] input[data-weight=\"1\"]");
    private final By TASK_2_RESULT = By.cssSelector("[data-fieldset=\"quiz-2\"] [class=\"quiz__question-result\"]");
    private final By TASK_2_BTN = By.cssSelector("button[class=\"slide__btn quiz__btn\"][data-parent-fieldset=\"quiz-2\"]");

    private final By TASK_3_ANSWER = By.cssSelector("[data-fieldset=\"quiz-3\"] input[data-weight=\"1\"]");
    private final By TASK_3_RESULT = By.cssSelector("[data-fieldset=\"quiz-3\"] [class=\"quiz__question-result\"]");
    private final By TASK_3_BTN = By.cssSelector("button[class=\"slide__btn quiz__btn\"][data-parent-fieldset=\"quiz-3\"]");

    private final By TASK_4_ANSWER = By.cssSelector("[data-fieldset=\"quiz-4\"] input[data-weight=\"1\"]");
    private final By TASK_4_RESULT = By.cssSelector("[data-fieldset=\"quiz-4\"] [class=\"quiz__question-result\"]");
    private final By TASK_4_BTN = By.cssSelector("button[class=\"slide__btn quiz__btn\"][data-result-filedset=\"quiz-final\"]");

    private final By FINAL_RESULT = By.cssSelector("[class*=\"quiz-final__header\"]");

    @Step("Выполнить корректно тест \"Обмани мошенника\"")
    public SecurityRulesPage doSecurityQuizCorrect() {
        Selenide.sleep(6000);
        checkFirstTask();
        checkSecondTask();
        checkThirdTask();
        checkFourthTask();
        return this;
    }

    @Step("Проверить корректный результат Задания №1")
    private SecurityRulesPage checkFirstTask() {
        $(TASK_1_ANSWER).click();
        $(TASK_1_RESULT).shouldBe(Condition.visible).shouldHave(Condition.text("Правильно"));
        $(TASK_1_BTN).click();
        return this;
    }

    @Step("Проверить корректный результат Задания №2")
    private SecurityRulesPage checkSecondTask() {
        $(TASK_2_ANSWER).click();
        $(TASK_2_RESULT).shouldBe(Condition.visible).shouldHave(Condition.text("Правильно"));
        $(TASK_2_BTN).click();
        return this;
    }

    @Step("Проверить корректный результат Задания №3")
    private SecurityRulesPage checkThirdTask() {
        $(TASK_3_ANSWER).click();
        $(TASK_3_RESULT).shouldBe(Condition.visible).shouldHave(Condition.text("Правильно"));
        $(TASK_3_BTN).click();
        return this;
    }

    @Step("Проверить корректный результат Задания №4")
    private SecurityRulesPage checkFourthTask() {
        $(TASK_4_ANSWER).click();
        $(TASK_4_RESULT).shouldBe(Condition.visible).shouldHave(Condition.text("Правильно"));
        $(TASK_4_BTN).click();
        return this;
    }

    @Step("Проверить корректный результат прохождения тесты")
    public SecurityRulesPage checkQuizScore() {
        $(FINAL_RESULT).shouldHave(Condition.text("4/4"));
        return this;
    }
}
