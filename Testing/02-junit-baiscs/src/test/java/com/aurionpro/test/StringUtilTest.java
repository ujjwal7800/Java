package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.StringUtil;

class StringUtilTest {
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testTruncateInFirstTwoPositions() {
		String input = "AASD,ASD,SDwe";
		String expectedOutput = "SD";
		String result = StringUtil.trancateInFirst2Position(input);
		assertEquals(expectedOutput, result);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersSameWithSameCharacters() {
		String input = "ASDAS";
		boolean result = StringUtil.areFirstAndLastTwoCharactersSame(input);
		assertTrue(result);
	}
}
