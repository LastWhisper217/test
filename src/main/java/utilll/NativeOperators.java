/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package utilll;

/**
 * Operators that can be implemented in a more performant way
 * using the language constructs.
 *
 * @param <T> Type of elements.
 */
public interface NativeOperators<T>
    extends Addition<T>,
            Multiplication<T> {
    /**
     * Binary subtraction.
     *
     * @param a Element.
     * @return {@code this - a}.
     */
    T subtract(T a);

    /**
     * Binary division.
     *
     * @param a Element.
     * @return {@code this / a}.
     */
    T divide(T a);

    /**
     * Repeated addition.
     *
     * @param n Number of times to add {@code this} to itself.
     * @return {@code n * this}.
     */
    T multiply(int n);

    /**
     * Repeated multiplication.
     *
     * @param n Number of times to multiply {@code this} with itself.
     * @return {@code this^n}.
     */
    T pow(int n);
}
