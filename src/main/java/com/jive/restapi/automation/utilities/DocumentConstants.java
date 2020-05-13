package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content.TypeEnum;
import com.jive.restapi.generated.person.models.Content.VisibilityEnum;
import com.jive.restapi.generated.person.models.ContentBody;
import com.jive.restapi.generated.person.models.Document;
import com.jive.restapi.generated.person.models.Person;
import java.util.List;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang.RandomStringUtils;

@UtilityClass
public class DocumentConstants {

    private final String DEFAULT_TAG_ONE = "testTagOne";
    private final String DEFAULT_DESCRIPTION = "regularDescription-" + RandomStringUtils.randomAlphanumeric(16);
    public final String UPDATED_SUBJECT_POSTFIX = "-updated";

    public static Document getDefaultDocumentDataWithSpecificPeople(List<Person> users) {
        String defaultSubject = String.format("regular-%s-%s",
                TypeEnum.DOCUMENT,
                RandomStringUtils.randomAlphanumeric(8));

        return (Document) new Document()
                .type(TypeEnum.DOCUMENT)
                .addTagsItem(DEFAULT_TAG_ONE)
                .subject(defaultSubject)
                .visibility(VisibilityEnum.PEOPLE)
                .users(users)
                .content(new ContentBody().text(DEFAULT_DESCRIPTION));
    }

    public static Document getDefaultDocumentDataWithSpecificPeopleAndAuthors(List<Person> users) {
        String defaultSubject = String.format("regular-%s-%s",
                TypeEnum.DOCUMENT,
                RandomStringUtils.randomAlphanumeric(8));

        return (Document) new Document()
                .authors(users)
                .type(TypeEnum.DOCUMENT)
                .addTagsItem(DEFAULT_TAG_ONE)
                .subject(defaultSubject)
                .visibility(VisibilityEnum.PEOPLE)
                .users(users)
                .content(new ContentBody().text(DEFAULT_DESCRIPTION));
    }

    public static Document getDefaultDocumentDataWithCommentsRestricted() {
        String defaultSubject = String.format("regular-%s-%s",
                TypeEnum.DOCUMENT,
                RandomStringUtils.randomAlphanumeric(8));
        return (Document) new Document().restrictComments(true)
                .type(TypeEnum.DOCUMENT)
                .subject(defaultSubject)
                .addTagsItem(DEFAULT_TAG_ONE)
                .content(new ContentBody().text(DEFAULT_DESCRIPTION));
    }
}
