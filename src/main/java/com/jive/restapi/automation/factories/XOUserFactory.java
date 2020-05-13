package com.jive.restapi.automation.factories;

import com.jive.restapi.automation.types.UserImpl;
import com.xo.restapi.automation.factories.UserFactory;
import com.xo.restapi.automation.types.User;

public class XOUserFactory implements UserFactory {

    @Override
    public <E extends Enum<?>> User getUser(String username, String password) {
        return new UserImpl(username, password);
    }
}
