package tests;

import org.junit.jupiter.api.Test;
import pages.CompletionFormsPage;
import pages.components.ResultTableComponent;

public class NegativeLoginTests extends TestBase {

    CompletionFormsPage completionForms = new CompletionFormsPage();
    ResultTableComponent resultTableComponent = new ResultTableComponent();

    @Test
    void negativeLoginTest () {
        completionForms.openPage()
                       .setFirstName("Max")
                       .setLastName("Jons")
                       .setEmail("max@jons.com")
                       .setGender("Male")
                       .setDateOfBirth("14", "August","1980")
                       .setHobbiesWrapper("Sports")
                       .setCurrentAddress("Baker Street 1")
                       .clickSubmit();
        //Проверки
        resultTableComponent.notsuccessfullyCompletedCase()
                .checkResult("Student Name", "Max Jons")
                .checkResult("Student Email", "max@jons.com")
                .checkResult("Gender", "Male")
                .checkResult("Date of Birth", "14 August,1980")
                .checkResult("Hobbies", "Sports")
                .checkResult("Address", "Baker Street 1");
    }

}
