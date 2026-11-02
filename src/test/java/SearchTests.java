import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void successfulSearchTest() {
        open("https://github.com/search");
        $("input[placeholder='Search GitHub']").setValue("qa.guru").pressEnter();
        $("[data-testid='results-list']").shouldHave(text("QA.GURU"));
    }

    @AfterEach
    void closeBrowser() {
        closeWebDriver();
    }
}