package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Comment;
import com.jive.restapi.generated.person.models.DirectMessage;
import com.jive.restapi.generated.person.models.DirectMessageRequest;
import com.jive.restapi.generated.person.models.InlineObject2;
import io.restassured.response.Response;

import java.util.function.Function;

import static com.jive.restapi.automation.utilities.JiveApiUtils.getApiClient;

public class DirectMessageUtils {
    public static DirectMessage defaultDirectMessage() {
        return new DirectMessage()
                .type("dm");
    }

    public static Response sendDirectMessage(DirectMessageRequest dmRequest) {
        return getApiClient()
                .directMessage()
                .createDirectMessage()
                .body(dmRequest)
                .execute(Function.identity());
    }

    public static Response deleteDirectMessage(String id) {
        return getApiClient()
                .directMessage()
                .deleteDirectMessage()
                .dmIDPath(id)
                .execute(Function.identity());
    }

    public static Response updateSubject(String id, String subject) {
        return getApiClient()
                .directMessage()
                .setSubject()
                .dmIDPath(id)
                .body(new InlineObject2()
                        .subject(subject))
                .execute(Function.identity());
    }

    public static Response addReply(DirectMessage directMessage, Comment comment) {
        return getApiClient()
                .directMessage()
                .createComment()
                .dmIDPath(directMessage.getId())
                .body(comment)
                .execute(Function.identity());
    }

    public static Response getDirectMessageContentImages(DirectMessage directMessage) {
        return getApiClient()
                .directMessage()
                .getContentImages()
                .dmIDPath(directMessage.getId())
                .execute(Function.identity());
    }

    public static Response getDirectMessageById(String ID) {
        return getApiClient()
                .directMessage()
                .getDirectMessage()
                .dmIDPath(ID)
                .execute(Function.identity());
    }
}
