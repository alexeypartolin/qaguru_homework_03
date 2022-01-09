import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FirstContributorTest {
    @Test
    void firstContributorShouldBeAndreiSolntsev() {
    Configuration.browserSize = "1920x1080";

    open("https://github.com/selenide/selenide");
//        $(".Layout-sidebar").$(byText("Contributors")).closest("div").scrollTo()
//              .$$("ul li").first().hover();


    $$(".Layout-sidebar .BorderGrid-row").find(text("Contributors"))
            .$$("ul li").first().hover();

    $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));

    sleep(3000);
}
}

