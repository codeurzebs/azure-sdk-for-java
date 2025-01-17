// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The detailed information for a function invocation, as provided by a required action invoking a function tool, that
 * includes the name of and arguments to the function.
 */
@Immutable
public final class RequiredFunctionToolCallDetails {

    /*
     * The name of the function.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The arguments to use when invoking the named function, as provided by the model. Arguments are presented as a
     * JSON document that should be validated and parsed for evaluation.
     */
    @Generated
    @JsonProperty(value = "arguments")
    private String arguments;

    /**
     * Creates an instance of RequiredFunctionToolCallDetails class.
     *
     * @param name the name value to set.
     * @param arguments the arguments value to set.
     */
    @Generated
    @JsonCreator
    private RequiredFunctionToolCallDetails(@JsonProperty(value = "name") String name,
        @JsonProperty(value = "arguments") String arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    /**
     * Get the name property: The name of the function.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the arguments property: The arguments to use when invoking the named function, as provided by the model.
     * Arguments are presented as a JSON document that should be validated and parsed for evaluation.
     *
     * @return the arguments value.
     */
    @Generated
    public String getArguments() {
        return this.arguments;
    }
}
