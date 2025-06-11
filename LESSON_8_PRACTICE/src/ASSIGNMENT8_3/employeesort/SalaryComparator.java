package ASSIGNMENT8_3.employeesort;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() > e2.getSalary())
            return 1;
        else if(e1.getSalary() < e2.getSalary())
            return -1;

        else {
            if (e1.getName().compareTo(e2.getName()) != 0)
                return e1.getName().compareTo(e2.getName());

            return e1.getHireDate().compareTo(e2.getHireDate());
        }

    }
    }

