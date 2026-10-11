package instructor;
import student.Person;
public class Instructor extends Person{
    private String employeeNumber;

    // No-arg constructor
    public Instructor() {
        super();
        this.employeeNumber = "";
    }

    // Initialization constructor
    public Instructor(String firstName, String lastName, String phone, String email, String employeeNumber) {
        super(firstName, lastName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    // Accessor methods
    public String getEmployeeNumber() { return employeeNumber; }
    public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }

    // 1. trim whitespace and remove internal spaces
    public String cleanEmployeeNumber() {
        if (employeeNumber == null) return null;
        return employeeNumber.trim().replaceAll("\\s+", "");
    }

    // 4. summaryLine using String.format
    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                employeeNumber, lastName, firstName);
    }

    // 6. toCard using StringBuilder
    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("Employee #: ").append(employeeNumber).append("\n");
        sb.append("Name      : ").append(lastName).append(", ").append(firstName).append("\n");
        sb.append("Email     : ").append(email).append("\n");
        sb.append("Phone     : ").append(phone);
        return sb.toString();
    }

    // 8. displayName handling nulls safely
    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null && !firstName.trim().isEmpty()) {
            sb.append(firstName.trim());
        }
        if (lastName != null && !lastName.trim().isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" "); // Add space if firstName was appended
            }
            sb.append(lastName.trim());
        }
        return sb.toString();
    }

    public String toString() {
        return "Instructor [" + super.toString() + ", employeeNumber=" + employeeNumber + "]";
    }
}
