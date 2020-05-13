package com.jive.restapi.automation.utilities.v3;

import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.api.PagesApi;
import com.jive.restapi.generated.person.models.Page;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;

/**
 * Utility class for api calls in pages group.
 */

@UtilityClass
public class PagesUtils {
    private static PagesApi api() {
        return ApiUtils.apiClient().pages();
    }

    /**
     * createPage.
     *
     * <p>Path   : "/pages"
     * Method : post
     * OpId   : createPage
     * Create a page for a person or place as specified by parent.
     *
     * @param body required parameter
     * @return Page
     */
    @SafeVarargs
    public static Response createPage(
            Page body,
            Options.OptionsBuilder<PagesApi.CreatePageOper>... options) {
        return Options.execute(api()
                        .createPage()
                        .body(body),
                options);
    }

    /**
     * getPrototypePage.
     *
     * <p>Path   : "/pages/prototype"
     * Method : get
     * OpId   : getPrototypePage
     * Return a new page, that is not persistent, based on the specified place template.
     * From the Page that is returned by this service, you must supply the following in order to persist it:
     *
     * @return Page
     */
    @SafeVarargs
    public static Response getPrototypePage(
            Options.OptionsBuilder<PagesApi.GetPrototypePageOper>... options) {
        return Options.execute(api()
                        .getPrototypePage(),
                options);
    }

    /**
     * deletePage.
     *
     * <p>Path   : "/pages/{pageID}"
     * Method : delete
     * OpId   : deletePage
     * Delete the specified page.
     *
     * @param pageID required parameter
     * @return Generic response
     */
    @SafeVarargs
    public static Response deletePage(
            String pageID,
            Options.OptionsBuilder<PagesApi.DeletePageOper>... options) {
        return Options.execute(api()
                        .deletePage()
                        .pageIDPath(pageID),
                options);
    }

    /**
     * getPage.
     *
     * <p>Path   : "/pages/{pageID}"
     * Method : get
     * OpId   : getPage
     * Retrieve a page by ID
     *
     * @param pageID required parameter
     * @return Page
     */
    @SafeVarargs
    public static Response getPage(
            String pageID,
            Options.OptionsBuilder<PagesApi.GetPageOper>... options) {
        return Options.execute(api()
                        .getPage()
                        .pageIDPath(pageID),
                options);
    }

    /**
     * updatePage.
     *
     * <p>Path   : "/pages/{pageID}"
     * Method : put
     * OpId   : updatePage
     * Update a page
     *
     * @param pageID required parameter
     * @param body   required parameter
     * @return Page
     */
    @SafeVarargs
    public static Response updatePage(
            String pageID,
            Page body,
            Options.OptionsBuilder<PagesApi.UpdatePageOper>... options) {
        return Options.execute(api()
                        .updatePage()
                        .pageIDPath(pageID)
                        .body(body),
                options);
    }
}
