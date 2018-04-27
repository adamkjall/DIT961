public class Bid {
    final public String name;
    final public int bid;

    public Bid(String name, int bid) {
        this.name = name;
        this.bid = bid;
    }

    public int hashCode() {
        return 1 + 23*bid + 31*name.hashCode();
    }


    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Bid)) return false;

        Bid bid = (Bid) obj;

        // TODO: compare the objects
        return this.name == bid.name && this.bid == bid.bid;
    }

    public String getName() {
        return name;
    }

    public int getBid() {
        return bid;
    }

    public String toString(){
        // TODO: return a description of the bid
        return " " + name + " for " + bid + "kr";

    }
}
