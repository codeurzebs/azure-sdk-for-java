// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.EndpointDependency;
import com.azure.resourcemanager.kusto.models.EndpointDetail;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EndpointDependencyTests {
    @Test
    public void testDeserialize() {
        EndpointDependency model =
            BinaryData
                .fromString(
                    "{\"domainName\":\"ggxkallatmelwuip\",\"endpointDetails\":[{\"port\":834190026},{\"port\":120709025},{\"port\":154268521},{\"port\":1783583685}]}")
                .toObject(EndpointDependency.class);
        Assertions.assertEquals("ggxkallatmelwuip", model.domainName());
        Assertions.assertEquals(834190026, model.endpointDetails().get(0).port());
    }

    @Test
    public void testSerialize() {
        EndpointDependency model =
            new EndpointDependency()
                .withDomainName("ggxkallatmelwuip")
                .withEndpointDetails(
                    Arrays
                        .asList(
                            new EndpointDetail().withPort(834190026),
                            new EndpointDetail().withPort(120709025),
                            new EndpointDetail().withPort(154268521),
                            new EndpointDetail().withPort(1783583685)));
        model = BinaryData.fromObject(model).toObject(EndpointDependency.class);
        Assertions.assertEquals("ggxkallatmelwuip", model.domainName());
        Assertions.assertEquals(834190026, model.endpointDetails().get(0).port());
    }
}