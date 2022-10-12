// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcontainerservice.fluent.HybridContainerServicesClient;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.OrchestratorVersionProfileListResultInner;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VMSkuListResultInner;
import com.azure.resourcemanager.hybridcontainerservice.models.HybridContainerServices;
import com.azure.resourcemanager.hybridcontainerservice.models.OrchestratorVersionProfileListResult;
import com.azure.resourcemanager.hybridcontainerservice.models.VMSkuListResult;

public final class HybridContainerServicesImpl implements HybridContainerServices {
    private static final ClientLogger LOGGER = new ClientLogger(HybridContainerServicesImpl.class);

    private final HybridContainerServicesClient innerClient;

    private final com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager;

    public HybridContainerServicesImpl(
        HybridContainerServicesClient innerClient,
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OrchestratorVersionProfileListResult> listOrchestratorsWithResponse(
        String customLocationResourceUri, Context context) {
        Response<OrchestratorVersionProfileListResultInner> inner =
            this.serviceClient().listOrchestratorsWithResponse(customLocationResourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OrchestratorVersionProfileListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OrchestratorVersionProfileListResult listOrchestrators(String customLocationResourceUri) {
        OrchestratorVersionProfileListResultInner inner =
            this.serviceClient().listOrchestrators(customLocationResourceUri);
        if (inner != null) {
            return new OrchestratorVersionProfileListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VMSkuListResult> listVMSkusWithResponse(String customLocationResourceUri, Context context) {
        Response<VMSkuListResultInner> inner =
            this.serviceClient().listVMSkusWithResponse(customLocationResourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VMSkuListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VMSkuListResult listVMSkus(String customLocationResourceUri) {
        VMSkuListResultInner inner = this.serviceClient().listVMSkus(customLocationResourceUri);
        if (inner != null) {
            return new VMSkuListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private HybridContainerServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager() {
        return this.serviceManager;
    }
}