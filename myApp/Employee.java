import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private String fullName;
    private String callingName;
    private String nic;
    private LocalDate dateOfBirth;
    private String mobile;
    private BigDecimal salary;

    //all constructor(all properties)
   
    public Employee(String fullName, String callingName, String nic, LocalDate dateOfBirth, String mobile, BigDecimal salary) {
        this.fullName = fullName;
        this.callingName= callingName;
        this.nic = nic;
        this.dateOfBirth= dateOfBirth;
        this.mobile = mobile;
        this.salary = salary;

    }
    public Employee() {
    }
    //fullname
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    //calling name
    public String getCallingName() {
        return callingName;
    }
    public void setCallingName(String callingName) {
        this.callingName = callingName;
    }
    //nic
    public String getNic() {
        return nic;
    }
    public void setNic(String nic) {
        this.nic = nic;
    }
    //date
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    //mobile
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    //salary 
     public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public void setDateOfBirth(String dOB) {
    }

}
