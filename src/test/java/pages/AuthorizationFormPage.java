package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationFormPage {

    private SelenideElement firstNameInput = $("#firstName"),
                            lastNameInput = $("#lastName"),
                            userEmailInput = $("#userEmail"),
                            genterWrapperInput = $("#genterWrapper"),
                            userNumberInput = $("#userNumber"),
                            calendarInput = $("#dateOfBirthInput"),
                            subjectsInput = $("#subjectsInput"),
                            hobbiesWrapperInput = $("#hobbiesWrapper"),
                            uploadPictureInput = $("#uploadPicture"),
                            currentAddressInput = $("#currentAddress"),
                            StateInput = $("#react-select-3-input"),
                            CityInput = $("#react-select-4-input"),
                            submitClosed = $("#submit");

    CalendarComponent calendarComponent = new CalendarComponent();


    public AuthorizationFormPage openPage () {
        open("/automation-practice-form");

        return this;
    }
    public AuthorizationFormPage setFirstName (String value) {
        firstNameInput.setValue(value);

        return this;
    }
    public AuthorizationFormPage setLastName (String value) {
        lastNameInput.setValue(value);

        return this;
    }
    public AuthorizationFormPage setEmail (String value) {
        userEmailInput.setValue(value);

        return this;
    }
    public AuthorizationFormPage setgenter (String value) {
        genterWrapperInput.$(byText(value)).click();

        return this;
    }
    public AuthorizationFormPage setuserNumber (String value) {
        userNumberInput.setValue(value);

        return this;
    }
    public AuthorizationFormPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }
    public AuthorizationFormPage setSubjects (String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }
    public AuthorizationFormPage setHobbiesWrapper (String value) {
        hobbiesWrapperInput.$(byText(value)).click();

        return this;
    }
    public AuthorizationFormPage setUploadPicture (String fileName) {
        uploadPictureInput.uploadFromClasspath("2025-04-24_13-53-15.png");

        return this;
    }
    public AuthorizationFormPage setuCurrentAddress (String value) {
         currentAddressInput.setValue(value);

        return this;
    }
    public AuthorizationFormPage setState (String value) {
        StateInput.setValue(value).pressEnter();

        return this;
    }
    public AuthorizationFormPage setCity (String value) {
        CityInput.setValue(value).pressEnter();

        return this;
    }
    public AuthorizationFormPage setSubmit () {
        submitClosed.click();

        return this;
    }
    //Проверки
    public AuthorizationFormPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));

        return this;
    }


}
