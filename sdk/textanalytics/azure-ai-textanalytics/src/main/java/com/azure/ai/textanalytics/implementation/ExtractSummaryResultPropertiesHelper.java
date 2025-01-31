// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.implementation;

import com.azure.ai.textanalytics.models.DetectedLanguage;
import com.azure.ai.textanalytics.models.ExtractSummaryResult;
import com.azure.ai.textanalytics.models.SummarySentenceCollection;

/**
 * The helper class to set the non-public properties of an {@link ExtractSummaryResult} instance.
 */
public final class ExtractSummaryResultPropertiesHelper {
    private static ExtractSummaryResultAccessor accessor;

    private ExtractSummaryResultPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link ExtractSummaryResult} instance.
     */
    public interface ExtractSummaryResultAccessor {
        void setSentences(ExtractSummaryResult documentResult, SummarySentenceCollection sentences);
        void setDetectedLanguage(ExtractSummaryResult documentResult, DetectedLanguage detectedLanguage);
    }

    /**
     * The method called from {@link ExtractSummaryResult} to set it's accessor.
     *
     * @param extractSummaryResultAccessor The accessor.
     */
    public static void setAccessor(final ExtractSummaryResultAccessor extractSummaryResultAccessor) {
        accessor = extractSummaryResultAccessor;
    }

    public static void setSentences(ExtractSummaryResult documentResult, SummarySentenceCollection sentences) {
        accessor.setSentences(documentResult, sentences);
    }

    public static void setDetectedLanguage(ExtractSummaryResult documentResult, DetectedLanguage detectedLanguage) {
        accessor.setDetectedLanguage(documentResult, detectedLanguage);
    }
}
