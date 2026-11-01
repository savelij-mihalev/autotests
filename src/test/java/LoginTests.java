import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("somepasshere").pressEnter();
    }

    @Test
    void negativeLoginTest() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("qagurubot@gmail.com");
        $("[name=password]").setValue("asfdasewrw").pressEnter();

        $("[name=password]").shouldBe(visible);
    }
}