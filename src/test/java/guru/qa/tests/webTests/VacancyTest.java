package guru.qa.tests.webTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class VacancyTest extends TestBase {

    @Test
    void vacancyTest() {
        step("Открываем раздел \"Вакансии\"", () -> {
            open("career/");
            $(".hb2p5qp-F").shouldHave(text("Создавайте будущее вместе с нами"));
        });

        step("Переходим в раздел \"Работа в IT\"", () -> {
            $(".header__a2QKp5").$(byText("Работа в IT")).click();
            $(".aK8zZW").shouldHave(text("Работа в IT"));
        });

        step("Выбираем направление", () -> {
            $(".aqkUm3").click();
            $(".dqkUm3").$(byText("Тестирование")).click();
        });

        step("Проверяем наличие вакансий", () -> {
            $(".beyd61").shouldHave(text("Инженер по тестированию"));
        });

    }
}
