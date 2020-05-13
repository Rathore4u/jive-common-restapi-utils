package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.PublicationsApi;
import com.jive.restapi.generated.person.models.Publication;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in publications group.
 */

@UtilityClass
public class PublicationsUtil {
        private static PublicationsApi api() {
                return ApiUtils.apiClient().publications();
        }

        /**
         * createPublication.
         * 
         * Path : "/publications" Method : post OpId : createPublication Create a new
         * publication owned by the caller, based on the information in the specified
         * Publication
         * 
         * @param body required parameter
         * @return Publication
         */
        @SafeVarargs
        public static Response createPublication(Publication body,
                        Options.OptionsBuilder<PublicationsApi.CreatePublicationOper>... options) {
                return Options.execute(api().createPublication().body(body), options);
        }

}
