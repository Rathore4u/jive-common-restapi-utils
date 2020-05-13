package com.jive.restapi.automation.utilities;

import java.util.function.Function;

import com.jive.restapi.automation.utilities.v3.ApiUtils;
import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.MessageApi;
import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.Message;
import com.jive.restapi.generated.person.models.OutcomeBase;

import io.restassured.response.Response;

public class MessageUtils {

    public static Response createMessageWithDefaultData(String discussionUri) {
        return JiveApiUtils.getApiClient()
                .message()
                .createMessage()
                .body(ContentConstants.getDefaultMessageData(discussionUri))
                .execute(Function.identity());
    }

    public static Response createMessageWithMessageData(Message message) {
        return JiveApiUtils.getApiClient()
                .message()
                .createMessage()
                .body(message)
                .execute(Function.identity());
    }

    public static Response updateMessage(Message message) {
        return JiveApiUtils.getApiClient()
                .message()
                .updateMessage()
                .body(message)
                .execute(Function.identity());
    }

    public static Response deleteMessage(Message message) {
        return JiveApiUtils.getApiClient()
                .message()
                .deleteMessage()
                .messageIDPath(message.getId())
                .execute(Function.identity());
    }

    public static Response getContentReplies(Content content) {
        return JiveApiUtils.getApiClient()
                .message()
                .getContentReplies()
                .contentIDPath(content.getContentID())
                .execute(Function.identity());
    }

    public static Response createOutcome(
            String msgID,
            OutcomeBase body,
            Options.OptionsBuilder<MessageApi.CreateOutcomeOper>... options) {
        return Options.execute(ApiUtils.apiClient().message()
                .createOutcome()
                .messageIDPath(msgID)
                .body(body), options);

    }
}
