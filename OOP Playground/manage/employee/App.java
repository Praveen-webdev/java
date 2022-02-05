package manage.employee;

public class App {
    public static void main(String[] args) {
        Employee praveen=new Employee(1, "Praveen", "Doctor" , true);
        // hireNewEmployee(praveen);
        // terminateEmployee(praveen);
        printEmployeeReport(praveen, ReportFormat.CSV);
        
    }
    public static void hireNewEmployee(Employee emp){
        EmployeeDAO dao=new EmployeeDAO();
        dao.saveEmployee(emp);
    }
    public static void terminateEmployee(Employee emp){
        EmployeeDAO dao=new EmployeeDAO();
        dao.deleteEmployee(emp);
    }
    public static void printEmployeeReport(Employee emp,ReportFormat format){
        EmpoyeeReportFormatter formatter=new EmpoyeeReportFormatter(emp,format);
        System.out.println(formatter.getFormattedEmployee()); ;  
    }
}
