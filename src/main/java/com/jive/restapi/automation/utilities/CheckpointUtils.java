package com.jive.restapi.automation.utilities;

import com.jive.restapi.generated.person.api.CheckpointApi;
import com.jive.restapi.generated.person.models.CheckpointEntities;
import com.jive.restapi.generated.person.models.SetCheckpoints;
import io.restassured.response.Response;

import java.util.function.Consumer;
import java.util.function.Function;

import static com.jive.restapi.automation.utilities.JiveApiUtils.getApiClient;

public class CheckpointUtils {
    private static CheckpointApi api() {
        return getApiClient().checkpoint();
    }

    /**
     * Makes the getCheckpoint call
     * @param custom optional way to customize the call before calling
     * @param handler handler the response and convert it to return type
     * @param projectId the project it
     * @param <T> the returned type
     * @return
     */
    public static <T> T getCheckpointsCall(Consumer<CheckpointApi.GetCheckPointsOper> custom, Function<Response, T> handler, String projectId) {
        CheckpointApi.GetCheckPointsOper op = api().getCheckPoints()
                .projectIDPath(projectId);
        if (custom != null) {
            custom.accept(op);
        }
        return op.execute(handler);
    }

    /**
     * Makes the getCheckpoint call returning the response
     * @param projectId the project id
     * @return the response
     */
    public static Response getCheckpointsResponse(String projectId) {
        return getCheckpointsCall((spec) -> {
        }, Function.identity(), projectId);
    }

    /**
     * Makes the getCheckpoints call and return the list of checkpoints
     * @param handler handler that will process the request before returning
     * @param projectId the project id
     * @return the list of checkpoints
     */
    public static CheckpointEntities getCheckpoints(Function<Response, Response> handler, String projectId) {
        return api().getCheckPoints().projectIDPath(projectId).executeAs(handler);
    }

    /**
     * Return the checkpoint list given the project id
     * @param projectId the project id
     * @return the list of checkpoints
     */
    public static CheckpointEntities getCheckpoints(String projectId) {
        return getCheckpoints(Function.identity(), projectId);
    }

    /**
     * Makes the setCheckpoint call
     * @param custom optional customizer to customize the op before calling
     * @param handler handles the response and convert it to return type
     * @param projectId the project id
     * @param checkpoints the checkpoint to set
     * @param <T> the type to return
     * @return
     */
    public static <T> T setCheckpointsCall(Consumer<CheckpointApi.SetCheckPointsOper> custom, Function<Response, T> handler, String projectId, SetCheckpoints checkpoints) {
        CheckpointApi.SetCheckPointsOper op = api().setCheckPoints()
                .projectIDPath(projectId)
                .body(checkpoints);
        if (custom != null) {
            custom.accept(op);
        }
        return op.execute(handler);
    }

    /**
     * Call the setcheckpoints and return the response
     * @param projectId the project id
     * @param checkpoints the checkpoint to set
     * @return the response
     */
    public static Response setCheckpointsResponse(String projectId, SetCheckpoints checkpoints) {
        return setCheckpointsCall((op) -> {
        }, Function.identity(), projectId, checkpoints);
    }

    /**
     * Call the setcheckpoints and return the list of checkpoints
     * @param handler an handler to process the response before returning the result (for example to save it somewhere for later processing)
     * @param projectId the project id
     * @param checkpoints the checkpoint list
     * @return
     */
    public static CheckpointEntities setCheckpoints(Function<Response, Response> handler, String projectId, SetCheckpoints checkpoints) {
        return api().setCheckPoints().projectIDPath(projectId).body(checkpoints).executeAs(handler);
    }

    /**
     * Set checkpoints for the project
     * @param projectId project id
     * @param checkpoints checkpoint to set
     * @return the complete list of checkpoints
     */
    public static CheckpointEntities setCheckpoints(String projectId, SetCheckpoints checkpoints) {
        return setCheckpoints(Function.identity(), projectId, checkpoints);
    }
}
