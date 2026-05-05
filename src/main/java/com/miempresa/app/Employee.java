public class Employee {

    private String name;
    private int years;

    /**
     * Constructor de Employee
     * @param name nombre del empleado
     * @param years años en la empresa
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }
}
