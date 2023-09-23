package OOP.homeworkOOP.hw7FinalyWork;

import java.util.Scanner;
import OOP.homeworkOOP.hw7FinalyWork.Controller.Calculator;
import OOP.homeworkOOP.hw7FinalyWork.Model.ComplexNumber;
import OOP.homeworkOOP.hw7FinalyWork.Model.Decorator;
import OOP.homeworkOOP.hw7FinalyWork.Model.OperationFactory;
import OOP.homeworkOOP.hw7FinalyWork.View.Message;
import OOP.homeworkOOP.hw7FinalyWork.View.View;

/**
 * Основной класс приложения, реализующий взаимодействие с пользователем и вызов
 * операций калькулятора.
 */
public class Main{
    /**
     * Объект класса Scanner для ввода данных с консоли.
     */
    public Scanner scanner = new Scanner(System.in);

    /**
     * Метод main, точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Создание объектов View и Calculator
        View view = new View();
        Calculator calculator = new Calculator();

        int choice = 0;
        while (choice != 4) {
            // Вывод меню на экран и получение выбора пользователя
            view.showText(Message.START_MENU);
            choice = view.getMenuChoice(Message.CHOICE);

            // Выбор операции в зависимости от выбора пользователя
            switch (choice) {
                case 1:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // сложения
                    ComplexNumber num1 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    ComplexNumber num2 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("сложение")));
                    ComplexNumber sum = calculator.execute(num1, num2);
                    break;
                case 2:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // вычитания
                    ComplexNumber num3 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    ComplexNumber num4 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("вычитание")));
                    ComplexNumber dif = calculator.execute(num3, num4);
                    break;
                case 3:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // произведения
                    ComplexNumber num5 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    ComplexNumber num6 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("умножение")));
                    ComplexNumber prod = calculator.execute(num5, num6);
                    break;
                case 4:
                    // Получение двух комплексных чисел от пользователя и выполнение операции
                    // деления
                    ComplexNumber num7 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    ComplexNumber num8 = view.getComplexNumber(Message.GET_IMAGINARY_NUM,Message.GET_REAL_NUM);
                    calculator.setOperation(new Decorator(OperationFactory.createOperation("деление")));
                    ComplexNumber div = calculator.execute(num7, num8);
                    break;
                case 5:
                    // Вывод сообщения о выходе из программы
                    view.showText(Message.EXIT);
                    break;
                default:
                    // Вывод сообщения об ошибке при некорректном выборе пользователя
                    view.showText(Message.ERROR);
            }
        }
    }
}
