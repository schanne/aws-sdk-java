/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Job JSON Unmarshaller
 */
public class JobJsonUnmarshaller implements
        Unmarshaller<Job, JsonUnmarshallerContext> {

    public Job unmarshall(JsonUnmarshallerContext context) throws Exception {
        Job job = new Job();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    job.setArn(StringJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    job.setName(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    job.setType(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    job.setCreated(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    job.setStatus(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    context.nextToken();
                    job.setResult(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("started", targetDepth)) {
                    context.nextToken();
                    job.setStarted(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("stopped", targetDepth)) {
                    context.nextToken();
                    job.setStopped(DateJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("counters", targetDepth)) {
                    context.nextToken();
                    job.setCounters(CountersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    job.setMessage(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("device", targetDepth)) {
                    context.nextToken();
                    job.setDevice(DeviceJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("deviceMinutes", targetDepth)) {
                    context.nextToken();
                    job.setDeviceMinutes(DeviceMinutesJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return job;
    }

    private static JobJsonUnmarshaller instance;

    public static JobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonUnmarshaller();
        return instance;
    }
}
