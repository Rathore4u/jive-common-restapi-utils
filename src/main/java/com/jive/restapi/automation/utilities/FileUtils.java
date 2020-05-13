package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import com.jive.restapi.generated.person.models.FileModel;
import io.restassured.response.Response;

import java.io.File;
import java.util.function.Function;

public class FileUtils {

    public static Content createDefaultFile() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultFileData())
                .executeAs(Function.identity());
    }

    public static Response createFile(File content, Function<Response, Response> handler) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultFileData())
                .fileMultiPart(content)
                .execute(handler);
    }

    public static Content getFileById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Content createFile(Content fileData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(fileData)
                .executeAs(Function.identity());
    }

    public static Response deleteFile(String fileID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(fileID)
                .execute(Function.identity());
    }

    public static Content searchFileByName(String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Content updateFileByFileData(Content fileData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(fileData)
                .executeAs(Function.identity());
    }


    public static Response createFileToReturnResponse(Content fileData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(fileData)
                .execute(Function.identity());
    }

    public static Response updateFileToReturnResponse(Content fileData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(fileData)
                .contentIDPath(fileData.getContentID())
                .execute(Function.identity());
    }

    public static Response getResponseOfFileById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .execute(Function.identity());
    }

    public static Response createFileWithBinary(FileModel model, File content) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(model)
                .fileMultiPart(content)
                .execute(Function.identity());
    }
}
