// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for ExtensionMetadataV2 Get.
 */
public final class ExtensionMetadataV2GetSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2025-02-19-preview/examples/
     * extension/ExtensionMetadataV2_Get.json
     */
    /**
     * Sample code: GET an extension metadata.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void gETAnExtensionMetadata(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.extensionMetadataV2s()
            .getWithResponse("EastUS", "microsoft.azure.monitor", "azuremonitorlinuxagent", "1.33.0",
                com.azure.core.util.Context.NONE);
    }
}
