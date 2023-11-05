import java.util.List;

public interface EmployeeInterface {

    //define method without body call save(employee)
    //to save given employee object return "ok" if save complete --- not complete --return error
    public String save(Employee employee);
    //define method without body call findAll()
    //return type list -> get all employees
    public List<Employee> findAll();
}
