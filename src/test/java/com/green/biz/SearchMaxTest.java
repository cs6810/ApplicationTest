package com.green.biz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchMaxTest {
	
	
	@Test
	public void test() {
	assertEquals(4,CalcUtil.searchMax(new int[] {1, 3, 4, 2}));
	assertEquals(-1,CalcUtil.searchMax(new int[] {-12, -1, -4, -2}));
}
}