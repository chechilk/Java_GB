package OOP.homeworkOOP.hw7FinalyWork.Controller;

/**
 * Интерфейс OperationDecorator расширяет интерфейс Operation и добавляет
 * метод getDescription(),
 * который возвращает описание операции.
 */
public interface OperationDecorator extends Operation {
    /**
     * Метод возвращает описание операции.
     *
     * @return Описание операции в виде строки.
     */
    String getDescription();
}