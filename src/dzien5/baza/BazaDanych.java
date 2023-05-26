package dzien5.baza;

import dzien5.baza.service.EmployeeService;

import java.sql.Connection;
public class BazaDanych {

    private static final EmployeeService empService = new EmployeeService();
    public static void main(String[] args) {
        Connection connection = Connector.getConnection();
        System.out.println(connection);

        System.out.println(empService.findAll());
    }
}
