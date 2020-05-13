package com.jive.restapi.automation.utilities;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import com.jive.restapi.automation.data.NumberConstants;
import com.jive.restapi.generated.person.models.GenericEntities;
import com.jive.restapi.generated.person.models.PersonEntities;
import com.jive.restapi.generated.person.models.PlaceEntities;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;

import java.util.function.Function;

public class SearchUtils {

    public static Response searchContent(String query, String origin) {
        return searchContent(new String[]{query}, origin);
    }

    public static Response searchContent(String[] filters, String origin) {
        Response resp = null;
        for (int counter = NumberConstants.ZERO; counter < NumberConstants.FIFTEEN; counter++) {
            resp = JiveApiUtils.getApiClient()
                    .search()
                    .searchContents()
                    .filterQuery(filters)
                    .countQuery(100)
                    .originQuery(origin)
                    .execute(Function.identity());
            GenericEntities contentEntities = resp.as(GenericEntities.class);
            if (contentEntities.getList() != null && !contentEntities.getList().isEmpty()) {
                break;
            }

            try {
                MILLISECONDS.sleep(NumberConstants.TWO_THOUSAND);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        return resp;
    }

    public static Response searchPeople(String query, String origin) {
        return searchPeople(new String[]{query}, origin);
    }

    public static Response searchPeople(String[] filters, String origin) {
        Response resp = null;
        for (int counter = NumberConstants.ZERO; counter < NumberConstants.FIFTEEN; counter++) {
            resp = JiveApiUtils.getApiClient()
                    .search()
                    .searchPeople()
                    .filterQuery(filters)
                    .originQuery(origin)
                    .reqSpec(spec -> spec.log(LogDetail.ALL))
                    .execute(Function.identity());
            PersonEntities personEntities = resp.as(PersonEntities.class);
            if (personEntities.getList() != null && !personEntities.getList().isEmpty()) {
                break;
            }

            try {
                MILLISECONDS.sleep(NumberConstants.TWO_THOUSAND);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        return resp;
    }

    public static Response searchPlace(String[] filters, String origin) {
        Response resp = null;
        for (int counter = NumberConstants.ZERO; counter < NumberConstants.FIFTEEN; counter++) {
            resp = JiveApiUtils.getApiClient()
                    .search()
                    .searchPlaces()
                    .filterQuery(filters)
                    .originQuery(origin)
                    .execute(Function.identity());
            PlaceEntities placeEntities = resp.as(PlaceEntities.class);
            if (placeEntities.getList() != null && !placeEntities.getList().isEmpty()) {
                break;
            }

            try {
                MILLISECONDS.sleep(NumberConstants.TWO_THOUSAND);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        return resp;
    }
}
