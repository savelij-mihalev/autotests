import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class WikiTests {

    @Test
    void softAssertionsPageShouldContainJUnit5Example() {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("JUnit5"));
    }

    @AfterEach
    void closeBrowser() {
        closeWebDriver();
    }
}