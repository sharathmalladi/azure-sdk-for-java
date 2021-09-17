// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine scale set storage profile.
 */
@Fluent
public final class VirtualMachineScaleSetStorageProfile {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetStorageProfile.class);

    /*
     * Specifies information about the image to use. You can specify
     * information about platform images, marketplace images, or virtual
     * machine images. This element is required when you want to use a platform
     * image, marketplace image, or virtual machine image, but is not used in
     * other creation operations.
     */
    @JsonProperty(value = "imageReference")
    private ImageReference imageReference;

    /*
     * Specifies information about the operating system disk used by the
     * virtual machines in the scale set. <br><br> For more information about
     * disks, see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     */
    @JsonProperty(value = "osDisk")
    private VirtualMachineScaleSetOSDisk osDisk;

    /*
     * Specifies the parameters that are used to add data disks to the virtual
     * machines in the scale set. <br><br> For more information about disks,
     * see [About disks and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     */
    @JsonProperty(value = "dataDisks")
    private List<VirtualMachineScaleSetDataDisk> dataDisks;

    /**
     * Get the imageReference property: Specifies information about the image
     * to use. You can specify information about platform images, marketplace
     * images, or virtual machine images. This element is required when you
     * want to use a platform image, marketplace image, or virtual machine
     * image, but is not used in other creation operations.
     * 
     * @return the imageReference value.
     */
    public ImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: Specifies information about the image
     * to use. You can specify information about platform images, marketplace
     * images, or virtual machine images. This element is required when you
     * want to use a platform image, marketplace image, or virtual machine
     * image, but is not used in other creation operations.
     * 
     * @param imageReference the imageReference value to set.
     * @return the VirtualMachineScaleSetStorageProfile object itself.
     */
    public VirtualMachineScaleSetStorageProfile withImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the osDisk property: Specifies information about the operating
     * system disk used by the virtual machines in the scale set.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks
     * and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     * @return the osDisk value.
     */
    public VirtualMachineScaleSetOSDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Specifies information about the operating
     * system disk used by the virtual machines in the scale set.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks
     * and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     * @param osDisk the osDisk value to set.
     * @return the VirtualMachineScaleSetStorageProfile object itself.
     */
    public VirtualMachineScaleSetStorageProfile withOsDisk(VirtualMachineScaleSetOSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Get the dataDisks property: Specifies the parameters that are used to
     * add data disks to the virtual machines in the scale set.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks
     * and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     * @return the dataDisks value.
     */
    public List<VirtualMachineScaleSetDataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: Specifies the parameters that are used to
     * add data disks to the virtual machines in the scale set.
     * &lt;br&gt;&lt;br&gt; For more information about disks, see [About disks
     * and VHDs for Azure virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     * @param dataDisks the dataDisks value to set.
     * @return the VirtualMachineScaleSetStorageProfile object itself.
     */
    public VirtualMachineScaleSetStorageProfile withDataDisks(List<VirtualMachineScaleSetDataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageReference() != null) {
            imageReference().validate();
        }
        if (osDisk() != null) {
            osDisk().validate();
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
    }
}
