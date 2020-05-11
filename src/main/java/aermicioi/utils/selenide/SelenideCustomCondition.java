package aermicioi.utils.selenide;

import com.codeborne.selenide.Condition;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SelenideCustomCondition {

    public static final Condition CLICKABLE = Condition.and("Clickable", Condition.visible, Condition.enabled);

}
