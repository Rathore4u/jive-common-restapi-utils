package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class BlogPostUtils {

    public static Response createBlogPost(Content content) {
        return ContentUtils.createContent(content);
    }

    public static Content getBlogPostById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Response deleteBlogPost(String taskID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(taskID)
                .execute(Function.identity());
    }

    public static Response searchBlogPostByName (String searchQuery, String origin, Content content) {
        return SearchUtils.searchContent(new FilterBuilder().addCondition("search", content.getSubject()).buildList(),
                origin);
    }

    public static Content createDefaultPost() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultPostData())
                .executeAs(Function.identity());
    }
    public static Response createPostToReturnResponse(Content postData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(postData)
                .execute(Function.identity());
    }

    public static Response updatePostToReturnResponse(Content postData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .contentIDPath(postData.getContentID())
                .body(postData)
                .execute(Function.identity());
    }

    public static Response getResponseOfPostById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .execute(Function.identity());
    }
}
