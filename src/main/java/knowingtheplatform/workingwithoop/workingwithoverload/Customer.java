package knowingtheplatform.workingwithoop.workingwithoverload;

public class Customer {

    private String name;
    private String address;
    private String city;
    private String state;
    private String country;

    public Customer(String name, String address, String city, String state, String country) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Customer(String name) {
        this.name = name;
        this.country = "Brazil";
    }

    public Customer() {
        this.country = "Brazil";
    }

    public void setCustomerAddress(String address, String city, String state, String country) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void setCustomerAddress(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public void printCustomerAddress() {
        System.out.println("Customer: " + this.name + "\naddress: " + this.address + "\ncity: " + this.city + "\nstate: " + this.state + "\ncountry: " + this.country);
    }

    public void setName(String name) {
        this.name = name;
    }
}
