
public class TestTwo extends Animal{
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.fullName = "Hrisha";
        employee.age = 12;
        employee.mobile = "0771234532";
        employee.setFullName("deee");

        System.out.println(employee.getFullName());
        animalSound();
       
    }
    
}
class Employee {
    String fullName;
    String callingName;
    Integer age;
    String nic;
    String mobile;

    //getter - return
    public String getFullName() {
        return fullName;
    }
    //setter - void
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}


abstract class Animal{
    public static void  animalSound(){
        System.out.println("wwwwww");
    }
}