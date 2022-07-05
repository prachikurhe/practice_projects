package com.spring.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertTest {
	@Test
	 public void Test() {
		 boolean condn=true;
		 assertEquals(true, condn);
		 assertTrue(condn);
		// assertFalse(condn);
		 
		 
	 }

}
