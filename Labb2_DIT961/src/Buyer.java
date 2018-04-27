public class Buyer implements Comparable<Buyer> {

    String name;
    Bid bid;

    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Bengt", new Bid("Bengt", 40));
        Buyer buyer2 = new Buyer("Göran", new Bid("Göran", 50));

        System.out.println(buyer1.compareTo(buyer2));

    }

    public Buyer(String name, Bid bid) {
        this.name = name;
        this.bid = bid;
    }


    @Override
    public int compareTo(Buyer other) {
        if(bid.getBid() < other.bid.getBid() ) return 1;
        if(bid.getBid() == other.bid.getBid()) return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", bid=" + bid +
                '}';
    }
}
