package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import java.util.Map;

import com.jive.restapi.generated.person.api.CommentsApi;
import com.jive.restapi.generated.person.models.AbuseReport;
import com.jive.restapi.generated.person.models.Comment;
import com.jive.restapi.generated.person.models.OutcomeBase;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in comments group.
 */

@UtilityClass
public class CommentsUtil {
    private static CommentsApi api() {
        return ApiUtils.apiClient().comments();
    }

        
    /**
     * createComment.
     * 
     * Path   : "/comments"
     * Method : post
     * OpId   : createComment
     * Create a new comment with the specified characteristics.  The parent field must contain the URI of either a content object for which this is a direct reply, or the URI of a previous comment to which this is a reply.
     * @param body required parameter
     * @return Comment 
     */ 
    @SafeVarargs
    public static Response createComment(
                                    Comment body,
                                    Options.OptionsBuilder<CommentsApi.CreateCommentOper>... options) {
        return Options.execute(api()
                .createComment()
                .body(body), options);

    }
    
    
    /**
     * deleteComment.
     * 
     * Path   : "/comments/{commentID}"
     * Method : delete
     * OpId   : deleteComment
     * Delete the specified comment and sub comments recursively.  
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteComment(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.DeleteCommentOper>... options) {
        return Options.execute(api()
                .deleteComment()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * getComment.
     * 
     * Path   : "/comments/{commentID}"
     * Method : get
     * OpId   : getComment
     * Return the specified content object with the specified fields.
     * @param commentID required parameter
     * @return Comment 
     */ 
    @SafeVarargs
    public static Response getComment(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetCommentOper>... options) {
        return Options.execute(api()
                .getComment()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * updateComment.
     * 
     * Path   : "/comments/{commentID}"
     * Method : put
     * OpId   : updateComment
     * Update the specified comment with the specified characteristics.
     * @param commentID required parameter
     * @param body required parameter
     * @return Comment 
     */ 
    @SafeVarargs
    public static Response updateComment(
                                    String commentID,
                                    Comment body,
                                    Options.OptionsBuilder<CommentsApi.UpdateCommentOper>... options) {
        return Options.execute(api()
                .updateComment()
                .commentIDPath(commentID)
                .body(body), options);

    }
    
    
    /**
     * createAbuseReport.
     * 
     * Path   : "/comments/{commentID}/abuseReports"
     * Method : post
     * OpId   : createAbuseReport
     * Register that the requesting person considers the specified comment as abusive. See AbuseReport for an example.
     * @param commentID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createAbuseReport(
                                    String commentID,
                                    AbuseReport body,
                                    Options.OptionsBuilder<CommentsApi.CreateAbuseReportOper>... options) {
        return Options.execute(api()
                .createAbuseReport()
                .commentIDPath(commentID)
                .body(body), options);

    }
    
    
    /**
     * getAbuseReports.
     * 
     * Path   : "/comments/{commentID}/abuseReports"
     * Method : get
     * OpId   : getAbuseReports
     * Retrieve the abuse reports for the specified comment
     * @param commentID required parameter
     * @return AbuseReportEntities 
     */ 
    @SafeVarargs
    public static Response getAbuseReports(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetAbuseReportsOper>... options) {
        return Options.execute(api()
                .getAbuseReports()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * createReply.
     * 
     * Path   : "/comments/{commentID}/comments"
     * Method : post
     * OpId   : createReply
     * Create a new comment as a reply to an existing comment with the specified characteristics.
     * @param commentID required parameter
     * @param body required parameter
     * @return Comment 
     */ 
    @SafeVarargs
    public static Response createReply(
                                    String commentID,
                                    Comment body,
                                    Options.OptionsBuilder<CommentsApi.CreateReplyOper>... options) {
        return Options.execute(api()
                .createReply()
                .commentIDPath(commentID)
                .body(body), options);

    }
    
    
    /**
     * getComments.
     * 
     * Path   : "/comments/{commentID}/comments"
     * Method : get
     * OpId   : getComments
     * Return a paginated list of comments to the specified content object, optionally limiting the returned results to direct replies only.  The specified content object type must support comments, or be a comment itself (in which case replies to this comment only are returned).
     * @param commentID required parameter
     * @return CommentEntities 
     */ 
    @SafeVarargs
    public static Response getComments(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetCommentsOper>... options) {
        return Options.execute(api()
                .getComments()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * getEditableComment.
     * 
     * Path   : "/comments/{commentID}/editable"
     * Method : get
     * OpId   : getEditableComment
     * Return the specified editable content object with the specified fields.
     * @param commentID required parameter
     * @return Comment 
     */ 
    @SafeVarargs
    public static Response getEditableComment(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetEditableCommentOper>... options) {
        return Options.execute(api()
                .getEditableComment()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * lockEditableComment.
     * 
     * Path   : "/comments/{commentID}/editable"
     * Method : post
     * OpId   : lockEditableComment
     * Attempt to lock the specified comment for editing.  This method will not fail if the comment is already locked.  Check the 'editingBy' field in returned entity to see who owns the lock.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response lockEditableComment(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.LockEditableCommentOper>... options) {
        return Options.execute(api()
                .lockEditableComment()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * unlockEditableComment.
     * 
     * Path   : "/comments/{commentID}/editable"
     * Method : delete
     * OpId   : unlockEditableComment
     * Attempt to unlock the specified comment for editing.  This method will not fail if the comment is not locked or the lock is owned by another user. Check the 'editingBy' field in returned entity to see who owns the lock.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response unlockEditableComment(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.UnlockEditableCommentOper>... options) {
        return Options.execute(api()
                .unlockEditableComment()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * updateEditableComment.
     * 
     * Path   : "/comments/{commentID}/editable"
     * Method : put
     * OpId   : updateEditableComment
     * Update the specified editable comment with the specified characteristics.
     * @param commentID required parameter
     * @param body required parameter
     * @return Comment 
     */ 
    @SafeVarargs
    public static Response updateEditableComment(
                                    String commentID,
                                    Comment body,
                                    Options.OptionsBuilder<CommentsApi.UpdateEditableCommentOper>... options) {
        return Options.execute(api()
                .updateEditableComment()
                .commentIDPath(commentID)
                .body(body), options);

    }
    
    
    /**
     * createExtendedProperties.
     * 
     * Path   : "/comments/{commentID}/extprops"
     * Method : post
     * OpId   : createExtendedProperties
     * Save a new set of extended properties for a comment, and return an entity representing the newly created extended properties.  Any previous extended properties for this comment will be completely replaced.
     * @param commentID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createExtendedProperties(
                                    String commentID,
                                    Map body,
                                    Options.OptionsBuilder<CommentsApi.CreateExtendedPropertiesOper>... options) {
        return Options.execute(api()
                .createExtendedProperties()
                .commentIDPath(commentID)
                .body(body), options);

    }
    
    
    /**
     * deleteExtendedProperties.
     * 
     * Path   : "/comments/{commentID}/extprops"
     * Method : delete
     * OpId   : deleteExtendedProperties
     * Delete the existing extended properties for the specified comment.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteExtendedProperties(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.DeleteExtendedPropertiesOper>... options) {
        return Options.execute(api()
                .deleteExtendedProperties()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * getExtendedProperties.
     * 
     * Path   : "/comments/{commentID}/extprops"
     * Method : get
     * OpId   : getExtendedProperties
     * Return the extended properties for the specified comment.
     * @param commentID required parameter
     * @return Map 
     */ 
    @SafeVarargs
    public static Response getExtendedProperties(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetExtendedPropertiesOper>... options) {
        return Options.execute(api()
                .getExtendedProperties()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * createExtendedPropertiesForAddon.
     * 
     * Path   : "/comments/{commentID}/extprops/addOn/{addonUUID}"
     * Method : post
     * OpId   : createExtendedPropertiesForAddon
     * Save a new set of extended properties for a comment, and return an entity representing the newly created extended properties.  Any previous extended properties for this comment will be completely replaced.
     * @param commentID required parameter
     * @param addonUUID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createExtendedPropertiesForAddon(
                                    String commentID,
                                    String addonUUID,
                                    Map body,
                                    Options.OptionsBuilder<CommentsApi.CreateExtendedPropertiesForAddonOper>... options) {
        return Options.execute(api()
                .createExtendedPropertiesForAddon()
                .commentIDPath(commentID)
                .addonUUIDPath(addonUUID)
                .body(body), options);

    }
    
    
    /**
     * deleteExtendedPropertiesForAddon.
     * 
     * Path   : "/comments/{commentID}/extprops/addOn/{addonUUID}"
     * Method : delete
     * OpId   : deleteExtendedPropertiesForAddon
     * Delete the existing extended properties for the specified comment.
     * @param commentID required parameter
     * @param addonUUID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteExtendedPropertiesForAddon(
                                    String commentID,
                                    String addonUUID,
                                    Options.OptionsBuilder<CommentsApi.DeleteExtendedPropertiesForAddonOper>... options) {
        return Options.execute(api()
                .deleteExtendedPropertiesForAddon()
                .commentIDPath(commentID)
                .addonUUIDPath(addonUUID), options);

    }
    
    
    /**
     * getExtendedPropertiesForAddon.
     * 
     * Path   : "/comments/{commentID}/extprops/addOn/{addonUUID}"
     * Method : get
     * OpId   : getExtendedPropertiesForAddon
     * Return the extended properties for the specified comment.
     * @param commentID required parameter
     * @param addonUUID required parameter
     * @return Map 
     */ 
    @SafeVarargs
    public static Response getExtendedPropertiesForAddon(
                                    String commentID,
                                    String addonUUID,
                                    Options.OptionsBuilder<CommentsApi.GetExtendedPropertiesForAddonOper>... options) {
        return Options.execute(api()
                .getExtendedPropertiesForAddon()
                .commentIDPath(commentID)
                .addonUUIDPath(addonUUID), options);

    }
    
    
    /**
     * createCommentHelpful.
     * 
     * Path   : "/comments/{commentID}/helpful"
     * Method : post
     * OpId   : createCommentHelpful
     * Register that the requesting person considers the specified comment helpful.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createCommentHelpful(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.CreateCommentHelpfulOper>... options) {
        return Options.execute(api()
                .createCommentHelpful()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * deleteCommentHelpful.
     * 
     * Path   : "/comments/{commentID}/helpful"
     * Method : delete
     * OpId   : deleteCommentHelpful
     * Delete the helpful mark of the specified comment by the requesting user.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteCommentHelpful(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.DeleteCommentHelpfulOper>... options) {
        return Options.execute(api()
                .deleteCommentHelpful()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * getHaveMarkedHelpful.
     * 
     * Path   : "/comments/{commentID}/helpful"
     * Method : get
     * OpId   : getHaveMarkedHelpful
     * Return a paginated list of the people who consider this comment helpful.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getHaveMarkedHelpful(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetHaveMarkedHelpfulOper>... options) {
        return Options.execute(api()
                .getHaveMarkedHelpful()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * createCommentLike.
     * 
     * Path   : "/comments/{commentID}/likes"
     * Method : post
     * OpId   : createCommentLike
     * Register that the requesting person likes the specified comment.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createCommentLike(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.CreateCommentLikeOper>... options) {
        return Options.execute(api()
                .createCommentLike()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * deleteCommentLike.
     * 
     * Path   : "/comments/{commentID}/likes"
     * Method : delete
     * OpId   : deleteCommentLike
     * Delete the like of the specified content object by the requesting user.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteCommentLike(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.DeleteCommentLikeOper>... options) {
        return Options.execute(api()
                .deleteCommentLike()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * getCommentLikes.
     * 
     * Path   : "/comments/{commentID}/likes"
     * Method : get
     * OpId   : getCommentLikes
     * Return a paginated list of the people who like the specified comment.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getCommentLikes(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetCommentLikesOper>... options) {
        return Options.execute(api()
                .getCommentLikes()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * getOutcomeTypes.
     * 
     * Path   : "/comments/{commentID}/outcomeTypes"
     * Method : get
     * OpId   : getOutcomeTypes
     * Return a paginated list of the possible outcome types for the specified comment.
     * @param commentID required parameter
     * @return OutcomeTypeEntities 
     */ 
    @SafeVarargs
    public static Response getOutcomeTypes(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetOutcomeTypesOper>... options) {
        return Options.execute(api()
                .getOutcomeTypes()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * createOutcome.
     * 
     * Path   : "/comments/{commentID}/outcomes"
     * Method : post
     * OpId   : createOutcome
     * 
     * @param commentID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createOutcome(
                                    String commentID,
                                    OutcomeBase body,
                                    Options.OptionsBuilder<CommentsApi.CreateOutcomeOper>... options) {
        return Options.execute(api()
                .createOutcome()
                .commentIDPath(commentID)
                .body(body), options);

    }
    
    
    /**
     * getOutcomes.
     * 
     * Path   : "/comments/{commentID}/outcomes"
     * Method : get
     * OpId   : getOutcomes
     * Return a paginated list of the outcomes for the specified comment.
     * @param commentID required parameter
     * @return OutcomeEntities 
     */ 
    @SafeVarargs
    public static Response getOutcomes(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetOutcomesOper>... options) {
        return Options.execute(api()
                .getOutcomes()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * createCommentUnhelpful.
     * 
     * Path   : "/comments/{commentID}/unhelpful"
     * Method : post
     * OpId   : createCommentUnhelpful
     * Register that the requesting person considers the specified comment unhelpful.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createCommentUnhelpful(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.CreateCommentUnhelpfulOper>... options) {
        return Options.execute(api()
                .createCommentUnhelpful()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * deleteCommentUnhelpful.
     * 
     * Path   : "/comments/{commentID}/unhelpful"
     * Method : delete
     * OpId   : deleteCommentUnhelpful
     * Delete the registration of the specified comment as unhelpful by the requesting user.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteCommentUnhelpful(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.DeleteCommentUnhelpfulOper>... options) {
        return Options.execute(api()
                .deleteCommentUnhelpful()
                .commentIDPath(commentID), options);

    }
    
    
    /**
     * getHaveMarkedUnhelpful.
     * 
     * Path   : "/comments/{commentID}/unhelpful"
     * Method : get
     * OpId   : getHaveMarkedUnhelpful
     * Return a paginated list of the people who consider this comment unhelpful.
     * @param commentID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getHaveMarkedUnhelpful(
                                    String commentID,
                                    Options.OptionsBuilder<CommentsApi.GetHaveMarkedUnhelpfulOper>... options) {
        return Options.execute(api()
                .getHaveMarkedUnhelpful()
                .commentIDPath(commentID), options);

    }
    
    
}
