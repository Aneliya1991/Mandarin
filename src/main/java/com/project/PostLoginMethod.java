package com.project;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

import static com.project.utils.Constants.LOGIN.LOGIN_REQ_BODY;
import static com.project.utils.Constants.LOGIN.LOGIN_RES_BODY;

public class PostLoginMethod extends AbstractApiMethodV2 {

    public PostLoginMethod() {
        super(LOGIN_REQ_BODY, LOGIN_RES_BODY, new Properties());
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("url"));
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");
        addProperty("email","qauser7@edcast.com");
        addProperty("password","123456Aa!");
    }
}