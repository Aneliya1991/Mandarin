package com.project;

import com.project.PostLoginMethod;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class LoginTests extends AbstractTest {

    @Test
    public static void createLoginApiTest() {
        PostLoginMethod postLoginMethod = new PostLoginMethod();
        postLoginMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        postLoginMethod.callAPI().asString();
        postLoginMethod.validateResponse();
    }
}
