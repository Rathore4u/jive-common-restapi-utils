package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content.TypeEnum;
import com.jive.restapi.generated.person.models.Content.VisibilityEnum;
import com.jive.restapi.generated.person.models.ContentBody;
import com.jive.restapi.generated.person.models.FileModel;
import com.jive.restapi.generated.person.models.Person;
import java.util.List;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang.RandomStringUtils;

@UtilityClass
public class FileConstants {

    private final String DEFAULT_TAG_ONE = "testTagOne";
    private final String DEFAULT_DESCRIPTION = "regularDescription-" + RandomStringUtils.randomAlphanumeric(16);

    public static FileModel getDefaultFileDataWithSpecificPeople(List<Person> users) {
        String defaultSubject = String.format("regular-%s-%s",
                TypeEnum.FILE,
                RandomStringUtils.randomAlphanumeric(8));

        return (FileModel) new FileModel()
                .type(TypeEnum.FILE)
                .addTagsItem(DEFAULT_TAG_ONE)
                .subject(defaultSubject)
                .visibility(VisibilityEnum.PEOPLE)
                .users(users)
                .content(new ContentBody().text(DEFAULT_DESCRIPTION));
    }

    public static FileModel getDefaultFileDataWithSpecificPeopleAndAuthors(List<Person> users) {
        String defaultSubject = String.format("regular-%s-%s",
                TypeEnum.FILE,
                RandomStringUtils.randomAlphanumeric(8));

        return (FileModel) new FileModel()
                .authors(users)
                .type(TypeEnum.FILE)
                .addTagsItem(DEFAULT_TAG_ONE)
                .subject(defaultSubject)
                .visibility(VisibilityEnum.PEOPLE)
                .users(users)
                .content(new ContentBody().text(DEFAULT_DESCRIPTION));
    }
}
