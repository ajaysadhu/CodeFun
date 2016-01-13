package com.saiyan;

public class Vertex implements Comparable<Vertex> {

	public String name;
	public Edge[] adjacencies;
	public Double minDistance=Double.POSITIVE_INFINITY;
	public Vertex previous;
	public Vertex(String name){
		this.name= name;
	}
	public String getName(){
		return name;
	}
	
	@Override
	public int compareTo(Vertex other) {
		
		return Double.compare(minDistance, other.minDistance);
	}

}
