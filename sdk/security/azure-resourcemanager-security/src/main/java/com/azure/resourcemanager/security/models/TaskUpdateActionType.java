// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TaskUpdateActionType. */
public final class TaskUpdateActionType extends ExpandableStringEnum<TaskUpdateActionType> {
    /** Static value Activate for TaskUpdateActionType. */
    public static final TaskUpdateActionType ACTIVATE = fromString("Activate");

    /** Static value Dismiss for TaskUpdateActionType. */
    public static final TaskUpdateActionType DISMISS = fromString("Dismiss");

    /** Static value Start for TaskUpdateActionType. */
    public static final TaskUpdateActionType START = fromString("Start");

    /** Static value Resolve for TaskUpdateActionType. */
    public static final TaskUpdateActionType RESOLVE = fromString("Resolve");

    /** Static value Close for TaskUpdateActionType. */
    public static final TaskUpdateActionType CLOSE = fromString("Close");

    /**
     * Creates or finds a TaskUpdateActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TaskUpdateActionType.
     */
    @JsonCreator
    public static TaskUpdateActionType fromString(String name) {
        return fromString(name, TaskUpdateActionType.class);
    }

    /**
     * Gets known TaskUpdateActionType values.
     *
     * @return known TaskUpdateActionType values.
     */
    public static Collection<TaskUpdateActionType> values() {
        return values(TaskUpdateActionType.class);
    }
}