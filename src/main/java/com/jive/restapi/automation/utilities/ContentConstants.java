package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.AbuseReport;
import com.jive.restapi.generated.person.models.Checkpoint;
import com.jive.restapi.generated.person.models.Comment;
import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.ContentBody;
import com.jive.restapi.generated.person.models.DirectMessageRequest;
import com.jive.restapi.generated.person.models.Discussion;
import com.jive.restapi.generated.person.models.Document;
import com.jive.restapi.generated.person.models.Event;
import com.jive.restapi.generated.person.models.FileModel;
import com.jive.restapi.generated.person.models.Idea;
import com.jive.restapi.generated.person.models.Message;
import com.jive.restapi.generated.person.models.Person;
import com.jive.restapi.generated.person.models.Place;
import com.jive.restapi.generated.person.models.Poll;
import com.jive.restapi.generated.person.models.Post;
import com.jive.restapi.generated.person.models.Project;
import com.jive.restapi.generated.person.models.Task;
import com.jive.restapi.generated.person.models.Update;
import com.xo.restapi.automation.configs.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.RandomStringUtils;

public class ContentConstants {

    static String defaultTitle = "regular-" + RandomStringUtils.randomAlphanumeric(8);
    static String defaultTagOne = "testTagOne";
    static String defaultDescription = "regularDescription-" + RandomStringUtils.randomAlphanumeric(16);


    public static Document getDefaultDocumentData() {
        return (Document) new Document()
                .type(Content.TypeEnum.DOCUMENT)
                .addTagsItem(defaultTagOne)
                .visibility(Content.VisibilityEnum.ALL)
                .subject(defaultTitle)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Document getDefaultDocumentDataUnderPlace(Place place) {
        return (Document) new Document()
                .type(Content.TypeEnum.DOCUMENT)
                .addTagsItem(defaultTagOne)
                .subject(defaultTitle)
                .parent(CommonUtils.getParentPlaceUri(place))
                .content(new ContentBody().text(defaultDescription));
    }


    public static Discussion getDefaultDiscussionData() {
        return (Discussion) new Discussion()
                .type(Content.TypeEnum.DISCUSSION)
                .addTagsItem(defaultTagOne)
                .subject(defaultTitle)
                .visibility(Content.VisibilityEnum.ALL)
                .content(new ContentBody().text(defaultDescription));
    }


    public static FileModel getDefaultFileData() {
        return (FileModel) new FileModel()
                .type(Content.TypeEnum.FILE)
                .visibility(Content.VisibilityEnum.ALL)
                .subject(defaultTitle);
    }

    public static FileModel getDefaultFileDataWithMention(String tagMention) {
        return (FileModel) new FileModel()
                .type(Content.TypeEnum.FILE)
                .subject(defaultTitle)
                .content(new ContentBody().text(defaultDescription + " " + tagMention));
    }

    public static Task getDefaultTaskData() {
        return (Task) new Task()
                .type(Content.TypeEnum.TASK)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Poll getDefaultPollData() {
        List<String> options = new ArrayList<>();
        options.add("blue");
        options.add("red");
        return (Poll) new Poll()
                .options(options)
                .type(Content.TypeEnum.POLL)
                .subject(defaultTitle)
                .visibility(Content.VisibilityEnum.ALL)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Poll getDefaultPollDataWithMention(Place place, String tagMention) {
        List<String> options = new ArrayList<>();
        options.add("blue");
        options.add("red");
        return (Poll) new Poll()
                .options(options)
                .type(Content.TypeEnum.POLL)
                .subject(defaultTitle)
                .parent(CommonUtils.getParentPlaceUri(place))
                .content(new ContentBody().text(defaultDescription + " " + tagMention.toLowerCase()));
    }

    public static Content getDefaultContentDataUnderPlace(Place placeID, Content.TypeEnum contentType) {
        return (Content) new Content()
                .type(contentType)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .parent(CommonUtils.getParentPlaceUri(placeID))
                .content(new ContentBody().text(defaultDescription));
    }

    public static Post getDefaultPostData() {
        return (Post) new Post()
                .type(Content.TypeEnum.POST)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription));
    }


    public static Discussion getDefaultContentDataForQuestion() {
        return (Discussion) new Discussion().
                type(Content.TypeEnum.DISCUSSION)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .visibility(Content.VisibilityEnum.ALL)
                .question(true)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Content getDefaultContentDataWithTagMention(Content.TypeEnum contentType, String tagMention) {
        return (Content) (new Content())
                .type(contentType)
                .addTagsItem(defaultTagOne).subject(defaultTitle)
                .content(new ContentBody().text(defaultDescription + " " + tagMention));
    }

    public static Content getDefaultContentDataOfType(Content.TypeEnum contentType) {
        if (contentType.equals("QUESTION")) {
            return getDefaultContentDataForQuestion();
        }
        return new Content()
                .subject(defaultTitle)
                .type(contentType)
                .visibility(Content.VisibilityEnum.ALL)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Content getDefaultContentDataForQuestionUnderPlace(Place place) {
        return new Content()
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription))
                .question(true)
                .type(Content.TypeEnum.DISCUSSION)
                .parent(CommonUtils.getParentPlaceUri(place));
    }

    public static Post getDefaultPostDataUnderPlace(Place place) {
        return (Post) new Post()
                .type(Content.TypeEnum.POST)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription))
                .parent(CommonUtils.getParentPlaceUri(place));
    }

    public static Post getDefaultPostDataWithMention(String tagMention) {
        return (Post) (new Post()).type(Content.TypeEnum.POST)
                .subject(defaultTitle).addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription + " " + tagMention));
    }

    public static AbuseReport getDefaultAbuseReportData() {
        return new AbuseReport().type("abuseReport")
                .message("Message-" + RandomStringUtils.randomAlphanumeric(8).toLowerCase())
                .category("General Abuse");
    }

    public static Poll getDefaultPollDataUnderPlace(Place place) {
        List<String> options = new ArrayList<>();
        options.add("blue");
        options.add("red");
        return (Poll) new Poll()
                .options(options)
                .type(Content.TypeEnum.POLL)
                .subject(defaultTitle)
                .content(new ContentBody().text(defaultDescription))
                .parent(CommonUtils.getParentPlaceUri(place));
    }

    public static Discussion getDefaultDiscussionDataUndetPlace(Place discussionPlace) {
        return (Discussion) new Discussion()
                .type(Content.TypeEnum.DISCUSSION)
                .addTagsItem(defaultTagOne)
                .subject(defaultTitle)
                .content(new ContentBody().text(defaultDescription))
                .parent(CommonUtils.getParentPlaceUri(discussionPlace));
    }

    public static Idea getDefaultIdeaData() {
        return (Idea) new Idea()
                .type(Content.TypeEnum.IDEA)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Idea getDefaultIdeaDataUnderPlace(Place ideaPlace) {
        return (Idea) new Idea()
                .type(Content.TypeEnum.IDEA)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .parent(CommonUtils.getParentPlaceUri(ideaPlace))
                .content(new ContentBody().text(defaultDescription));
    }

    public static Message getDefaultMessageData(String discussionUri) {
        return new Message()
                .subject(defaultTitle)
                .parent(discussionUri)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Event getDefaultEventData() {
        return (Event) new Event()
                .type(Content.TypeEnum.EVENT)
                .subject(defaultTitle)
                .visibility(Content.VisibilityEnum.ALL)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Event getDefaultEventDataWithMention(String tagMention) {
        return (Event) new Event()
                .type(Content.TypeEnum.EVENT)
                .subject(defaultTitle)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription + " " + tagMention.toLowerCase()));
    }

    public static Document getDefaultDocumentDatawithExtendedAuthors(Place place, Person P) {
        List<Person> authors = new ArrayList<Person>();
        authors.add(P);
        return (Document) new Document()
                .authors(authors)
                .type(Content.TypeEnum.DOCUMENT)
                .addTagsItem(defaultTagOne)
                .subject(defaultTitle)
                .parent(CommonUtils.getParentPlaceUri(place))
                .content(new ContentBody().text(defaultDescription));
    }

    public static DirectMessageRequest getDefaultDirectMessageRequestData() {
        return new DirectMessageRequest()
                .type(Content.TypeEnum.DM.toString())
                .subject(defaultTitle)
                .content(new ContentBody().text(defaultDescription));
    }

    public static DirectMessageRequest getDefaultDirectMessageRequestDataWithMention(String tagMention) {
        return new DirectMessageRequest().type(Content.TypeEnum.DM.toString())
                .subject(defaultTitle).content(new ContentBody().text(defaultDescription + "" + tagMention));
    }

    public static Checkpoint newCheckpoint() {
        return new Checkpoint();
    }

    public static Project newProject() {
        return (Project) new Project()
                .type(Content.TypeEnum.PROJECT);
    }

    public static Comment getDefaultCommentData() {
        return new Comment()
                .type(Comment.TypeEnum.COMMENT)
                .subject(defaultTitle)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Update getStatusDataWithTitle(String title) {
        return (Update) new Update()
                .type(Content.TypeEnum.UPDATE)
                .subject(title)
                .addTagsItem(defaultTagOne)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Content getDefaultContentDataWithImageInRTE
            (Content.TypeEnum contentType, String imageURL1, String imageURL2) {
        String bodyText = "regularDescription-" + RandomStringUtils.randomAlphanumeric(16);
        String defaultSubject =
                String.format("regular-%s-%s", contentType, RandomStringUtils.randomAlphanumeric(8));
        String defaultDescription =
                String.format("<p>%s</p><p><a href=\"%s\"><img alt=\"\" class=\"image-1 jive-image\" src=\"%s\"/></a></p>",
                        bodyText, imageURL1, imageURL2);
        return new Content().type(contentType).subject(defaultSubject)
                .addTagsItem("testTagOne")
                .visibility(Content.VisibilityEnum.ALL)
                .content(new ContentBody().text(defaultDescription));
    }
}
