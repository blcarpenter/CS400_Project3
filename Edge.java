/**
 * // --== CS400 File Header Information ==--
 * // Name: Alexander Dudin
 * // Email: dudin@wisc.edu
 * // Team: Red
 * // Group: GG
 * // TA: Surabhi
 * // Lecturer: Gary Dahl
 * // Notes to Grader: n/a
 */
public class Edge implements Comparable<Edge> {
    public String target;
    public int weight;

    public Edge(String target, int weight) {
        this.target = target;
        this.weight = weight;
    }

    public Edge() {
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