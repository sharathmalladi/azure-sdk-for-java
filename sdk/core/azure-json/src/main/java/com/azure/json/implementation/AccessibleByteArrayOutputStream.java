// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.json.implementation;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/**
 * This class is an extension of {@link ByteArrayOutputStream} which allows access to the backing {@code byte[]} without
 * requiring a copying of the data. The only use of this class is for internal purposes where we know it is safe to
 * directly access the {@code byte[]} without copying.
 * <p>
 * This class isn't thread-safe and should only be used when concurrency is controlled.
 */
public final class AccessibleByteArrayOutputStream extends ByteArrayOutputStream {
    /**
     * Constructs an instance of {@link AccessibleByteArrayOutputStream} with the default initial capacity.
     */
    public AccessibleByteArrayOutputStream() {
        super();
    }

    /**
     * Constructs an instance of {@link AccessibleByteArrayOutputStream} with a specified initial capacity.
     *
     * @param initialCapacity The initial capacity.
     * @throws IllegalArgumentException If {@code initialCapacity} is less than 0.
     */
    public AccessibleByteArrayOutputStream(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public byte[] toByteArray() {
        return buf;
    }

    /**
     * The number of bytes that have been written to the stream.
     *
     * @return The number of byte written to the stream.
     */
    public int count() {
        return count;
    }

    public String toString(Charset charset) {
        return new String(buf, 0, count, charset);
    }
}
