package federicocalo.datastructure.graph;



import java.util.ArrayList;

public class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String data){
        this.data = data;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endVertex, Integer weight,String nameEdge){
        this.edges.add(new Edge(this,endVertex,weight,nameEdge));
    }
    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEndV().equals(endVertex));
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
