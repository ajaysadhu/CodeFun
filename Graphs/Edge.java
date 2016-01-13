package com.saiyan;

public class Edge {
	private Vertex target;
	private double weight;

	public Edge(Vertex targetNode, double edgeWeight){
		target=targetNode;
		weight = edgeWeight;
	}
	public Vertex getTarget()
	{
		return target;
	}
	public double getWeight(){
		return weight;
	}

}
