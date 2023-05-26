package dzien5.baza;

import dzien5.baza.model.Employee;
import dzien5.baza.service.EmployeeService;

import java.sql.Connection;
import java.util.Date;

public class BazaDanych {

    private static final EmployeeService empService = new EmployeeService();
    public static void main(String[] args) {
        Connection connection = Connector.getConnection();
        System.out.println(connection);

        System.out.println(empService.findAll());

        Employee employee = new Employee(300L, "Pracownik", "Pracujacy", "ppracujacy",
                "123.123", new Date(), "IT_PROG", 15000.0, 0.0, 100L, 60L
        );

        empService.createEmployee(employee);
    }
}
