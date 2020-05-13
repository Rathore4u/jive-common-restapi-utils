package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.OutcomeType;
import lombok.Getter;

/**
 * Standard OutcomeType.
 */
public enum StandardOutcomeTypes {
    WIP("9", "wip"),
    SUCCESS("6", "success"),
    RESOLVED("5", "resolved"),
    OUTDATED("7", "outdated"),
    PENDING("3", "pending"),
    OFFICIAL("8", "official"),
    FINALIZED("2", "finalized"),
    DECISION("1", "decision");

    @Getter
    private final OutcomeType outcomeType;

    StandardOutcomeTypes(String id, String name) {
        outcomeType = new OutcomeType()
                .id(id)
                .name(name);
    }
}
