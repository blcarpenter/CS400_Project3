import java.util.List;

public class Edge2 extends Edge {
    int weight;
    Destinations target;
    public Edge2(Edge edge,List<DestinationsInterface> destinations) {
        this.weight = edge.weight;
        for(DestinationsInterface d: destinations){
            if(d.getName().equals(edge.target)){
                this.target = (Destinations)d;
            }
        }
    }
}
