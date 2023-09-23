package OOP.homeworkOOP.hw6.task1;

public class Calculate {
    // private int baseSalary;
    public int calculateNetSalary(int baseSalary){
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}
