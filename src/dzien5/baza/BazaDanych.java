package dzien5.baza;

import dzien5.baza.model.Employee;
import dzien5.baza.service.EmployeeService;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BazaDanych {

    private static final EmployeeService empService = new EmployeeService();
    public static void main(String[] args) {
        Connection connection = Connector.getConnection();
        System.out.println(connection);

        List<Employee> allEmployees = empService.findAll();
        System.out.println(allEmployees);

//        Employee employee = new Employee(300L, "Pracownik", "Pracujacy", "ppracujacy",
//                "123.123", new Date(), "IT_PROG", 15000.0, 0.0, 100L, 60L
//        );
//
//        empService.createEmployee(employee);
//        jobId -> "IT_PROG"
        // znajdź wszystkich pracowników pracującyh w dziale IT, oraz zsumuj ich miesięczne zarobki -> to daje informacje ile kosztuje utrzymanie działu IT na miesiąć
        // policz ile pensja prezesa wynosi procentowo wzgledem kosztów całej firmy // tylko procent
        // zwroc listę imion i nazwisk jako jeden String - listę wszystkich którzy zostali zatrudnieni w lutym // List<String> urodziny; "James Marlow", "Hazel Philtanker"

        double sumItProg = allEmployees.stream()
                .filter(e -> e.getJobId().equalsIgnoreCase("IT_PROG"))
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println(sumItProg);

        double sumAllEmployees = allEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        double sumPrezes = allEmployees.stream()
                .filter(e -> e.getJobId().equalsIgnoreCase("AD_PRES"))
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println(sumPrezes/sumAllEmployees*100);

        List<String> zatrudnienie = allEmployees
                .stream()
                .filter(e -> e.getHireDate().getMonth() == Calendar.FEBRUARY)
                .map(e -> e.getFirstName() + " " + e.getLastName() + "\n")
                .toList();

        System.out.println(zatrudnienie);
    }
}
