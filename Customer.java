public class Customer{

    private String name;
    private int rating;
    private String address;

    public Customer(String name, int rating, String address) {
        this.name = name;
        this.rating = rating;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public int compareTo(Customer o){
        return this.name.compareTo(o.getName());
    }
}
