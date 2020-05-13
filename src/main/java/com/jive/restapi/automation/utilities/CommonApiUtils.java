package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Place;
import com.xo.restapi.automation.context.UserContext;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;

import java.util.function.Supplier;

import static com.jive.restapi.generated.person.GsonObjectMapper.gson;
import static com.xo.restapi.automation.configs.CommonUtils.getBaseUrl;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;

/**
 * Common API utils
 */
public class CommonApiUtils {
    public static final String API_CORE_V_3 = "api/core/v3";
    public static final String API_CORE_V_3_EVENT_INVITE = "api/core/ext/event-type-plugin/v3";

    /**
     * Provides the authenticated supplier.
     */
    protected static Supplier<RequestSpecBuilder> DEFAULT_SUPPLIER = () -> {
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName(UserContext.getUser().getUsername());
        authScheme.setPassword(UserContext.getUser().getPassword());

        return new RequestSpecBuilder()
                .setBaseUri(getBaseUrl() + API_CORE_V_3)
                .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                .setAuth(authScheme);
    };

    protected static Supplier<RequestSpecBuilder> DEFAULT_SUPPLIER_EVENT = () -> {
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName(UserContext.getUser().getUsername());
        authScheme.setPassword(UserContext.getUser().getPassword());

        return new RequestSpecBuilder()
                .setBaseUri(getBaseUrl() + API_CORE_V_3_EVENT_INVITE)
                .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                .setAuth(authScheme);
    };

    public static String getParentPlaceUri(Place place) {
        return getBaseUrl() + API_CORE_V_3 + "/places" + "/" + place.getPlaceID();
    }
}
