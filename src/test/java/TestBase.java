import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import page.AbleMainPage;

public class TestBase {
    AbleMainPage ableMP = new AbleMainPage();

    @BeforeAll
    static void setupAbleTest() {
        Configuration.browserSize = "1920x1080";
    }
}
