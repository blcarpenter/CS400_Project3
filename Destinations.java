import java.util.List;

public class Destinations implements DestinationsInterface {
    public  List<Edge> destinationsLeaving;
    private String name;

    public Destinations(List<Edge> destinationsLeaving, String name) {
        this.destinationsLeaving = destinationsLeaving;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public List<Edge> destinationsLeaving() {
       return destinationsLeaving;
    }
    @Override
    public String toString(){
        return name+"\n";
    }


}
