package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Comment;
import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.DirectMessage;
import io.restassured.response.Response;

import java.util.function.Function;

public final class CommentUtils {
    public static Response createComment(Comment comment, Content content) {
        return JiveApiUtils.getApiClient()
                .content()
                .createComment()
                .contentIDPath(content.getContentID())
                .body(comment)
                .execute(Function.identity());
    }

    public static Response getDirectMessageComments(DirectMessage directMessage) {
        return JiveApiUtils.getApiClient()
                .directMessage()
                .getComments()
                .dmIDPath(directMessage.getId())
                .execute(Function.identity());
    }
}
