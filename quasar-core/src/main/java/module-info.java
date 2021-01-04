/*
 * Quasar: lightweight threads and actors for the JVM.
 * Copyright (c) 2018, Parallel Universe Software Co. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 3.0
 * as published by the Free Software Foundation.
 */
module co.paralleluniverse.quasar.core {
    requires java.management;
    requires java.instrument;
    requires jdk.unsupported; // needed for ThreadAccess and ExtendedStackTraceHotSpot

    requires static org.objectweb.asm;
    requires static org.objectweb.asm.util;
    requires static org.objectweb.asm.commons;
    requires com.google.common;
    requires static kryo;
    requires static ant;
    requires static junit;
    requires static HdrHistogram;
    requires static LatencyUtils;
    requires static com.codahale.metrics;
    requires static com.codahale.metrics.jmx;
    requires static osgi.annotation;

    exports co.paralleluniverse.fibers;
    exports co.paralleluniverse.fibers.futures;
    exports co.paralleluniverse.fibers.instrument;
    exports co.paralleluniverse.fibers.io;
    exports co.paralleluniverse.remote;
    exports co.paralleluniverse.strands;
    exports co.paralleluniverse.strands.channels;
    exports co.paralleluniverse.strands.channels.transfer;
    exports co.paralleluniverse.strands.concurrent;
    exports co.paralleluniverse.strands.dataflow;

    uses co.paralleluniverse.fibers.instrument.SuspendableClassifier;
}
