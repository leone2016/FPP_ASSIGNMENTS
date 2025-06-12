package ASSIGNMENT8_3.employeesort;

import java.util.Collections;
import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getHireDate().compareTo(e2.getHireDate()) != 0) {
            return e1.getHireDate().compareTo(e2.getHireDate());
        }


        if (e1.getName().compareTo(e2.getName()) != 0) {
            return e1.getName().compareTo(e2.getName());
        }


        if (e1.getSalary() < e2.getSalary()) return -1;
        else if (e1.getSalary() > e2.getSalary()) return 1;
        else return 0;
    }
}
