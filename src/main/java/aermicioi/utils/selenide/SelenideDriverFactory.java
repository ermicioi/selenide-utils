package aermicioi.utils.selenide;

import com.codeborne.selenide.SelenideDriver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class SelenideDriverFactory {

    private final SelenideProperties selenideProperties;

    public SelenideDriver createDriver() {
        log.trace("Creating driver with properties {}", this.selenideProperties);
        return new SelenideDriver(selenideProperties);
    }

}
