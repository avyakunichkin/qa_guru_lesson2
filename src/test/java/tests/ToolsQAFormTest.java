package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ToolsQAFormTest {

    @Test
    void toolsQAFormTest(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Yak");
        $x(".//*[@id='gender-radio-1']/..").click();
        $("#userNumber").setValue("89898989898");
        $("#submit").scrollTo().click();
        $x(".//*[text()='Student Name']/following-sibling::td").shouldBe(text("Alex"));
        $x(".//*[text()='Gender']/following-sibling::td").shouldBe(text("Male"));
        $x(".//*[text()='Mobile']/following-sibling::td").shouldBe(text("8989898989"));
    }
}
