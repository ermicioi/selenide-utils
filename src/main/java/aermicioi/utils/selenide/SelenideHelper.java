package aermicioi.utils.selenide;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.annotation.Nullable;

public class SelenideHelper {

    @Nullable
    public static String $outerText(final SelenideElement el) {
        String text = el.getText();
        for (final WebElement childEl : el.findElements(By.xpath("./*"))) {
            text = text.replace(childEl.getText(), StringUtils.EMPTY);
        }

        return text;
    }

}
