package com.jive.restapi.automation.utils.e2e.commonsteps;

import static com.xo.restapi.automation.configs.BaseUrlUtil.getBaseUrl;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;

import com.aurea.automation.openapi.common.FeatureRegistry;
import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.automation.configs.AppConfig;
import com.jive.restapi.automation.configs.Role;
import com.jive.restapi.automation.configs.User;
import com.jive.restapi.automation.data.UrlConsts;
import com.jive.restapi.automation.utilities.AnnouncementUtils;
import com.jive.restapi.automation.utilities.BlogPostUtils;
import com.jive.restapi.automation.utilities.ContentConstants;
import com.jive.restapi.automation.utilities.ContentUtils;
import com.jive.restapi.automation.utilities.DiscussionUtils;
import com.jive.restapi.automation.utilities.DocumentUtils;
import com.jive.restapi.automation.utilities.FileUtils;
import com.jive.restapi.automation.utilities.FilterBuilder;
import com.jive.restapi.automation.utilities.GroupUtils;
import com.jive.restapi.automation.utilities.IdeaUtils;
import com.jive.restapi.automation.utilities.PeopleUtils;
import com.jive.restapi.automation.utilities.PlaceConstants;
import com.jive.restapi.automation.utilities.PlacesUtils;
import com.jive.restapi.automation.utilities.PollUtils;
import com.jive.restapi.automation.utilities.ProjectUtils;
import com.jive.restapi.automation.utilities.StandardOutcomeTypes;
import com.jive.restapi.automation.utilities.v3.CommentsUtil;
import com.jive.restapi.automation.utilities.v3.ContentUtil;
import com.jive.restapi.automation.utilities.v3.MessageUtil;
import com.jive.restapi.automation.utilities.v3.OutcomesUtil;
import com.jive.restapi.automation.utilities.v3.PersonUtil;
import com.jive.restapi.automation.utilities.v3.PlacesUtil;
import com.jive.restapi.generated.person.models.Announcement;
import com.jive.restapi.generated.person.models.Comment;
import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.ContentBody;
import com.jive.restapi.generated.person.models.Discussion;
import com.jive.restapi.generated.person.models.Document;
import com.jive.restapi.generated.person.models.FileModel;
import com.jive.restapi.generated.person.models.Group;
import com.jive.restapi.generated.person.models.Message;
import com.jive.restapi.generated.person.models.Outcome;
import com.jive.restapi.generated.person.models.OutcomeEntities;
import com.jive.restapi.generated.person.models.Person;
import com.jive.restapi.generated.person.models.PersonEntities;
import com.jive.restapi.generated.person.models.Place;
import com.jive.restapi.generated.person.models.PlaceEntities;
import com.jive.restapi.generated.person.models.Summary;
import com.jive.restapi.generated.person.models.Update;
import com.xo.restapi.automation.actions.UserActionUtils;
import com.xo.restapi.automation.context.UserContext;
import com.xo.restapi.automation.context.UserData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import java.io.File;
import lombok.Getter;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.HttpStatus;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;

public class TrialStepDefs {

    private Response searchResponse;
    private PersonEntities personEntities;

    @Getter
    private UserData userData = new UserData();
    private Response discussionResponse;
    private Response fileUploadResponse;
    private FileModel uploadedFile;
    private Response createOutcomeResponse;
    private Response findOutcomeResponse;

    @Given("^(.*) logged into the system$")
    public void loginToSystem(String userRole) {
        User userCredentials = AppConfig.getInstance().getRole(Role.valueOf(userRole));
        userData.addUser(userCredentials.getUsername(), userCredentials.getPassword());
        UserContext.setUserData(userData);
        UserActionUtils.perform(userCredentials.getUsername(), UserContext::getUser);
    }

    @When("i test blogpost utils")
    public void blogPostTests() {
        // default blogpost creation
        Content blogPost = BlogPostUtils.createDefaultPost();
        System.out.println("BlogPost created summary is: " + blogPost.getSubject());

        //prepare content object
        Content blogPostData = new Content();
        blogPostData.subject("Testing Blog Post- " + RandomStringUtils.randomAlphanumeric(8))
                .type(Content.TypeEnum.POST)
                .content(new ContentBody().text("Blog Post description-" + RandomStringUtils.randomAlphanumeric(10)));

        Response blogPostResponse = BlogPostUtils.createPostToReturnResponse(blogPostData);
        System.out.println("Blog Post Created Status code for User Data provided: " + blogPostResponse.statusCode());

        Content blogPostTwo = blogPostResponse.as(Content.class);

        blogPostTwo.addTagsItem("NewTag");

        System.out.println("Blog Post created content ID is: " + blogPostTwo.getContentID());
        Response updatedBlogPostResponse = BlogPostUtils.updatePostToReturnResponse(blogPostTwo);
        System.out.println("Blog Post updated and returned status code is: " + updatedBlogPostResponse.statusCode());

        // get blog post by ID
        Content blogPostReceived = BlogPostUtils.getBlogPostById(blogPostTwo.getContentID());
        System.out.println("Blog post received subject is: " + blogPostReceived.getSubject());

        // get blog post by name
        Response searchByNameResponse = BlogPostUtils.searchBlogPostByName("search", "spotlight", blogPostReceived);
        System.out.println("Status code for name Search of BlogPost is: " + searchByNameResponse.getStatusCode());

        // delete a created blogPost
        Response deletedBlogPostResponse = BlogPostUtils.deleteBlogPost(blogPostTwo.getContentID());
        System.out.println("Response status code for deleted Blog Post is: " + deletedBlogPostResponse.statusCode());

    }

    @When("i test idea utils")
    public void ideaTests() {

        // create default IDEA response
        Response ideaResponse = IdeaUtils.createDefaultIdea();
        System.out.println("Default Idea Response status is: " + ideaResponse.getStatusCode());

        // create IDEA data
        Content customIdea = new Content();
        customIdea.subject("custom subject-" + RandomStringUtils.randomAlphanumeric(8))
                .type(Content.TypeEnum.IDEA)
                .content(new ContentBody().text("some description" + RandomStringUtils.randomAlphanumeric(10))
                        .type("text/html"));

        // Create Idea using custom data
        Response customIdeaResponseReceived = IdeaUtils.createIdea(customIdea);
        System.out.println("Custom Idea status code is: " + customIdeaResponseReceived.getStatusCode());

        // Get Idea by IdeaId
        Content ideaCreated = customIdeaResponseReceived.as(Content.class);
        Content ideaReceived = IdeaUtils.getIdeaById(ideaCreated.getContentID());
        System.out.println("Subject of Idea received using contentID is: " + ideaReceived.getSubject());

        // Update Idea

        ideaCreated.subject("Changed Subject-" + RandomStringUtils.randomAlphanumeric(8));
        Content ideaAfterUpdate = IdeaUtils.updateIdeaByIdeaData(ideaCreated);
        System.out.println("Updated Idea Subject is: " + ideaAfterUpdate.getSubject());

        // Delete Idea
        Response deleteIdeaResponse = IdeaUtils.deleteIdea(ideaAfterUpdate.getSubject());
        System.out.println("deleted idea response status code is: " + deleteIdeaResponse.getStatusCode());
    }

    @When("i test announcement utils")
    public void announcementTests() {

        // create a place
        Response responseGroup = GroupUtils.createOpenGroup();
        Group group = responseGroup.as(Group.class);
        String placeId = group.getPlaceID();

        // create an announcement wih place Id and default data
        Response responseAnnouncement = AnnouncementUtils.createAnnouncementUnderPlace(placeId);
        System.out.println("Status Code received from response " + responseAnnouncement.getStatusCode());

        // Create Announcement with given data
        Announcement announcement = new Announcement();
        announcement
                .subject("customannouncement-" + RandomStringUtils.randomAlphanumeric(8))
                .type("announcement")
                .content(new ContentBody().text("customAnnouncement-" + RandomStringUtils.randomAlphanumeric(8)).type("text"));
        Response customAnnouncementResponse = AnnouncementUtils.createAnnouncementUnderPlaceWithData(placeId, announcement);
        System.out.println("Custom created announcement status code is: " + customAnnouncementResponse.getStatusCode());
    }

    @When("I search for an user with display name (.+)")
    public void searchForPerson(String query) {
        personEntities = PeopleUtils.searchPeople(new FilterBuilder()
                .addCondition("include-disabled", "true")
                .addCondition("include-online", "false"), query, null, (resp) -> searchResponse = resp);
    }


    @Then("I found some users with (.+)")
    public void foundPerson(String query) {
        searchResponse.then().log().all().statusCode(SC_OK);
        MatcherAssert.assertThat(personEntities.getList(), IsNull.notNullValue());
        MatcherAssert.assertThat(personEntities.getList().stream().anyMatch(p -> p.getDisplayName() != null && p.getDisplayName().contains(query)), Is.is(true));
    }

    @Given("I create a user with name (.+)")
    public void createUser(String displayname) {
        PeopleUtils.createPerson(PeopleUtils.newPerson()
                .displayName(displayname))
                .then().statusCode(HttpStatus.SC_CREATED);
    }

    @When("I create a discussion with Group Mention")
    public void iCreateADiscussion() {
        Response group = GroupUtils.createOpenGroup();
        String macro = "\" __jive_macro_name=\"groups\" href=/groups/";
        String groupMention = PlacesUtils.createPlaceMacro(macro, group.as(Place.class));
        Content discussionData = ContentConstants.getDefaultContentDataWithTagMention(Content.TypeEnum.DISCUSSION, groupMention);
        discussionResponse = ContentUtils.createContent(discussionData);
    }

    @Then("^I create a document with Content Mention$")
    public void iCreateADocumentWithContentMention() throws Throwable {
        Content content = DocumentUtils.createDefaultDocument();
        String docMention = ContentUtils.createDocMention(content);
        Content discussionData = ContentConstants.getDefaultContentDataWithTagMention(Content.TypeEnum.DISCUSSION, docMention);
        discussionResponse = ContentUtils.createContent(discussionData);
        System.out.println(discussionResponse.asString());
    }

    @Then("a discussion is created")
    public void aDiscussionIsCreated() {
        discussionResponse.then().log().all().statusCode(HttpStatus.SC_CREATED);
        MatcherAssert.assertThat(discussionResponse.as(Discussion.class).getContentID(), IsNull.notNullValue());
    }

    @When("I upload file (.+)")
    public void createFile(String name) {
        File f = new File(new File("src/test/resources"), name);
        MatcherAssert.assertThat(f.exists(), Is.is(true));
        FileUtils.createFile(f, (r) -> fileUploadResponse = r);
    }

    @Then("The file gets created")
    public void theFileGetsCreated() {
        fileUploadResponse.then().log().all().statusCode(HttpStatus.SC_CREATED);
        uploadedFile = fileUploadResponse.as(FileModel.class);
        System.out.println("BINARY : " + uploadedFile.getBinaryURL());
        System.out.println("content : " + uploadedFile.getContentID());

    }

    @Given("^I create poll under place$")
    public void iCreatePollUnderSpace() throws Throwable {
        Place space = PlaceConstants.getDefaultSpaceData();
        Response res = PlacesUtils.createPlace(space);
        Content contentDataAsPoll = ContentConstants.getDefaultPollDataUnderPlace(res.as(Place.class));
        Response createDocumentResponse = PollUtils.createPoll(contentDataAsPoll);
    }

    @Given("^I create content under place$")
    public void iCreatePollUnderPlace() throws Throwable {
        Response openGroup = GroupUtils.createOpenGroup();
        Place openGroupPlace = openGroup.as(Place.class);
        Response createPlaceResponse = ProjectUtils.createProject(openGroupPlace);
        Content discussionData = ContentConstants.getDefaultContentDataUnderPlace(createPlaceResponse.as(Place.class),
                Content.TypeEnum.DISCUSSION);
        Response createDocumentResponse = DiscussionUtils.createDiscussionToReturnResponse(discussionData);
    }

    @When("I create an outcome ([a-zA-Z]+)")
    public void createOutcome(String name) {
        Content doc = DocumentUtils.createDefaultDocument();
        createOutcomeResponse = ContentUtil.createOutcome(doc.getContentID(), new Outcome()
                .note(name)
                .outcomeType(StandardOutcomeTypes.OFFICIAL.getOutcomeType()), Options.logResponse());
    }

    @Then("the outcome ([a-zA-Z]+) is created")
    public void checkOutcomeOk(String name) {
        createOutcomeResponse.then().statusCode(HttpStatus.SC_CREATED);
        MatcherAssert.assertThat(createOutcomeResponse.as(Outcome.class).getNote(), IsEqual.equalTo(name));
    }

    @Given("There is some outcome")
    public void thereIsSomeOutcome() {
        findOutcomeResponse = OutcomesUtil.getOutcomes(Options.logResponse());
        findOutcomeResponse.then().statusCode(SC_OK);
        findOutcomeResponse.as(OutcomeEntities.class).getList();
    }

    @When("I want to make a status update with an image")
    public void updateStatusWithImage() {
        ContentUtil.comments("12345", Options.custom(op -> op.authorQuery("somebody")));
        ContentUtil.createContent(
                new Update(), null,
                Options.attachResource("file", "whatever.png", "image.png", "image/png"));
    }

    @When("I want to test create and update comment API")
    public void testCreateUpdateComment() {
        Response createDocResponse = ContentUtil.createContent(ContentConstants.getDefaultDocumentData(), null);
        createDocResponse.then().assertThat().statusCode(HttpStatus.SC_CREATED);
        Document newDoc = createDocResponse.as(Document.class);

        Response createCommentResponse = ContentUtil.createComment(newDoc.getId(), ContentConstants.getDefaultCommentData());
        createCommentResponse.then().assertThat().statusCode(HttpStatus.SC_CREATED);
        Comment newComment = createCommentResponse.as(Comment.class);

        Response updateCommentResp = CommentsUtil.updateComment(newComment.getId(), ContentConstants.getDefaultCommentData()
                .id(newComment.getId()));

        updateCommentResp.then().assertThat().statusCode(SC_OK);
    }

    @When("I search for all places")
    public void iSearchForAllPlaces() {
        int start = 0;
        PlaceEntities places;
        do {
            int finalStart = start;
            places = PlacesUtil.getPlaces(Options.custom(op -> op
                    .startIndexQuery(finalStart))).as(PlaceEntities.class);
            start += 25;
            places.getList().forEach(p -> System.out.println("ID: " + p.getId() + " placeID: " + p.getPlaceID() + " Name: " + p.getName() + " type " + p.getType()));
        } while (places.getList().size() == 25);
    }

    @Then("I find the community place")
    public void iFindTheCommunityPlace() {

    }

    @When("I Look for discussion with id {int}")
    public void iLookForDiscusionWithId(int arg0) {
        Discussion disc = ContentUtil.getContent(String.valueOf(arg0), Options.logResponse()).as(Discussion.class);
        System.out.println("PArent : " + disc.getParent());
        System.out.println("PLACE " + disc.getParentPlace() + " uri " + disc.getParent());
    }

    @When("I Look for message with id {int}")
    public void iLookForMessageWithId(int arg0) {
        Discussion disc = MessageUtil.getMessage(String.valueOf(arg0), Options.logResponse()).as(Discussion.class);
        System.out.println("PArent : " + disc.getParent());
        System.out.println("PLACE " + disc.getParentPlace().getId() + " uri " + disc.getParent());
    }

    public static String getPersonUri(Person person) {
        return getBaseUrl() + "/" + UrlConsts.CORE_API + "/people/" + person.getId();
    }

    @Then("I create a discussion (.*) under (.*)")
    public void iCreateADiscussionDISCUnderPIPPO(String discId, String placeId) {
        Person p = FeatureRegistry.getCurrentFeature().getData(Person.class, placeId);
        p = PersonUtil.getPerson(p.getId()).as(Person.class);
        ContentConstants.getDefaultDiscussionData();
        String uri = getPersonUri(p);
        Response resp = ContentUtil.createContent(
                new Discussion()
                        .subject("A sample discussion")
                        .type(Content.TypeEnum.DISCUSSION)
                        .content(new ContentBody()
                                .text("<div>Sample discussion</div>"))
                        .visibility(Content.VisibilityEnum.ALL),
                null,
                Options.logRequest(),
                Options.logResponse(), Options.storeAs(discId));
        resp.then().statusCode(SC_CREATED);

        // Look for messages
        MessageUtil.getContentReplies(resp.as(Discussion.class).getContentID(),Options.logResponse());
    }

    @When("I read document (.*)")
    public void readADoc(String docid) {
        ContentUtil.getContent(docid,Options.logResponse(), Options.storeAs("theDoc"));
    }
}
