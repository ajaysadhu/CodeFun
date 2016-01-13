package com.saiyan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import org.omg.PortableServer.AdapterActivator;

public class Dijiktras {


	public static void computePaths(Vertex source){
		source.minDistance=0.0;
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		vertexQueue.add(source);

		while(!vertexQueue.isEmpty()){
			Vertex u = vertexQueue.poll();
			System.out.println(u.getName());
			if(u.adjacencies !=null){
				for(Edge e: u.adjacencies){
					//System.out.println(u.getName());
					Vertex v=e.getTarget();
					double weight = e.getWeight();
					double distanceThroughU = u.minDistance+weight;

					if(distanceThroughU < v.minDistance){
						
						vertexQueue.remove(u);
						v.minDistance=distanceThroughU;
						v.previous=u;
						vertexQueue.add(v);
					}
				}
			}
		}
	}

	public static List<String> getShortestPathTo(Vertex target){
		List<String> path = new ArrayList<String>();
		for(Vertex vertex = target; vertex!=null ;vertex = vertex.previous)
			path.add(vertex.getName());
		Collections.reverse(path);
		return path;
	}
	
	public static void main(String[] args) {
		char str='A';
		System.out.println((int) str);
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D= new Vertex("D");
		Vertex E = new Vertex("E");
		/*Vertex M = new Vertex("M");
		Vertex O = new Vertex("O");
		Vertex Z = new Vertex("Z");
		Vertex P = new Vertex("P");
		Vertex J = new Vertex("J");
		Vertex D = new Vertex("D");


		 */
		A.adjacencies = new Edge[]{  new Edge(C, 2), new Edge(B, 4)};
		
		for(Edge e: A.adjacencies){
			System.out.println(e.getWeight());
		}
		B.adjacencies = new Edge[] {new Edge(D,2), new Edge(E, 3), new Edge(C, 3)};
		C.adjacencies = new Edge[]{new Edge(B,1), new Edge(E, 5), new Edge(D, 4)};
		E.adjacencies = new Edge[]{new Edge(D,1)};	
		computePaths(A);
		System.out.println("Distance from A to E: "+E.minDistance);
		List<String> path = getShortestPathTo(E);
		System.out.println("Path: "+path);
	}

}
