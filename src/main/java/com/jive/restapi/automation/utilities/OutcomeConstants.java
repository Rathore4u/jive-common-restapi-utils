package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Outcome;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OutcomeConstants {

    private static final String DEFAULT_NOTE = "outcome note";

    public static Outcome getDefaultOutcomeDataWithType(StandardOutcomeTypes standardOutcomeType) {
        return (Outcome) new Outcome()
                .note(DEFAULT_NOTE)
                .outcomeType(standardOutcomeType.getOutcomeType());
    }
}
