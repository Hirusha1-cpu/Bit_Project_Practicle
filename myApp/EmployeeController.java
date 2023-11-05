import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeController implements EmployeeInterface{

    List<Employee> allEmployees = new ArrayList<>();
    @Override
    public String save(Employee employee) {
        allEmployees.add(employee);
        return "OK";
    }

    @Override
    public List<Employee> findAll() {
        Employee employeeKamal = new Employee("Kamal", "kamal", "991661700V", LocalDate.of(1999,06 ,14 ),"0775371591",BigDecimal.valueOf(500000));
        allEmployees.add(employeeKamal);
        Employee employeeAamal = new Employee("Aamal", "Aamal", "991661701V", LocalDate.of(1999,06 ,15 ),"0775371591",BigDecimal.valueOf(500000));
        allEmployees.add(employeeAamal);
        Employee employeeTamal = new Employee("Tamal", "Tamal", "991661702V", LocalDate.of(1999,06 ,16 ),"0775371591",BigDecimal.valueOf(500000));
        allEmployees.add(employeeTamal);
        // employeeKamal.setFullName(null);
        // employeeKamal.setCallingName(null);
        // employeeKamal.setDateOfBirth(null);
        // employeeKamal.setNic(null);
        // employeeKamal.setMobile(null);
        // employeeKamal.setSalary(null);

        return allEmployees;
    }
    
}
