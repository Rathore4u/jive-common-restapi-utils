package com.jive.restapi.automation.commonsteps;

import static com.xo.restapi.automation.configs.RestAssuredConfigUtils.setBaseUri;

import com.jive.restapi.automation.configs.AppConfig;
import com.jive.restapi.automation.factories.XOUserFactory;
import com.xo.restapi.automation.context.UserContext;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public static void beforeScenario() {
        AppConfig.init(AppConfig.DEFAULT);
        UserContext.setFactory(new XOUserFactory());
        setBaseUri(AppConfig.DEFAULT);
    }

}
