// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.GalleryArtifactVersionSource;
import com.azure.resourcemanager.compute.models.GalleryImageVersionPublishingProfile;
import com.azure.resourcemanager.compute.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.compute.models.GalleryImageVersionUpdate;
import com.azure.resourcemanager.compute.models.StorageAccountType;
import com.azure.resourcemanager.compute.models.TargetRegion;
import java.util.Arrays;

/** Samples for GalleryImageVersions Update. */
public final class GalleryImageVersionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/galleryExamples/GalleryImageVersion_Update.json
     */
    /**
     * Sample code: Update a simple Gallery Image Version (Managed Image as source).
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateASimpleGalleryImageVersionManagedImageAsSource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleryImageVersions()
            .update(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryImageName",
                "1.0.0",
                new GalleryImageVersionUpdate()
                    .withPublishingProfile(
                        new GalleryImageVersionPublishingProfile()
                            .withTargetRegions(
                                Arrays
                                    .asList(
                                        new TargetRegion().withName("West US").withRegionalReplicaCount(1),
                                        new TargetRegion()
                                            .withName("East US")
                                            .withRegionalReplicaCount(2)
                                            .withStorageAccountType(StorageAccountType.STANDARD_ZRS))))
                    .withStorageProfile(
                        new GalleryImageVersionStorageProfile()
                            .withSource(
                                new GalleryArtifactVersionSource()
                                    .withId(
                                        "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/images/{imageName}"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/galleryExamples/GalleryImageVersion_Update_WithoutSourceId.json
     */
    /**
     * Sample code: Update a simple Gallery Image Version without source id.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateASimpleGalleryImageVersionWithoutSourceId(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleryImageVersions()
            .update(
                "myResourceGroup",
                "myGalleryName",
                "myGalleryImageName",
                "1.0.0",
                new GalleryImageVersionUpdate()
                    .withPublishingProfile(
                        new GalleryImageVersionPublishingProfile()
                            .withTargetRegions(
                                Arrays
                                    .asList(
                                        new TargetRegion().withName("West US").withRegionalReplicaCount(1),
                                        new TargetRegion()
                                            .withName("East US")
                                            .withRegionalReplicaCount(2)
                                            .withStorageAccountType(StorageAccountType.STANDARD_ZRS))))
                    .withStorageProfile(new GalleryImageVersionStorageProfile()),
                Context.NONE);
    }
}
