package com.jive.restapi.automation.utilities;

import static com.jive.restapi.automation.utilities.JiveApiUtils.getApiClient;

import com.jive.restapi.generated.person.models.Publication;
import io.restassured.response.Response;
import java.util.function.Function;

public final class PublicationUtils {

    private PublicationUtils() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }

    public static Response createPublication(Publication publication) {
        return getApiClient()
                .publications()
                .createPublication()
                .body(publication)
                .execute(Function.identity());
    }

    public static Response deletePublication(Publication publication) {
        return getApiClient()
                .publications()
                .deletePublication()
                .publicationIDPath(publication.getId())
                .execute(Function.identity());
    }

    public static Response updatePublication(Publication publication) {
        return getApiClient()
                .publications()
                .updatePublication()
                .publicationIDPath(publication.getId())
                .body(publication)
                .execute(Function.identity());
    }

    public static Response getPublication(Publication publication) {
        return getApiClient()
                .publications()
                .getPublication()
                .publicationIDPath(publication.getId())
                .execute(Function.identity());
    }

    public static Response getPublications() {
        return getApiClient()
                .publications()
                .getPublications()
                .execute(Function.identity());
    }
}
