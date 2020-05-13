package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Publication;
import org.apache.commons.lang.RandomStringUtils;

public final class PublicationConstants {

    private PublicationConstants() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }

    public static Publication getDefaultPublicationData() {
        String defaultName = "regularName-" + RandomStringUtils.randomAlphanumeric(16);
        return new Publication().name(defaultName);
    }
}
