/*
 * Copyright (c) Orchestral Developments Ltd and the Orion Health group of companies (2001 - 2016).
 *
 * This document is copyright. Except for the purpose of fair reviewing, no part
 * of this publication may be reproduced or transmitted in any form or by any
 * means, electronic or mechanical, including photocopying, recording, or any
 * information storage and retrieval system, without permission in writing from
 * the publisher. Infringers of copyright render themselves liable for
 * prosecution.
 */
package org.ctci.java8.chapter1test;

import static org.junit.Assert.assertEquals;

import org.ctci.java8.chapter1.NonDuplicatedDigitInArray;
import org.junit.Test;

public class NonDuplicatedDigitInArrayTest {

	NonDuplicatedDigitInArray obj = new NonDuplicatedDigitInArray();

	@Test
	public void test() {
		// array elements duplicated only once.
		assertEquals(6, this.obj.getNonDuplicationDigitInArray(new int[] { 2, 2, 4, 5, 6, 5, 4 }));
		assertEquals(3, this.obj.getNonDuplicationDigitInArray(new int[] { 1, 1, 2, 2, 3, 4, 4 }));
	}
}
