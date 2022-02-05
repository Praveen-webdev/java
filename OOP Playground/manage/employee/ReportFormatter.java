package manage.employee;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object object, ReportFormat format) {
        switch (format) {
            case XML:
                this.formattedOutput=this.convertObjectToXML(object);
                break;
            case CSV:
            this.formattedOutput=this.convertObjectToCSV(object);
            default:
                break;
        }

    }

    private String convertObjectToXML(Object obj) {
        return "converted " + obj.toString() + " to XML";
    }

    private String convertObjectToCSV(Object obj) {
        return "converted " + obj.toString() + " to CSV";
    }

    public String getFormattedValue() {
        return formattedOutput;
    }
}
