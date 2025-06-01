package ASSIGNMENT4_1;
import java.time.LocalDate;
public class DeptEmployee {
    private String name;
    private LocalDate hireDate;
    private final double salary;


    public DeptEmployee(String name, LocalDate hireDate, double salary){
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return salary;
    }
   /* public double getSalary() {
        return salary;
    }*/

   /* public void setSalary(double salary) {
        this.salary = salary;
    }*/
}
