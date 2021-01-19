package knowingtheplatform.workingwithoop.workingwithinheritance;

public class Developer extends Employee{

    public Developer(String name, double payment) {
        super(name, payment);
    }

    @Override
    protected double calculatePaymentWithBonus() {
        return this.getPayment() * 0.3 + this.getPayment();
    }
}
