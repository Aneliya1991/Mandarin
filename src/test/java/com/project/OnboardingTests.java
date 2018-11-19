package com.project;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.annotations.Test;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

public class OnboardingTests extends AbstractTest {

    @Test
    public static void GetOnbordingTest()  {
        GetOnboardingStatusMethod getOnboardingStatusMethod = new GetOnboardingStatusMethod();
        getOnboardingStatusMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getOnboardingStatusMethod.callAPI();
        getOnboardingStatusMethod.validateResponse();

    }
}
