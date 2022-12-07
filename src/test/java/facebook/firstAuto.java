package facebook;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class firstAuto {
    @Test
    public void test(){
        open("https://www.facebook.com/");
        $(byLinkText("Create new account")).click();
        $(byName("firstname")).setValue("Nika");
        $(byName("lastname")).setValue("Gelovani");
        $(byName("reg_email__")).setValue("nikagelo@gmail.com");
        $(byName("reg_passwd__")).setValue("Test123");
        $(byName("birthday_month")).selectOption("Jun");
        $(byName("birthday_day")).selectOption("28");
        $(byName("birthday_year")).selectOption("2000");
//        $(byClassName("_5k_3")).selectRadio("Custom");
        $(byText("Custom")).click();
        $(byText("Select your pronoun")).shouldBe(Condition.visible);
        $(byName("custom_gender")).shouldBe(Condition.visible);
        $(byName("preferred_pronoun")).selectOption("He: \"Wish him a happy birthday!\"");
        $(byText("Male")).click();
        $(byText("Select your pronoun")).shouldNotBe(Condition.visible);
        $(byName("custom_gender")).shouldNotBe(Condition.visible);
        sleep(3000);
    }
}
