package manage.employee;

public class EmpoyeeReportFormatter extends ReportFormatter {
    public EmpoyeeReportFormatter(Employee employee, ReportFormat format) {
        super(employee, format);
    }

    public String getFormattedEmployee() {
       return super.getFormattedValue();
    }
}
