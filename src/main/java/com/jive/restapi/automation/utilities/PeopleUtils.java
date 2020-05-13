package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.api.PersonApi;
import com.jive.restapi.generated.person.models.Email;
import com.jive.restapi.generated.person.models.Jive;
import com.jive.restapi.generated.person.models.Name;
import com.jive.restapi.generated.person.models.Person;
import com.jive.restapi.generated.person.models.PersonEntities;
import com.jive.restapi.generated.person.models.Task;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class PeopleUtils {

    public static final String GIVEN_NAME_PATH = "name.givenName";

    public static Response createStandardUser() {
        return createPerson(newPerson());
    }

    public static Response createPerson(Person person) {
        return JiveApiUtils.getApiClient()
                .person()
                .createPerson()
                .body(person)
                .execute(Function.identity());
    }

    public static Response searchPeopleByName(String searchQuery) {
        return JiveApiUtils.getApiClient()
                .person()
                .getPersonByUsername()
                .usernamePath(searchQuery)
                .execute(Function.identity());
    }

    public static Response updatePerson(Person person) {
        return JiveApiUtils.getApiClient()
                .person()
                .updatePerson()
                .personIDPath(person.getId())
                .body(person)
                .execute(Function.identity());
    }

    public static Person newPerson() {
        int userId = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        String password = "test123";
        String givenName = "regularUser-" + userId;
        String familyName = "TestUser";
        String emailLabel = "Email";
        String emailAddress = "regularUser-" + userId + "@example.com";
        String emailType = "Work";

        return new Person()
                .addEmailsItem(new Email()
                        .jiveLabel(emailLabel)
                        .primary(true)
                        .value(emailAddress)
                        .type(emailType))
                .jive(new Jive()
                        .username(emailAddress)
                        .password(password))
                .name(new Name()
                        .givenName(givenName)
                        .familyName(familyName));
    }

    public static Response getMe() {
        return JiveApiUtils.getApiClient()
                .person()
                .getPerson()
                .personIDPath("@me")
                .execute(Function.identity());
    }

    /**
     * Search people by filter and query
     *
     * @param filterBuilder optional filter builder used to build the search filter (can be  null)
     * @param query         optional query (can be null)
     * @param handler       optional response handler (can be null, use it if you need to store the response somewhere)
     * @param origin
     * @return a paginated
     */
    public static PersonEntities searchPeople(FilterBuilder filterBuilder, String query, String origin, Function<Response, Response> handler) {
        PersonApi.GetPeopleOper op = JiveApiUtils.getApiClient().person()
                .getPeople()
                .reqSpec((req) -> req.log(LogDetail.ALL));

        if (filterBuilder != null) {
            op.filterQuery((Object[]) filterBuilder.buildList());
        }
        if (query != null) {
            op.queryQuery(query);
        }
        if (origin != null) {
            op.originQuery(origin);
        }
        return op.executeAs(handler != null ? handler : Function.identity());
    }


    public static String createUserMention(Person person) {
        return "<a __default_attr=\"" + person.getId() + "\" __jive_macro_name=\"user\" href=/people/" + person.getName() + " >" + person.getDisplayName() + "</a>";
    }

    public static Response createPersonalTask(Task task, Person person) {
        return JiveApiUtils.getApiClient()
                .person()
                .createTask()
                .personIDPath(person.getId())
                .body(task)
                .execute(Function.identity());
    }

    public static Person newPersonWithCompositeNames() {
        int userId = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        String password = "test123";
        String givenName = "CompositeUser-" + RandomStringUtils.randomAlphanumeric(6)
                + "-" + RandomStringUtils.randomAlphanumeric(6);
        String familyName = "CompositeUser-" + RandomStringUtils.randomAlphanumeric(6)
                + "-" + RandomStringUtils.randomAlphanumeric(6);
        String emailLabel = "Email";
        String displayName = "TestUser" + RandomStringUtils.randomAlphanumeric(9);
        String emailAddress = "regularUser-" + userId + "@example.com";
        String emailType = "Work";

        return new Person()
                .addEmailsItem(new Email()
                        .jiveLabel(emailLabel)
                        .primary(true)
                        .value(emailAddress)
                        .type(emailType))
                .jive(new Jive()
                        .username(emailAddress)
                        .password(password))
                .name(new Name()
                        .givenName(givenName)
                        .familyName(familyName))
                .displayName(displayName);
    }

    /**
     * Search people by filter and query
     *
     * @param filterBuilder optional filter builder used to build the search filter (can be  null)
     * @param query         optional query (can be null)
     * @param handler       optional response handler (can be null, use it if you need to store the response somewhere)
     * @return a paginated
     */
    public static PersonEntities searchPeople(FilterBuilder filterBuilder, String query, Function<Response, Response> handler) {
        return searchPeople(filterBuilder, query, null, handler);
    }
}
