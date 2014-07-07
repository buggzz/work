package com.gga.lesson140707;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTestBadCases {

	Graph g;
	
	@Test(expected = RuntimeException.class)
	public void testNegativeVertices() throws Exception {
		g = new Graph(-10);
	}
	
	@Test
	public void testNegativeVertices2() throws Exception {
		try {
			g = new Graph(-10);
			fail("should throw exception!");
		} catch (Exception e) {

		}
	}
	
}
