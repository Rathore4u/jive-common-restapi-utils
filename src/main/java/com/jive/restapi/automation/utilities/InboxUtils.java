package com.jive.restapi.automation.utilities;

import com.jive.restapi.automation.utilities.v3.InboxUtil;
import com.aurea.automation.openapi.common.Options;
import com.jive.restapi.generated.person.models.InboxEntry;
import com.jive.restapi.generated.person.models.InboxEntryEntities;

import io.restassured.response.Response;

public class InboxUtils {
    public static Response readInboxAsResponse(FilterBuilder filterBuilder) {
        Response resp = null;
        for (int counter = 0; counter < 15; counter++) {
            resp = InboxUtil.getActivity(Options.custom(op -> op.filterQuery((Object[]) filterBuilder.buildList())));
            InboxEntryEntities inboxEntryEntities = resp.as(InboxEntryEntities.class);
            if (inboxEntryEntities.getList() != null && !inboxEntryEntities.getList().isEmpty()) {
                break;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        return resp;
    }

    public static InboxEntry readInbox(FilterBuilder filterBuilder) {
        return readInboxAsResponse(filterBuilder).as(InboxEntry.class);
    }

    public static String readInboxToReturnString(FilterBuilder filterBuilder) {
        return InboxUtil.getActivity(
                Options.logRequest(),
                Options.logResponse(),
                Options.custom(op -> op.filterQuery((Object[]) filterBuilder.buildList())))
                .as(String.class);
    }
}
