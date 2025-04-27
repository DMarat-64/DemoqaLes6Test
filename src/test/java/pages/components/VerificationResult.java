package pages.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class VerificationResult {
    private final SelenideElement modal = $(".modal-content");
    private final ElementsCollection tableRows = $$("table tr");


    public VerificationResult checkResult(String fieldName, String expectedValue) {
        tableRows.findBy(text(fieldName)).shouldHave(text(expectedValue));
        return this;
    }

    public VerificationResult successfullyCompletedCase(){
   // verifyFormSubmittedSuccessfully() {
        modal.shouldBe(visible);
        return this;
    }

    public VerificationResult notsuccessfullyCompletedCase() {
        modal.shouldNotBe(visible);
        return this;
    }
}
