package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class PostUtils {

    public static Content createDefaultPost() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultPostData())
                .executeAs(Function.identity());
    }

    public static Content getPostById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Content createPost(Content postData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(postData)
                .executeAs(Function.identity());
    }

    public static Response deletePost(String postID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(postID)
                .execute(Function.identity());
    }

    public static Content searchPostByName (String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Content updatePostByPostData (Content postData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(postData)
                .executeAs(Function.identity());
    }

    public static Response createPostToReturnResponse(Content postData) {
        return ContentUtils.createContent(postData);
    }
}
