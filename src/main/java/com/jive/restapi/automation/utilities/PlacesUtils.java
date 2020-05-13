package com.jive.restapi.automation.utilities;


import com.jive.restapi.generated.person.models.*;
import io.restassured.response.Response;

import java.util.function.Function;


public class PlacesUtils {
    public static Response createPlace(Place place) {
        return JiveApiUtils.getApiClient()
                .places()
                .createPlace()
                .body(place)
                .execute(Function.identity());
    }

    public static Response createTaskUnderPlace(Place place, Task task) {
        return JiveApiUtils.getApiClient()
                .places()
                .createPlaceTask()
                .placeIDPath(place.getPlaceID())
                .body(task)
                .execute(Function.identity());
    }

    public static Response editPlaceSetting(Place placeData, Settings settingData) {
        return JiveApiUtils.getApiClient()
                .places()
                .updatePlaceSettings()
                .placeIDPath(placeData.getPlaceID())
                .body(settingData)
                .execute(Function.identity());
    }

    public static Response getPlaceSetting(Place place) {
        return JiveApiUtils.getApiClient()
                .places()
                .getPlaceSettings()
                .placeIDPath(place.getPlaceID())
                .execute(Function.identity());
    }

    public static String createPlaceMacro(String macro,Place place) {
        return "<a __default_attr=\"" + place.getId() + macro + place.getName() + " >" + place.getDisplayName() + "</a>";
    }

    public static Place getPlaceById(String id) {
        return JiveApiUtils.getApiClient()
                .places()
                .getPlace()
                .placeIDPath(id)
                .executeAs(Function.identity());
    }

    public static Response getPlaces(String placeId) {
        return JiveApiUtils.getApiClient()
                .places()
                .getPlacePlaces()
                .placeIDPath(placeId)
                .execute(Function.identity());
    }

    public static Response createCategory(String id, String categoryName) {
        Category category = new Category();
        category.name(categoryName).type("category");
        return JiveApiUtils.getApiClient()
                .places()
                .createPlaceCategory()
                .body(category)
                .placeIDPath(id)
                .execute(Function.identity());
    }

    public static Response getContentWithFilters(String id, String[] filters) {
        return JiveApiUtils.getApiClient()
                .places()
                .getContentInPlace()
                .filterQuery(filters)
                .placeIDPath(id)
                .execute(Function.identity());
    }
}
