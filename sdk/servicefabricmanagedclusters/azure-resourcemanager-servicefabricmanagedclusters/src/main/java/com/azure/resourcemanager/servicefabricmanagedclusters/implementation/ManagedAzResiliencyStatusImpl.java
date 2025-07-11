// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ManagedAzResiliencyStatusInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedAzResiliencyStatus;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ResourceAzStatus;
import java.util.Collections;
import java.util.List;

public final class ManagedAzResiliencyStatusImpl implements ManagedAzResiliencyStatus {
    private ManagedAzResiliencyStatusInner innerObject;

    private final com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager;

    ManagedAzResiliencyStatusImpl(ManagedAzResiliencyStatusInner innerObject,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ResourceAzStatus> baseResourceStatus() {
        List<ResourceAzStatus> inner = this.innerModel().baseResourceStatus();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean isClusterZoneResilient() {
        return this.innerModel().isClusterZoneResilient();
    }

    public ManagedAzResiliencyStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager() {
        return this.serviceManager;
    }
}
