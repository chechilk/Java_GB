package OOP.homeworkOOP.hw7FinalyWork.Model;

import OOP.homeworkOOP.hw7FinalyWork.Action.Addition;
import OOP.homeworkOOP.hw7FinalyWork.Action.Difference;
import OOP.homeworkOOP.hw7FinalyWork.Action.Division;
import OOP.homeworkOOP.hw7FinalyWork.Action.Multiplication;
import OOP.homeworkOOP.hw7FinalyWork.Controller.Operation;

/**
 * Фабрика операций.
 */
public class OperationFactory {

    /**
     * Создает объект операции в зависимости от переданного типа.
     *
     * @param type тип операции
     * @return объект операции
     * @throws IllegalArgumentException если передан неизвестный тип операции
     */
    public static Operation createOperation(String type) {
        switch (type) {
            case "сложение":
                return (Operation) new Addition();
            case "вычитание":
                return (Operation) new Difference();
            case "умножение":
                return (Operation) new Multiplication();
            case "деление":
                return (Operation) new Division();
            default:
                throw new IllegalArgumentException("Неизвестный тип операции: " + type);
        }
    }
}
