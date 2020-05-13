package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.models.Content;
import io.restassured.response.Response;

import java.util.function.Function;

public class TaskUtils {

    public static Content createDefaultTask() {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(ContentConstants.getDefaultTaskData())
                .executeAs(Function.identity());
    }

    public static Content getTaskById(String id) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(id)
                .executeAs(Function.identity());
    }

    public static Content createTask(Content taskData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(taskData)
                .executeAs(Function.identity());
    }

    public static Response deleteTask(String taskID) {
        return JiveApiUtils.getApiClient()
                .content()
                .deleteContent()
                .contentIDPath(taskID)
                .execute(Function.identity());
    }

    public static Content searchTaskByName (String searchQuery) {
        return JiveApiUtils.getApiClient()
                .content()
                .getContent()
                .contentIDPath(searchQuery)
                .executeAs(Function.identity());
    }

    public static Content updateTaskByTaskData (Content taskData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .body(taskData)
                .executeAs(Function.identity());
    }

    public static Response createTaskToReturnResponse(Content taskData) {
        return JiveApiUtils.getApiClient()
                .content()
                .createContent()
                .contentPart(taskData)
                .execute(Function.identity());
    }

    public static Response updateTaskByTaskDataToReturnResponse (String id, Content taskData) {
        return JiveApiUtils.getApiClient()
                .content()
                .updateContent()
                .contentIDPath(id)
                .body(taskData)
                .execute(Function.identity());
    }
}
