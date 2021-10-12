// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.util.Context;

/** Samples for Channels Delete. */
public final class ChannelsDeleteSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/DeleteChannel.json
     */
    /**
     * Sample code: Delete Bot.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void deleteBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.channels().deleteWithResponse("OneResourceGroupName", "samplebotname", "EmailChannel", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/DeleteDirectLineSpeechChannel.json
     */
    /**
     * Sample code: Delete DirectLine Speech Bot.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void deleteDirectLineSpeechBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager
            .channels()
            .deleteWithResponse("OneResourceGroupName", "samplebotname", "DirectLineSpeechChannel", Context.NONE);
    }
}
