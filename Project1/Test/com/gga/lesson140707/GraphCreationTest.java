package com.gga.lesson140707;


import java.awt.List;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GraphCreationTest {

	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{	Arrays.asList(new Object[][] {
						{3},
						{0, 1},
						{1, 2},
						{2, 0}
				}), 3
				}
		});
	}
	
	Graph g;
	private int _exceptedEdges;

	public GraphCreationTest(List<Object[]> graphData, int exceptedEdges) {
		_exceptedEdges = exceptedEdges;
		int vertices = (int) graphData.get(0)[0];
	    g = new Graph(vertices);
	    for (int i = 0; i < graphData.size(); i++) {
			int v = (int) graphData.get(i)[0];
			int w = (int) graphData.get(i)[1];
			g.addEdge(i, j);
		}
	    
	    
	}
	
	@Test
	public void test() {
		
	}

}
