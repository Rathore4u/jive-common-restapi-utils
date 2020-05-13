package com.jive.restapi.automation.utilities.v3;

import com.jive.restapi.automation.utilities.JiveApiUtils;
import com.jive.restapi.generated.person.ApiClient;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiUtils {
    public static ApiClient apiClient() {
        return JiveApiUtils.getApiClient();
    }

    public static ApiClient apiClientEventInvite() {
        return JiveApiUtils.getApiClientEventType();
    }
}
