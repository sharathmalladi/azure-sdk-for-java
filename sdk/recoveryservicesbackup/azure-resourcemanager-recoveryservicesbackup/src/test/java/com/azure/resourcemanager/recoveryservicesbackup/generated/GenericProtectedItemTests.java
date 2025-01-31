// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.GenericProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GenericProtectedItemTests {
    @Test
    public void testDeserialize() {
        GenericProtectedItem model =
            BinaryData
                .fromString(
                    "{\"protectedItemType\":\"GenericProtectedItem\",\"friendlyName\":\"monstshiyxgve\",\"policyState\":\"clduc\",\"protectionState\":\"IRPending\",\"protectedItemId\":2121793057109407419,\"sourceAssociations\":{\"stmninwjizcilng\":\"wcobie\"},\"fabricName\":\"shejjtbxqm\",\"backupManagementType\":\"AzureIaasVM\",\"workloadType\":\"Exchange\",\"containerName\":\"qzvnersbycucr\",\"sourceResourceId\":\"amikzebrqbsm\",\"policyId\":\"ziqgfuh\",\"lastRecoveryPoint\":\"2021-01-11T08:57:38Z\",\"backupSetName\":\"uswhvhczznvfbycj\",\"createMode\":\"Invalid\",\"deferredDeleteTimeInUTC\":\"2021-07-04T04:10Z\",\"isScheduledForDeferredDelete\":false,\"deferredDeleteTimeRemaining\":\"vumwmxqh\",\"isDeferredDeleteScheduleUpcoming\":true,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"ldsehaohdj\",\"hflzokxco\",\"pelnjetag\"],\"isArchiveEnabled\":false,\"policyName\":\"oatftgzpnpbswvef\",\"softDeleteRetentionPeriod\":1872397233}")
                .toObject(GenericProtectedItem.class);
        Assertions.assertEquals("qzvnersbycucr", model.containerName());
        Assertions.assertEquals("amikzebrqbsm", model.sourceResourceId());
        Assertions.assertEquals("ziqgfuh", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T08:57:38Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("uswhvhczznvfbycj", model.backupSetName());
        Assertions.assertEquals(CreateMode.INVALID, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-04T04:10Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("vumwmxqh", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("ldsehaohdj", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("oatftgzpnpbswvef", model.policyName());
        Assertions.assertEquals(1872397233, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("monstshiyxgve", model.friendlyName());
        Assertions.assertEquals("clduc", model.policyState());
        Assertions.assertEquals(ProtectionState.IRPENDING, model.protectionState());
        Assertions.assertEquals(2121793057109407419L, model.protectedItemId());
        Assertions.assertEquals("wcobie", model.sourceAssociations().get("stmninwjizcilng"));
        Assertions.assertEquals("shejjtbxqm", model.fabricName());
    }

    @Test
    public void testSerialize() {
        GenericProtectedItem model =
            new GenericProtectedItem()
                .withContainerName("qzvnersbycucr")
                .withSourceResourceId("amikzebrqbsm")
                .withPolicyId("ziqgfuh")
                .withLastRecoveryPoint(OffsetDateTime.parse("2021-01-11T08:57:38Z"))
                .withBackupSetName("uswhvhczznvfbycj")
                .withCreateMode(CreateMode.INVALID)
                .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-07-04T04:10Z"))
                .withIsScheduledForDeferredDelete(false)
                .withDeferredDeleteTimeRemaining("vumwmxqh")
                .withIsDeferredDeleteScheduleUpcoming(true)
                .withIsRehydrate(false)
                .withResourceGuardOperationRequests(Arrays.asList("ldsehaohdj", "hflzokxco", "pelnjetag"))
                .withIsArchiveEnabled(false)
                .withPolicyName("oatftgzpnpbswvef")
                .withSoftDeleteRetentionPeriod(1872397233)
                .withFriendlyName("monstshiyxgve")
                .withPolicyState("clduc")
                .withProtectionState(ProtectionState.IRPENDING)
                .withProtectedItemId(2121793057109407419L)
                .withSourceAssociations(mapOf("stmninwjizcilng", "wcobie"))
                .withFabricName("shejjtbxqm");
        model = BinaryData.fromObject(model).toObject(GenericProtectedItem.class);
        Assertions.assertEquals("qzvnersbycucr", model.containerName());
        Assertions.assertEquals("amikzebrqbsm", model.sourceResourceId());
        Assertions.assertEquals("ziqgfuh", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T08:57:38Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("uswhvhczznvfbycj", model.backupSetName());
        Assertions.assertEquals(CreateMode.INVALID, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-04T04:10Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("vumwmxqh", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("ldsehaohdj", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("oatftgzpnpbswvef", model.policyName());
        Assertions.assertEquals(1872397233, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("monstshiyxgve", model.friendlyName());
        Assertions.assertEquals("clduc", model.policyState());
        Assertions.assertEquals(ProtectionState.IRPENDING, model.protectionState());
        Assertions.assertEquals(2121793057109407419L, model.protectedItemId());
        Assertions.assertEquals("wcobie", model.sourceAssociations().get("stmninwjizcilng"));
        Assertions.assertEquals("shejjtbxqm", model.fabricName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
