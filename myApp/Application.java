import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Application {
    Scanner newScanner = new Scanner(System.in);
    EmployeeController employeeController = new EmployeeController();

    public Application() {
        generateEmployee();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Application();

    }

    public void generateEmployee() {
        System.out.println("******************************");
        System.out.println("*************Employee Management*****************");
        System.out.println("******************************");
        System.out.println("[1] --Add New Employee");
        System.out.println("[2] --View All Employee");
        String userResponse = newScanner.nextLine();

        if (userResponse.equals("1")) {
            generateEmployeeForm();
        } else {
            generateEmployeeTable();

        }
    }

    public void generateEmployeeForm() {
        System.out.println("******************************");
        System.out.println("*************Employee Management Form*****************");
        System.out.println("******************************");
        Employee newEmployee = new Employee();

        System.out.println("Enter Full Name :");
        String fullName = newScanner.nextLine();
        newEmployee.setFullName(fullName);

        System.out.println("Enter Calling Name :");
        String callingName = newScanner.nextLine();
        newEmployee.setCallingName(callingName);
        // newEmployee.setAge(Integer.valueOf(age));

        System.out.println("Enter Salary :");
        String salary = newScanner.nextLine();
        newEmployee.setSalary(BigDecimal.valueOf(Double.valueOf(salary)));

        System.out.println("Enter DOB (yyyy-mm-dd) :");
        String DOB = newScanner.nextLine(); // 1999-12-12
        String[] dobParts = DOB.split("-");
        newEmployee.setDateOfBirth(
                LocalDate.of(Integer.valueOf(dobParts[0]), Integer.valueOf(dobParts[1]), Integer.valueOf(dobParts[2])));

        System.out.println("Enter Mobile :");
        String mobile = newScanner.nextLine();
        newEmployee.setMobile(mobile);

        System.out.println("Enter Nic :");
        String nic = newScanner.nextLine();
        newEmployee.setNic(nic);

        System.out.println("******************************");
        System.out.println("[1] - yes");
        System.out.println("[2] - no");
        System.out.println("*************Are You Sure to add this employee...? *****************");
        System.out.println("******************************");
        String userResponse = newScanner.nextLine();
        if (userResponse.equals("1")) {
            String serverResponse = employeeController.save(newEmployee);
            if (serverResponse.equals("OK")) {
                System.out.println("******************************");
                System.out.println("************* Save Successfully *****************");
                System.out.println("******************************");
                generateEmployee();
            } else {
                System.out.println("******************************");
                System.out.println("************* Save Not Successfully *****************");
                System.out.println("******************************");
            }
        }

    }

    public void generateEmployeeTable() {

        List<Employee> employeeList = employeeController.findAll();
        System.out.println("******************************");
        System.out.println("*************Employee Management Table*****************");
        System.out.println("******************************");
        System.out.println("Full Name *** Callin Name *** Mobile **** DOB *** Nic *** Salary");
        for (Employee employee : employeeList) {
            System.out.println(employee.getFullName() + " " + employee.getCallingName() + " " + employee.getMobile()
                    + " " + employee.getNic() + " " + employee.getSalary());
        }
        System.out.println("************");
        generateEmployee();
    }
}
