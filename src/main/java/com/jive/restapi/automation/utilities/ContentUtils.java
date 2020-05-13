package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

import java.util.function.Function;

@UtilityClass
public final class ContentUtils {
    public static Response createContent(Content content) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(content)
                .execute(Function.identity());
    }

    public static Content getContentById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }


    public static Response deleteContent(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(id)
                .execute(Function.identity());
    }

    public static Content createContentUnderPlace(String parentUri, Content.TypeEnum contentType) {
        Content content = ContentConstants.getDefaultContentDataOfType(contentType);
        content.parent(parentUri);
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(content)
                .executeAs(Function.identity());
    }

    public static String createDocMention(Content content) {
        return "<a __default_attr=\"" + content.getId() + "\" __jive_macro_name=\"document\" href=/document/" + content.getSubject() + " >" + content.getId() + "</a>";
    }

    public static Response getComments(Content content) {
        return JiveApiUtils.getApiClient()
                .content()
                .comments()
                .contentIDPath(content.getContentID())
                .execute(Function.identity());
    }
}
