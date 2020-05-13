package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.ActivitiesApi;
import com.jive.restapi.generated.person.models.Activity;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in activities group.
 */

@UtilityClass
public class ActivitiesUtil {
    private static ActivitiesApi api() {
        return ApiUtils.apiClient().activities();
    }

        
    /**
     * createActivity.
     * 
     * Path   : "/activities"
     * Method : post
     * OpId   : createActivity
     * Create a new activity stream entry based on the characteristics in the incoming activity object.
     * @param body required parameter
     * @return Activity 
     */ 
    @SafeVarargs
    public static Response createActivity(
                                    Activity body,
                                    Options.OptionsBuilder<ActivitiesApi.CreateActivityOper>... options) {
        return Options.execute(api()
                .createActivity()
                .body(body), 
                 options);

    }
    
    
    /**
     * getActivity.
     * 
     * Path   : "/activities"
     * Method : get
     * OpId   : getActivity
     * Return the specified activities from the stream of all activity visible to the requesting person.
     * @return ActivityEntities 
     */ 
    @SafeVarargs
    public static Response getActivity(
                                    Options.OptionsBuilder<ActivitiesApi.GetActivityOper>... options) {
        return Options.execute(api()
                .getActivity(), 
                 options);

    }
    
    
    /**
     * getCount.
     * 
     * Path   : "/activities/count"
     * Method : get
     * OpId   : getCount
     * Return count of new activities for the given user since the provided time.
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getCount(
                                    Options.OptionsBuilder<ActivitiesApi.GetCountOper>... options) {
        return Options.execute(api()
                .getCount(), 
                 options);

    }
    
    
    /**
     * getDiscoveryChannel.
     * 
     * Path   : "/activities/discovery"
     * Method : get
     * OpId   : getDiscoveryChannel
     * Return the discovery stream, containing recommended, trending, and matters most items.
     * @return PlaceEntities 
     */ 
    @SafeVarargs
    public static Response getDiscoveryChannel(
                                    Options.OptionsBuilder<ActivitiesApi.GetDiscoveryChannelOper>... options) {
        return Options.execute(api()
                .getDiscoveryChannel(), 
                 options);

    }
    
    
    /**
     * getFrequentContent.
     * 
     * Path   : "/activities/frequent/content"
     * Method : get
     * OpId   : getFrequentContent
     * Return the most frequently viewed content that is visible to the requesting person.
     * @return GenericEntities 
     */ 
    @SafeVarargs
    public static Response getFrequentContent(
                                    Options.OptionsBuilder<ActivitiesApi.GetFrequentContentOper>... options) {
        return Options.execute(api()
                .getFrequentContent(), 
                 options);

    }
    
    
    /**
     * getFrequentPeople.
     * 
     * Path   : "/activities/frequent/people"
     * Method : get
     * OpId   : getFrequentPeople
     * Return the most frequently viewed people that are visible to the requesting person.
     * @return PersonEntities 
     */ 
    @SafeVarargs
    public static Response getFrequentPeople(
                                    Options.OptionsBuilder<ActivitiesApi.GetFrequentPeopleOper>... options) {
        return Options.execute(api()
                .getFrequentPeople(), 
                 options);

    }
    
    
    /**
     * getFrequentPlaces.
     * 
     * Path   : "/activities/frequent/places"
     * Method : get
     * OpId   : getFrequentPlaces
     * Return the most frequently viewed places that are visible to the requesting person.
     * @return PlaceEntities 
     */ 
    @SafeVarargs
    public static Response getFrequentPlaces(
                                    Options.OptionsBuilder<ActivitiesApi.GetFrequentPlacesOper>... options) {
        return Options.execute(api()
                .getFrequentPlaces(), 
                 options);

    }
    
    
    /**
     * getRecentContent.
     * 
     * Path   : "/activities/recent/content"
     * Method : get
     * OpId   : getRecentContent
     * Return the most recently viewed content that is visible to the requesting person.
     * @return GenericEntities 
     */ 
    @SafeVarargs
    public static Response getRecentContent(
                                    Options.OptionsBuilder<ActivitiesApi.GetRecentContentOper>... options) {
        return Options.execute(api()
                .getRecentContent(), 
                 options);

    }
    
    
    /**
     * getRecentPeople.
     * 
     * Path   : "/activities/recent/people"
     * Method : get
     * OpId   : getRecentPeople
     * Return the most recently viewed people that are visible to the requesting person.
     * @return PersonEntities 
     */ 
    @SafeVarargs
    public static Response getRecentPeople(
                                    Options.OptionsBuilder<ActivitiesApi.GetRecentPeopleOper>... options) {
        return Options.execute(api()
                .getRecentPeople(), 
                 options);

    }
    
    
    /**
     * getRecentPlaces.
     * 
     * Path   : "/activities/recent/places"
     * Method : get
     * OpId   : getRecentPlaces
     * Return the most recently viewed places that are visible to the requesting person.
     * @return PlaceEntities 
     */ 
    @SafeVarargs
    public static Response getRecentPlaces(
                                    Options.OptionsBuilder<ActivitiesApi.GetRecentPlacesOper>... options) {
        return Options.execute(api()
                .getRecentPlaces(), 
                 options);

    }
    
    
    /**
     * getSocialNews.
     * 
     * Path   : "/activities/social/news"
     * Method : get
     * OpId   : getSocialNews
     * Return a paginated list of social news for the authenticated user.
     * @return ActivityEntities 
     */ 
    @SafeVarargs
    public static Response getSocialNews(
                                    Options.OptionsBuilder<ActivitiesApi.GetSocialNewsOper>... options) {
        return Options.execute(api()
                .getSocialNews(), 
                 options);

    }
    
    
    /**
     * getSocialPeople.
     * 
     * Path   : "/activities/social/people"
     * Method : get
     * OpId   : getSocialPeople
     * Return the people most frequently interacted with in the inbox that are visible to the requesting person.
     * @return PersonEntities 
     */ 
    @SafeVarargs
    public static Response getSocialPeople(
                                    Options.OptionsBuilder<ActivitiesApi.GetSocialPeopleOper>... options) {
        return Options.execute(api()
                .getSocialPeople(), 
                 options);

    }
    
    
}
