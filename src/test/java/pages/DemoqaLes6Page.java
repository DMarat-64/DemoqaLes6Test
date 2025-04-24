package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoqaLes6Page {

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


    public DemoqaLes6Page openPage () {
        open("/automation-practice-form");

        return this;
    }
    public DemoqaLes6Page setFirstName (String value) {
        firstNameInput.setValue(value);

        return this;
    }
    public DemoqaLes6Page setLastName (String value) {
        lastNameInput.setValue(value);

        return this;
    }
    public DemoqaLes6Page setEmail (String value) {
        userEmailInput.setValue(value);

        return this;
    }
    public DemoqaLes6Page setgenter (String value) {
        genterWrapperInput.$(byText(value)).click();

        return this;
    }
    public DemoqaLes6Page setuserNumber (String value) {
        userNumberInput.setValue(value);

        return this;
    }
    public DemoqaLes6Page setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }
    public DemoqaLes6Page setSubjects (String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }
    public DemoqaLes6Page setHobbiesWrapper (String value) {
        hobbiesWrapperInput.$(byText(value)).click();

        return this;
    }
    public DemoqaLes6Page setUploadPicture (String fileName) {
        uploadPictureInput.uploadFromClasspath("2025-04-24_13-53-15.png");

        return this;
    }
    public DemoqaLes6Page setuCurrentAddress (String value) {
         currentAddressInput.setValue(value);

        return this;
    }
    public DemoqaLes6Page setState (String value) {
        StateInput.setValue(value).pressEnter();

        return this;
    }
    public DemoqaLes6Page setCity (String value) {
        CityInput.setValue(value).pressEnter();

        return this;
    }
    public DemoqaLes6Page setSubmit () {
        submitClosed.click();

        return this;
    }
    //Проверки
    public DemoqaLes6Page checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));

        return this;
    }


}
