package knowingtheplatform.workingwithoop.workingwithinheritance;

public class Manager extends Employee{

    public Manager(String name, double payment) {
        super(name, payment);
    }

    @Override
    protected double calculatePaymentWithBonus() {
        return this.getPayment() * 0.6 + this.getPayment();
    }
}
