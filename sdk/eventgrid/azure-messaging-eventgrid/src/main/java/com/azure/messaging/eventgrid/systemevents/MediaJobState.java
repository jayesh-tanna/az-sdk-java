// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

/**
 * The previous state of the Job.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Deprecated
public enum MediaJobState {

    /**
     * The job was canceled. This is a final state for the job.
     */
    CANCELED("Canceled"),
    /**
     * The job is in the process of being canceled. This is a transient state for the job.
     */
    CANCELING("Canceling"),
    /**
     * The job has encountered an error. This is a final state for the job.
     */
    ERROR("Error"),
    /**
     * The job is finished. This is a final state for the job.
     */
    FINISHED("Finished"),
    /**
     * The job is processing. This is a transient state for the job.
     */
    PROCESSING("Processing"),
    /**
     * The job is in a queued state, waiting for resources to become available. This is a transient state.
     */
    QUEUED("Queued"),
    /**
     * The job is being scheduled to run on an available resource. This is a transient state, between queued and
     * processing states.
     */
    SCHEDULED("Scheduled");

    /**
     * The actual serialized value for a MediaJobState instance.
     */
    private final String value;

    MediaJobState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MediaJobState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MediaJobState object, or null if unable to parse.
     */
    public static MediaJobState fromString(String value) {
        if (value == null) {
            return null;
        }
        MediaJobState[] items = MediaJobState.values();
        for (MediaJobState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
