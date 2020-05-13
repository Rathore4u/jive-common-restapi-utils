package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class IdeaUtils {

    public static Response createDefaultIdea() {
        return ContentUtils.createContent(ContentConstants.getDefaultIdeaData());
    }

    public static Content getIdeaById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Response createIdea(Content ideaData) {
        return ContentUtils.createContent(ideaData);
    }

    public static Response deleteIdea(String ideaId) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(ideaId)
                .execute(Function.identity());
    }

    public static Content searchIdeaByName(String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Content updateIdeaByIdeaData(Content ideaData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .contentIDPath(ideaData.getContentID())
                .body(ideaData)
                .executeAs(Function.identity());
    }

    public static Response createIdeaToReturnResponse(Content ideaData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ideaData)
                .execute(Function.identity());
    }

    public static Response updateIdeaToReturnResponse(Content ideaData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(ideaData)
                .contentIDPath(ideaData.getContentID())
                .execute(Function.identity());
    }

    public static Response getResponseOfIdeaById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .execute(Function.identity());
    }
}
