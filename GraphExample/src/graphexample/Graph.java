/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphexample;

import java.util.ArrayList;

public class Graph {
   ArrayList<Node> nodes; 
   ArrayList<Edge> edges;
   
   public Graph(){
       this.nodes = new ArrayList<Node>();
        this.edges = new ArrayList<Edge>();
   }
   
   public void addNode(int id){
       nodes.add(new Node(id));
   }
   
   public void addEdge(int start,int finish){ 
       edges.add(new Edge(start,finish));
   }
   
   public void printNeighbours() {
    for (Node node : nodes) {
        System.out.print( node.id +" ID'li Dugumun" + " Komsulari: ");
        for (Edge edge : edges) {
            if (edge.start == node.id) {
                System.out.print(edge.finish + " ");
            }
        }
        System.out.println();
    }
}
   

}
