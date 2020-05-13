package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.VersionApi;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in version group.
 */

@UtilityClass
public class VersionUtil {
    private static VersionApi api() {
        return ApiUtils.apiClient().version();
    }

        
    /**
     * getVersions.
     * 
     * Path   : "/versions/{contentID}"
     * Method : get
     * OpId   : getVersions
     * Return a paginated list of versions of the specified content.
     * @param contentID required parameter
     * @return ContentVersionEntities 
     */ 
    @SafeVarargs
    public static Response getVersions(
                                    String contentID,
                                    Options.OptionsBuilder<VersionApi.GetVersionsOper>... options) {
        return Options.execute(api()
                .getVersions()
                .contentIDPath(contentID), 
                 options);

    }
    
    
    /**
     * deleteVersion.
     * 
     * Path   : "/versions/{contentID}/{versionNumber}"
     * Method : delete
     * OpId   : deleteVersion
     * Delete the specified version of a specified content object.
     * @param contentID required parameter
     * @param versionNumber required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteVersion(
                                    String contentID,
                                    Object versionNumber,
                                    Options.OptionsBuilder<VersionApi.DeleteVersionOper>... options) {
        return Options.execute(api()
                .deleteVersion()
                .contentIDPath(contentID)
                .versionNumberPath(versionNumber), 
                 options);

    }
    
    
    /**
     * getVersion.
     * 
     * Path   : "/versions/{contentID}/{versionNumber}"
     * Method : get
     * OpId   : getVersion
     * Return the specified version of a content with the specified fields.
     * @param contentID required parameter
     * @param versionNumber required parameter
     * @return ContentVersion 
     */ 
    @SafeVarargs
    public static Response getVersion(
                                    String contentID,
                                    Object versionNumber,
                                    Options.OptionsBuilder<VersionApi.GetVersionOper>... options) {
        return Options.execute(api()
                .getVersion()
                .contentIDPath(contentID)
                .versionNumberPath(versionNumber), 
                 options);

    }
    
    
    /**
     * restoreVersion.
     * 
     * Path   : "/versions/{contentID}/{versionNumber}"
     * Method : post
     * OpId   : restoreVersion
     * Restore a content version by creating a copy of the version to restore as the newest content version and returning that content version.
     * @param contentID required parameter
     * @param versionNumber required parameter
     * @return ContentVersion 
     */ 
    @SafeVarargs
    public static Response restoreVersion(
                                    String contentID,
                                    Object versionNumber,
                                    Options.OptionsBuilder<VersionApi.RestoreVersionOper>... options) {
        return Options.execute(api()
                .restoreVersion()
                .contentIDPath(contentID)
                .versionNumberPath(versionNumber), 
                 options);

    }
    
    
    /**
     * getVersionData.
     * 
     * Path   : "/versions/{contentID}/{versionNumber}/data"
     * Method : get
     * OpId   : getVersionData
     * Return the binary content of the specified version of the specified file (returns ConflictException on any other content type.)
     * @param contentID required parameter
     * @param versionNumber required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getVersionData(
                                    String contentID,
                                    Object versionNumber,
                                    Options.OptionsBuilder<VersionApi.GetVersionDataOper>... options) {
        return Options.execute(api()
                .getVersionData()
                .contentIDPath(contentID)
                .versionNumberPath(versionNumber), 
                 options);

    }
    
    
}
