/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.emc.pravega.common.metrics;

/**
 * A meter metric which measures mean throughput and  * one-, five-,
 * and fifteen-minute exponentially-weighted moving average throughput.
 */
public interface Meter {
    /**
     * Mark the occurrence of an event.
     */
    public void mark();

    /**
     * Mark the occurrence of a given number of events..
     *
     * @param n the n
     */
    public void mark(long n);

    /**
     * Returns the number of events which have been marked.
     *
     * @return the count
     */
    public long getCount();

    /**
     * Returns the fifteen-minute exponentially-weighted moving average rate
     * at which events have occurred since the meter was created.
     *
     * @return the fifteen minute rate
     */
    public double getFifteenMinuteRate();

    /**
     * Returns the five-minute exponentially-weighted moving average rate
     * at which events have occurred since the meter was created.
     *
     * @return the five minute rate
     */
    public double getFiveMinuteRate();

    /**
     * Returns the mean rate at which events have occurred since the meter was created.
     *
     * @return the mean rate
     */
    public double getMeanRate();

    /**
     * Returns the one-minute exponentially-weighted moving average rate
     * at which events have occurred since the meter was created.
     *
     * @return the one minute rate
     */
    public double getOneMinuteRate();
}
