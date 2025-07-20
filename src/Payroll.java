import java.sql.*;

import static java.time.chrono.JapaneseEra.values;

public class Payroll {
    Connection connection;
    Statement statement;
    private String url = "jdbc:postgresql://localhost:5432/payroll";
    private String username = "postgres";
    private String password = "123456";

    public Payroll() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "insert into employee(name,department,salary) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, employee.getName());
        statement.setString(2, employee.getDepartment());
        statement.setDouble(3, employee.getSalary());
        System.out.println("-----------------/n" + statement);
        statement.executeUpdate();
        System.out.println("employee successfully added");
    }
}
