package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.OutcomesApi;
import com.jive.restapi.generated.person.models.OutcomeBase;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in outcomes group
 */

@UtilityClass
public class OutcomesUtil {
    private static OutcomesApi api() {
        return ApiUtils.apiClient().outcomes();
    }

        
    /**
     * Path   : "/outcomes"
     * Method : get
     * OpId   : getOutcomes
     * Returns a paginated list of outcomes that were created by the requesting person.
     * @return OutcomeEntities 
     */ 
    @SafeVarargs
    public static Response getOutcomes(Options.OptionsBuilder<OutcomesApi.GetOutcomesOper>... options) {
        return Options.execute(api()
                .getOutcomes(), options);

    }
    
    
    /**
     * Path   : "/outcomes/{outcomeID}"
     * Method : delete
     * OpId   : deleteOutcome
     * Delete the outcome of the specified outcome entry by the requesting user.
     * @param outcomeID required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response deleteOutcome(String outcomeID,Options.OptionsBuilder<OutcomesApi.DeleteOutcomeOper>... options) {
        return Options.execute(api()
                .deleteOutcome()
                .outcomeIDPath(outcomeID), options);

    }
    
    
    /**
     * Path   : "/outcomes/{outcomeID}"
     * Method : get
     * OpId   : getOutcome
     * Return the specified outcome entry with the specified fields.
     * @param outcomeID required parameter
     * @return Outcome 
     */ 
    @SafeVarargs
    public static Response getOutcome(String outcomeID,Options.OptionsBuilder<OutcomesApi.GetOutcomeOper>... options) {
        return Options.execute(api()
                .getOutcome()
                .outcomeIDPath(outcomeID), options);

    }
    
    
    /**
     * Path   : "/outcomes/{outcomeID}"
     * Method : put
     * OpId   : updateOutcome
     * Update the specified outcome with the specified characteristics.
     * @param outcomeID required parameter
     * @param body required parameter
     * @return OutcomeBase 
     */ 
    @SafeVarargs
    public static Response updateOutcome(String outcomeID,OutcomeBase body,Options.OptionsBuilder<OutcomesApi.UpdateOutcomeOper>... options) {
        return Options.execute(api()
                .updateOutcome()
                .outcomeIDPath(outcomeID)
                .body(body), options);

    }
    
    
    /**
     * Path   : "/outcomes/{outcomeID}/history"
     * Method : get
     * OpId   : getHistory
     * Get the history of the given outcome by following its parent outcomes.
     * @param outcomeID required parameter
     * @return Outcome 
     */ 
    @SafeVarargs
    public static Response getHistory(String outcomeID,Options.OptionsBuilder<OutcomesApi.GetHistoryOper>... options) {
        return Options.execute(api()
                .getHistory()
                .outcomeIDPath(outcomeID), options);

    }
    
    
    /**
     * Path   : "/outcomes/{outcomeID}/outcomes"
     * Method : post
     * OpId   : createOutcome
     * Create a new outcome as a child of the existing outcome with the specified characteristics.
     * @param outcomeID required parameter
     * @param body required parameter
     * @return Outcome 
     */ 
    @SafeVarargs
    public static Response createOutcome(String outcomeID,OutcomeBase body,Options.OptionsBuilder<OutcomesApi.CreateOutcomeOper>... options) {
        return Options.execute(api()
                .createOutcome()
                .outcomeIDPath(outcomeID)
                .body(body), options);

    }
    
    
}
    