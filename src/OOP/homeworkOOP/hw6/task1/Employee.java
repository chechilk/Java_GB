package OOP.homeworkOOP.hw6.task1;

import java.util.Date;

public class Employee extends Calculate {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo(){
        return "name - " + name + ", dob - " + dob.toString() + ", baseSalary - " + calculateNetSalary(baseSalary);
    }
}