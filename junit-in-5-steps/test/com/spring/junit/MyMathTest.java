package com.spring.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyMathTest {
	// MyMath.sum
	// 1,2,3=>6
	
	@BeforeEach
	public void before() {
		System.out.println("before");
	}
	@AfterEach
	public void after() {
		System.out.println("after");
	}
	@BeforeAll
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	@AfterAll
	public static void afterClass() {
		System.out.println("afterClass");
	}
	@Test
	public void sum_with3numbers() {
		MyMath myMath = new MyMath();
		System.out.println("Test1");
		int result1 = myMath.sum(new int[] { 1, 2, 3 });
		assertEquals(6, result1);
	}

	@Test
	public void sum_with1numbers() {
		MyMath myMath = new MyMath();
		System.out.println("Test2");
		int result2 = myMath.sum(new int[] { 3 });
		assertEquals(3, result2);

	}

}
