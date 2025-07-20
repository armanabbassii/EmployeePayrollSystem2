import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        Employee employee = new Employee(0,"ali", "math", 2000.5);
        Payroll payroll = new Payroll();
        payroll.addEmployee(employee);
        System.out.println("employee added");
        }
    }
