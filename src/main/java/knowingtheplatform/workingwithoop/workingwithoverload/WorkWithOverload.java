package knowingtheplatform.workingwithoop.workingwithoverload;

public class WorkWithOverload {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Mateus", "Rua Werner Goldberg", "Barueri", "SP", "Brazil");
        customer1.printCustomerAddress();

        Customer customer2 = new Customer("João");
        customer2.setCustomerAddress("Rua Carlos Chagas", "Cascavel", "Paraná");
        customer2.printCustomerAddress();

        Customer customer3 = new Customer();
        customer3.setName("Igor");
        customer3.setCustomerAddress("Av Brasil", "Jaraguá do Sul", "Santa Catarina");
        customer3.printCustomerAddress();

    }
}
