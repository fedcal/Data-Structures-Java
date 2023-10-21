package federicocalo.datastructure.graph;


public class Edge {
    private Vertex startV;
    private Vertex endV;
    private int weight;
    private String nameEdge;

    public Edge(Vertex startV, Vertex endV, Integer weight, String nameEdge){
        this.startV = startV;
        this.endV = endV;
        this.weight = weight;
        this.nameEdge = nameEdge;
    }

    public Vertex getStartV() {
        return startV;
    }

    public void setStartV(Vertex startV) {
        this.startV = startV;
    }

    public Vertex getEndV() {
        return endV;
    }

    public void setEndV(Vertex endV) {
        this.endV = endV;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNameEdge() {
        return nameEdge;
    }

    public void setNameEdge(String nameEdge) {
        this.nameEdge = nameEdge;
    }
}
