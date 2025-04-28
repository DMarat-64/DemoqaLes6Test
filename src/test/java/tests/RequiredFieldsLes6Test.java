package tests;

import org.junit.jupiter.api.Test;
import pages.CompletionFormsPage;
import pages.components.ResultTableComponent;

public class RequiredFieldsLes6Test extends TestBase{

    CompletionFormsPage completionForms = new CompletionFormsPage();
    ResultTableComponent resultTableComponent = new ResultTableComponent();

    @Test
    void fillFormRequiredFieldsTest () {
        completionForms.openPage()
                       .setFirstName("Max")
                       .setLastName("Jons")
                       .setEmail("max@jons.com")
                       .setGender("Male")
                       .setUserNumber("1234567890")
                       .setDateOfBirth("14", "August","1980")
                       .setHobbiesWrapper("Sports")
                       .setCurrentAddress("Baker Street 1")
                       .clickSubmit();
        //Проверки
        resultTableComponent.successfullyCompletedCase()
                .checkResult("Student Name", "Max Jons")
                .checkResult("Student Email", "max@jons.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "14 August,1980")
                .checkResult("Hobbies", "Sports")
                .checkResult("Address", "Baker Street 1");
    }

}
