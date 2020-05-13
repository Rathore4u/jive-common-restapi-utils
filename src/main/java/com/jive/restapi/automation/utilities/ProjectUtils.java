package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.Place;
import io.restassured.response.Response;

import java.util.function.Function;

public class ProjectUtils {

    public static Response createProject(Place place) {
        return PlacesUtils.createPlace(PlaceConstants.getDefaultProjectData(place));
    }

    public static Content getProjectById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Content createProjectWithData(Content projectContent) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(projectContent)
                .executeAs(Function.identity());
    }

    public static Response deleteProject(String taskID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(taskID)
                .execute(Function.identity());
    }

    public static Content searchProjectByName(String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }
}
