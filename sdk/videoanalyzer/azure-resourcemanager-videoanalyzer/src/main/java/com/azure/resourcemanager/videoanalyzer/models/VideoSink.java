// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Video sink in a live topology allows for video and audio to be captured, optionally archived, and published via a
 * video resource. If archiving is enabled, this results in a video of type 'archive'. If used in a batch topology, this
 * allows for video and audio to be stored as a file, and published via a video resource of type 'file'.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.VideoSink")
@Fluent
public final class VideoSink extends SinkNodeBase {
    /*
     * Name of a new or existing video resource used to capture and publish
     * content. Note: if downstream of RTSP source, and if disableArchive is
     * set to true, then no content is archived.
     */
    @JsonProperty(value = "videoName", required = true)
    private String videoName;

    /*
     * Optional video properties to be used in case a new video resource needs
     * to be created on the service.
     */
    @JsonProperty(value = "videoCreationProperties")
    private VideoCreationProperties videoCreationProperties;

    /*
     * Options to change how the video sink publishes content via the video
     * resource. This property is only allowed for topologies where "kind" is
     * set to "live".
     */
    @JsonProperty(value = "videoPublishingOptions")
    private VideoPublishingOptions videoPublishingOptions;

    /**
     * Get the videoName property: Name of a new or existing video resource used to capture and publish content. Note:
     * if downstream of RTSP source, and if disableArchive is set to true, then no content is archived.
     *
     * @return the videoName value.
     */
    public String videoName() {
        return this.videoName;
    }

    /**
     * Set the videoName property: Name of a new or existing video resource used to capture and publish content. Note:
     * if downstream of RTSP source, and if disableArchive is set to true, then no content is archived.
     *
     * @param videoName the videoName value to set.
     * @return the VideoSink object itself.
     */
    public VideoSink withVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    /**
     * Get the videoCreationProperties property: Optional video properties to be used in case a new video resource needs
     * to be created on the service.
     *
     * @return the videoCreationProperties value.
     */
    public VideoCreationProperties videoCreationProperties() {
        return this.videoCreationProperties;
    }

    /**
     * Set the videoCreationProperties property: Optional video properties to be used in case a new video resource needs
     * to be created on the service.
     *
     * @param videoCreationProperties the videoCreationProperties value to set.
     * @return the VideoSink object itself.
     */
    public VideoSink withVideoCreationProperties(VideoCreationProperties videoCreationProperties) {
        this.videoCreationProperties = videoCreationProperties;
        return this;
    }

    /**
     * Get the videoPublishingOptions property: Options to change how the video sink publishes content via the video
     * resource. This property is only allowed for topologies where "kind" is set to "live".
     *
     * @return the videoPublishingOptions value.
     */
    public VideoPublishingOptions videoPublishingOptions() {
        return this.videoPublishingOptions;
    }

    /**
     * Set the videoPublishingOptions property: Options to change how the video sink publishes content via the video
     * resource. This property is only allowed for topologies where "kind" is set to "live".
     *
     * @param videoPublishingOptions the videoPublishingOptions value to set.
     * @return the VideoSink object itself.
     */
    public VideoSink withVideoPublishingOptions(VideoPublishingOptions videoPublishingOptions) {
        this.videoPublishingOptions = videoPublishingOptions;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VideoSink withInputs(List<NodeInput> inputs) {
        super.withInputs(inputs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VideoSink withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (videoName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property videoName in model VideoSink"));
        }
        if (videoCreationProperties() != null) {
            videoCreationProperties().validate();
        }
        if (videoPublishingOptions() != null) {
            videoPublishingOptions().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VideoSink.class);
}
