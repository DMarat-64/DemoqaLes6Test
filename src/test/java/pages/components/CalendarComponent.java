package pages.components;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {

    public void setDate (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1980");
        $(".react-datepicker__month-select").selectOption("August");
        $$(".react-datepicker__day").findBy(text("14")).click();
    }
}
