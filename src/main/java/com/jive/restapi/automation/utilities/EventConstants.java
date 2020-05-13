package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.ContentBody;
import com.jive.restapi.generated.person.models.Event;
import org.apache.commons.lang.RandomStringUtils;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

public class EventConstants {

    private static final String DEFAULT_LOCATION = "Pattaya";

    public enum EventAccessEnum {
        OPEN ("open", 0),
        PRIVATE ("cover", 2),
        CLOSED ("closed", 1);

        private final String eventAccess;
        private final Integer eventAccessID;

        EventAccessEnum(String eventAccess, Integer eventAccessID) {
            this.eventAccess = eventAccess;
            this.eventAccessID = eventAccessID;
        }

        public String getEventAccess() {
            return this.eventAccess;
        }

        public Integer getEventAccessID() {
            return this.eventAccessID;
        }
    }

    public static Event getDefaultEventDataWithVisibility(EventAccessEnum eventAccess) {
        String defaultSubject = String.format("regular-%s-%s",
                Content.TypeEnum.EVENT,
                RandomStringUtils.randomAlphanumeric(8));

        return (Event) new Event()
                .eventAccess(eventAccess.getEventAccess())
                .eventAccessID(eventAccess.getEventAccessID())
                .startDate(OffsetDateTime.now(ZoneOffset.UTC).plusDays(1))
                .endDate(OffsetDateTime.now(ZoneOffset.UTC).plusDays(4))
                .location(DEFAULT_LOCATION)
                .type(Content.TypeEnum.EVENT)
                .subject(defaultSubject)
                .addTagsItem(ContentConstants.defaultTagOne)
                .content(new ContentBody().text(ContentConstants.defaultDescription));
    }
}
