import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class basket extends ChromeRunner {
    @Test
    public void mymethod_1() {

        $(".btn-register").click();
        $(byText("სწრაფი რეგისტრაცია"));
        $("#singup").shouldBe(Condition.disabled);
        $("#firstName").click();
        $("#lastName").click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $("#lastName").click();
        $("#email").click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible, Duration.ofMillis(10000));
        $("#email").click();
        $("#password").click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#password").click();
        $("#confirmPassword").click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $("#confirmPassword").click();
        $("#password").click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);

    }

    @Test
    public void mymethod_2() {

        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible, Duration.ofMillis(7000));
        $("#search_list").setValue("notebook");
        $(".search-btn").click();
        $(".d-xs-none", 0).click();
        $(".add_to_cart", 0).click();
        $(".cart-count").click();
        $(".Collapsible__trigger").shouldBe(Condition.visible);
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible, Duration.ofMillis(7000));


    }

}
