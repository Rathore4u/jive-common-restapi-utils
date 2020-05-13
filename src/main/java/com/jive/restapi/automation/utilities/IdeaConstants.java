package com.jive.restapi.automation.utilities;

import static com.xo.restapi.automation.configs.CommonUtils.getBaseUrl;

import com.jive.restapi.automation.data.ContentConsts;
import com.jive.restapi.generated.person.models.Content.TypeEnum;
import com.jive.restapi.generated.person.models.ContentBody;
import com.jive.restapi.generated.person.models.Idea;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang.RandomStringUtils;

@UtilityClass
public class IdeaConstants {

    private final String DEFAULT_TAG_ONE = "testTagOne";
    private final String DEFAULT_DESCRIPTION = "regularDescription-" + RandomStringUtils.randomAlphanumeric(16);

    public static Idea getDefaultIdeaDataWithImageInRTE(String imageURL1, String imageURL2) {
        String defaultSubject = String.format("regular-%s-%s",
                TypeEnum.IDEA,
                RandomStringUtils.randomAlphanumeric(8));
        String defaultDescription = String.format(ContentConsts.IMAGE_IN_RTE_SNIPPET,
                DEFAULT_DESCRIPTION,
                imageURL1,
                imageURL2);

        return (Idea) new Idea()
                .type(TypeEnum.IDEA)
                .subject(defaultSubject)
                .addTagsItem(DEFAULT_TAG_ONE)
                .content(new ContentBody().text(defaultDescription));
    }

    public static Idea getDefaultIdeaDataWithVideoFromFileInRTE(String videoID) {
        String defaultSubject = String.format("regular-%s-%s",
                TypeEnum.IDEA,
                RandomStringUtils.randomAlphanumeric(8));
        String defaultDescription = String.format(ContentConsts.VIDEO_IN_RTE_SNIPPET,
                DEFAULT_DESCRIPTION,
                videoID,
                videoID,
                getBaseUrl(),
                videoID,
                videoID);

        return (Idea) new Idea()
                .type(TypeEnum.IDEA)
                .subject(defaultSubject)
                .addTagsItem(DEFAULT_TAG_ONE)
                .content(new ContentBody().text(defaultDescription));
    }
}
