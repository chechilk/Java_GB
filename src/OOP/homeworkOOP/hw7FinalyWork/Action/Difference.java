package OOP.homeworkOOP.hw7FinalyWork.Action;

import OOP.homeworkOOP.hw7FinalyWork.Controller.Operation;
import OOP.homeworkOOP.hw7FinalyWork.Model.ComplexNumber;

/**
 * Класс для выполнения операции сложения комплексных чисел
 */
public class Difference implements Operation {
    /**
     * Метод для выполнения операции разности двух комплексных чисел
     *
     * @param a первое комплексное число
     * @param b второе комплексное число
     * @return результат вычитания двух комплексных чисел
     */
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }
}
