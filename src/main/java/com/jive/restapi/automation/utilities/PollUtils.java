package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class PollUtils {

    public static Content createDefaultPoll() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultPollData())
                .executeAs(Function.identity());
    }

    public static Content getPollById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Response createPoll(Content pollData) {
        return ContentUtils.createContent(pollData);
    }

    public static Response deletePoll(String pollID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(pollID)
                .execute(Function.identity());
    }

    public static Content searchPollByName (String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Content updatePollByPollData (Content pollData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(pollData)
                .executeAs(Function.identity());
    }

    public static Response createPollUnderPlace(Content pollData) {
        return ContentUtils.createContent(pollData);
    }

    public static Response updatePollByToReturnResponse (String id, Content pollData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .contentIDPath(id)
                .body(pollData)
                .execute(Function.identity());
    }
}
