package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Invite;
import com.jive.restapi.generated.person.models.InviteRequest;
import com.jive.restapi.generated.person.models.Place;
import io.restassured.response.Response;

import java.util.function.Function;

public class InviteUtils {

    public static Response createInvite(InviteRequest inviteRequest, Place place) {
        return JiveApiUtils.getApiClient()
                .invite()
                .createInvite()
                .placeIDPath(place.getPlaceID())
                .body(inviteRequest)
                .execute(Function.identity());
    }

    public static Response updateInvite(Invite invite) {
        return JiveApiUtils.getApiClient()
                .invite()
                .updateInvite()
                .inviteIDPath(invite.getId())
                .body(invite)
                .execute(Function.identity());
    }
}
