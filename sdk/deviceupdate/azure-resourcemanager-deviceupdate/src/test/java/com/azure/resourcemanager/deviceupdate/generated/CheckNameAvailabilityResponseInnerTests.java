// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.deviceupdate.models.CheckNameAvailabilityReason;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CheckNameAvailabilityResponseInnerTests {
    @Test
    public void testDeserialize() {
        CheckNameAvailabilityResponseInner model =
            BinaryData
                .fromString("{\"nameAvailable\":false,\"reason\":\"Invalid\",\"message\":\"gsybbejhp\"}")
                .toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("gsybbejhp", model.message());
    }

    @Test
    public void testSerialize() {
        CheckNameAvailabilityResponseInner model =
            new CheckNameAvailabilityResponseInner()
                .withNameAvailable(false)
                .withReason(CheckNameAvailabilityReason.INVALID)
                .withMessage("gsybbejhp");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("gsybbejhp", model.message());
    }
}