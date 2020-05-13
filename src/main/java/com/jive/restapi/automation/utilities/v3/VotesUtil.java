package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.VotesApi;
import java.util.List;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in votes group.
 */

@UtilityClass
public class VotesUtil {
    private static VotesApi api() {
        return ApiUtils.apiClient().votes();
    }

        
    /**
     * castVote.
     * 
     * Path   : "/votes/{contentID}"
     * Method : post
     * OpId   : castVote
     * Cast a vote on the specified poll. Some polls allow multiple votes or a single vote.
     * @param contentID required parameter
     * @param body required parameter
     * @return Generic response 
     */ 
    @SafeVarargs
    public static Response castVote(
                                    String contentID,
                                    List<String> body,
                                    Options.OptionsBuilder<VotesApi.CastVoteOper>... options) {
        return Options.execute(api()
                .castVote()
                .contentIDPath(contentID)
                .body(body), 
                 options);

    }
    
    
    /**
     * getVotes.
     * 
     * Path   : "/votes/{contentID}"
     * Method : get
     * OpId   : getVotes
     * Return the number of votes cast for each poll option.
     * @param contentID required parameter
     * @return List<VoteCount> 
     */ 
    @SafeVarargs
    public static Response getVotes(
                                    String contentID,
                                    Options.OptionsBuilder<VotesApi.GetVotesOper>... options) {
        return Options.execute(api()
                .getVotes()
                .contentIDPath(contentID), 
                 options);

    }
    
    
}
