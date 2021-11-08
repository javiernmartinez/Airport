package Airport;

public class Flight {
    private String id;
    private String destination;
    private int cost;
    private int length;

    public Flight (String id, String destination, int cost, int length){
        this.id = id;
        this.destination = destination;
        this.cost = cost;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
