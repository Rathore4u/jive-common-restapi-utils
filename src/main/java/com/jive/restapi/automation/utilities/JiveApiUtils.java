package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.ApiClient;

public class JiveApiUtils extends CommonApiUtils {

    public static ApiClient getApiClient() {
        return ApiClient.api(
                ApiClient.Config.apiConfig()
                        .reqSpecSupplier(DEFAULT_SUPPLIER));
    }

    public static ApiClient getApiClientEventType() {
        return ApiClient.api(
                ApiClient.Config.apiConfig()
                        .reqSpecSupplier(DEFAULT_SUPPLIER_EVENT));
    }
}
