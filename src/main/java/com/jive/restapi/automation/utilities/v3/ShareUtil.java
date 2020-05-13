package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.ShareApi;
import com.jive.restapi.generated.person.models.ShareRequest;
import com.jive.restapi.generated.person.models.Comment;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in share group.
 */

@UtilityClass
public class ShareUtil {
    private static ShareApi api() {
        return ApiUtils.apiClient().share();
    }

        
    /**
     * createShare.
     * 
     * Path   : "/shares"
     * Method : post
     * OpId   : createShare
     * 
     * @param body required parameter
     * @return Share 
     */ 
    @SafeVarargs
    public static Response createShare(
                                    ShareRequest body,
                                    Options.OptionsBuilder<ShareApi.CreateShareOper>... options) {
        return Options.execute(api()
                .createShare()
                .body(body), 
                 options);
    }   
    
    /**
     * deleteShare.
     * 
     * Path   : "/shares/{shareID}"
     * Method : delete
     * OpId   : deleteShare
     * Delete the specified share.
     * @param shareID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteShare(
                                    String shareID,
                                    Options.OptionsBuilder<ShareApi.DeleteShareOper>... options) {
        return Options.execute(api()
                .deleteShare()
                .shareIDPath(shareID), 
                 options);
    }  
    
    /**
     * getShare.
     * 
     * Path   : "/shares/{shareID}"
     * Method : get
     * OpId   : getShare
     * Retrieve and return the specified share.
     * @param shareID required parameter
     * @return Share 
     */ 
    @SafeVarargs
    public static Response getShare(
                                    String shareID,
                                    Options.OptionsBuilder<ShareApi.GetShareOper>... options) {
        return Options.execute(api()
                .getShare()
                .shareIDPath(shareID), 
                 options);
    }  
    
    /**
     * createComment.
     * 
     * Path   : "/shares/{shareID}/comments"
     * Method : post
     * OpId   : createComment
     * Create a new comment as a reply to the specified share.  The parent field (if any) in the incoming entity will be ignored.  Instead, it will be set to the URI of the specified share.
     * @param shareID required parameter
     * @param body required parameter
     * @return Comment 
     */ 
    @SafeVarargs
    public static Response createComment(
                                    String shareID,
                                    Comment body,
                                    Options.OptionsBuilder<ShareApi.CreateCommentOper>... options) {
        return Options.execute(api()
                .createComment()
                .shareIDPath(shareID)
                .body(body), 
                 options);
    }  
    
    /**
     * getComments.
     * 
     * Path   : "/shares/{shareID}/comments"
     * Method : get
     * OpId   : getComments
     * Return a paginated list of comments to the specified share, optionally limiting the returned results to direct replies only.
     * @param shareID required parameter
     * @return CommentEntities 
     */ 
    @SafeVarargs
    public static Response getComments(
                                    String shareID,
                                    Options.OptionsBuilder<ShareApi.GetCommentsOper>... options) {
        return Options.execute(api()
                .getComments()
                .shareIDPath(shareID), 
                 options);
    }  
    
    /**
     * markRead.
     * 
     * Path   : "/shares/{shareID}/read"
     * Method : post
     * OpId   : markRead
     * Mark the specified share as having been read.
     * @param shareID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response markRead(
                                    String shareID,
                                    Options.OptionsBuilder<ShareApi.MarkReadOper>... options) {
        return Options.execute(api()
                .markRead()
                .shareIDPath(shareID), 
                 options);
    } 
    
    /**
     * markUnread.
     * 
     * Path   : "/shares/{shareID}/read"
     * Method : delete
     * OpId   : markUnread
     * Mark the specified share as having not been read.
     * @param shareID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response markUnread(
                                    String shareID,
                                    Options.OptionsBuilder<ShareApi.MarkUnreadOper>... options) {
        return Options.execute(api()
                .markUnread()
                .shareIDPath(shareID), 
                 options);
    }   
}
