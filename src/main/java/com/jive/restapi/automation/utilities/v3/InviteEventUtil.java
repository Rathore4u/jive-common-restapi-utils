package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.InviteEventApi;
import com.jive.restapi.generated.person.models.EventInvite;
import com.jive.restapi.generated.person.models.EventInviteRequest;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in invite-event group.
 */

@UtilityClass
public class InviteEventUtil {
    private static InviteEventApi api() {
        return ApiUtils.apiClientEventInvite().inviteEvent();
    }


    /**
     * getInvites.
     * <p>
     * Path   : "/invites/event/all/{eventID}"
     * Method : get
     * OpId   : getInvites
     *
     * @return EventInviteEntities
     */
    @SafeVarargs
    public static Response getInvites(
            Options.OptionsBuilder<InviteEventApi.GetInvitesOper>... options) {
        return Options.execute(api()
                .getInvites(), options);

    }


    /**
     * createInvites.
     * <p>
     * Path   : "/invites/event/{eventID}"
     * Method : post
     * OpId   : createInvites
     * Creates and sends invites to one or many persons for the specified event. The invitees can be defined by passing their username or person URI.  An example of the required JSON input is:
     *
     * @param eventID required parameter
     * @param body    required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response createInvites(
            String eventID,
            EventInviteRequest body,
            Options.OptionsBuilder<InviteEventApi.CreateInvitesOper>... options) {
        return Options.execute(api()
                .createInvites()
                .eventIDPath(eventID)
                .body(body), options);

    }


    /**
     * deleteInvite.
     * <p>
     * Path   : "/invites/event/{inviteID}"
     * Method : delete
     * OpId   : deleteInvite
     * Delete the specified invitation.
     *
     * @param inviteID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deleteInvite(
            String inviteID,
            Options.OptionsBuilder<InviteEventApi.DeleteInviteOper>... options) {
        return Options.execute(api()
                .deleteInvite()
                .inviteIDPath(inviteID), options);

    }


    /**
     * getInvite.
     * <p>
     * Path   : "/invites/event/{inviteID}"
     * Method : get
     * OpId   : getInvite
     * Return the specified invitation.
     *
     * @param inviteID required parameter
     * @return EventInvite
     */
    @SafeVarargs
    public static Response getInvite(
            String inviteID,
            Options.OptionsBuilder<InviteEventApi.GetInviteOper>... options) {
        return Options.execute(api()
                .getInvite()
                .inviteIDPath(inviteID), options);

    }


    /**
     * updateInvite.
     * <p>
     * Path   : "/invites/event/{inviteID}"
     * Method : put
     * OpId   : updateInvite
     * Update the state of the specified invitation.
     *
     * @param inviteID required parameter
     * @param body     required parameter
     * @return EventInvite
     */
    @SafeVarargs
    public static Response updateInvite(
            String inviteID,
            EventInvite body,
            Options.OptionsBuilder<InviteEventApi.UpdateInviteOper>... options) {
        return Options.execute(api()
                .updateInvite()
                .inviteIDPath(inviteID)
                .body(body), options);

    }


}
