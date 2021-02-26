package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ToolsQAFormTest {

    @Test
    void toolsQAFormTest(){
        String phone = "8989898989";
        String firstName = "Alex";
        String lastName = "Yak";
        String gender = "Male";

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $(byText(gender)).click();
        $("#userNumber").setValue(phone);
        $("#submit").scrollTo().click();

        $x(".//*[text()='Student Name']").sibling(0).shouldBe(text(firstName + " " + lastName));
        $x(".//*[text()='Gender']/following-sibling::td").shouldBe(text(gender));
        $x(".//*[text()='Mobile']/following-sibling::td").shouldBe(text(phone));
    }
}
