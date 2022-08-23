// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.personalizer;

import com.azure.ai.personalizer.administration.*;
import com.azure.ai.personalizer.administration.models.*;
import com.azure.ai.personalizer.models.*;
import com.azure.core.http.HttpClient;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.OffsetDateTime;
import java.util.ArrayList;

import static com.azure.ai.personalizer.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.*;

public class EvaluationTests extends PersonalizerTestBase {

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.personalizer.TestUtils#getTestParameters")
    public final void listEvaluationsTest(HttpClient httpClient, PersonalizerServiceVersion serviceVersion) {
        PersonalizerAdministrationClient client = getAdministrationClient(httpClient, serviceVersion, true);
        client.listEvaluations();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.personalizer.TestUtils#getTestParameters")
    public final void runEvaluationLifecycleTest(HttpClient httpClient, PersonalizerServiceVersion serviceVersion) {
        PersonalizerEvaluationOptions evaluationOptions = new PersonalizerEvaluationOptions()
            .setName("JavaSDKTestEvaluation")
            .setOfflineExperimentationEnabled(true)
            .setStartTime(OffsetDateTime.now())
            .setEndTime(OffsetDateTime.now().minusDays(1))
            .setPolicies(new ArrayList<PersonalizerPolicy>());
        PersonalizerAdministrationAsyncClient client = getAdministrationAsyncClient(httpClient, serviceVersion, true);
        SyncPoller<CreateEvaluationOperationResult, PersonalizerEvaluation> syncPoller = client.beginCreateEvaluation(evaluationOptions).getSyncPoller();
        syncPoller.waitForCompletion();

        PersonalizerEvaluation evaluationResult = syncPoller.getFinalResult();
        assertNotNull(evaluationResult);
        assertEquals(EvaluationJobStatus.COMPLETED, evaluationResult.getStatus());
        assertTrue(evaluationResult.getPolicyResults().stream().anyMatch(p -> p.getPolicySource().equals(PolicySource.ONLINE)));
        assertFalse(CoreUtils.isNullOrEmpty(evaluationResult.getOptimalPolicy()));

        client.deleteEvaluation(evaluationResult.getId());
    }
}
