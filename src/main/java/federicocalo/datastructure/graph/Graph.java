package federicocalo.datastructure.graph;

import federicocalo.datastructure.customexception.DataStructureRunTimeException;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected){
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public ArrayList<Vertex> addVertex (ArrayList<Vertex> vertices){
        return this.vertices = vertices;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight,String nameEdge){
        if(!this.isWeighted && weight != null){
            new DataStructureRunTimeException("The graph is not weighted");
        }
        vertex1.addEdge(vertex2,weight,nameEdge);
        if(!this.isDirected){
            vertex2.addEdge(vertex1,weight,nameEdge);
        }
    }
    public void removeEdge(Vertex vertex1,Vertex vertex2){
        vertex1.removeEdge(vertex2);
        if(!this.isDirected){
            vertex2.removeEdge(vertex1);
        }
    }

    public void removeVertex(Vertex vertex){
        this.vertices.remove(vertex);
    }

    public ArrayList<Vertex> getVertices(){
        return this.vertices;
    }

    public boolean isWeighted(){
        return this.isWeighted;
    }

    public boolean isDirected(){
        return this.isDirected;
    }

    public Vertex getVertexByValue(String value){
        for (Vertex v: this.vertices){
            if(v.getData().equals(value)){
                return null;
            }
        }
        return null;
    }
}
