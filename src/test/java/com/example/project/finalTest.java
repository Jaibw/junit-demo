package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class finalTest {

	@Test
	@DisplayName("Final test!")
	void myFinalTest(TestInfo testInfo) {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.add(1, 1), "1 + 1 should equal 3");
	
	}

}