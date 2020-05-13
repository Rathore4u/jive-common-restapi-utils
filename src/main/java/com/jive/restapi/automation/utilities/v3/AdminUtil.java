package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.AdminApi;
import com.jive.restapi.generated.person.models.ProfileField;
import com.jive.restapi.generated.person.models.JivePropertyEntity;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in admin group.
 */

@UtilityClass
public class AdminUtil {
    private static AdminApi api() {
        return ApiUtils.apiClient().admin();
    }

        
    /**
     * getBlogAppliedEntitlements.
     * 
     * Path   : "/admin/blogs/appliedEntitlements"
     * Method : get
     * OpId   : getBlogAppliedEntitlements
     * 
     * @return AppliedEntitlementEntities 
     */ 
    @SafeVarargs
    public static Response getBlogAppliedEntitlements(
                                    Options.OptionsBuilder<AdminApi.GetBlogAppliedEntitlementsOper>... options) {
        return Options.execute(api()
                .getBlogAppliedEntitlements(), options);

    }
    
    
    /**
     * getCaches.
     * 
     * Path   : "/admin/caches"
     * Method : get
     * OpId   : getCaches
     * 
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getCaches(
                                    Options.OptionsBuilder<AdminApi.GetCachesOper>... options) {
        return Options.execute(api()
                .getCaches(), options);

    }
    
    
    /**
     * getCache.
     * 
     * Path   : "/admin/caches/{name}"
     * Method : get
     * OpId   : getCache
     * 
     * @param name required parameter
     * @return CacheEntity 
     */ 
    @SafeVarargs
    public static Response getCache(
                                    String name,
                                    Options.OptionsBuilder<AdminApi.GetCacheOper>... options) {
        return Options.execute(api()
                .getCache()
                .namePath(name), options);

    }
    
    
    /**
     * clearCache.
     * 
     * Path   : "/admin/caches/{name}/clear"
     * Method : post
     * OpId   : clearCache
     * 
     * @param name required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response clearCache(
                                    String name,
                                    Options.OptionsBuilder<AdminApi.ClearCacheOper>... options) {
        return Options.execute(api()
                .clearCache()
                .namePath(name), options);

    }
    
    
    /**
     * getGroupsAppliedEntitlements.
     * 
     * Path   : "/admin/groups/appliedEntitlements"
     * Method : get
     * OpId   : getGroupsAppliedEntitlements
     * 
     * @return AppliedEntitlementEntities 
     */ 
    @SafeVarargs
    public static Response getGroupsAppliedEntitlements(
                                    Options.OptionsBuilder<AdminApi.GetGroupsAppliedEntitlementsOper>... options) {
        return Options.execute(api()
                .getGroupsAppliedEntitlements(), options);

    }
    
    
    /**
     * getAuthorization.
     * 
     * Path   : "/admin/people/authorizations/oauth/{ID}"
     * Method : get
     * OpId   : getAuthorization
     * 
     * @param ID required parameter
     * @return AuthorizationEntity 
     */ 
    @SafeVarargs
    public static Response getAuthorization(
                                    String ID,
                                    Options.OptionsBuilder<AdminApi.GetAuthorizationOper>... options) {
        return Options.execute(api()
                .getAuthorization()
                .IDPath(ID), options);

    }
    
    
    /**
     * deleteAuthorization.
     * 
     * Path   : "/admin/people/authorizations/oauth/{ID}"
     * Method : delete
     * OpId   : deleteAuthorization
     * 
     * @param ID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteAuthorization(
                                    String ID,
                                    Options.OptionsBuilder<AdminApi.DeleteAuthorizationOper>... options) {
        return Options.execute(api()
                .deleteAuthorization()
                .IDPath(ID), options);

    }
    
    
    /**
     * getAuthorizations.
     * 
     * Path   : "/admin/people/{personID}/authorizations/oauth"
     * Method : get
     * OpId   : getAuthorizations
     * 
     * @param personID required parameter
     * @return AuthorizationEntityEntities 
     */ 
    @SafeVarargs
    public static Response getAuthorizations(
                                    String personID,
                                    Options.OptionsBuilder<AdminApi.GetAuthorizationsOper>... options) {
        return Options.execute(api()
                .getAuthorizations()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPlugins.
     * 
     * Path   : "/admin/plugins"
     * Method : get
     * OpId   : getPlugins
     * 
     * @return PluginEntities 
     */ 
    @SafeVarargs
    public static Response getPlugins(
                                    Options.OptionsBuilder<AdminApi.GetPluginsOper>... options) {
        return Options.execute(api()
                .getPlugins(), options);

    }
    
    
    /**
     * getPlugin.
     * 
     * Path   : "/admin/plugins/{name}"
     * Method : get
     * OpId   : getPlugin
     * 
     * @param name required parameter
     * @return Plugin 
     */ 
    @SafeVarargs
    public static Response getPlugin(
                                    String name,
                                    Options.OptionsBuilder<AdminApi.GetPluginOper>... options) {
        return Options.execute(api()
                .getPlugin()
                .namePath(name), options);

    }
    
    
    /**
     * getProfileFields.
     * 
     * Path   : "/admin/profileFields"
     * Method : get
     * OpId   : getProfileFields
     * 
     * @return ProfileFieldEntities 
     */ 
    @SafeVarargs
    public static Response getProfileFields(
                                    Options.OptionsBuilder<AdminApi.GetProfileFieldsOper>... options) {
        return Options.execute(api()
                .getProfileFields(), options);

    }
    
    
    /**
     * createProfileField.
     * 
     * Path   : "/admin/profileFields"
     * Method : post
     * OpId   : createProfileField
     * 
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createProfileField(
                                    ProfileField body,
                                    Options.OptionsBuilder<AdminApi.CreateProfileFieldOper>... options) {
        return Options.execute(api()
                .createProfileField()
                .body(body), options);

    }
    
    
    /**
     * getProfileFieldName.
     * 
     * Path   : "/admin/profileFields/@name"
     * Method : get
     * OpId   : getProfileFieldName
     * 
     * @return ProfileFieldNameEntity 
     */ 
    @SafeVarargs
    public static Response getProfileFieldName(
                                    Options.OptionsBuilder<AdminApi.GetProfileFieldNameOper>... options) {
        return Options.execute(api()
                .getProfileFieldName(), options);

    }
    
    
    /**
     * updateProfileFieldNAme.
     * 
     * Path   : "/admin/profileFields/@name"
     * Method : put
     * OpId   : updateProfileFieldNAme
     * 
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response updateProfileFieldNAme(
                                    Options.OptionsBuilder<AdminApi.UpdateProfileFieldNAmeOper>... options) {
        return Options.execute(api()
                .updateProfileFieldNAme(), options);

    }
    
    
    /**
     * updateOrder.
     * 
     * Path   : "/admin/profileFields/order"
     * Method : put
     * OpId   : updateOrder
     * 
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response updateOrder(
                                    Options.OptionsBuilder<AdminApi.UpdateOrderOper>... options) {
        return Options.execute(api()
                .updateOrder(), options);

    }
    
    
    /**
     * getProfileField.
     * 
     * Path   : "/admin/profileFields/{profileFieldID}"
     * Method : get
     * OpId   : getProfileField
     * 
     * @param profileFieldID required parameter
     * @return ProfileField 
     */ 
    @SafeVarargs
    public static Response getProfileField(
                                    String profileFieldID,
                                    Options.OptionsBuilder<AdminApi.GetProfileFieldOper>... options) {
        return Options.execute(api()
                .getProfileField()
                .profileFieldIDPath(profileFieldID), options);

    }
    
    
    /**
     * updateProfileField.
     * 
     * Path   : "/admin/profileFields/{profileFieldID}"
     * Method : put
     * OpId   : updateProfileField
     * 
     * @param profileFieldID required parameter
     * @param body required parameter
     * @return ProfileField 
     */ 
    @SafeVarargs
    public static Response updateProfileField(
                                    String profileFieldID,
                                    ProfileField body,
                                    Options.OptionsBuilder<AdminApi.UpdateProfileFieldOper>... options) {
        return Options.execute(api()
                .updateProfileField()
                .profileFieldIDPath(profileFieldID)
                .body(body), options);

    }
    
    
    /**
     * deleteProfileField.
     * 
     * Path   : "/admin/profileFields/{profileFieldID}"
     * Method : delete
     * OpId   : deleteProfileField
     * 
     * @param profileFieldID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteProfileField(
                                    String profileFieldID,
                                    Options.OptionsBuilder<AdminApi.DeleteProfileFieldOper>... options) {
        return Options.execute(api()
                .deleteProfileField()
                .profileFieldIDPath(profileFieldID), options);

    }
    
    
    /**
     * getProfileFieldValues.
     * 
     * Path   : "/admin/profileFields/{profileFieldID}/values"
     * Method : get
     * OpId   : getProfileFieldValues
     * 
     * @param profileFieldID required parameter
     * @return ProfileFieldValueCountEntities 
     */ 
    @SafeVarargs
    public static Response getProfileFieldValues(
                                    String profileFieldID,
                                    Options.OptionsBuilder<AdminApi.GetProfileFieldValuesOper>... options) {
        return Options.execute(api()
                .getProfileFieldValues()
                .profileFieldIDPath(profileFieldID), options);

    }
    
    
    /**
     * getProperties.
     * 
     * Path   : "/admin/properties"
     * Method : get
     * OpId   : getProperties
     * 
     * @return JivePropertyEntityEntities 
     */ 
    @SafeVarargs
    public static Response getProperties(
                                    Options.OptionsBuilder<AdminApi.GetPropertiesOper>... options) {
        return Options.execute(api()
                .getProperties(), options);

    }
    
    
    /**
     * createProperty.
     * 
     * Path   : "/admin/properties"
     * Method : post
     * OpId   : createProperty
     * 
     * @param body required parameter
     * @return JivePropertyEntity 
     */ 
    @SafeVarargs
    public static Response createProperty(
                                    JivePropertyEntity body,
                                    Options.OptionsBuilder<AdminApi.CreatePropertyOper>... options) {
        return Options.execute(api()
                .createProperty()
                .body(body), options);

    }
    
    
    /**
     * getProperty.
     * 
     * Path   : "/admin/properties/{name}"
     * Method : get
     * OpId   : getProperty
     * 
     * @param name required parameter
     * @return JivePropertyEntity 
     */ 
    @SafeVarargs
    public static Response getProperty(
                                    String name,
                                    Options.OptionsBuilder<AdminApi.GetPropertyOper>... options) {
        return Options.execute(api()
                .getProperty()
                .namePath(name), options);

    }
    
    
    /**
     * updateProperty.
     * 
     * Path   : "/admin/properties/{name}"
     * Method : put
     * OpId   : updateProperty
     * 
     * @param name required parameter
     * @param body required parameter
     * @return JivePropertyEntity 
     */ 
    @SafeVarargs
    public static Response updateProperty(
                                    String name,
                                    JivePropertyEntity body,
                                    Options.OptionsBuilder<AdminApi.UpdatePropertyOper>... options) {
        return Options.execute(api()
                .updateProperty()
                .namePath(name)
                .body(body), options);

    }
    
    
    /**
     * deleteProperty.
     * 
     * Path   : "/admin/properties/{name}"
     * Method : delete
     * OpId   : deleteProperty
     * 
     * @param name required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteProperty(
                                    String name,
                                    Options.OptionsBuilder<AdminApi.DeletePropertyOper>... options) {
        return Options.execute(api()
                .deleteProperty()
                .namePath(name), options);

    }
    
    
    /**
     * getAppliedEntitlements.
     * 
     * Path   : "/admin/spaces/appliedEntitlements"
     * Method : get
     * OpId   : getAppliedEntitlements
     * 
     * @return Entities 
     */ 
    @SafeVarargs
    public static Response getAppliedEntitlements(
                                    Options.OptionsBuilder<AdminApi.GetAppliedEntitlementsOper>... options) {
        return Options.execute(api()
                .getAppliedEntitlements(), options);

    }
    
    
    /**
     * get.
     * 
     * Path   : "/admin/video/config"
     * Method : get
     * OpId   : get
     * 
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response get(
                                    Options.OptionsBuilder<AdminApi.GetOper>... options) {
        return Options.execute(api()
                .get(), options);

    }
    
    
    /**
     * post.
     * 
     * Path   : "/admin/video/config"
     * Method : post
     * OpId   : post
     * 
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response post(
                                    Options.OptionsBuilder<AdminApi.PostOper>... options) {
        return Options.execute(api()
                .post(), options);

    }
    
    
    /**
     * put.
     * 
     * Path   : "/admin/video/config"
     * Method : put
     * OpId   : put
     * 
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response put(
                                    Options.OptionsBuilder<AdminApi.PutOper>... options) {
        return Options.execute(api()
                .put(), options);

    }
    
    
    /**
     * delete.
     * 
     * Path   : "/admin/video/config"
     * Method : delete
     * OpId   : delete
     * 
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response delete(
                                    Options.OptionsBuilder<AdminApi.DeleteOper>... options) {
        return Options.execute(api()
                .delete(), options);

    }
    
    
}
