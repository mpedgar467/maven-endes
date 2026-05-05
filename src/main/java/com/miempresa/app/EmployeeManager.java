import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona empleados del sistema
 * @author Mario
 * @version 1.0
 */
public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    /**
     * Añade un empleado al sistema
     * @param name nombre del empleado
     * @param years años en la empresa
     */
    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years));
        System.out.println(name + " added to the system.");
    }

    /**
     * Imprime todos los empleados
     */
    public void printEmployees() {
        System.out.println("List of employees:");

        for (Employee emp : employees) {
            System.out.println(emp.getName() + ", Years in company: " + emp.getYears());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }
}