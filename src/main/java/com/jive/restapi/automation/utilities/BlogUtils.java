package com.jive.restapi.automation.utilities;

import io.restassured.response.Response;

public class BlogUtils {

    public static Response createPersonalBlog() {
        return PlacesUtils.createPlace(PlaceConstants.getDefaultBlogData());
    }
}
