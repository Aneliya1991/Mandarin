package com.project;

import static com.project.utils.Constants.ONBOARDING.ONBOARDING_REQ_BODY;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;


public class GetOnboardingStatusMethod extends AbstractApiMethodV2 {
    public GetOnboardingStatusMethod() {
        super (null, ONBOARDING_REQ_BODY);
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("url"));
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");
        request.header("x-api-token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJob3N0X25hbWUiOiJxYSIsInVzZXJfaWQiOjE3MzQwMSwiY2xpZW50X3VzZXJfaWQiOm51bGwsImlzX29yZ19hZG1pbiI6ZmFsc2UsImlzX3N1cGVyYWRtaW4iOmZhbHNlLCJvcmdhbml6YXRpb25faWQiOjE1LCJ0aW1lc3RhbXAiOiIyMDE4LTEwLTE3VDE4OjMzOjMwLjE1OSswMDowMCIsImlzX3dlYiI6bnVsbH0.gAW5cyVWH6eZbX7b2uv27PZXf-okeJoT1tyx5fZtHdI");
    }
}
