package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.PlacesApi;
import com.jive.restapi.generated.person.models.Category;
import com.jive.restapi.generated.person.models.Content;
import java.util.Map;
import com.jive.restapi.generated.person.models.Stream;
import com.jive.restapi.generated.person.models.Settings;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in places group.
 */

@UtilityClass
public class PlacesUtilExt {
        private static PlacesApi api() {
                return ApiUtils.apiClient().places();
        }

        /**
         * createPlaceCategory.
         * 
         * Path : "/places/{placeID}/categories" Method : post OpId :
         * createPlaceCategory Create a new category for a place with specified
         * characteristics, and return an entity representing the newly created
         * category.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return Category
         */
        @SafeVarargs
        public static Response createPlaceCategory(String placeID, Category body,
                        Options.OptionsBuilder<PlacesApi.CreatePlaceCategoryOper>... options) {
                return Options.execute(api().createPlaceCategory().placeIDPath(placeID).body(body), options);

        }

        /**
         * getPlaceCategories.
         * 
         * Path : "/places/{placeID}/categories" Method : get OpId : getPlaceCategories
         * Return categories associated to the specified place.
         * 
         * @param placeID required parameter
         * @return List<Category>
         */
        @SafeVarargs
        public static Response getPlaceCategories(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceCategoriesOper>... options) {
                return Options.execute(api().getPlaceCategories().placeIDPath(placeID), options);

        }

        /**
         * deletePlaceCategory.
         * 
         * Path : "/places/{placeID}/categories/{categoryID}" Method : delete OpId :
         * deletePlaceCategory Delete the existing category for the specified place.
         * Only admins of the place can manage place categories.
         * 
         * @param placeID    required parameter
         * @param categoryID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response deletePlaceCategory(String placeID, String categoryID,
                        Options.OptionsBuilder<PlacesApi.DeletePlaceCategoryOper>... options) {
                return Options.execute(api().deletePlaceCategory().placeIDPath(placeID).categoryIDPath(categoryID),
                                options);

        }

        /**
         * getPlaceCategory.
         * 
         * Path : "/places/{placeID}/categories/{categoryID}" Method : get OpId :
         * getPlaceCategory Return the specified category of a place.
         * 
         * @param placeID    required parameter
         * @param categoryID required parameter
         * @return Category
         */
        @SafeVarargs
        public static Response getPlaceCategory(String placeID, String categoryID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceCategoryOper>... options) {
                return Options.execute(api().getPlaceCategory().placeIDPath(placeID).categoryIDPath(categoryID),
                                options);

        }

        /**
         * updatePlaceCategory.
         * 
         * Path : "/places/{placeID}/categories/{categoryID}" Method : put OpId :
         * updatePlaceCategory Update an existing category with specified
         * characteristics.
         * 
         * @param placeID    required parameter
         * @param categoryID required parameter
         * @param body       required parameter
         * @return Category
         */
        @SafeVarargs
        public static Response updatePlaceCategory(String placeID, String categoryID, Category body,
                        Options.OptionsBuilder<PlacesApi.UpdatePlaceCategoryOper>... options) {
                return Options.execute(
                                api().updatePlaceCategory().placeIDPath(placeID).categoryIDPath(categoryID).body(body),
                                options);

        }

        /**
         * createContentInPlace.
         * 
         * Path : "/places/{placeID}/contents" Method : post OpId : createContentInPlace
         * Create a new content object with specified characteristics, and return an
         * entity representing the newly created content object. Uploaded files will be
         * added to the new content object as attachments. Uploading attachments is only
         * allowed for those content types that support attachments. A BAD_REQUEST error
         * will be returned if attachments are passed and the content type does not
         * support them.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return Content
         */
        @SafeVarargs
        public static Response createContentInPlace(String placeID, Content body,
                        Options.OptionsBuilder<PlacesApi.CreateContentInPlaceOper>... options) {
                return Options.execute(api().createContentInPlace().placeIDPath(placeID).body(body), options);

        }

        /**
         * getContentInPlace.
         * 
         * Path : "/places/{placeID}/contents" Method : get OpId : getContentInPlace
         * Return a list of featured content objects in the specified place.
         * 
         * @param placeID required parameter
         * @return List<Content>
         */
        @SafeVarargs
        public static Response getContentInPlace(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetContentInPlaceOper>... options) {
                return Options.execute(api().getContentInPlace().placeIDPath(placeID), options);

        }

        /**
         * getFeaturedContentForPlace.
         * 
         * Path : "/places/{placeID}/contents/featured" Method : get OpId :
         * getFeaturedContentForPlace Return a list of featured content objects in the
         * specified place.
         * 
         * @param placeID required parameter
         * @return List<Content>
         */
        @SafeVarargs
        public static Response getFeaturedContentForPlace(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetFeaturedContentForPlaceOper>... options) {
                return Options.execute(api().getFeaturedContentForPlace().placeIDPath(placeID), options);

        }

        /**
         * createExtProps.
         * 
         * Path : "/places/{placeID}/extprops" Method : post OpId : createExtProps Save
         * a new set of extended properties for a place with specified characteristics,
         * and return an entity representing the newly created extended properties.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return Map
         */
        @SafeVarargs
        public static Response createExtProps(String placeID, Map body,
                        Options.OptionsBuilder<PlacesApi.CreateExtPropsOper>... options) {
                return Options.execute(api().createExtProps().placeIDPath(placeID).body(body), options);

        }

        /**
         * deleteExtProps.
         * 
         * Path : "/places/{placeID}/extprops" Method : delete OpId : deleteExtProps
         * Delete the existing extended properties for the specified place.
         * 
         * @param placeID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response deleteExtProps(String placeID,
                        Options.OptionsBuilder<PlacesApi.DeleteExtPropsOper>... options) {
                return Options.execute(api().deleteExtProps().placeIDPath(placeID), options);

        }

        /**
         * getExtProps.
         * 
         * Path : "/places/{placeID}/extprops" Method : get OpId : getExtProps Return
         * the specified extended properties of a place.
         * 
         * @param placeID required parameter
         * @return Map
         */
        @SafeVarargs
        public static Response getExtProps(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetExtPropsOper>... options) {
                return Options.execute(api().getExtProps().placeIDPath(placeID), options);

        }

        /**
         * createExtPropsForAddon.
         * 
         * Path : "/places/{placeID}/extprops/addOn/{addonUUID}" Method : post OpId :
         * createExtPropsForAddon For the specified addon, save a new set of extended
         * properties for a place with specified characteristics, and return an entity
         * representing the newly created extended properties.
         * 
         * @param placeID   required parameter
         * @param addonUUID required parameter
         * @param body      required parameter
         * @return Map
         */
        @SafeVarargs
        public static Response createExtPropsForAddon(String placeID, String addonUUID, Map body,
                        Options.OptionsBuilder<PlacesApi.CreateExtPropsForAddonOper>... options) {
                return Options.execute(
                                api().createExtPropsForAddon().placeIDPath(placeID).addonUUIDPath(addonUUID).body(body),
                                options);

        }

        /**
         * deleteExtPropsForAddon.
         * 
         * Path : "/places/{placeID}/extprops/addOn/{addonUUID}" Method : delete OpId :
         * deleteExtPropsForAddon For the specified add-on, delete the existing extended
         * properties for the specified place.
         * 
         * @param placeID   required parameter
         * @param addonUUID required parameter
         * @return Generic response
         */
        @SafeVarargs
        public static Response deleteExtPropsForAddon(String placeID, String addonUUID,
                        Options.OptionsBuilder<PlacesApi.DeleteExtPropsForAddonOper>... options) {
                return Options.execute(api().deleteExtPropsForAddon().placeIDPath(placeID).addonUUIDPath(addonUUID),
                                options);

        }

        /**
         * getExtPropsForAddOn.
         * 
         * Path : "/places/{placeID}/extprops/addOn/{addonUUID}" Method : get OpId :
         * getExtPropsForAddOn For the specified add-on, return the specified extended
         * properties of a place.
         * 
         * @param placeID   required parameter
         * @param addonUUID required parameter
         * @return Map
         */
        @SafeVarargs
        public static Response getExtPropsForAddOn(String placeID, String addonUUID,
                        Options.OptionsBuilder<PlacesApi.GetExtPropsForAddOnOper>... options) {
                return Options.execute(api().getExtPropsForAddOn().placeIDPath(placeID).addonUUIDPath(addonUUID),
                                options);

        }

        /**
         * getPlaceFollowers.
         * 
         * Path : "/places/{placeID}/followers" Method : get OpId : getPlaceFollowers
         * Return a paginated list of Persons about people who are following the
         * specified place.
         * 
         * @param placeID required parameter
         * @return List<Person>
         */
        @SafeVarargs
        public static Response getPlaceFollowers(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceFollowersOper>... options) {
                return Options.execute(api().getPlaceFollowers().placeIDPath(placeID), options);

        }

        /**
         * getPlaceFollowingIn.
         * 
         * Path : "/places/{placeID}/followingIn" Method : get OpId :
         * getPlaceFollowingIn Return the list of custom streams in which the requesting
         * user is following this place.
         * 
         * @param placeID required parameter
         * @return List<Stream>
         */
        @SafeVarargs
        public static Response getPlaceFollowingIn(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceFollowingInOper>... options) {
                return Options.execute(api().getPlaceFollowingIn().placeIDPath(placeID), options);

        }

        /**
         * setPlaceFollowingIn.
         * 
         * Path : "/places/{placeID}/followingIn" Method : post OpId :
         * setPlaceFollowingIn Replace the list of Streams in which the requesting user
         * is following this place object.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return List<Stream>
         */
        @SafeVarargs
        public static Response setPlaceFollowingIn(String placeID, Stream body,
                        Options.OptionsBuilder<PlacesApi.SetPlaceFollowingInOper>... options) {
                return Options.execute(api().setPlaceFollowingIn().placeIDPath(placeID).body(body), options);

        }

        /**
         * getPages.
         * 
         * Path : "/places/{placeID}/pages" Method : get OpId : getPages Return a list
         * of pages related to the specified place.
         * 
         * @param placeID required parameter
         * @return List<Page>
         */
        @SafeVarargs
        public static Response getPages(String placeID, Options.OptionsBuilder<PlacesApi.GetPagesOper>... options) {
                return Options.execute(api().getPages().placeIDPath(placeID), options);

        }

        /**
         * getPlacePermissions.
         * 
         * Path : "/places/{placeID}/permissions" Method : get OpId :
         * getPlacePermissions Return the list of content types that the user is allowed
         * to created for the specified place.
         * 
         * @param placeID required parameter
         * @return List<String>
         */
        @SafeVarargs
        public static Response getPlacePermissions(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlacePermissionsOper>... options) {
                return Options.execute(api().getPlacePermissions().placeIDPath(placeID), options);

        }

        /**
         * getPlacePlaces.
         * 
         * Path : "/places/{placeID}/places" Method : get OpId : getPlacePlaces Return a
         * paginated list of places contained within the specified place.
         * 
         * @param placeID required parameter
         * @return List<Place>
         */
        @SafeVarargs
        public static Response getPlacePlaces(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlacePlacesOper>... options) {
                return Options.execute(api().getPlacePlaces().placeIDPath(placeID), options);

        }

        /**
         * getPlaceSettings.
         * 
         * Path : "/places/{placeID}/settings" Method : get OpId : getPlaceSettings
         * Return settings for a specified place, which can be modified by a place
         * admin. Currently settings for Activity and Overview tab visibility are
         * supported.
         * 
         * @param placeID required parameter
         * @return Settings
         */
        @SafeVarargs
        public static Response getPlaceSettings(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceSettingsOper>... options) {
                return Options.execute(api().getPlaceSettings().placeIDPath(placeID), options);

        }

        /**
         * updatePlaceSettings.
         * 
         * Path : "/places/{placeID}/settings" Method : put OpId : updatePlaceSettings
         * Updates settings for a specified place. Only a place admin may do this.
         * Currently settings for Activity and Overview tab visibility are supported.
         * 
         * @param placeID required parameter
         * @param body    required parameter
         * @return Settings
         */
        @SafeVarargs
        public static Response updatePlaceSettings(String placeID, Settings body,
                        Options.OptionsBuilder<PlacesApi.UpdatePlaceSettingsOper>... options) {
                return Options.execute(api().updatePlaceSettings().placeIDPath(placeID).body(body), options);

        }

        /**
         * createPlaceStaticData.
         * 
         * Path : "/places/{placeID}/statics" Method : post OpId : createPlaceStaticData
         * Create and return a new static resource associated with the specified place,
         * including the specified data content. The minimum information needed in the
         * JSON object is:
         * 
         * @param placeID required parameter
         * @return Static
         */
        @SafeVarargs
        public static Response createPlaceStaticData(String placeID,
                        Options.OptionsBuilder<PlacesApi.CreatePlaceStaticDataOper>... options) {
                return Options.execute(api().createPlaceStaticData().placeIDPath(placeID), options);

        }

        /**
         * getPlaceStatics.
         * 
         * Path : "/places/{placeID}/statics" Method : get OpId : getPlaceStatics Return
         * a list of the static resources associated with the specified place.
         * 
         * @param placeID required parameter
         * @return List<Static>
         */
        @SafeVarargs
        public static Response getPlaceStatics(String placeID,
                        Options.OptionsBuilder<PlacesApi.GetPlaceStaticsOper>... options) {
                return Options.execute(api().getPlaceStatics().placeIDPath(placeID), options);

        }

        /**
         * getPlaceSuggestedPlaces.
         * 
         * Path : "/places/{placeID}/suggested/{contentType}" Method : get OpId :
         * getPlaceSuggestedPlaces Return a list of suggested places that the specified
         * content type could be posted by the requesting person, considering the
         * specified place to be the person's 'current' place.
         * 
         * @param placeID     required parameter
         * @param contentType required parameter
         * @return List<Place>
         */
        @SafeVarargs
        public static Response getPlaceSuggestedPlaces(String placeID, String contentType,
                        Options.OptionsBuilder<PlacesApi.GetPlaceSuggestedPlacesOper>... options) {
                return Options.execute(
                                api().getPlaceSuggestedPlaces().placeIDPath(placeID).contentTypePath(contentType),
                                options);

        }

}
