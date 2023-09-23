package OOP.seminarOOP.seminar6.dependency;

interface Operation {
    double execute(double a, double b);
}

class Addition implements Operation {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}

class Multiplication implements Operation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}

class Calculator {
    public double performOperation(Operation operation, double a, double b) {
        return operation.execute(a, b);
    }
}
// class BasicCalculator {
// public double add(double a, double b) {
// return a + b;
// }

// public double subtract(double a, double b) {
// return a - b;
// }

// // Если добавляем умножение и деление, придется изменять этот класс
// }
