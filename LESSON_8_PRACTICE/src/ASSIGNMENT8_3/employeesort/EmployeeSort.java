package ASSIGNMENT8_3.employeesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

    public static void main(String[] args) {
        new EmployeeSort();
    }

    public EmployeeSort() {
        Employee[] empArray = {
                new Employee("George", 40000, 1996, 11, 5),
                new Employee("Dave", 50000, 2000, 1, 3),
                new Employee("Richard", 45000, 2001, 2, 7)
        };

        List<Employee> empList = Arrays.asList(empArray);
        NameComparator nameComp = new NameComparator();
        empList.sort(nameComp);
        System.out.println("With NameComparator");
        System.out.print(empList);
        System.out.println("\n------------------------------------------");

        SalaryComparator salComp = new SalaryComparator();
        System.out.println("\nWith SalaryComparator");
        Collections.sort(empList, salComp);
        System.out.print(empList);
        System.out.println("\n------------------------------------------");

        HireDateComparator hireDateComp = new HireDateComparator();
        System.out.println("\nWith HireDateComparator");
        Collections.sort(empList, hireDateComp);
        System.out.print(empList);
    }

}
