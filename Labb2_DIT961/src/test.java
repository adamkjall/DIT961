public class test {





            //sellers.add(new Seller("Bob", new
            // Bid("bobs bid", 66)));
    public static void main(String[] args) {
        //PriorityQueue<Buyer> buyers = new PriorityQueue<>(Buyer::compareTo);
        PriorityQueue<Buyer> sellers = new PriorityQueue<>(Buyer::compareTo);

        sellers.add(new Buyer("Bob0", new Bid("bobs bid", 8)));
        sellers.add(new Buyer("Bob1", new Bid("bobs bid", 18)));
        sellers.add(new Buyer("Bob2", new Bid("bobs bid", 29)));
        sellers.add(new Buyer("Bob3", new Bid("bobs bid", 20)));
        sellers.add(new Buyer("Bob4", new Bid("bobs bid", 28)));
        sellers.add(new Buyer("Bob5", new Bid("bobs bid", 39)));
        sellers.add(new Buyer("Bob5", new Bid("bobs bid", 12)));

        while (sellers.size()>0) {

            System.out.println(sellers.minimum().toString());
            sellers.deleteMinimum();
        }
    }

}
