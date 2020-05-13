package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.api.AnnouncementsApi;
import com.jive.restapi.generated.person.models.Announcement;
import io.restassured.response.Response;

import java.util.function.Function;

public class AnnouncementUtils {

    private static AnnouncementsApi getApi() {
        return JiveApiUtils.getApiClient().announcements();
    }

    public static Response createAnnouncementUnderPlace(String placeId) {
        return JiveApiUtils.getApiClient()
                .places()
                .createPlaceAnnouncement()
                .placeIDPath(placeId)
                .body(PlaceConstants.getAnnouncementData())
                .execute(Function.identity());
    }

    public static Response createAnnouncementUnderPlaceWithData(String placeId, Announcement announcement) {
        return JiveApiUtils.getApiClient()
                .places()
                .createPlaceAnnouncement()
                .placeIDPath(placeId)
                .body(announcement)
                .execute(Function.identity());
    }

    /**
     * Create a system announcement
     * @param data the announcement data
     * @return created announcement
     */
    public static Response createSystemAnnouncement(Announcement data) {
        return JiveApiUtils.getApiClient().announcements()
                .createAnnouncement()
                .body(data)
                .execute(Function.identity());
    }

    /**
     * Update an announcment
     * @param id announcement id
     * @param data data
     * @return the updated announcment
     */
    public static Response updateAnnouncement(String id,Announcement data) {
        return getApi()
                .updateAnnouncement()
                .announcementIDPath(id)
                .body(data)
                .execute(Function.identity());
    }

    /**
     * Deletes an announcment
     * @param id the id
     * @return response 204
     */
    public static Response deleteAnnouncement(String id) {
        return getApi()
                .deleteAnnouncement()
                .announcementIDPath(id)
                .execute(Function.identity());
    }

    /**
     * Mark an announcement as read
     * @param id the id
     * @return response 204
     */
    public static Response markRead(String id) {
        return getApi()
                .markRead()
                .announcementIDPath(id)
                .execute(Function.identity());
    }

    /**
     * Mark an announcement as not read
     * @param id the id
     * @return response 204
     */
    public static Response unmarkRead(String id) {
        return getApi()
                .markUnread()
                .announcementIDPath(id)
                .execute(Function.identity());
    }

    /**
     * Paginated list of system announcements
     * @param activeOnly optional query flag
     * @return the paginated list of announcments {@see import com.jive.restapi.generated.person.models.AnnouncementEntities}
     */
    public static Response querySystemAnnouncements(Boolean activeOnly) {
        return getApi()
                .getSystemAnnouncements()
                .activeOnlyQuery(activeOnly)
                .execute(Function.identity());
    }

    public static Response getAnnouncement(String id) {
        return getApi()
                .getAnnouncement()
                .announcementIDPath(id)
                .execute(Function.identity());
    }
}
