// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** A slot with it's associated features and list of excluded actions. */
@Fluent
public final class SlotRequest {
    /*
     * Slot ID
     */
    private String id;

    /*
     * List of dictionaries containing slot features.
     */
    private List<Object> features;

    /*
     * List of excluded action Ids.
     */
    private List<String> excludedActions;

    /*
     * The 'baseline action' ID for the slot.
     * The BaselineAction is the Id of the Action your application would use in
     * that slot if Personalizer didn't exist.
     * BaselineAction must be defined for every slot.
     * BaselineAction should never be part of ExcludedActions.
     * Each slot must have a unique BaselineAction which corresponds to an an
     * action from the event's Actions list.
     */
    private String baselineAction;

    /**
     * Get the id property: Slot ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Slot ID.
     *
     * @param id the id value to set.
     * @return the SlotRequest object itself.
     */
    public SlotRequest setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the features property: List of dictionaries containing slot features.
     *
     * @return the features value.
     */
    public List<Object> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: List of dictionaries containing slot features.
     *
     * @param features the features value to set.
     * @return the SlotRequest object itself.
     */
    public SlotRequest setFeatures(List<Object> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the excludedActions property: List of excluded action Ids.
     *
     * @return the excludedActions value.
     */
    public List<String> getExcludedActions() {
        return this.excludedActions;
    }

    /**
     * Set the excludedActions property: List of excluded action Ids.
     *
     * @param excludedActions the excludedActions value to set.
     * @return the SlotRequest object itself.
     */
    public SlotRequest setExcludedActions(List<String> excludedActions) {
        this.excludedActions = excludedActions;
        return this;
    }

    /**
     * Get the baselineAction property: The 'baseline action' ID for the slot. The BaselineAction is the Id of the
     * Action your application would use in that slot if Personalizer didn't exist. BaselineAction must be defined for
     * every slot. BaselineAction should never be part of ExcludedActions. Each slot must have a unique BaselineAction
     * which corresponds to an an action from the event's Actions list.
     *
     * @return the baselineAction value.
     */
    public String getBaselineAction() {
        return this.baselineAction;
    }

    /**
     * Set the baselineAction property: The 'baseline action' ID for the slot. The BaselineAction is the Id of the
     * Action your application would use in that slot if Personalizer didn't exist. BaselineAction must be defined for
     * every slot. BaselineAction should never be part of ExcludedActions. Each slot must have a unique BaselineAction
     * which corresponds to an an action from the event's Actions list.
     *
     * @param baselineAction the baselineAction value to set.
     * @return the SlotRequest object itself.
     */
    public SlotRequest setBaselineAction(String baselineAction) {
        this.baselineAction = baselineAction;
        return this;
    }
}
