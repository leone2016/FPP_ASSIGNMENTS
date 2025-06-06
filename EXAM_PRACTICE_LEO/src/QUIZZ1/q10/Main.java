package QUIZZ1.q10;

public class Main {

    String managerInfo = (new Employee("Leonardo", 10000)
    {
        double bonus;
        {
            bonus = 0.5;
        }

        int computeSalaryWithBonus(){
            return (int)(getSalary() * (1 + bonus));
        }

        @Override
        public String toString() {
            return "Name: " + getName() + "\n" +
                    "Base Salary: " + getSalary()+ "\n" +
                    "bonus: " + bonus + "\n" +
                    "actual Salary: " + computeSalaryWithBonus();
        }
    }
    ).toString();
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.managerInfo+"\n\n");
    }
}
