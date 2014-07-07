package com.gga.lesson140707;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GraphTest2 {

	static {
	    System.out.println("static init");	
	}
	
	{
		System.out.println("instance init");
	}
	
	public GraphTest2() {
	    System.out.println("constructor");	
	}
	
	Graph g;
	
	@BeforeClass
	public static void setupClass() throws Exception {
		System.out.println("setupClass (beforeClass)");
		
	}
	
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("tearDownClass (afterClass)");
		
	}
	
	
	@Before
	public void setup() {
		System.out.println("setup (before)");
		g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("test1");
		
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("test2");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown (after)");
	}
}
