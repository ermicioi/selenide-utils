package aermicioi.utils.selenide;

import com.codeborne.selenide.SelenideDriver;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class SelenideExecutionTemplate {

    private final SelenideDriverFactory selenideDriverFactory;

    public <R> R execute(final Function<SelenideDriver, R> func) {
        final var driver = selenideDriverFactory.createDriver();
        try {
            return func.apply(driver);
        } finally {
            if (driver != null) {
                driver.close();
            }
        }
    }
}
