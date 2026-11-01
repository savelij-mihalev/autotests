import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikiTests {

    @Test
    void softAssertionsPageShouldContainJUnit5Example() {
        // 1. Открываем репозиторий Selenide
        open("https://github.com/selenide/selenide");

        // 2. Переходим во вкладку Wiki
        $(byText("Wiki")).click();

        // 3. Открываем страницу про Soft assertions
        $(byText("Soft assertions")).click();

        // 4. Проверяем, что на странице есть пример для JUnit5
        $(".markdown-body").shouldHave(text("JUnit5"));
    }
}