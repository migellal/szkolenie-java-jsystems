package dzien5.baza.service;

import dzien5.baza.Connector;
import dzien5.baza.model.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public List<Employee> findAll() {
        List<Employee> list = new ArrayList<>();
        String sql = "select EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL," +
                "PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT," +
                "MANAGER_ID,DEPARTMENT_ID from employees";
        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while (rows.next()) {
                Employee emp = new Employee(
                        rows.getLong(1),
                        rows.getString(2),
                        rows.getString(3),
                        rows.getString(4),
                        rows.getString(5),
                        rows.getDate(6),
                        rows.getString(7),
                        rows.getDouble(8),
                        rows.getDouble(9),
                        rows.getLong(10),
                        rows.getLong(11)
                );
                list.add(emp);
            }
            statement.close();
            rows.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void createEmployee(Employee employee) {
        String sql = "insert into employees (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL," +
                "PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT," +
                "MANAGER_ID,DEPARTMENT_ID) values (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = Connector.getConnection().prepareStatement(sql);
            ps.setLong(1, employee.getEmployeeId());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getLastName());
            ps.setString(4, employee.getEmail());
            ps.setString(5, employee.getPhoneNumber());
            ps.setDate(6, new java.sql.Date(employee.getHireDate().getTime()));
            ps.setString(7, employee.getJobId());
            ps.setDouble(8, employee.getSalary());
            ps.setDouble(9, employee.getCommissionPct());
            ps.setLong(10, employee.getManagerId());
            ps.setLong(11, employee.getDepartmentId());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
