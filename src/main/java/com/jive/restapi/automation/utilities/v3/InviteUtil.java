package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.InviteApi;
import com.jive.restapi.generated.person.models.Invite;
import com.jive.restapi.generated.person.models.InviteRequest;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in invite group.
 */

@UtilityClass
public class InviteUtil {
    private static InviteApi api() {
        return ApiUtils.apiClient().invite();
    }

        
    /**
     * deleteInvite.
     * 
     * Path   : "/invites/{inviteID}"
     * Method : delete
     * OpId   : deleteInvite
     * Delete the specified invitation.
     * @param inviteID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteInvite(
                                    String inviteID,
                                    Options.OptionsBuilder<InviteApi.DeleteInviteOper>... options) {
        return Options.execute(api()
                .deleteInvite()
                .inviteIDPath(inviteID), options);

    }
    
    
    /**
     * getInvite.
     * 
     * Path   : "/invites/{inviteID}"
     * Method : get
     * OpId   : getInvite
     * Return the specified invitation.
     * @param inviteID required parameter
     * @return Invite 
     */ 
    @SafeVarargs
    public static Response getInvite(
                                    String inviteID,
                                    Options.OptionsBuilder<InviteApi.GetInviteOper>... options) {
        return Options.execute(api()
                .getInvite()
                .inviteIDPath(inviteID), options);

    }
    
    
    /**
     * updateInvite.
     * 
     * Path   : "/invites/{inviteID}"
     * Method : put
     * OpId   : updateInvite
     * Update the state of the specified invitation.
     * @param inviteID required parameter
     * @param body required parameter
     * @return Invite 
     */ 
    @SafeVarargs
    public static Response updateInvite(
                                    String inviteID,
                                    Invite body,
                                    Options.OptionsBuilder<InviteApi.UpdateInviteOper>... options) {
        return Options.execute(api()
                .updateInvite()
                .inviteIDPath(inviteID)
                .body(body), options);

    }
    
    
    /**
     * createInvite.
     * 
     * Path   : "/invites/places/{placeID}"
     * Method : post
     * OpId   : createInvite
     * Creates and sends invites to one or many persons for the specified place. The invitees can be defined by passing their email address, username or person URI.
     * @param placeID required parameter
     * @param body required parameter
     * @return InviteEntities 
     */ 
    @SafeVarargs
    public static Response createInvite(
                                    String placeID,
                                    InviteRequest body,
                                    Options.OptionsBuilder<InviteApi.CreateInviteOper>... options) {
        return Options.execute(api()
                .createInvite()
                .placeIDPath(placeID)
                .body(body), options);

    }
    
    
    /**
     * getInvites.
     * 
     * Path   : "/invites/places/{placeID}"
     * Method : get
     * OpId   : getInvites
     * Return the invites of the specified place that match the specified criteria.
     * @param placeID required parameter
     * @return InviteEntities 
     */ 
    @SafeVarargs
    public static Response getInvites(
                                    String placeID,
                                    Options.OptionsBuilder<InviteApi.GetInvitesOper>... options) {
        return Options.execute(api()
                .getInvites()
                .placeIDPath(placeID), options);

    }
    
    
}
