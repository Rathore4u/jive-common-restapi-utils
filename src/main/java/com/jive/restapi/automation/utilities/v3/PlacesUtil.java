package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.PlacesApi;
import com.jive.restapi.generated.person.models.Place;
import com.jive.restapi.generated.person.models.Announcement;
import com.jive.restapi.generated.person.models.Task;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in places group.
 */

@UtilityClass
public class PlacesUtil {
        private static PlacesApi api() {
                return ApiUtils.apiClient().places();
        }

        /**
         * createPlace.
         * 
         * Path : "/places" Method : post OpId : createPlace Create a new place with
         * specified characteristics, and return an entity representing the newly
         * created place.
         * 
         * @param body required parameter
         * @return Place
         */
        @SafeVarargs
        public static Response createPlace(Place body, Options.OptionsBuilder<PlacesApi.CreatePlaceOper>... options) {
                return Options.execute(api().createPlace().body(body), options);
        }

        /**
         * getPlaces.
         * 
         * Path : "/places" Method : get OpId : getPlaces Return a paginated list of
         * places that match the specified filter criteria.
         * 
         * @return List<Place>
         */
        @SafeVarargs
        public static Response getPlaces(Options.OptionsBuilder<PlacesApi.GetPlacesOper>... options) {
                return Options.execute(api().getPlaces(), options);
        }

        /**
         * getRecommendedPlaces.
         * 
         * Path : "/places/recommended" Method : get OpId : getRecommendedPlaces Return
         * a list of recommended places. This feature is only available when Jive has
         * enabled the recommender. Do a GET to
         * /api/core/v3/metadata/properties/feature.recommender.enabled to figure out
         * whether recommendation service is enabled or not.
         * 
         * @return List<Place>
         */
        @SafeVarargs
        public static Response getRecommendedPlaces(
                        Options.OptionsBuilder<PlacesApi.GetRecommendedPlacesOper>... options) {
                return Options.execute(api().getRecommendedPlaces(), options);

        }

        /**
         * getRootSpace.
         * 
         * Path : "/places/root" Method : get OpId : getRootSpace Return the root space
         * for this Jive instance.
         * 
         * @return Place
         */
        @SafeVarargs
        public static Response getRootSpace(Options.OptionsBuilder<PlacesApi.GetRootSpaceOper>... options) {
                return Options.execute(api().getRootSpace(), options);

        }

        /**
         * getSuggestedPlaces.
         * 
         * Path : "/places/suggested/{contentType}" Method : get OpId :
         * getSuggestedPlaces Return a list of suggested places that the specified
         * content type could be posted by the requesting person, without any
         * consideration of the person's 'current' place.
         * 
         * @param contentType required parameter
         * @return List<Place>
         */
        @SafeVarargs
        public static Response getSuggestedPlaces(String contentType,
                        Options.OptionsBuilder<PlacesApi.GetSuggestedPlacesOper>... options) {
                return Options.execute(api().getSuggestedPlaces().contentTypePath(contentType), options);

        }

        /**
         * getTrendingPlaces.
         * 
         * Path : "/places/trending" Method : get OpId : getTrendingPlaces Return a list
         * of trending places. This feature is only available when Jive has enabled the
         * recommender. Do a GET to
         * /api/core/v3/metadata/properties/feature.recommender.enabled to figure out
         * whether recommendation service is enabled or not.
         * 
         * @return List<Place>
         */
        @SafeVarargs
        public static Response getTrendingPlaces(Options.OptionsBuilder<PlacesApi.GetTrendingPlacesOper>... options) {
                return Options.execute(api().getTrendingPlaces(), options);

        }

        /**
         * deletePlace.
         * 
         * Path : "/places/{placeID}" Method : delete OpId : deletePlace Delete the
         * specified place.
         * 
         * @param placeID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response deletePlace(String placeID,
                        Options.OptionsBuilder<PlacesApi.DeletePlaceOper>... options) {
                return Options.execute(api().deletePlace().placeIDPath(placeID), options);

        }

        /**
         * getPlace.
         * 
         * Path : "/places/{placeID}" Method : get OpId : getPlace Return the specified
         * place with the specified fields.
         * 
         * @param placeID required parameter
         * @return Place
         */
        @SafeVarargs
        public static Response getPlace(String placeID, Options.OptionsBuilder<PlacesApi.GetPlaceOper>... options) {
                return Options.execute(api().getPlace().placeIDPath(placeID), options);

        }

        /**
         * updatePlace.
         * 
         * Path : "/places/{placeID}" Method : put OpId : updatePlace Update an existing
         * place with specified characteristics.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return Place
         */
        @SafeVarargs
        public static Response updatePlace(String placeID, Place body,
                        Options.OptionsBuilder<PlacesApi.UpdatePlaceOper>... options) {
                return Options.execute(api().updatePlace().placeIDPath(placeID).body(body), options);

        }

        /**
         * getActivity.
         * 
         * Path : "/places/{placeID}/activities" Method : get OpId : getActivity Return
         * the activity stream for the specified place.
         * 
         * @param placeID required parameter
         * @return List<Activity>
         */
        @SafeVarargs
        public static Response getActivity(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetActivityOper>... options) {
                return Options.execute(api().getActivity().placeIDPath(placeID), options);

        }

        /**
         * createPlaceAnnouncement.
         * 
         * Path : "/places/{placeID}/announcements" Method : post OpId :
         * createPlaceAnnouncement Create a new announcement associated with this place.
         * An appropriate parent field will be calculated and injected automatically.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return Announcement
         */
        @SafeVarargs
        public static Response createPlaceAnnouncement(String placeID, Announcement body,
                        Options.OptionsBuilder<PlacesApi.CreatePlaceAnnouncementOper>... options) {
                return Options.execute(api().createPlaceAnnouncement().placeIDPath(placeID).body(body), options);

        }

        /**
         * getPlaceAnnouncements.
         * 
         * Path : "/places/{placeID}/announcements" Method : get OpId :
         * getPlaceAnnouncements Return a paginated list of announcements related to the
         * specified place.
         * 
         * @param placeID required parameter
         * @return List<Announcement>
         */
        @SafeVarargs
        public static Response getPlaceAnnouncements(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceAnnouncementsOper>... options) {
                return Options.execute(api().getPlaceAnnouncements().placeIDPath(placeID), options);

        }

        /**
         * getAppliedEntitlements.
         * 
         * Path : "/places/{placeID}/appliedEntitlements" Method : get OpId :
         * getAppliedEntitlements Obtains a paginated list of applied entitlement
         * entities for a given place id
         * 
         * @param placeID required parameter
         * @return List<AppliedEntitlement>
         */
        @SafeVarargs
        public static Response getAppliedEntitlements(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetAppliedEntitlementsOper>... options) {
                return Options.execute(api().getAppliedEntitlements().placeIDPath(placeID), options);

        }

        /**
         * createPlaceAvatar.
         * 
         * Path : "/places/{placeID}/avatar" Method : post OpId : createPlaceAvatar
         * Register a new avatar image (or replace an existing one) from the specified
         * URI. The image will be downloaded and scaled as necessary. Note that avatar
         * images are not supported on blogs.
         * 
         * @param placeID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response createPlaceAvatar(String placeID,
                        Options.OptionsBuilder<PlacesApi.CreatePlaceAvatarOper>... options) {
                return Options.execute(api().createPlaceAvatar().placeIDPath(placeID), options);

        }

        /**
         * deletePlaceAvatar.
         * 
         * Path : "/places/{placeID}/avatar" Method : delete OpId : deletePlaceAvatar
         * Delete the existing avatar image for the specified place. Note that avatar
         * images are not supported on blogs.
         * 
         * @param placeID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response deletePlaceAvatar(String placeID,
                        Options.OptionsBuilder<PlacesApi.DeletePlaceAvatarOper>... options) {
                return Options.execute(api().deletePlaceAvatar().placeIDPath(placeID), options);

        }

        /**
         * getPlaceAvatar.
         * 
         * Path : "/places/{placeID}/avatar" Method : get OpId : getPlaceAvatar Return
         * the binary content of the avatar image for the specified place. Note that
         * avatar images are not supported on blogs.
         * 
         * @param placeID required parameter
         * @return String
         */
        @SafeVarargs
        public static Response getPlaceAvatar(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceAvatarOper>... options) {
                return Options.execute(api().getPlaceAvatar().placeIDPath(placeID), options);

        }

         /**
         * createPlaceTask.
         * 
         * Path : "/places/{placeID}/tasks" Method : post OpId : createPlaceTask Create
         * a Task in a project.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response createPlaceTask(String placeID, Task body,
                        Options.OptionsBuilder<PlacesApi.CreatePlaceTaskOper>... options) {
                return Options.execute(api().createPlaceTask().placeIDPath(placeID).body(body), options);

        }

        /**
         * getPlaceTasks.
         * 
         * Path : "/places/{placeID}/tasks" Method : get OpId : getPlaceTasks Return a
         * paginated list of tasks created for the specified project.
         * 
         * @param placeID required parameter
         * @return List<Task>
         */
        @SafeVarargs
        public static Response getPlaceTasks(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceTasksOper>... options) {
                return Options.execute(api().getPlaceTasks().placeIDPath(placeID), options);

        }

}
