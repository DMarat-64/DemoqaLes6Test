package tests;

import org.junit.jupiter.api.Test;
import pages.DemoqaLes6Page;

public class RequiredFieldsLes6Test extends TestBase{

    DemoqaLes6Page registrationPage = new DemoqaLes6Page();

    @Test
    void fillFormRequiredFieldsTest () {
        registrationPage.openPage()
        //ФИ=почта+пол+тел
                         .setFirstName("Max")
                         .setLastName("Jons")
                         .setEmail("max@jons.com")
                         .setgenter("Male")
                         .setuserNumber("1234567890")

        //Д/р
               .setDateOfBirth("14", "August","1980")

        //Увлечение
               .setHobbiesWrapper("Sports")

        //Текущий адресс
                .setuCurrentAddress("Baker Street 1")

                .setSubmit();

        //Проверки
        registrationPage.checkResult("Student Name", "Max Jons")
                .checkResult("Student Email", "max@jons.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "14 August,1980")
                .checkResult("Hobbies", "Sports")
                .checkResult("Address", "Baker Street 1");




    }

}
