import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class AbleTest extends TestBase {
    @Test
    void ableSiteTest() {
        ableMP.openPage()
            .testStudentsPage()
            .testTeachersPage();

       /* $(byText("1. DATA SCIENCE (8 месяцев)")).shouldBe(visible);
        sleep(8000);
        consult.click();
        sleep(8000);
        Selenide.back();

        techOrda.scrollTo();
        techOrda.shouldBe(visible);
        techOrda.click(); */

    }
}
