package knowingtheplatform.workingwithoop.workingwithinheritance;

public class WorkWithInheritance {

    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 5000);
        System.out.println("Manager payment with bonus: " + manager.calculatePaymentWithBonus());

        Employee employee = new Employee("SomeEmployee", 5000);
        System.out.println("Employee payment with bonus: " + employee.calculatePaymentWithBonus());

        Developer developer = new Developer("Developer", 5000);
        System.out.println("Developer payment with bonus: " + developer.calculatePaymentWithBonus());
    }
}
