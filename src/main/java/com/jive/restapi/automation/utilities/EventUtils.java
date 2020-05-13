package com.jive.restapi.automation.utilities;

import com.jive.restapi.automation.utilities.EventConstants.EventAccessEnum;
import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class EventUtils {

    public static Response createDefaultEvent() {
        return ContentUtils.createContent(ContentConstants.getDefaultEventData());
    }

    public static Response createDefaultEventWithVisibility(EventAccessEnum eventAccess) {
        return ContentUtils.createContent(
                EventConstants.getDefaultEventDataWithVisibility(eventAccess));
    }

    public static Content getEventById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Response createEvent(Content eventData) {
        return ContentUtils.createContent(eventData);
    }

    public static Response deleteEvent(String eventId) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(eventId)
                .execute(Function.identity());
    }

    public static Content updateEventByEventData (Content eventData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(eventData)
                .executeAs(Function.identity());
    }

    public static Response createEventToReturnResponse(Content eventData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(eventData)
                .execute(Function.identity());
    }

    public static Response updateEventToReturnResponse(Content eventData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(eventData)
                .contentIDPath(eventData.getContentID())
                .execute(Function.identity());
    }

    public static Response getResponseOfEventById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .execute(Function.identity());
    }
}
