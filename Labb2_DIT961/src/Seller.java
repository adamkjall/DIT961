public class Seller implements Comparable<Seller> {

    String name;
    Bid bid;

    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Bengt", new Bid("Bengt", 60));
        Buyer buyer2 = new Buyer("Göran", new Bid("Göran", 50));

        buyer1.compareTo(buyer2);

    }

    public Seller(String name, Bid bid) {
        this.name = name;
        this.bid = bid;
    }


    @Override
    public int compareTo(Seller other) {
        if(bid.getBid() < other.bid.getBid() ) return 1;
        if(bid.getBid() == other.bid.getBid()) return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "bid=" + bid +
                '}';
    }
}