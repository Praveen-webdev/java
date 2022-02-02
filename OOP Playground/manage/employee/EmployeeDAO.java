package manage.employee;

public class EmployeeDAO {

    public void saveEmployee(Employee emp) {
        // Database connectionManager=new Database();
        // connectionManager.connect();
        // connectionManager.getConnectionObject.prepareStatement("insert into
        // employee_tbl");
        // connectionManager.disconnect();
        System.out.println(emp + " is Saved to the database");
    }

    public void deleteEmployee(Employee emp) {
        System.out.println(emp.toString() + " is deleted from the database");
    }
}
