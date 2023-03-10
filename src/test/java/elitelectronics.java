import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class elitelectronics extends ChromeRunner {
    @Test
    public void mymethod(){

        $(".btn-register").click();
        $(byText("სწრაფი რეგისტრაცია"));
        $("#firstName").setValue("Tornike").shouldNotBe(Condition.empty);
        $("#lastName").setValue("Dalakishvili").shouldNotBe(Condition.empty);
        $("#email").setValue("tdalakishvili@gmail.com").shouldNotBe(Condition.empty);
        $("#password").setValue("Elit1234").shouldNotBe(Condition.empty);
        $("#confirmPassword").setValue("Elit1234").shouldNotBe(Condition.empty);
        $("#singup").shouldBe(Condition.enabled);

    }
}
