package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;

import java.util.function.Function;

public class DiscussionUtils {

    public static Content createDefaultDiscussion() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultDiscussionData())
                .executeAs(Function.identity());
    }

    public static Content getDiscussionById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Response createDiscussion(Content discussionData) {
        return ContentUtils.createContent(discussionData);
    }

    public static Response deleteDiscussion(String discussionID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(discussionID)
                .execute(Function.identity());
    }

    public static Content searchDiscussionByName(String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Content updateDiscussionByDiscussionData(Content discussionData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(discussionData)
                .executeAs(Function.identity());
    }

    public static Response createDiscussionToReturnResponse(Content discussionData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(discussionData)
                .reqSpec(spec->spec.log(LogDetail.ALL))
                .execute(Function.identity());
    }

    public static Response updateDiscussionToReturnResponse(Content discussionData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(discussionData)
                .contentIDPath(discussionData.getContentID())
                .execute(Function.identity());
    }
}
