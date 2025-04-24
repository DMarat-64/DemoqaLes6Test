package tests;

import org.junit.jupiter.api.Test;
import pages.DemoqaLes6Page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoqaLes6WithPageObjectsTests extends TestBase {

    DemoqaLes6Page registrationPage = new DemoqaLes6Page();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
        //ФИ=почта+пол+тел
                         .setFirstName("Max")
                         .setLastName("Jons")
                         .setEmail("max@jons.com")
                         .setgenter("Male")
                         .setuserNumber("1234567890")


         //Д/р
                .setDateOfBirth("14", "August","1980")

        //Должность
                .setSubjects("Biology")

        //Увлечение
                .setHobbiesWrapper("Sports")

        //Загрузка картинки
                .setUploadPicture("2025-04-24_13-53-15.png")

        //Текущий адресс
                .setuCurrentAddress("Baker Street 1")

        //Штат и город
                .setState("Haryana")
                .setCity("Karnal")

                .setSubmit();

        //Проверки
        registrationPage.checkResult("Student Name", "Max Jons")
                        .checkResult("Student Email", "max@jons.com")
                        .checkResult("Gender", "Male")
                        .checkResult("Mobile", "1234567890")
                        .checkResult("Date of Birth", "14 August,1980")
                        .checkResult("Subjects", "Biology")
                        .checkResult("Hobbies", "Sports")
                        .checkResult("Picture", "2025-04-24_13-53-15.png")
                        .checkResult("Address", "Baker Street 1")
                        .checkResult("State and City", "Haryana Karnal");

    }

}
