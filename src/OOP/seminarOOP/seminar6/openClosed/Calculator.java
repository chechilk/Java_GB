package OOP.seminarOOP.seminar6.openClosed;

import java.util.List;

interface Operation {
    boolean isApplicable(String operator);

    double apply(double a, double b);
}

class Addition implements Operation {

    @Override
    public boolean isApplicable(String operator) {
        return "add".equals(operator);
    }

    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {

    @Override
    public boolean isApplicable(String operator) {
        return "subtract".equals(operator);
    }

    @Override
    public double apply(double a, double b) {
        return a - b;
    }
}

class Calculator {

    private final List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public double calculate(String operation, double a, double b) {
        for (Operation op : operations) {
            if (op.isApplicable(operation)) {
                return op.apply(a, b);
            }
        }
        throw new IllegalArgumentException("Invalid operation");
    }
}



// class Calculator {

// public double calculate(String operation, double a, double b) {
// if ("add".equals(operation)) {
// return a + b;
// } else if ("subtract".equals(operation)) {
// return a - b;
// }
// // ... другие операции ...

// throw new IllegalArgumentException("Invalid operation");
// }
// }
