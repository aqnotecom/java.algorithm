/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aqnote.shared.algorithm.problem;

import com.aqnote.shared.algorithm.problem.ReverseOrderOfBinaryNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */
public class ReverseOrderOfBinaryNumberTest {

  private ReverseOrderOfBinaryNumber reverseOrder;

  @Before public void setUp() {
    reverseOrder = new ReverseOrderOfBinaryNumber();
  }

  @Test public void shouldReturnZeroIfInputIsZero() {
    int input = 0; // 0

    int result = reverseOrder.reverse(input);

    assertEquals(0, result); // 0
  }

  @Test public void shouldReturnOneIfInputIsOne() {
    int input = 1; // 1

    int result = reverseOrder.reverse(input);

    assertEquals(1, result); // 1
  }

  @Test public void shouldReturnTheSameNumberIfIsFullOfOnes() {
    int input = 7; // 111

    int result = reverseOrder.reverse(input);

    assertEquals(7, result); // 11
  }

  @Test public void shouldReturnBinaryNumberOrder() {
    int input = 13; // 1101

    int result = reverseOrder.reverse(input);

    assertEquals(11, result); // 1011
  }
}
