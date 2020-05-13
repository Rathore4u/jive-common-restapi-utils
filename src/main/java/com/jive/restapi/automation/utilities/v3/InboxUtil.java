package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.InboxApi;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in inbox group.
 */

@UtilityClass
public class InboxUtil {
    private static InboxApi api() {
        return ApiUtils.apiClient().inbox();
    }

    /**
     * getActivity.
     * 
     * Path : "/inbox" Method : get OpId : getActivity Return the specified inbox
     * entries of the person making the request.
     * 
     * @return InboxEntry
     */
    @SafeVarargs
    public static Response getActivity(Options.OptionsBuilder<InboxApi.GetActivityOper>... options) {
        return Options.execute(api().getActivity(), options);

    }

    /**
     * markRead.
     * 
     * Path : "/inbox/allRead" Method : post OpId : markRead Mark everything in the
     * inbox as having been read.
     * 
     * @return Generic response
     */
    @SafeVarargs
    public static Response markRead(Options.OptionsBuilder<InboxApi.MarkReadOper>... options) {
        return Options.execute(api().markRead(), options);

    }

    /**
     * getCounts.
     * 
     * Path : "/inbox/counts" Method : get OpId : getCounts Return counting
     * information about the inbox of the person making the request.
     * 
     * @return Generic response
     */
    @SafeVarargs
    public static Response getCounts(Options.OptionsBuilder<InboxApi.GetCountsOper>... options) {
        return Options.execute(api().getCounts(), options);

    }

}
