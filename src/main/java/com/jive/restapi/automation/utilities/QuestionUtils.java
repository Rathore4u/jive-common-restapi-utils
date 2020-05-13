package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class QuestionUtils {

    public static Response createQuestion(Content questionData) {
        return ContentUtils.createContent(questionData);
    }

    public static Content getQuestionById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Content createDefaultQuestion() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultContentDataForQuestion())
                .executeAs(Function.identity());
    }

    public static Response deleteQuestion(String taskID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(taskID)
                .execute(Function.identity());
    }

    public static Content searchQuestionByName (String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Response createQuestionToReturnResponse(Content questionData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(questionData)
                .execute(Function.identity());
    }

    public static Response updateQuestionToReturnResponse(Content questionData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(questionData)
                .contentIDPath(questionData.getContentID())
                .execute(Function.identity());
    }

    public static Response getResponseOfQuestionById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .execute(Function.identity());
    }
}
