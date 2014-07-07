package com.gga.lesson140707;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph {

	private final int _vertices;
	private int _edges; 
	final boolean [][] _adjancencyMatrix;
	
	public Graph(int vertices) {
		_vertices = vertices;
		_edges = 0;
		_adjancencyMatrix = new boolean [_vertices] [_vertices];
	}

	public int vertices() {
		return _vertices;
	}

	public void addEdge(int i, int j) {
		_adjancencyMatrix[i][j] = _adjancencyMatrix[j][i] = true;
        _edges++;
	}

	public int edges() {
		return _edges;
	}

	public boolean areConnected(int i, int j) {
		return _adjancencyMatrix[i][j];
	}

	public List<Integer> adj(int i) {
		List<Integer> vertices = new ArrayList<>();
		for (int j = 0; j < _adjancencyMatrix[i].length; j++) {
			if (_adjancencyMatrix[i][j]) {
				vertices.add(j);
			}
		}
		return vertices;
	}
	
}
