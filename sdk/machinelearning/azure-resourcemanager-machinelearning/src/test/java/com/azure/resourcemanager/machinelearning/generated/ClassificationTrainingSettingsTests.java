// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ClassificationModels;
import com.azure.resourcemanager.machinelearning.models.ClassificationTrainingSettings;
import com.azure.resourcemanager.machinelearning.models.StackEnsembleSettings;
import com.azure.resourcemanager.machinelearning.models.StackMetaLearnerType;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClassificationTrainingSettingsTests {
    @Test
    public void testDeserialize() {
        ClassificationTrainingSettings model =
            BinaryData
                .fromString(
                    "{\"allowedTrainingAlgorithms\":[\"LinearSVM\",\"KNN\"],\"blockedTrainingAlgorithms\":[\"LogisticRegression\"],\"enableDnnTraining\":false,\"enableModelExplainability\":true,\"enableOnnxCompatibleModels\":false,\"enableStackEnsemble\":true,\"enableVoteEnsemble\":false,\"ensembleModelDownloadTimeout\":\"PT171H27M12S\",\"stackEnsembleSettings\":{\"stackMetaLearnerKWargs\":\"dataeseyqr\",\"stackMetaLearnerTrainPercentage\":0.8015922020078059,\"stackMetaLearnerType\":\"LightGBMClassifier\"}}")
                .toObject(ClassificationTrainingSettings.class);
        Assertions.assertEquals(false, model.enableDnnTraining());
        Assertions.assertEquals(true, model.enableModelExplainability());
        Assertions.assertEquals(false, model.enableOnnxCompatibleModels());
        Assertions.assertEquals(true, model.enableStackEnsemble());
        Assertions.assertEquals(false, model.enableVoteEnsemble());
        Assertions.assertEquals(Duration.parse("PT171H27M12S"), model.ensembleModelDownloadTimeout());
        Assertions.assertEquals(0.8015922020078059D, model.stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions
            .assertEquals(
                StackMetaLearnerType.LIGHT_GBMCLASSIFIER, model.stackEnsembleSettings().stackMetaLearnerType());
        Assertions.assertEquals(ClassificationModels.LINEAR_SVM, model.allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(ClassificationModels.LOGISTIC_REGRESSION, model.blockedTrainingAlgorithms().get(0));
    }

    @Test
    public void testSerialize() {
        ClassificationTrainingSettings model =
            new ClassificationTrainingSettings()
                .withEnableDnnTraining(false)
                .withEnableModelExplainability(true)
                .withEnableOnnxCompatibleModels(false)
                .withEnableStackEnsemble(true)
                .withEnableVoteEnsemble(false)
                .withEnsembleModelDownloadTimeout(Duration.parse("PT171H27M12S"))
                .withStackEnsembleSettings(
                    new StackEnsembleSettings()
                        .withStackMetaLearnerKWargs("dataeseyqr")
                        .withStackMetaLearnerTrainPercentage(0.8015922020078059D)
                        .withStackMetaLearnerType(StackMetaLearnerType.LIGHT_GBMCLASSIFIER))
                .withAllowedTrainingAlgorithms(Arrays.asList(ClassificationModels.LINEAR_SVM, ClassificationModels.KNN))
                .withBlockedTrainingAlgorithms(Arrays.asList(ClassificationModels.LOGISTIC_REGRESSION));
        model = BinaryData.fromObject(model).toObject(ClassificationTrainingSettings.class);
        Assertions.assertEquals(false, model.enableDnnTraining());
        Assertions.assertEquals(true, model.enableModelExplainability());
        Assertions.assertEquals(false, model.enableOnnxCompatibleModels());
        Assertions.assertEquals(true, model.enableStackEnsemble());
        Assertions.assertEquals(false, model.enableVoteEnsemble());
        Assertions.assertEquals(Duration.parse("PT171H27M12S"), model.ensembleModelDownloadTimeout());
        Assertions.assertEquals(0.8015922020078059D, model.stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions
            .assertEquals(
                StackMetaLearnerType.LIGHT_GBMCLASSIFIER, model.stackEnsembleSettings().stackMetaLearnerType());
        Assertions.assertEquals(ClassificationModels.LINEAR_SVM, model.allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(ClassificationModels.LOGISTIC_REGRESSION, model.blockedTrainingAlgorithms().get(0));
    }
}
