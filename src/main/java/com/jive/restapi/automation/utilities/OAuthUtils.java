package com.jive.restapi.automation.utilities;

import com.xo.restapi.automation.context.UserContext;
import io.restassured.specification.RequestSpecification;
import lombok.experimental.UtilityClass;
import lombok.var;

import java.util.Base64;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpHeaders.AUTHORIZATION;


@UtilityClass
public class OAuthUtils {

    private static final String BASIC = "Basic ";


    public static RequestSpecification getOAuthRequestSpecification() {
        var str = UserContext.getUser().getUsername() + ":" + UserContext.getUser().getPassword();
        var basic = BASIC + Base64.getEncoder().encodeToString(str.getBytes());
        return given()
                .header(AUTHORIZATION, basic);
    }
}
