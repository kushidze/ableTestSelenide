package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AbleMainPage {
    private final String
            form_Title = "Стройте карьеру в IT с практикующими специалистами",
            url = "https://able.kz/",
            alexanderStudent = "Александр, 35 лет",
            sabyrStudent = "Сабыр, 28 лет",
            kaiyrlyK = "Кайырлы Куанышпаев";

    SelenideElement
            whatsappChat = $(byText("Перейти в чат")),
            techOrda = $(".tech-toggle_head", 0),
            formTitle = $(".s-first-screen__subtitle"),
            freeConsultButton = $(byText("Бесплатная консультация"), 1),
            teachers = $("[href='#teacher']", 0),
            courseAuthor = $(byText("Автор курса QA")),
            students = $(byText("Студенты")),
            studentsHeaderMenu = $("[href='#history']"),
            studentsAlexanderTitle = $(".history-card"),
            companyHeaderMenu = $(byText("Для компаний")),
            corporateEducation = $("[href='#corpo']"),
            name = $("[placeholder='Ваше имя*']",1),
            email = $("[placeholder='E-mail*']",1),
            phone = $("[placeholder='+7 (...)*']", 1),
            comment = $("[placeholder='Ваш комментарий']",1),
            studentsHistoryTitle = $(".s-nav-fs__cards");

    SelenideElement teacherPageValidate = $$(".section s-teacher section--long-pb .container").find(text("Кайырлы Куанышпаев"));

    public AbleMainPage openPage() {
        open(url);
        formTitle.shouldHave(text(form_Title));
        return this;
    }
    public AbleMainPage testTeachersPage() {
        teachers.click();
        teacherPageValidate.scrollTo();
        teacherPageValidate.shouldHave(text(kaiyrlyK));
        return this;
    }
    public AbleMainPage testStudentsPage() {
        students.hover();
        studentsHeaderMenu.click();
        studentsAlexanderTitle.shouldHave(text(alexanderStudent));
        return this;
    }
    public AbleMainPage openConsultForm() {
        freeConsultButton.click();
        return this;
    }

}
