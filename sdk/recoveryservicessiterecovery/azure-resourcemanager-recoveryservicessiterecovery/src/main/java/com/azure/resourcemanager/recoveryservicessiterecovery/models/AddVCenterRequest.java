// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input required to add vCenter. */
@Fluent
public final class AddVCenterRequest {
    /*
     * The properties of an add vCenter request.
     */
    @JsonProperty(value = "properties")
    private AddVCenterRequestProperties properties;

    /** Creates an instance of AddVCenterRequest class. */
    public AddVCenterRequest() {
    }

    /**
     * Get the properties property: The properties of an add vCenter request.
     *
     * @return the properties value.
     */
    public AddVCenterRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of an add vCenter request.
     *
     * @param properties the properties value to set.
     * @return the AddVCenterRequest object itself.
     */
    public AddVCenterRequest withProperties(AddVCenterRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
