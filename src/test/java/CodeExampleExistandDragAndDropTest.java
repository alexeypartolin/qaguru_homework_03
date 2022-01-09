import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CodeExampleExistandDragAndDropTest {
        @Test
        void junit5CodeExampleExistTest() {
            open("https://github.com/selenide/selenide");
            $("#wiki-tab").click();
            $("#wiki-body").$(byText("Soft assertions")).shouldBe(); // 1 Вариант проверки текста
            $(byText("Soft assertions")).click();
            $("body").shouldHave(Condition.text("Using JUnit5 extend test class:")); // 2 Вариант проверки текста
        }

        @Test
        void dragAndDropTest() {
            open("https://the-internet.herokuapp.com/drag_and_drop");
            $("#column-a").dragAndDropTo("#column-b");
            $(".column", 1).shouldHave(Condition.text("A"));
        }
    }
