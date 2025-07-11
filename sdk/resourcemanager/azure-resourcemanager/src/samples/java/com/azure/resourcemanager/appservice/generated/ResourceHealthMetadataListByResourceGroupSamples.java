// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for ResourceHealthMetadata ListByResourceGroup.
 */
public final class ResourceHealthMetadataListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2024-11-01/examples/
     * ListResourceHealthMetadataByResourceGroup.json
     */
    /**
     * Sample code: List ResourceHealthMetadata for a resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listResourceHealthMetadataForAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getResourceHealthMetadatas()
            .listByResourceGroup("Default-Web-NorthCentralUS", com.azure.core.util.Context.NONE);
    }
}
