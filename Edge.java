public class Edge implements Comparable<Edge> {
    public String target;
    public int weight;

    public Edge(String target, int weight) {
        this.target = target;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge edge) {
        if(this.weight> edge.weight){
            return 1;
        }else if(this.weight<edge.weight){
            return -1;
        }else{
            return 0;
        }
    }
}