// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualMachines. */
public interface VirtualMachines {
    /**
     * Implements VirtualMachine GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition.
     */
    VirtualMachine getByResourceGroup(String resourceGroupName, String virtualMachineName);

    /**
     * Implements VirtualMachine GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition along with {@link Response}.
     */
    Response<VirtualMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualMachineName);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force, Context context);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine stop action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String virtualMachineName);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine stop action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body, Context context);

    /**
     * Start virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String virtualMachineName);

    /**
     * Start virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Restart virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String virtualMachineName);

    /**
     * Restart virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine create checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void createCheckpoint(String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void createCheckpoint(String resourceGroupName, String virtualMachineName);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine create checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void createCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body, Context context);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine delete checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCheckpoint(String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCheckpoint(String resourceGroupName, String virtualMachineName);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine delete checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body, Context context);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine restore checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreCheckpoint(String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreCheckpoint(String resourceGroupName, String virtualMachineName);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine restore checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body, Context context);

    /**
     * List of VirtualMachines in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName);

    /**
     * List of VirtualMachines in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List of VirtualMachines in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachine> list();

    /**
     * List of VirtualMachines in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualMachine> list(Context context);

    /**
     * Implements VirtualMachine GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition along with {@link Response}.
     */
    VirtualMachine getById(String id);

    /**
     * Implements VirtualMachine GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition along with {@link Response}.
     */
    Response<VirtualMachine> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param id the resource ID.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean retain, Boolean force, Context context);

    /**
     * Begins definition for a new VirtualMachine resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualMachine definition.
     */
    VirtualMachine.DefinitionStages.Blank define(String name);
}
