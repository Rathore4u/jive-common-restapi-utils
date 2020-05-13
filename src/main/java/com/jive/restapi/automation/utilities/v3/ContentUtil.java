package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import java.util.List;
import java.util.Map;

import com.jive.restapi.generated.person.api.ContentApi;
import com.jive.restapi.generated.person.models.AbuseReport;
import com.jive.restapi.generated.person.models.Comment;
import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.OutcomeBase;
import com.jive.restapi.generated.person.models.Stream;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in content group.
 */

@UtilityClass
public class ContentUtil {
    private static ContentApi api() {
        return ApiUtils.apiClient().content();
    }


    /**
     * getFeaturedContent.
     * <p>
     * Path   : "/contents/featured"
     * Method : get
     * OpId   : getFeaturedContent
     * Return a list of featured content objects that match the specified filter criteria. This service supports the following filters. Parameters, when used, should be wrapped in parentheses, and multiple values separated by commas. See the examples for clarification.
     *
     * @return List<Content>
     */
    @SafeVarargs
    public static Response getFeaturedContent(
            Options.OptionsBuilder<ContentApi.GetFeaturedContentOper>... options) {
        return Options.execute(api()
                .getFeaturedContent(), options);

    }


    /**
     * getRecentContents.
     * <p>
     * Path   : "/contents/recent"
     * Method : get
     * OpId   : getRecentContents
     * Return a list of recently updated content objects that match the specified filter criteria.
     *
     * @return List<Content>
     */
    @SafeVarargs
    public static Response getRecentContents(
            Options.OptionsBuilder<ContentApi.GetRecentContentsOper>... options) {
        return Options.execute(api()
                .getRecentContents(), options);

    }


    /**
     * getTrendingContents.
     * <p>
     * Path   : "/contents/trending"
     * Method : get
     * OpId   : getTrendingContents
     * Return a list of trending content objects that match the specified filter criteria. It's possible for some Jive instances to have recommendation disabled, for these cases use getPopularContent(fields, abridged) instead. Do a GET to /api/core/v3/metadata/properties/feature.recommender.enabled to figure out whether recommendation service is enabled or not.
     *
     * @return List<Content>
     */
    @SafeVarargs
    public static Response getTrendingContents(
            Options.OptionsBuilder<ContentApi.GetTrendingContentsOper>... options) {
        return Options.execute(api()
                .getTrendingContents(), options);

    }


    /**
     * getRecommendedContents.
     * <p>
     * Path   : "/contents/recommended"
     * Method : get
     * OpId   : getRecommendedContents
     * Return a list of recommended content objects for the authenticated user. When recommender service is not enabled in the Jive instance then predefined recommended content is going to be returned instead. Do a GET to /api/core/v3/metadata/properties/feature.recommender.enabled to figure out whether recommendation service is enabled or not.
     *
     * @return List<Content>
     */
    @SafeVarargs
    public static Response getRecommendedContents(
            Options.OptionsBuilder<ContentApi.GetRecommendedContentsOper>... options) {
        return Options.execute(api()
                .getRecommendedContents(), options);

    }


    /**
     * getPopularContent.
     * <p>
     * Path   : "/contents/popular"
     * Method : get
     * OpId   : getPopularContent
     * Return a list of popular content objects for the authenticated user. Use this service when recommendation is disabled. Do a GET to /api/core/v3/metadata/properties/feature.recommender.enabled to figure out whether recommendation service is enabled or not.
     *
     * @return List<Content>
     */
    @SafeVarargs
    public static Response getPopularContent(
            Options.OptionsBuilder<ContentApi.GetPopularContentOper>... options) {
        return Options.execute(api()
                .getPopularContent(), options);

    }


    /**
     * getContents.
     * <p>
     * Path   : "/contents"
     * Method : get
     * OpId   : getContents
     * Return a paginated list of content objects that match the specified filter criteria. This service supports the following filters. Parameters, when used, should be wrapped in parentheses, and multiple values separated by commas.
     *
     * @return List<Content>
     */
    @SafeVarargs
    public static Response getContents(
            Options.OptionsBuilder<ContentApi.GetContentsOper>... options) {
        return Options.execute(api()
                .getContents(), options);

    }


    /**
     * createContent.
     * <p>
     * Path   : "/contents"
     * Method : post
     * OpId   : createContent
     * Create a new content object with specified characteristics, and return an entity representing the newly created content object. For those types of content that support attachments, it is possible to specify URL of files that the server will download and store them as attachments of the new content. A BAD_REQUEST error will be returned if URL of files are passed and the content type does not support attachments. Here we can see an example where attachments are specified as URLs.
     *
     * @param content required parameter
     * @param file    required parameter
     * @return Content
     */
    @SafeVarargs
    public static Response createContent(
            Content content,
            java.io.File file,
            Options.OptionsBuilder<ContentApi.CreateContentOper>... options) {
        return Options.execute(api()
                .createContent()
                .contentPart(content)
                .fileMultiPart(file), options);

    }


    /**
     * getContent.
     * <p>
     * Path   : "/contents/{contentID}"
     * Method : get
     * OpId   : getContent
     * Return the specified content object with the specified fields.
     *
     * @param contentID required parameter
     * @return Content
     */
    @SafeVarargs
    public static Response getContent(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetContentOper>... options) {
        return Options.execute(api()
                .getContent()
                .contentIDPath(contentID), options);

    }


    /**
     * updateContent.
     * <p>
     * Path   : "/contents/{contentID}"
     * Method : put
     * OpId   : updateContent
     * Update an existing content with specified characteristics.
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return Content
     */
    @SafeVarargs
    public static Response updateContent(
            String contentID,
            Content body,
            Options.OptionsBuilder<ContentApi.UpdateContentOper>... options) {
        return Options.execute(api()
                .updateContent()
                .contentIDPath(contentID)
                .body(body), options);

    }


    /**
     * deleteContent.
     * <p>
     * Path   : "/contents/{contentID}"
     * Method : delete
     * OpId   : deleteContent
     * Delete the specified content object.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteContent(
            String contentID,
            Options.OptionsBuilder<ContentApi.DeleteContentOper>... options) {
        return Options.execute(api()
                .deleteContent()
                .contentIDPath(contentID), options);

    }


    /**
     * getPreviewImage.
     * <p>
     * Path   : "/contents/{contentID}/previewImage"
     * Method : get
     * OpId   : getPreviewImage
     * Return a preview image that represents a content item. If returnDefaultImageWhenNoPreviewAvailable is true and no preview exists for the specified content item, a default preview image will be displayed. For content created in a place, the default image will represent the place where the content was created. For personal content, the default image will represent the creator of the content item. If false, a not found response will be returned if no preview is available for the content. Defaults to false, if no value for this param is provided.
     *
     * @param contentID required parameter
     * @return String
     */
    @SafeVarargs
    public static Response getPreviewImage(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetPreviewImageOper>... options) {
        return Options.execute(api()
                .getPreviewImage()
                .contentIDPath(contentID), options);

    }


    /**
     * getEditableContent.
     * <p>
     * Path   : "/contents/{contentID}/editable"
     * Method : get
     * OpId   : getEditableContent
     * Return the specified editable content object with the specified fields. This API is useful for clients that use an RTE like editor to render the content body. The returned content body in the JSON will include Jive macros that the RTE will need to understand.
     *
     * @param contentID required parameter
     * @return Content
     */
    @SafeVarargs
    public static Response getEditableContent(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetEditableContentOper>... options) {
        return Options.execute(api()
                .getEditableContent()
                .contentIDPath(contentID), options);

    }


    /**
     * updateEditableContent.
     * <p>
     * Path   : "/contents/{contentID}/editable"
     * Method : put
     * OpId   : updateEditableContent
     * Update an existing content with editable content and specified characteristics. The returned content body in the JSON will include Jive macros that the RTE will need to understand. The input JSON must include a true value in content.editable if the content body is using RTE macros.
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return Content
     */
    @SafeVarargs
    public static Response updateEditableContent(
            String contentID,
            Content body,
            Options.OptionsBuilder<ContentApi.UpdateEditableContentOper>... options) {
        return Options.execute(api()
                .updateEditableContent()
                .contentIDPath(contentID)
                .body(body), options);

    }


    /**
     * unlockContent.
     * <p>
     * Path   : "/contents/{contentID}/editable"
     * Method : delete
     * OpId   : unlockContent
     * Unlock the specified content object.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response unlockContent(
            String contentID,
            Options.OptionsBuilder<ContentApi.UnlockContentOper>... options) {
        return Options.execute(api()
                .unlockContent()
                .contentIDPath(contentID), options);

    }


    /**
     * lockContent.
     * <p>
     * Path   : "/contents/{contentID}/editable"
     * Method : post
     * OpId   : lockContent
     * Attempt to lock the specified content for editing. This method will not fail if the content is already locked. Check the 'editingBy' field in returned entity to see who owns the lock.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response lockContent(
            String contentID,
            Options.OptionsBuilder<ContentApi.LockContentOper>... options) {
        return Options.execute(api()
                .lockContent()
                .contentIDPath(contentID), options);

    }


    /**
     * unmarkAsRead.
     * <p>
     * Path   : "/contents/{contentID}/read"
     * Method : delete
     * OpId   : unmarkAsRead
     * Mark the specified content object as having not been read.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response unmarkAsRead(
            String contentID,
            Options.OptionsBuilder<ContentApi.UnmarkAsReadOper>... options) {
        return Options.execute(api()
                .unmarkAsRead()
                .contentIDPath(contentID), options);

    }


    /**
     * markAsRead.
     * <p>
     * Path   : "/contents/{contentID}/read"
     * Method : post
     * OpId   : markAsRead
     * Mark the specified content object as having been read.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response markAsRead(
            String contentID,
            Options.OptionsBuilder<ContentApi.MarkAsReadOper>... options) {
        return Options.execute(api()
                .markAsRead()
                .contentIDPath(contentID), options);

    }


    /**
     * getContentData.
     * <p>
     * Path   : "/contents/{contentID}/data"
     * Method : get
     * OpId   : getContentData
     * Return the binary content of the specified file (returns ConflictException on any other content object type).
     *
     * @param contentID required parameter
     * @return String
     */
    @SafeVarargs
    public static Response getContentData(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetContentDataOper>... options) {
        return Options.execute(api()
                .getContentData()
                .contentIDPath(contentID), options);

    }


    /**
     * contentHelpfull.
     * <p>
     * Path   : "/contents/{contentID}/helpful"
     * Method : post
     * OpId   : contentHelpfull
     * Register that the requesting person considers the specified content helpful.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response contentHelpfull(
            String contentID,
            Options.OptionsBuilder<ContentApi.ContentHelpfullOper>... options) {
        return Options.execute(api()
                .contentHelpfull()
                .contentIDPath(contentID), options);

    }


    /**
     * deleteContentHelpfull.
     * <p>
     * Path   : "/contents/{contentID}/helpful"
     * Method : delete
     * OpId   : deleteContentHelpfull
     * Delete the registration of the specified content as helpful by the requesting user.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteContentHelpfull(
            String contentID,
            Options.OptionsBuilder<ContentApi.DeleteContentHelpfullOper>... options) {
        return Options.execute(api()
                .deleteContentHelpfull()
                .contentIDPath(contentID), options);

    }


    /**
     * getLikes.
     * <p>
     * Path   : "/contents/{contentID}/likes"
     * Method : get
     * OpId   : getLikes
     * Return a paginated list of the people who like the specified content object.
     *
     * @param contentID required parameter
     * @return List<Person>
     */
    @SafeVarargs
    public static Response getLikes(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetLikesOper>... options) {
        return Options.execute(api()
                .getLikes()
                .contentIDPath(contentID), options);

    }


    /**
     * contentLikes.
     * <p>
     * Path   : "/contents/{contentID}/likes"
     * Method : post
     * OpId   : contentLikes
     * Register that the requesting person considers the specified content helpful.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response contentLikes(
            String contentID,
            Options.OptionsBuilder<ContentApi.ContentLikesOper>... options) {
        return Options.execute(api()
                .contentLikes()
                .contentIDPath(contentID), options);

    }


    /**
     * deleteContentLike.
     * <p>
     * Path   : "/contents/{contentID}/likes"
     * Method : delete
     * OpId   : deleteContentLike
     * undefined
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteContentLike(
            String contentID,
            Options.OptionsBuilder<ContentApi.DeleteContentLikeOper>... options) {
        return Options.execute(api()
                .deleteContentLike()
                .contentIDPath(contentID), options);

    }


    /**
     * contentUnhelpfull.
     * <p>
     * Path   : "/contents/{contentID}/unhelpful"
     * Method : post
     * OpId   : contentUnhelpfull
     * Register that the requesting person considers the specified content helpful.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response contentUnhelpfull(
            String contentID,
            Options.OptionsBuilder<ContentApi.ContentUnhelpfullOper>... options) {
        return Options.execute(api()
                .contentUnhelpfull()
                .contentIDPath(contentID), options);

    }


    /**
     * deleteContentUnhelpfull.
     * <p>
     * Path   : "/contents/{contentID}/unhelpful"
     * Method : delete
     * OpId   : deleteContentUnhelpfull
     * Delete the registration of the specified content as unhelpful by the requesting user.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteContentUnhelpfull(
            String contentID,
            Options.OptionsBuilder<ContentApi.DeleteContentUnhelpfullOper>... options) {
        return Options.execute(api()
                .deleteContentUnhelpfull()
                .contentIDPath(contentID), options);

    }


    /**
     * getExtraProps.
     * <p>
     * Path   : "/contents/{contentID}/extprops"
     * Method : get
     * OpId   : getExtraProps
     * Return the specified extended properties of a content.
     *
     * @param contentID required parameter
     * @return Map
     */
    @SafeVarargs
    public static Response getExtraProps(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetExtraPropsOper>... options) {
        return Options.execute(api()
                .getExtraProps()
                .contentIDPath(contentID), options);

    }


    /**
     * createExtraProps.
     * <p>
     * Path   : "/contents/{contentID}/extprops"
     * Method : post
     * OpId   : createExtraProps
     * Register that the requesting person considers the specified content helpful.
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return Map
     */
    @SafeVarargs
    public static Response createExtraProps(
            String contentID,
            Map body,
            Options.OptionsBuilder<ContentApi.CreateExtraPropsOper>... options) {
        return Options.execute(api()
                .createExtraProps()
                .contentIDPath(contentID)
                .body(body), options);

    }


    /**
     * deleteExtraProps.
     * <p>
     * Path   : "/contents/{contentID}/extprops"
     * Method : delete
     * OpId   : deleteExtraProps
     * Delete the existing extended properties for the specified content.
     *
     * @param contentID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteExtraProps(
            String contentID,
            Options.OptionsBuilder<ContentApi.DeleteExtraPropsOper>... options) {
        return Options.execute(api()
                .deleteExtraProps()
                .contentIDPath(contentID), options);

    }


    /**
     * getExtraPropsForAddon.
     * <p>
     * Path   : "/contents/{contentID}/extprops/addOn/{addonUUID}"
     * Method : get
     * OpId   : getExtraPropsForAddon
     * Return the specified extended properties of a content..
     *
     * @param contentID required parameter
     * @param addonUUID required parameter
     * @return Map
     */
    @SafeVarargs
    public static Response getExtraPropsForAddon(
            String contentID,
            String addonUUID,
            Options.OptionsBuilder<ContentApi.GetExtraPropsForAddonOper>... options) {
        return Options.execute(api()
                .getExtraPropsForAddon()
                .contentIDPath(contentID)
                .addonUUIDPath(addonUUID), options);

    }


    /**
     * createExtraPropsForAddon.
     * <p>
     * Path   : "/contents/{contentID}/extprops/addOn/{addonUUID}"
     * Method : post
     * OpId   : createExtraPropsForAddon
     * Register that the requesting person considers the specified content helpful.
     *
     * @param contentID required parameter
     * @param addonUUID required parameter
     * @param body      required parameter
     * @return Map
     */
    @SafeVarargs
    public static Response createExtraPropsForAddon(
            String contentID,
            String addonUUID,
            Map body,
            Options.OptionsBuilder<ContentApi.CreateExtraPropsForAddonOper>... options) {
        return Options.execute(api()
                .createExtraPropsForAddon()
                .contentIDPath(contentID)
                .addonUUIDPath(addonUUID)
                .body(body), options);

    }


    /**
     * getOutcomes.
     * <p>
     * Path   : "/contents/{contentID}/outcomes"
     * Method : get
     * OpId   : getOutcomes
     * Return a paginated list of the Outcomes for the specified content.
     *
     * @param contentID required parameter
     * @return OutcomeEntities
     */
    @SafeVarargs
    public static Response getOutcomes(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetOutcomesOper>... options) {
        return Options.execute(api()
                .getOutcomes()
                .contentIDPath(contentID), options);

    }


    /**
     * createOutcome.
     * <p>
     * Path   : "/contents/{contentID}/outcomes"
     * Method : post
     * OpId   : createOutcome
     * Create the outcome on the specified content
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return OutcomeBase
     */
    @SafeVarargs
    public static Response createOutcome(
            String contentID,
            OutcomeBase body,
            Options.OptionsBuilder<ContentApi.CreateOutcomeOper>... options) {
        return Options.execute(api()
                .createOutcome()
                .contentIDPath(contentID)
                .body(body), options);

    }


    /**
     * abuseReports.
     * <p>
     * Path   : "/contents/{contentID}/abuseReports"
     * Method : get
     * OpId   : abuseReports
     * Retrieve the abuse reports for the specified content.
     *
     * @param contentID required parameter
     * @return AbuseReportEntities
     */
    @SafeVarargs
    public static Response abuseReports(
            String contentID,
            Options.OptionsBuilder<ContentApi.AbuseReportsOper>... options) {
        return Options.execute(api()
                .abuseReports()
                .contentIDPath(contentID), options);

    }


    /**
     * createAbuseReports.
     * <p>
     * Path   : "/contents/{contentID}/abuseReports"
     * Method : post
     * OpId   : createAbuseReports
     * undefined
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return AbuseReport
     */
    @SafeVarargs
    public static Response createAbuseReports(
            String contentID,
            AbuseReport body,
            Options.OptionsBuilder<ContentApi.CreateAbuseReportsOper>... options) {
        return Options.execute(api()
                .createAbuseReports()
                .contentIDPath(contentID)
                .body(body), options);

    }


    /**
     * childOutcomeTypes.
     * <p>
     * Path   : "/contents/{contentID}/childOutcomeTypes"
     * Method : get
     * OpId   : childOutcomeTypes
     * Return a paginated list of the possible OutcomeTypes for the children of the specified object.
     *
     * @param contentID required parameter
     * @return OutcomeTypeEntities
     */
    @SafeVarargs
    public static Response childOutcomeTypes(
            String contentID,
            Options.OptionsBuilder<ContentApi.ChildOutcomeTypesOper>... options) {
        return Options.execute(api()
                .childOutcomeTypes()
                .contentIDPath(contentID), options);

    }


    /**
     * getContentFollowers.
     * <p>
     * Path   : "/contents/{contentID}/followers"
     * Method : get
     * OpId   : getContentFollowers
     * Return a paginated list of Persons about people who are following the specified content.
     *
     * @param contentID required parameter
     * @return List<Person>
     */
    @SafeVarargs
    public static Response getContentFollowers(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetContentFollowersOper>... options) {
        return Options.execute(api()
                .getContentFollowers()
                .contentIDPath(contentID), options);

    }


    /**
     * comments.
     * <p>
     * Path   : "/contents/{contentID}/comments"
     * Method : get
     * OpId   : comments
     * Return a paginated list of comments to the specified content object, optionally limiting the returned results to direct replies only. The specified content object type must support comments, or be a comment itself (in which case replies to this comment only are returned).
     *
     * @param contentID required parameter
     * @return CommentEntities
     */
    @SafeVarargs
    public static Response comments(
            String contentID,
            Options.OptionsBuilder<ContentApi.CommentsOper>... options) {
        return Options.execute(api()
                .comments()
                .contentIDPath(contentID), options);

    }


    /**
     * createComment.
     * <p>
     * Path   : "/contents/{contentID}/comments"
     * Method : post
     * OpId   : createComment
     * Create a new comment as a reply to the specified content object. The parent field (if any) in the incoming entity will be ignored. Instead, it will be set to the URI of the specified content object.
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return Comment
     */
    @SafeVarargs
    public static Response createComment(
            String contentID,
            Comment body,
            Options.OptionsBuilder<ContentApi.CreateCommentOper>... options) {
        return Options.execute(api()
                .createComment()
                .contentIDPath(contentID)
                .body(body), options);

    }


    /**
     * getContentFollowingIn.
     * <p>
     * Path   : "/contents/{contentID}/followingIn"
     * Method : get
     * OpId   : getContentFollowingIn
     * Return the list of custom streams in which the requesting user is following this content object.
     *
     * @param contentID required parameter
     * @return List<Stream>
     */
    @SafeVarargs
    public static Response getContentFollowingIn(
            String contentID,
            Options.OptionsBuilder<ContentApi.GetContentFollowingInOper>... options) {
        return Options.execute(api()
                .getContentFollowingIn()
                .contentIDPath(contentID), options);

    }


    /**
     * putContentFollowingIn.
     * <p>
     * Path   : "/contents/{contentID}/followingIn"
     * Method : post
     * OpId   : putContentFollowingIn
     * Replace the list of Streams in which the requesting user is following this content object.
     *
     * @param contentID required parameter
     * @param body      required parameter
     * @return List<Stream>
     */
    @SafeVarargs
    public static Response putContentFollowingIn(
            String contentID,
            List<Stream> body,
            Options.OptionsBuilder<ContentApi.PutContentFollowingInOper>... options) {
        return Options.execute(api()
                .putContentFollowingIn()
                .contentIDPath(contentID)
                .body(body), options);

    }


    /**
     * myEntitlements.
     * <p>
     * Path   : "/contents/{contentID}/entitlements"
     * Method : get
     * OpId   : myEntitlements
     * Retrieve entitlements for the current user, granted for the specified content object.
     *
     * @param contentID required parameter
     * @return List<Entitlement>
     */
    @SafeVarargs
    public static Response myEntitlements(
            String contentID,
            Options.OptionsBuilder<ContentApi.MyEntitlementsOper>... options) {
        return Options.execute(api()
                .myEntitlements()
                .contentIDPath(contentID), options);

    }


    /**
     * getEntitlementsForPerson.
     * <p>
     * Path   : "/contents/{contentID}/entitlements/{personID}"
     * Method : get
     * OpId   : getEntitlementsForPerson
     * Retrieve entitlements for the specified user, granted for the specified content object.
     *
     * @param contentID required parameter
     * @param personID  required parameter
     * @return List<Entitlement>
     */
    @SafeVarargs
    public static Response getEntitlementsForPerson(
            String contentID,
            String personID,
            Options.OptionsBuilder<ContentApi.GetEntitlementsForPersonOper>... options) {
        return Options.execute(api()
                .getEntitlementsForPerson()
                .contentIDPath(contentID)
                .personIDPath(personID), options);

    }

    public static Response getContentByFilters(String[] filters,
            Options.OptionsBuilder<ContentApi.GetContentsOper>... options) {
        return Options.execute(api()
                .getContents()
                .filterQuery(filters), options);
    }
}
