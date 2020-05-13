package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class DocumentUtils {

    public static Content createDefaultDocument() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultDocumentData())
                .executeAs(Function.identity());
    }

    public static Content getDocumentById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Content createDocument(Content documentData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(documentData)
                .executeAs(Function.identity());
    }

    public static Response deleteDocument(String documentID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(documentID)
                .execute(Function.identity());
    }

    public static Content searchDocumentByName (String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Content updateDocumentByDocumentData (Content documentData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(documentData)
                .executeAs(Function.identity());
    }

    public static Response createDocumentToReturnResponse(Content documentData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(documentData)
                .execute(Function.identity());
    }

    public static Response updateDocumentToReturnResponse(Content documentData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(documentData)
                .contentIDPath(documentData.getContentID())
                .execute(Function.identity());
    }


    public static Response getResponseOfDocumentById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .execute(Function.identity());
    }

    public static Response hardDeleteDocument(String documentID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .hardDeleteQuery(true)
                .contentIDPath(documentID)
                .execute(Function.identity());
    }
}
