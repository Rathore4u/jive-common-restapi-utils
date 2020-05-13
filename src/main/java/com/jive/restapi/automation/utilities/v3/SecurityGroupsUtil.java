package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.SecurityGroupsApi;
import com.jive.restapi.generated.person.models.SecurityGroup;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in securityGroups group.
 */

@UtilityClass
public class SecurityGroupsUtil {
    private static SecurityGroupsApi api() {
        return ApiUtils.apiClient().securityGroups();
    }

    /**
     * createSecurityGroup.
     * 
     * Path : "/securityGroups" Method : post OpId : createSecurityGroup Create and
     * return a security group based on the specified security group entity. Upon
     * success, return a security group entity representing the new security group
     * with all available fields.
     * 
     * @param body required parameter
     * @return SecurityGroup
     */
    @SafeVarargs
    public static Response createSecurityGroup(SecurityGroup body,
            Options.OptionsBuilder<SecurityGroupsApi.CreateSecurityGroupOper>... options) {
        return Options.execute(api().createSecurityGroup().body(body), options);
    }
}
