package org.rip.dijsktra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dijskras2 {

	public static void main(String[] args) {
		// https://hu.wikipedia.org/wiki/Dijkstra-algoritmus#/media/F%C3%A1jl:Dijkstra_Animation.gif
		Graph g = new Graph();
		// from where To where and how much it costs
		g.addVertex('1', Arrays.asList(new Vertex('2', 7), new Vertex('3', 9), new Vertex('6', 14)));
		g.addVertex('2', Arrays.asList(new Vertex('1', 7), new Vertex('3', 10), new Vertex('4', 15)));
		g.addVertex('3', Arrays.asList(new Vertex('1', 9), new Vertex('2', 10), new Vertex('4', 11), new Vertex('6', 2)));
		g.addVertex('4', Arrays.asList(new Vertex('2', 15), new Vertex('3', 11), new Vertex('5', 6)));
		g.addVertex('5', Arrays.asList(new Vertex('4', 6), new Vertex('6', 9)));
		g.addVertex('6', Arrays.asList(new Vertex('1', 14), new Vertex('3', 2), new Vertex('5', 9)));
		// find the shortest way
		List<Character> list = g.getShortestPath('1', '5');
		list.add('1');
		Collections.reverse(list);
		System.out.println(list);
	}
}
