package tests;

import org.junit.jupiter.api.Test;
import pages.AuthorizationFormPage;
import pages.components.VerificationResult;

public class NegativeLoginTests extends TestBase {

    AuthorizationFormPage registrationPage = new AuthorizationFormPage();
    VerificationResult verificationresult = new VerificationResult();

    @Test
    void negativeLoginTest () {
        registrationPage.openPage()
                //ФИ+почта+пол - без телефона
                .setFirstName("Max")
                .setLastName("Jons")
                .setEmail("max@jons.com")
                .setgenter("Male")
                .setuserNumber("")

                //Д/р
                .setDateOfBirth("14", "August","1980")

                //Увлечение
                .setHobbiesWrapper("Sports")

                //Текущий адресс
                .setuCurrentAddress("Baker Street 1")

                .setSubmit();

        //Проверки
        verificationresult.notsuccessfullyCompletedCase()
                .checkResult("Student Name", "Max Jons")
                .checkResult("Student Email", "max@jons.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "14 August,1980")
                .checkResult("Hobbies", "Sports")
                .checkResult("Address", "Baker Street 1");
    }

}
