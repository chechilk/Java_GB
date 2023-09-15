package OOP.seminarOOP.seminar5.calculate;
// связывает UserModel и UserView
public class Controller {
    private Model model; // объект Модели
    private View view; // объект Вида

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void calculate(double num1, double num2, char operator) {
        double result;
        try {
            switch (operator) {
                case '+':
                    result = model.add(num1, num2);
                    break;
                case '-':
                    result = model.subtract(num1, num2);
                    break;
                case '*':
                    result = model.multiply(num1, num2);
                    break;
                case '/':
                    result = model.divide(num1, num2);
                    break;
                default:
                    view.printError("Неверная операция");
                    return;
            }
            view.printResult(result);
        } catch (ArithmeticException e) {
            view.printError(e.getMessage());
        }
    }
}
