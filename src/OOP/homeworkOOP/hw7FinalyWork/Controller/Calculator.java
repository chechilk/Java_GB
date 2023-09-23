package OOP.homeworkOOP.hw7FinalyWork.Controller;

import OOP.homeworkOOP.hw7FinalyWork.Model.ComplexNumber;

/**
 * Класс, представляющий калькулятор для работы с комплексными числами
 */
public class Calculator {
    private Operation operation;

    /**
     * Метод для установки операции, которую нужно выполнить
     *
     * @param operation операция, которую нужно выполнить
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * Метод для выполнения операции над двумя комплексными числами
     *
     * @param a первое комплексное число
     * @param b второе комплексное число
     * @return результат выполнения операции
     * @throws IllegalStateException если операция не установлена
     */
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        if (operation == null) {
            throw new IllegalStateException("Операция не задана");
        }
        return operation.execute(a, b);
    }
}