package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.PersonApi;
import com.jive.restapi.generated.person.models.Person;
import java.util.List;
import java.util.Map;
import com.jive.restapi.generated.person.models.Stream;
import com.jive.restapi.generated.person.models.Page;
import com.jive.restapi.generated.person.models.PrivateProps;
import com.jive.restapi.generated.person.models.ProfileFieldPrivacy;
import com.jive.restapi.generated.person.models.Task;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in person group.
 */

@UtilityClass
public class PersonUtil {
    private static PersonApi api() {
        return ApiUtils.apiClient().person();
    }

        
    /**
     * createPerson.
     * 
     * Path   : "/people"
     * Method : post
     * OpId   : createPerson
     * Create a Person for a new user based on the contents of the specified Person.  Only modifiable fields that actually provide a value in the incoming entity are processed. 
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createPerson(
                                    Person body,
                                    Options.OptionsBuilder<PersonApi.CreatePersonOper>... options) {
        return Options.execute(api()
                .createPerson()
                .body(body), options);

    }
    
    
    /**
     * getPeople.
     * 
     * Path   : "/people"
     * Method : get
     * OpId   : getPeople
     * Return a paginated list of Persons for users that match the specified criteria.

     * @return PersonEntities 
     */ 
    @SafeVarargs
    public static Response getPeople(
                                    Options.OptionsBuilder<PersonApi.GetPeopleOper>... options) {
        return Options.execute(api()
                .getPeople(), options);

    }
    
    
    /**
     * getAllPeople.
     * 
     * Path   : "/people/@all"
     * Method : get
     * OpId   : getAllPeople
     * Return a paginated list of Persons for users that match the specified criteria.  Users will be sorted by userID ascending.

     * @return List<Person> 
     */ 
    @SafeVarargs
    public static Response getAllPeople(
                                    Options.OptionsBuilder<PersonApi.GetAllPeopleOper>... options) {
        return Options.execute(api()
                .getAllPeople(), options);

    }
    
    
    /**
     * getFilterableFields.
     * 
     * Path   : "/people/@filterableFields"
     * Method : get
     * OpId   : getFilterableFields
     * Return the set of fields that can be used for filtering users in this Jive instance.
     * @return List<String> 
     */ 
    @SafeVarargs
    public static Response getFilterableFields(
                                    Options.OptionsBuilder<PersonApi.GetFilterableFieldsOper>... options) {
        return Options.execute(api()
                .getFilterableFields(), options);

    }
    
    
    /**
     * getMetadata.
     * 
     * Path   : "/people/@metadata"
     * Method : get
     * OpId   : getMetadata
     * Return metadata about our data object type in this Jive instance.
     * @return Object 
     */ 
    @SafeVarargs
    public static Response getMetadata(
                                    Options.OptionsBuilder<PersonApi.GetMetadataOper>... options) {
        return Options.execute(api()
                .getMetadata(), options);

    }
    
    
    /**
     * getResources.
     * 
     * Path   : "/people/@resources"
     * Method : get
     * OpId   : getResources
     * Return metadata about the resources available for our data object type in this Jive instance.
     * @return List<Resource> 
     */ 
    @SafeVarargs
    public static Response getResources(
                                    Options.OptionsBuilder<PersonApi.GetResourcesOper>... options) {
        return Options.execute(api()
                .getResources(), options);

    }
    
    
    /**
     * getSupportedFields.
     * 
     * Path   : "/people/@supportedFields"
     * Method : get
     * OpId   : getSupportedFields
     * Return the set of fields for our object type that are supported in this Jive instance.
     * @return List<String> 
     */ 
    @SafeVarargs
    public static Response getSupportedFields(
                                    Options.OptionsBuilder<PersonApi.GetSupportedFieldsOper>... options) {
        return Options.execute(api()
                .getSupportedFields(), options);

    }
    
    
    /**
     * getAvatarDeactivated.
     * 
     * Path   : "/people/avatar/deactivated"
     * Method : get
     * OpId   : getAvatarDeactivated
     * Return the binary content of the avatar image for deactivated users.
     * @return String 
     */ 
    @SafeVarargs
    public static Response getAvatarDeactivated(
                                    Options.OptionsBuilder<PersonApi.GetAvatarDeactivatedOper>... options) {
        return Options.execute(api()
                .getAvatarDeactivated(), options);

    }
    
    
    /**
     * getPersonByEmail.
     * 
     * Path   : "/people/email/{email}"
     * Method : get
     * OpId   : getPersonByEmail
     * Return a Person describing the requested Jive user by email address.
     * @param email required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response getPersonByEmail(
                                    String email,
                                    Options.OptionsBuilder<PersonApi.GetPersonByEmailOper>... options) {
        return Options.execute(api()
                .getPersonByEmail()
                .emailPath(email), options);

    }
    
    
    /**
     * getUsersByExpertise.
     * 
     * Path   : "/people/expertise/{tagName}"
     * Method : get
     * OpId   : getUsersByExpertise
     * Return paginated list of people that are experts on the specified tag.
     * @param tagName required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getUsersByExpertise(
                                    String tagName,
                                    Options.OptionsBuilder<PersonApi.GetUsersByExpertiseOper>... options) {
        return Options.execute(api()
                .getUsersByExpertise()
                .tagNamePath(tagName), options);

    }
    
    
    /**
     * getPersonByExternalIdentity.
     * 
     * Path   : "/people/external/{identityType}/{identity}"
     * Method : get
     * OpId   : getPersonByExternalIdentity
     * Return a Person describing the requested Jive user by external identity.
     * @param identityType required parameter
     * @param identity required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response getPersonByExternalIdentity(
                                    String identityType,
                                    String identity,
                                    Options.OptionsBuilder<PersonApi.GetPersonByExternalIdentityOper>... options) {
        return Options.execute(api()
                .getPersonByExternalIdentity()
                .identityTypePath(identityType)
                .identityPath(identity), options);

    }
    
    
    /**
     * getRecommendedPeople.
     * 
     * Path   : "/people/recommended"
     * Method : get
     * OpId   : getRecommendedPeople
     * Return a list of recommended Persons for users. Do a GET to /api/core/v3/metadata/properties/feature.recommender.enabled to figure out whether recommendation service is enabled or not.
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getRecommendedPeople(
                                    Options.OptionsBuilder<PersonApi.GetRecommendedPeopleOper>... options) {
        return Options.execute(api()
                .getRecommendedPeople(), options);

    }
    
    
    /**
     * getTrendingPeople.
     * 
     * Path   : "/people/trending"
     * Method : get
     * OpId   : getTrendingPeople
     * Return a list of trending Persons for users that match the specified filter criteria. Do a GET to /api/core/v3/metadata/properties/feature.recommender.enabled to figure out whether recommendation service is enabled or not.
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getTrendingPeople(
                                    Options.OptionsBuilder<PersonApi.GetTrendingPeopleOper>... options) {
        return Options.execute(api()
                .getTrendingPeople(), options);

    }
    
    
    /**
     * getPersonByUsername.
     * 
     * Path   : "/people/username/{username}"
     * Method : get
     * OpId   : getPersonByUsername
     * Return a Person describing the requested Jive user by username.
     * @param username required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response getPersonByUsername(
                                    String username,
                                    Options.OptionsBuilder<PersonApi.GetPersonByUsernameOper>... options) {
        return Options.execute(api()
                .getPersonByUsername()
                .usernamePath(username), options);

    }
    
    
    /**
     * deletePerson.
     * 
     * Path   : "/people/{personID}"
     * Method : delete
     * OpId   : deletePerson
     * Trigger a background task to delete the specified person, and all of their content.  Returns an HTTP 202 (Accepted) status to indicate the the deletion request has been accepted.  The only way that a client can tell it has been completed is by trying a GET on the person URI, and waiting until a NotFoundException is returned.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deletePerson(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.DeletePersonOper>... options) {
        return Options.execute(api()
                .deletePerson()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPerson.
     * 
     * Path   : "/people/{personID}"
     * Method : get
     * OpId   : getPerson
     * Return a Person describing the requested Jive user by ID.
     * @param personID required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response getPerson(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPersonOper>... options) {
        return Options.execute(api()
                .getPerson()
                .personIDPath(personID), options);

    }
    
    
    /**
     * updatePerson.
     * 
     * Path   : "/people/{personID}"
     * Method : put
     * OpId   : updatePerson
     * Update the specified user based on the contents of the specified Person. Only modifiable fields that actually provide a value in the incoming entity are processed. Then, return a Person reflecting the processed changes.
     * @param personID required parameter
     * @param body required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response updatePerson(
                                    String personID,
                                    Person body,
                                    Options.OptionsBuilder<PersonApi.UpdatePersonOper>... options) {
        return Options.execute(api()
                .updatePerson()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * getColleagues.
     * 
     * Path   : "/people/{personID}/@colleagues"
     * Method : get
     * OpId   : getColleagues
     * Return a paginated list of Persons about colleagues of the specified person (i.e. those who report to the same manager that this person does).
     * @param personID required parameter
     * @return List<Person> 
     */ 
    @SafeVarargs
    public static Response getColleagues(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetColleaguesOper>... options) {
        return Options.execute(api()
                .getColleagues()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getCommonBidirectional.
     * 
     * Path   : "/people/{personID}/@common"
     * Method : get
     * OpId   : getCommonBidirectional
     * Return a paginated list of Persons about bidirectionally related users that you and the specified person have in common (i.e. any person whom you and the specified person are both following, and who is following both you and specified person).
     * @param personID required parameter
     * @return List<Person> 
     */ 
    @SafeVarargs
    public static Response getCommonBidirectional(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetCommonBidirectionalOper>... options) {
        return Options.execute(api()
                .getCommonBidirectional()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPersonFeaturedContent.
     * 
     * Path   : "/people/{personID}/@featuredContent"
     * Method : get
     * OpId   : getPersonFeaturedContent
     * Return a list of featured content objects for the specified person. This is the same as requesting the featured content for the specified person's container via getFeaturedContent(personID, filters, fields, abridged).
     * @param personID required parameter
     * @return List<Content> 
     */ 
    @SafeVarargs
    public static Response getPersonFeaturedContent(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPersonFeaturedContentOper>... options) {
        return Options.execute(api()
                .getPersonFeaturedContent()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getFollowers.
     * 
     * Path   : "/people/{personID}/@followers"
     * Method : get
     * OpId   : getFollowers
     * Return a paginated list of Persons about people who are following the specified person.
     * @param personID required parameter
     * @return List<Person> 
     */ 
    @SafeVarargs
    public static Response getFollowers(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetFollowersOper>... options) {
        return Options.execute(api()
                .getFollowers()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getFollowing.
     * 
     * Path   : "/people/{personID}/@following"
     * Method : get
     * OpId   : getFollowing
     * Return a paginated list of Persons about people the specified person is following.
     * @param personID required parameter
     * @return List<Person> 
     */ 
    @SafeVarargs
    public static Response getFollowing(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetFollowingOper>... options) {
        return Options.execute(api()
                .getFollowing()
                .personIDPath(personID), options);

    }
    
    
    /**
     * createFollowing.
     * 
     * Path   : "/people/{personID}/@following/{followedPersonID}"
     * Method : put
     * OpId   : createFollowing
     * Create a following relationship between the specified user and the specified followed user.
     * @param personID required parameter
     * @param followedPersonID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createFollowing(
                                    String personID,
                                    String followedPersonID,
                                    Options.OptionsBuilder<PersonApi.CreateFollowingOper>... options) {
        return Options.execute(api()
                .createFollowing()
                .personIDPath(personID)
                .followedPersonIDPath(followedPersonID), options);

    }
    
    
    /**
     * deleteFollowing.
     * 
     * Path   : "/people/{personID}/@following/{followedPersonID}"
     * Method : delete
     * OpId   : deleteFollowing
     * Delete a following relationship between the specified user and the specified followed user.
     * @param personID required parameter
     * @param followedPersonID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteFollowing(
                                    String personID,
                                    String followedPersonID,
                                    Options.OptionsBuilder<PersonApi.DeleteFollowingOper>... options) {
        return Options.execute(api()
                .deleteFollowing()
                .personIDPath(personID)
                .followedPersonIDPath(followedPersonID), options);

    }
    
    
    /**
     * getFollowingPerson.
     * 
     * Path   : "/people/{personID}/@following/{followedPersonID}"
     * Method : get
     * OpId   : getFollowingPerson
     * Return a Person describing the followed person, if a following relationship from the specified person exists.
     * @param personID required parameter
     * @param followedPersonID required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response getFollowingPerson(
                                    String personID,
                                    String followedPersonID,
                                    Options.OptionsBuilder<PersonApi.GetFollowingPersonOper>... options) {
        return Options.execute(api()
                .getFollowingPerson()
                .personIDPath(personID)
                .followedPersonIDPath(followedPersonID), options);

    }
    
    
    /**
     * getManager.
     * 
     * Path   : "/people/{personID}/@manager"
     * Method : get
     * OpId   : getManager
     * Return a Person describing the manager of the specified person.
     * @param personID required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response getManager(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetManagerOper>... options) {
        return Options.execute(api()
                .getManager()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getNews.
     * 
     * Path   : "/people/{personID}/@news"
     * Method : get
     * OpId   : getNews
     * Return the specified news activity visible to the requesting person.
     * @param personID required parameter
     * @return News 
     */ 
    @SafeVarargs
    public static Response getNews(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetNewsOper>... options) {
        return Options.execute(api()
                .getNews()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getRecognition.
     * 
     * Path   : "/people/{personID}/@recognition"
     * Method : get
     * OpId   : getRecognition
     * Return the specified activities from the stream of all activity visible to the requesting person.
     * @param personID required parameter
     * @return List<Activity> 
     */ 
    @SafeVarargs
    public static Response getRecognition(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetRecognitionOper>... options) {
        return Options.execute(api()
                .getRecognition()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getReports.
     * 
     * Path   : "/people/{personID}/@reports"
     * Method : get
     * OpId   : getReports
     * Return a paginated list of Persons describing the direct reports of the specified person.
     * @param personID required parameter
     * @return List<Person> 
     */ 
    @SafeVarargs
    public static Response getReports(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetReportsOper>... options) {
        return Options.execute(api()
                .getReports()
                .personIDPath(personID), options);

    }
    
    
    /**
     * createReport.
     * 
     * Path   : "/people/{personID}/@reports/{reportPersonID}"
     * Method : put
     * OpId   : createReport
     * Create a manager-report relationship between the specified user and the specified report user.
     * @param personID required parameter
     * @param reportPersonID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createReport(
                                    String personID,
                                    String reportPersonID,
                                    Options.OptionsBuilder<PersonApi.CreateReportOper>... options) {
        return Options.execute(api()
                .createReport()
                .personIDPath(personID)
                .reportPersonIDPath(reportPersonID), options);

    }
    
    
    /**
     * deleteReport.
     * 
     * Path   : "/people/{personID}/@reports/{reportPersonID}"
     * Method : delete
     * OpId   : deleteReport
     * Delete (i.e. retire) an existing manager-report relationship between the specified manager user and the specified report user.
     * @param personID required parameter
     * @param reportPersonID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteReport(
                                    String personID,
                                    String reportPersonID,
                                    Options.OptionsBuilder<PersonApi.DeleteReportOper>... options) {
        return Options.execute(api()
                .deleteReport()
                .personIDPath(personID)
                .reportPersonIDPath(reportPersonID), options);

    }
    
    
    /**
     * getReport.
     * 
     * Path   : "/people/{personID}/@reports/{reportPersonID}"
     * Method : get
     * OpId   : getReport
     * Return a Person describing the specified direct report of the specified person, if such a relationship exists.
     * @param personID required parameter
     * @param reportPersonID required parameter
     * @return Person 
     */ 
    @SafeVarargs
    public static Response getReport(
                                    String personID,
                                    String reportPersonID,
                                    Options.OptionsBuilder<PersonApi.GetReportOper>... options) {
        return Options.execute(api()
                .getReport()
                .personIDPath(personID)
                .reportPersonIDPath(reportPersonID), options);

    }
    
    
    /**
     * getSocialUsers.
     * 
     * Path   : "/people/{personID}/@social"
     * Method : get
     * OpId   : getSocialUsers
     * Return a paginated list of Persons about the people with whom the specified person interacts most frequently.
     * @param personID required parameter
     * @return List<Person> 
     */ 
    @SafeVarargs
    public static Response getSocialUsers(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetSocialUsersOper>... options) {
        return Options.execute(api()
                .getSocialUsers()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getTrendingContent.
     * 
     * Path   : "/people/{personID}/@trendingContent"
     * Method : get
     * OpId   : getTrendingContent
     * Return a list of a user's trending content objects. It's possible for some Jive instances to have recommendation disabled, or too few recommendations, in which case the service falls back to the user's most-liked content unless otherwise specified with the fallback parameter.
     * @param personID required parameter
     * @return List<Content> 
     */ 
    @SafeVarargs
    public static Response getTrendingContent(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetTrendingContentOper>... options) {
        return Options.execute(api()
                .getTrendingContent()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPersonTrendingPlaces.
     * 
     * Path   : "/people/{personID}/@trendingPlaces"
     * Method : get
     * OpId   : getPersonTrendingPlaces
     * Return a list of trending places. It's possible for some Jive instances to have recommendation disabled, or too few recommendations, in which case the service falls back to the user's most frequent places unless otherwise specified with the fallback parameter.
     * @param personID required parameter
     * @return List<Place> 
     */ 
    @SafeVarargs
    public static Response getPersonTrendingPlaces(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPersonTrendingPlacesOper>... options) {
        return Options.execute(api()
                .getPersonTrendingPlaces()
                .personIDPath(personID), options);

    }
    
    
    /**
     * acceptTermsAndConditions.
     * 
     * Path   : "/people/{personID}/acceptTermsAndConditions"
     * Method : post
     * OpId   : acceptTermsAndConditions
     * Accept the terms and conditions for the authenticated user.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response acceptTermsAndConditions(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.AcceptTermsAndConditionsOper>... options) {
        return Options.execute(api()
                .acceptTermsAndConditions()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPersonActivity.
     * 
     * Path   : "/people/{personID}/activities"
     * Method : get
     * OpId   : getPersonActivity
     * Return the specified profile activities for the specified user.
     * @param personID required parameter
     * @return List<Activity> 
     */ 
    @SafeVarargs
    public static Response getPersonActivity(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPersonActivityOper>... options) {
        return Options.execute(api()
                .getPersonActivity()
                .personIDPath(personID), options);

    }
    
    
    /**
     * deleteAvatar.
     * 
     * Path   : "/people/{personID}/avatar"
     * Method : delete
     * OpId   : deleteAvatar
     * Delete the active avatar for the specified user. Only uploaded avatars can be deleted. The system avatar will be selected for the user after the delete operation is completed.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteAvatar(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.DeleteAvatarOper>... options) {
        return Options.execute(api()
                .deleteAvatar()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getAvatar.
     * 
     * Path   : "/people/{personID}/avatar"
     * Method : get
     * OpId   : getAvatar
     * Return the binary content of the avatar image for the specified user. If width is defined and height is not defined (or vice versa) then the returned size will depend on the value defined for aspect ratio. For instance, if the original image is 100 (W)x 600 (H) and 50 (W) is requested with preserveAspectRatio equals true, then the returned image will be 50 (W) x 300 (H). If preserveAspectRatio was false then the returned image will be 50 (W) x 600 (H). Remember that width and height are maximum possible values. This means that if you request 150 (W) then you will get 100 (W) since that is the size of the image.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getAvatar(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetAvatarOper>... options) {
        return Options.execute(api()
                .getAvatar()
                .personIDPath(personID), options);

    }
    
    
    /**
     * setAvatar.
     * 
     * Path   : "/people/{personID}/avatar"
     * Method : put
     * OpId   : setAvatar
     * Set the binary content of the active avatar image for the specified user by specifying the URL where the image will be fetched from.
     * @param personID required parameter
     * @param avatar required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response setAvatar(
                                    String personID,
                                    java.io.File avatar,
                                    Options.OptionsBuilder<PersonApi.SetAvatarOper>... options) {
        return Options.execute(api()
                .setAvatar()
                .personIDPath(personID)
                .avatarMultiPart(avatar), options);

    }
    
    
    /**
     * getBlog.
     * 
     * Path   : "/people/{personID}/blog"
     * Method : get
     * OpId   : getBlog
     * Return the personal blog for the specified user.
     * @param personID required parameter
     * @return Blog 
     */ 
    @SafeVarargs
    public static Response getBlog(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetBlogOper>... options) {
        return Options.execute(api()
                .getBlog()
                .personIDPath(personID), options);

    }
    
    
    /**
     * deleteExpertiseTag2.
     * 
     * Path   : "/people/{personID}/expertise/"
     * Method : delete
     * OpId   : deleteExpertiseTag2
     * Remove an expertise tag from a person, where the name of the tag is specified query string. This alternative version allows backslashes in the tag name
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteExpertiseTag2(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.DeleteExpertiseTag2Oper>... options) {
        return Options.execute(api()
                .deleteExpertiseTag2()
                .personIDPath(personID), options);

    }
    
    
    /**
     * addExpertiseTag.
     * 
     * Path   : "/people/{personID}/expertise/endorse"
     * Method : post
     * OpId   : addExpertiseTag
     * Add expertise tag(s) to a person
     * @param personID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response addExpertiseTag(
                                    String personID,
                                    List<String> body,
                                    Options.OptionsBuilder<PersonApi.AddExpertiseTagOper>... options) {
        return Options.execute(api()
                .addExpertiseTag()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * getTagsUserTaggedOnUser.
     * 
     * Path   : "/people/{personID}/expertise/endorse"
     * Method : get
     * OpId   : getTagsUserTaggedOnUser
     * Returns all the tags that the current user endorsed the user with the id specified with.
     * @param personID required parameter
     * @return List<String> 
     */ 
    @SafeVarargs
    public static Response getTagsUserTaggedOnUser(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetTagsUserTaggedOnUserOper>... options) {
        return Options.execute(api()
                .getTagsUserTaggedOnUser()
                .personIDPath(personID), options);

    }
    
    
    /**
     * approveExpertiseTag.
     * 
     * Path   : "/people/{personID}/expertise/endorse/{tagName}"
     * Method : put
     * OpId   : approveExpertiseTag
     * Used to approve a tag that a user has been endorsed with. The current user and the specified user must be the same or an authorization error will occur.
     * @param personID required parameter
     * @param tagName required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response approveExpertiseTag(
                                    String personID,
                                    String tagName,
                                    Options.OptionsBuilder<PersonApi.ApproveExpertiseTagOper>... options) {
        return Options.execute(api()
                .approveExpertiseTag()
                .personIDPath(personID)
                .tagNamePath(tagName), options);

    }
    
    
    /**
     * unendorse.
     * 
     * Path   : "/people/{personID}/expertise/endorse/{tagName}"
     * Method : delete
     * OpId   : unendorse
     * Removes a tag endorsement from the current user to the specified user.
     * @param personID required parameter
     * @param tagName required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response unendorse(
                                    String personID,
                                    String tagName,
                                    Options.OptionsBuilder<PersonApi.UnendorseOper>... options) {
        return Options.execute(api()
                .unendorse()
                .personIDPath(personID)
                .tagNamePath(tagName), options);

    }
    
    
    /**
     * getWhoEndorsed.
     * 
     * Path   : "/people/{personID}/expertise/endorsers/{tagName}"
     * Method : get
     * OpId   : getWhoEndorsed
     * Return the persons that endorsed the specified person with the specified tag.
     * @param personID required parameter
     * @param tagName required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getWhoEndorsed(
                                    String personID,
                                    String tagName,
                                    Options.OptionsBuilder<PersonApi.GetWhoEndorsedOper>... options) {
        return Options.execute(api()
                .getWhoEndorsed()
                .personIDPath(personID)
                .tagNamePath(tagName), options);

    }
    
    
    /**
     * getPendingExpertiseTags.
     * 
     * Path   : "/people/{personID}/expertise/pending"
     * Method : get
     * OpId   : getPendingExpertiseTags
     * Returns all of the tags that the user has been endorsed with but has not yet approved. The current user and the specified user must be the same or a forbidden error will occur.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getPendingExpertiseTags(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPendingExpertiseTagsOper>... options) {
        return Options.execute(api()
                .getPendingExpertiseTags()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getTopExpertise.
     * 
     * Path   : "/people/{personID}/expertise/top"
     * Method : get
     * OpId   : getTopExpertise
     * Return the top expertise for the specified user.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getTopExpertise(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetTopExpertiseOper>... options) {
        return Options.execute(api()
                .getTopExpertise()
                .personIDPath(personID), options);

    }
    
    
    /**
     * deleteExpertiseTag.
     * 
     * Path   : "/people/{personID}/expertise/{tagName}"
     * Method : delete
     * OpId   : deleteExpertiseTag
     * Remove an expertise tag from a person.
     * @param personID required parameter
     * @param tagName required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteExpertiseTag(
                                    String personID,
                                    String tagName,
                                    Options.OptionsBuilder<PersonApi.DeleteExpertiseTagOper>... options) {
        return Options.execute(api()
                .deleteExpertiseTag()
                .personIDPath(personID)
                .tagNamePath(tagName), options);

    }
    
    
    /**
     * createPersonExtProps.
     * 
     * Path   : "/people/{personID}/extprops"
     * Method : post
     * OpId   : createPersonExtProps
     * Save a new set of extended properties for a person with specified characteristics, and return an entity representing the newly created extended properties.
     * @param personID required parameter
     * @param body required parameter
     * @return Map 
     */ 
    @SafeVarargs
    public static Response createPersonExtProps(
                                    String personID,
                                    Map body,
                                    Options.OptionsBuilder<PersonApi.CreatePersonExtPropsOper>... options) {
        return Options.execute(api()
                .createPersonExtProps()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * deletePersonExtProps.
     * 
     * Path   : "/people/{personID}/extprops"
     * Method : delete
     * OpId   : deletePersonExtProps
     * Delete the existing extended properties for the specified person.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deletePersonExtProps(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.DeletePersonExtPropsOper>... options) {
        return Options.execute(api()
                .deletePersonExtProps()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPersonExtProps.
     * 
     * Path   : "/people/{personID}/extprops"
     * Method : get
     * OpId   : getPersonExtProps
     * Return the specified extended properties of a place.
     * @param personID required parameter
     * @return Map 
     */ 
    @SafeVarargs
    public static Response getPersonExtProps(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPersonExtPropsOper>... options) {
        return Options.execute(api()
                .getPersonExtProps()
                .personIDPath(personID), options);

    }
    
    
    /**
     * createPersonExtPropsForAddon.
     * 
     * Path   : "/people/{personID}/extprops/addOn/{addonUUID}"
     * Method : post
     * OpId   : createPersonExtPropsForAddon
     * Save a new set of extended properties for a person with specified characteristics, and return an entity representing the newly created extended properties.
     * @param personID required parameter
     * @param addonUUID required parameter
     * @param body required parameter
     * @return Map 
     */ 
    @SafeVarargs
    public static Response createPersonExtPropsForAddon(
                                    String personID,
                                    String addonUUID,
                                    Map body,
                                    Options.OptionsBuilder<PersonApi.CreatePersonExtPropsForAddonOper>... options) {
        return Options.execute(api()
                .createPersonExtPropsForAddon()
                .personIDPath(personID)
                .addonUUIDPath(addonUUID)
                .body(body), options);

    }
    
    
    /**
     * deletePersonExtPropsForAddon.
     * 
     * Path   : "/people/{personID}/extprops/addOn/{addonUUID}"
     * Method : delete
     * OpId   : deletePersonExtPropsForAddon
     * Delete the existing extended properties for the specified person.
     * @param personID required parameter
     * @param addonUUID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deletePersonExtPropsForAddon(
                                    String personID,
                                    String addonUUID,
                                    Options.OptionsBuilder<PersonApi.DeletePersonExtPropsForAddonOper>... options) {
        return Options.execute(api()
                .deletePersonExtPropsForAddon()
                .personIDPath(personID)
                .addonUUIDPath(addonUUID), options);

    }
    
    
    /**
     * getPersonExtPropsForAddOn.
     * 
     * Path   : "/people/{personID}/extprops/addOn/{addonUUID}"
     * Method : get
     * OpId   : getPersonExtPropsForAddOn
     * Return the specified extended properties of a place.
     * @param personID required parameter
     * @param addonUUID required parameter
     * @return Map 
     */ 
    @SafeVarargs
    public static Response getPersonExtPropsForAddOn(
                                    String personID,
                                    String addonUUID,
                                    Options.OptionsBuilder<PersonApi.GetPersonExtPropsForAddOnOper>... options) {
        return Options.execute(api()
                .getPersonExtPropsForAddOn()
                .personIDPath(personID)
                .addonUUIDPath(addonUUID), options);

    }
    
    
    /**
     * getFollowingIn.
     * 
     * Path   : "/people/{personID}/followingIn"
     * Method : get
     * OpId   : getFollowingIn
     * Return a list of Streams in which the requesting user is following this person (if any).
     * @param personID required parameter
     * @return List<Stream> 
     */ 
    @SafeVarargs
    public static Response getFollowingIn(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetFollowingInOper>... options) {
        return Options.execute(api()
                .getFollowingIn()
                .personIDPath(personID), options);

    }
    
    
    /**
     * setFollowingIn.
     * 
     * Path   : "/people/{personID}/followingIn"
     * Method : post
     * OpId   : setFollowingIn
     * Replace the list of Streams in which the requesting user is following this person.
     * @param personID required parameter
     * @param body required parameter
     * @return List<Stream> 
     */ 
    @SafeVarargs
    public static Response setFollowingIn(
                                    String personID,
                                    List<Stream> body,
                                    Options.OptionsBuilder<PersonApi.SetFollowingInOper>... options) {
        return Options.execute(api()
                .setFollowingIn()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * getPersonProfileImages.
     * 
     * Path   : "/people/{personID}/images"
     * Method : get
     * OpId   : getPersonProfileImages
     * Return a list of ProfileImages for the profile images of the specified person.
     * @param personID required parameter
     * @return List<ProfileImage> 
     */ 
    @SafeVarargs
    public static Response getPersonProfileImages(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPersonProfileImagesOper>... options) {
        return Options.execute(api()
                .getPersonProfileImages()
                .personIDPath(personID), options);

    }
    
    
    /**
     * setPersonProfileImage.
     * 
     * Path   : "/people/{personID}/images"
     * Method : post
     * OpId   : setPersonProfileImage
     * Create the specified profile image for the specified user at the next available index.  Return a 201 (Created) status with a Location header containing the URI of the new profile image.
     * @param personID required parameter
     * @return ProfileImage 
     */ 
    @SafeVarargs
    public static Response setPersonProfileImage(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.SetPersonProfileImageOper>... options) {
        return Options.execute(api()
                .setPersonProfileImage()
                .personIDPath(personID), options);

    }
    
    
    /**
     * deleteProfileImage.
     * 
     * Path   : "/people/{personID}/images/{index}"
     * Method : delete
     * OpId   : deleteProfileImage
     * Delete the specified profile image for the specified user.
     * @param personID required parameter
     * @param index required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteProfileImage(
                                    String personID,
                                    Object index,
                                    Options.OptionsBuilder<PersonApi.DeleteProfileImageOper>... options) {
        return Options.execute(api()
                .deleteProfileImage()
                .personIDPath(personID)
                .indexPath(index), options);

    }
    
    
    /**
     * getProfileImage.
     * 
     * Path   : "/people/{personID}/images/{index}"
     * Method : get
     * OpId   : getProfileImage
     * Return a ProfileImage describing the specified profile image information for the specified user.
     * @param personID required parameter
     * @param index required parameter
     * @return ProfileImage 
     */ 
    @SafeVarargs
    public static Response getProfileImage(
                                    String personID,
                                    Object index,
                                    Options.OptionsBuilder<PersonApi.GetProfileImageOper>... options) {
        return Options.execute(api()
                .getProfileImage()
                .personIDPath(personID)
                .indexPath(index), options);

    }
    
    
    /**
     * setProfileImage.
     * 
     * Path   : "/people/{personID}/images/{index}"
     * Method : post
     * OpId   : setProfileImage
     * Create or replace the specified profile image for the specified user.  Return a 201 (Created) status with a Location header containing the URI of the new profile image.
     * @param personID required parameter
     * @param index required parameter
     * @param body required parameter
     * @return ProfileImage 
     */ 
    @SafeVarargs
    public static Response setProfileImage(
                                    String personID,
                                    Object index,
                                    String body,
                                    Options.OptionsBuilder<PersonApi.SetProfileImageOper>... options) {
        return Options.execute(api()
                .setProfileImage()
                .personIDPath(personID)
                .indexPath(index)
                .body(body), options);

    }
    
    
    /**
     * getProfileImageData.
     * 
     * Path   : "/people/{personID}/images/{index}/data"
     * Method : get
     * OpId   : getProfileImageData
     * Return the binary profile image data for the specified profile image for the specified user.
     * @param personID required parameter
     * @param index required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getProfileImageData(
                                    String personID,
                                    Object index,
                                    Options.OptionsBuilder<PersonApi.GetProfileImageDataOper>... options) {
        return Options.execute(api()
                .getProfileImageData()
                .personIDPath(personID)
                .indexPath(index), options);

    }
    
    
    /**
     * createPersonPage.
     * 
     * Path   : "/people/{personID}/pages"
     * Method : post
     * OpId   : createPersonPage
     * Create a new Page for a user based on the contents of the specified Page.  Only modifiable fields that actually provide a value in the incoming entity are processed. 
     * @param personID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createPersonPage(
                                    String personID,
                                    Page body,
                                    Options.OptionsBuilder<PersonApi.CreatePersonPageOper>... options) {
        return Options.execute(api()
                .createPersonPage()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * getPersonPages.
     * 
     * Path   : "/people/{personID}/pages"
     * Method : get
     * OpId   : getPersonPages
     * Return a list of pages(currently only one) Page that a user has created with parent as user. currently you can only create one page with user as parent
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getPersonPages(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPersonPagesOper>... options) {
        return Options.execute(api()
                .getPersonPages()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPagesPrototype.
     * 
     * Path   : "/people/{personID}/pages/prototype"
     * Method : get
     * OpId   : getPagesPrototype
     * Return a new page, that is not persistent, based on the default Your View page.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getPagesPrototype(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPagesPrototypeOper>... options) {
        return Options.execute(api()
                .getPagesPrototype()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getPrivateProps.
     * 
     * Path   : "/people/{personID}/privateprops"
     * Method : get
     * OpId   : getPrivateProps
     * Return the specified private properties of a place.
     * @param personID required parameter
     * @return Map 
     */ 
    @SafeVarargs
    public static Response getPrivateProps(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetPrivatePropsOper>... options) {
        return Options.execute(api()
                .getPrivateProps()
                .personIDPath(personID), options);

    }
    
    
    /**
     * savePrivateProps.
     * 
     * Path   : "/people/{personID}/privateprops"
     * Method : post
     * OpId   : savePrivateProps
     * Save a new set of private properties for a person with specified characteristics, and return an entity representing the newly created private properties.
     * @param personID required parameter
     * @param body required parameter
     * @return PrivateProps 
     */ 
    @SafeVarargs
    public static Response savePrivateProps(
                                    String personID,
                                    PrivateProps body,
                                    Options.OptionsBuilder<PersonApi.SavePrivatePropsOper>... options) {
        return Options.execute(api()
                .savePrivateProps()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * getProfileFieldsPrivacy.
     * 
     * Path   : "/people/{personID}/profilePrivacy"
     * Method : get
     * OpId   : getProfileFieldsPrivacy
     * Return a paginated list of ProfileFieldPrivacys that describes the visibility of each profile field.
     * @param personID required parameter
     * @return List<ProfileFieldPrivacy> 
     */ 
    @SafeVarargs
    public static Response getProfileFieldsPrivacy(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetProfileFieldsPrivacyOper>... options) {
        return Options.execute(api()
                .getProfileFieldsPrivacy()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getProfileFieldPrivacy.
     * 
     * Path   : "/people/{personID}/profilePrivacy/{fieldID}"
     * Method : get
     * OpId   : getProfileFieldPrivacy
     * Return the specified ProfileFieldPrivacy that describes the visibility of the profile field.
     * @param personID required parameter
     * @param fieldID required parameter
     * @return ProfileFieldPrivacy 
     */ 
    @SafeVarargs
    public static Response getProfileFieldPrivacy(
                                    String personID,
                                    String fieldID,
                                    Options.OptionsBuilder<PersonApi.GetProfileFieldPrivacyOper>... options) {
        return Options.execute(api()
                .getProfileFieldPrivacy()
                .personIDPath(personID)
                .fieldIDPath(fieldID), options);

    }
    
    
    /**
     * updateProfileFieldPrivacy.
     * 
     * Path   : "/people/{personID}/profilePrivacy/{fieldID}"
     * Method : put
     * OpId   : updateProfileFieldPrivacy
     * Update the specified ProfileFieldPrivacy that describes the visibility of the profile field.
     * @param personID required parameter
     * @param fieldID required parameter
     * @param body required parameter
     * @return ProfileFieldPrivacy 
     */ 
    @SafeVarargs
    public static Response updateProfileFieldPrivacy(
                                    String personID,
                                    String fieldID,
                                    ProfileFieldPrivacy body,
                                    Options.OptionsBuilder<PersonApi.UpdateProfileFieldPrivacyOper>... options) {
        return Options.execute(api()
                .updateProfileFieldPrivacy()
                .personIDPath(personID)
                .fieldIDPath(fieldID)
                .body(body), options);

    }
    
    
    /**
     * getRoles.
     * 
     * Path   : "/people/{personID}/roles"
     * Method : get
     * OpId   : getRoles
     * Returns the system entitlements and whether the specified user is entitled.
     * @param personID required parameter
     * @return PersonRoles 
     */ 
    @SafeVarargs
    public static Response getRoles(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetRolesOper>... options) {
        return Options.execute(api()
                .getRoles()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getSecurityGroups.
     * 
     * Path   : "/people/{personID}/securityGroups"
     * Method : get
     * OpId   : getSecurityGroups
     * Return a list of SecurityGroups that the specified user is a member of.  Note that this list will NOT include any security groups that this person is an administrator of.  Because the number of security groups will generally be very small, pagination is not supported.
     * @param personID required parameter
     * @return List<SecurityGroup> 
     */ 
    @SafeVarargs
    public static Response getSecurityGroups(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetSecurityGroupsOper>... options) {
        return Options.execute(api()
                .getSecurityGroups()
                .personIDPath(personID), options);

    }
    
    
    /**
     * createStream.
     * 
     * Path   : "/people/{personID}/streams"
     * Method : post
     * OpId   : createStream
     * Create a new custom stream for the specified user, based on the information in the specified Stream.  Then, return a 201 with a Stream reflecting the new stream configuration. You can discover the maximum allowed length for stream names by using the metadata property 'feature.stream.name.length'.
     * @param personID required parameter
     * @param body required parameter
     * @return Stream 
     */ 
    @SafeVarargs
    public static Response createStream(
                                    String personID,
                                    Stream body,
                                    Options.OptionsBuilder<PersonApi.CreateStreamOper>... options) {
        return Options.execute(api()
                .createStream()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * getStreams.
     * 
     * Path   : "/people/{personID}/streams"
     * Method : get
     * OpId   : getStreams
     * Return a list of Streams for the specified user.  Because the number of streams will generally be very small, pagination is not supported.
     * @param personID required parameter
     * @return List<Stream> 
     */ 
    @SafeVarargs
    public static Response getStreams(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetStreamsOper>... options) {
        return Options.execute(api()
                .getStreams()
                .personIDPath(personID), options);

    }
    
    
    /**
     * createTask.
     * 
     * Path   : "/people/{personID}/tasks"
     * Method : post
     * OpId   : createTask
     * Create a personal Task. 
     * @param personID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response createTask(
                                    String personID,
                                    Task body,
                                    Options.OptionsBuilder<PersonApi.CreateTaskOper>... options) {
        return Options.execute(api()
                .createTask()
                .personIDPath(personID)
                .body(body), options);

    }
    
    
    /**
     * getTasks.
     * 
     * Path   : "/people/{personID}/tasks"
     * Method : get
     * OpId   : getTasks
     * Return a paginated list of personal tasks for the specified person.
     * @param personID required parameter
     * @return List<Task> 
     */ 
    @SafeVarargs
    public static Response getTasks(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetTasksOper>... options) {
        return Options.execute(api()
                .getTasks()
                .personIDPath(personID), options);

    }
    
    
    /**
     * getTermsAndConditions.
     * 
     * Path   : "/people/{personID}/termsAndConditions"
     * Method : get
     * OpId   : getTermsAndConditions
     * Return the details of terms and conditions or nothing if terms and conditions is not enabled. Note terms and conditions can be specified inline as text or via an extra url that the customer specifies.
     * @param personID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response getTermsAndConditions(
                                    String personID,
                                    Options.OptionsBuilder<PersonApi.GetTermsAndConditionsOper>... options) {
        return Options.execute(api()
                .getTermsAndConditions()
                .personIDPath(personID), options);

    }
    
    
}
