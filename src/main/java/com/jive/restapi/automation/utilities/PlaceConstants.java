package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Announcement;
import com.jive.restapi.generated.person.models.ContentBody;
import com.jive.restapi.generated.person.models.Place;
import com.xo.restapi.automation.configs.CommonUtils;
import org.apache.commons.lang.RandomStringUtils;

public class PlaceConstants {

    static String defaultDescription = "regularDescription- " + RandomStringUtils.randomAlphanumeric(16);

    public static Place getDefaultGroupData(GroupTypes groupTypes) {
        String defaultDisplayName = "regular-" + RandomStringUtils.randomAlphanumeric(8);
        Place defaultPlaceData = new Place()
                .name(defaultDisplayName)
                .description(defaultDescription)
                .type(PlaceTypes.group.toString())
                .displayName(defaultDisplayName)
                .groupType(groupTypes.toString().toUpperCase());
        return defaultPlaceData;
    }

    public static Place getDefaultProjectData(Place place) {
        String defaultDisplayName = "regular-" + RandomStringUtils.randomAlphanumeric(8);
        return new Place()
                .name(defaultDisplayName)
                .description(defaultDescription)
                .type(PlaceTypes.project.toString())
                .displayName(defaultDisplayName)
                .parent(CommonUtils.getParentPlaceUri(place))
                .startDate("2018-07-02T07:00:00.000+0000")
                .dueDate("2020-07-02T07:00:00.000+0000")
                .groupType(GroupTypes.OPEN.toString().toUpperCase());
    }

    public static Place getDefaultBlogData() {
        String defaultDisplayName = "regular-" + RandomStringUtils.randomAlphanumeric(8);
        return new Place()
                .name(defaultDisplayName)
                .description(defaultDescription)
                .type(PlaceTypes.blog.toString())
                .displayName(defaultDisplayName);
    }

    public static Place getDefaultSpaceData() {
        String defaultDisplayName = "regular-" + RandomStringUtils.randomAlphanumeric(8);
        return new Place()
                .name(defaultDisplayName)
                .description(defaultDescription)
                .type(PlaceTypes.space.toString())
                .displayName(defaultDisplayName);
    }

    public static Announcement getAnnouncementData() {
        return new Announcement()
                .type(PlaceTypes.announcement.toString())
                .subject("regular-"+ RandomStringUtils.randomAlphanumeric(8))
                .content(new ContentBody().type("text").text("regular announcement-" + RandomStringUtils.randomAlphanumeric(10)));
    }
}

enum PlaceTypes {
    space,
    project,
    group,
    blog,
    announcement
}

enum GroupTypes {
    OPEN,
    PRIVATE,
    SECRET,
    MEMBER_ONLY
}
