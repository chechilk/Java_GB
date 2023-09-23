package OOP.homeworkOOP.hw7FinalyWork.View;

import java.util.Scanner;

import OOP.homeworkOOP.hw7FinalyWork.Model.ComplexNumber;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void showText(String text) {
        System.out.println(text);
    }

    public int getMenuChoice(String text) {
        System.out.print(text);
        return scanner.nextInt();
    }

    public ComplexNumber getComplexNumber(String text1, String text2) {
        System.out.print(text1);
        double realPart = scanner.nextDouble();
        System.out.print(text2);
        double imaginaryPart = scanner.nextDouble();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void showResult(ComplexNumber result) {
        System.out.println("Результат: " + result.toString());
    }
}
