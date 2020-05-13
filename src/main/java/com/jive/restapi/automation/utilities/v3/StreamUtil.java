package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.StreamApi;
import com.jive.restapi.generated.person.models.Stream;
import java.util.List;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in stream group.
 */

@UtilityClass
public class StreamUtil {
    private static StreamApi api() {
        return ApiUtils.apiClient().stream();
    }
        
    /**
     * getConnectionsActivity.
     * 
     * Path   : "/streams/connections/activities"
     * Method : get
     * OpId   : getConnectionsActivity
     * Return the specified activities for the personal feed (activity of people and places you are following) for the requesting person.
     * @return ActivityEntities 
     */ 
    @SafeVarargs
    public static Response getConnectionsActivity(
                                    Options.OptionsBuilder<StreamApi.GetConnectionsActivityOper>... options) {
        return Options.execute(api()
                .getConnectionsActivity(), 
                 options);
    }
    
    /**
     * deleteStream.
     * 
     * Path   : "/streams/{streamID}"
     * Method : delete
     * OpId   : deleteStream
     * Delete an existing custom stream.
     * @param streamID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteStream(
                                    String streamID,
                                    Options.OptionsBuilder<StreamApi.DeleteStreamOper>... options) {
        return Options.execute(api()
                .deleteStream()
                .streamIDPath(streamID), 
                 options);
    }
    
    /**
     * getStream.
     * 
     * Path   : "/streams/{streamID}"
     * Method : get
     * OpId   : getStream
     * Return a Stream representation of the specified stream.
     * @param streamID required parameter
     * @return Stream 
     */ 
    @SafeVarargs
    public static Response getStream(
                                    String streamID,
                                    Options.OptionsBuilder<StreamApi.GetStreamOper>... options) {
        return Options.execute(api()
                .getStream()
                .streamIDPath(streamID), 
                 options);
    }
    
    /**
     * updateStream.
     * 
     * Path   : "/streams/{streamID}"
     * Method : put
     * OpId   : updateStream
     * Update an existing custom stream, based on the information in the specified Stream. Then, return a Stream reflecting the updated stream configuration.
     * @param streamID required parameter
     * @param body required parameter
     * @return Stream 
     */ 
    @SafeVarargs
    public static Response updateStream(
                                    String streamID,
                                    Stream body,
                                    Options.OptionsBuilder<StreamApi.UpdateStreamOper>... options) {
        return Options.execute(api()
                .updateStream()
                .streamIDPath(streamID)
                .body(body), 
                 options);
    }
    
    /**
     * getActivity.
     * 
     * Path   : "/streams/{streamID}/activities"
     * Method : get
     * OpId   : getActivity
     * Return the specified activities for the specified stream.
     * @param streamID required parameter
     * @return ActivityEntities 
     */ 
    @SafeVarargs
    public static Response getActivity(
                                    String streamID,
                                    Options.OptionsBuilder<StreamApi.GetActivityOper>... options) {
        return Options.execute(api()
                .getActivity()
                .streamIDPath(streamID), 
                 options);
    }    
    
    /**
     * getActivityCount.
     * 
     * Path   : "/streams/{streamID}/activities/count"
     * Method : get
     * OpId   : getActivityCount
     * Return count of new activities for the given user since the provided time.
     * @param streamID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getActivityCount(
                                    String streamID,
                                    Options.OptionsBuilder<StreamApi.GetActivityCountOper>... options) {
        return Options.execute(api()
                .getActivityCount()
                .streamIDPath(streamID), 
                 options);
    }
    
    /**
     * addAssociations.
     * 
     * Path   : "/streams/{streamID}/associations"
     * Method : post
     * OpId   : addAssociations
     * Add associations between the specified custom stream and the list of specified Jive objects.  This is an all or nothing operation; if any individual attempt to associate fails, all previously successful attempts will be rolled back.
     * @param streamID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response addAssociations(
                                    String streamID,
                                    List<String> body,
                                    Options.OptionsBuilder<StreamApi.AddAssociationsOper>... options) {
        return Options.execute(api()
                .addAssociations()
                .streamIDPath(streamID)
                .body(body), 
                 options);
    }  
    
    /**
     * getAssociations.
     * 
     * Path   : "/streams/{streamID}/associations"
     * Method : get
     * OpId   : getAssociations
     * Return a paginated list of s for Jive objects that are associated with the specified stream, and match the optionally specified filters.
     * @param streamID required parameter
     * @return JiveObjectEntities 
     */ 
    @SafeVarargs
    public static Response getAssociations(
                                    String streamID,
                                    Options.OptionsBuilder<StreamApi.GetAssociationsOper>... options) {
        return Options.execute(api()
                .getAssociations()
                .streamIDPath(streamID), 
                 options);
    }
      
    /**
     * getAssociation.
     * 
     * Path   : "/streams/{streamID}/associations/{objectType}/{objectID}"
     * Method : get
     * OpId   : getAssociation
     * Return an Object for the specified associated object with the specified stream (if any).
     * @param streamID required parameter
     * @param objectType required parameter
     * @param objectID required parameter
     * @return JiveObject 
     */ 
    @SafeVarargs
    public static Response getAssociation(
                                    String streamID,
                                    String objectType,
                                    String objectID,
                                    Options.OptionsBuilder<StreamApi.GetAssociationOper>... options) {
        return Options.execute(api()
                .getAssociation()
                .streamIDPath(streamID)
                .objectTypePath(objectType)
                .objectIDPath(objectID), 
                 options);
    }   
    
    /**
     * removeAssociation.
     * 
     * Path   : "/streams/{streamID}/associations/{objectType}/{objectID}"
     * Method : delete
     * OpId   : removeAssociation
     * Remove an association between the specified custom stream and the specified Jive object.
     * @param streamID required parameter
     * @param objectType required parameter
     * @param objectID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response removeAssociation(
                                    String streamID,
                                    String objectType,
                                    String objectID,
                                    Options.OptionsBuilder<StreamApi.RemoveAssociationOper>... options) {
        return Options.execute(api()
                .removeAssociation()
                .streamIDPath(streamID)
                .objectTypePath(objectType)
                .objectIDPath(objectID), 
                 options);
    }   
}
