package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Place;
import io.restassured.response.Response;

public class GroupUtils {

    public static Response createOpenGroup() {
        return PlacesUtils.createPlace(PlaceConstants.getDefaultGroupData(GroupTypes.OPEN));
    }

    public static Response createPrivateGroup() {
        return PlacesUtils.createPlace(PlaceConstants.getDefaultGroupData(GroupTypes.PRIVATE));
    }

    public static Response createGroupUnderPlace(Place parentPlace) {
        Place placeData = PlaceConstants.getDefaultGroupData(GroupTypes.OPEN);
        placeData.setParent(CommonApiUtils.getParentPlaceUri(parentPlace));
        return PlacesUtils.createPlace(placeData);
    }

    public static Response createGroup(String groupType) {
        return PlacesUtils.createPlace(PlaceConstants.getDefaultGroupData(getGroupType(groupType)));
    }

    private static GroupTypes getGroupType(String value) {
        GroupTypes groupType;
        switch (value.toUpperCase()) {
            case "PRIVATE":
                groupType = GroupTypes.PRIVATE;
                break;
            case "SECRET":
                groupType = GroupTypes.SECRET;
                break;
            case "MEMBER ONLY":
                groupType = GroupTypes.MEMBER_ONLY;
                break;
            default:
                groupType = GroupTypes.OPEN;
                break;
        }
        return groupType;
    }
}
