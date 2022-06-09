// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.BuildContext;
import com.azure.resourcemanager.machinelearning.models.EnvironmentVersionDetails;
import com.azure.resourcemanager.machinelearning.models.InferenceContainerProperties;
import com.azure.resourcemanager.machinelearning.models.Route;
import java.util.HashMap;
import java.util.Map;

/** Samples for EnvironmentVersions CreateOrUpdate. */
public final class EnvironmentVersionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/EnvironmentVersion/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Environment Version.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateEnvironmentVersion(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .environmentVersions()
            .define("string")
            .withExistingEnvironment("test-rg", "my-aml-workspace", "string")
            .withProperties(
                new EnvironmentVersionDetails()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withIsAnonymous(false)
                    .withBuild(
                        new BuildContext()
                            .withContextUri(
                                "https://storage-account.blob.core.windows.net/azureml/DockerBuildContext/95ddede6b9b8c4e90472db3acd0a8d28/")
                            .withDockerfilePath("prod/Dockerfile"))
                    .withCondaFile("string")
                    .withImage("docker.io/tensorflow/serving:latest")
                    .withInferenceConfig(
                        new InferenceContainerProperties()
                            .withLivenessRoute(new Route().withPath("string").withPort(1))
                            .withReadinessRoute(new Route().withPath("string").withPort(1))
                            .withScoringRoute(new Route().withPath("string").withPort(1))))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
