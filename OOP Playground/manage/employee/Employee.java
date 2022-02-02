package manage.employee;

public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    public Employee(long id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + ", id=" + id + ", name=" + name + ", working=" + working + "]";
    }
    
    

}
