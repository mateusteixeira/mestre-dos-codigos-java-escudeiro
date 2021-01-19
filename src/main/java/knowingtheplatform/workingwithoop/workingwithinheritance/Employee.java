package knowingtheplatform.workingwithoop.workingwithinheritance;

public class Employee {

    private String name;
    private double payment;

    public Employee(String name, double payment) {
        this.name = name;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public double getPayment() {
        return payment;
    }

    protected double calculatePaymentWithBonus() {
        return this.payment * 0.1 + this.payment;
    }
}
