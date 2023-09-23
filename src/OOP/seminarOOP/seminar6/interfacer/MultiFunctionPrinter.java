package OOP.seminarOOP.seminar6.interfacer;

interface EspressoMachine {
    void makeEspresso();
}

interface LatteMachine {
    void makeLatte();
}

interface CleaningFunction {
    void cleanMachine();
}

class BasicCoffeeMachine implements EspressoMachine, CleaningFunction {
    @Override
    public void makeEspresso() {
        // реализация
    }

    @Override
    public void cleanMachine() {
        // реализация
    }
}

class AdvancedCoffeeMachine implements EspressoMachine, LatteMachine, CleaningFunction {
    @Override
    public void makeEspresso() {
        // реализация
    }

    @Override
    public void makeLatte() {
        // реализация
    }

    @Override
    public void cleanMachine() {
        // реализация
    }
}
// interface CoffeeMachine {
// void makeEspresso();

// void makeLatte();

// void cleanMachine();
// }

// class BasicCoffeeMachine implements CoffeeMachine {
// @Override
// public void makeEspresso() {
// // реализация
// }

// // @Override
// // public void makeLatte() {
// // throw new UnsupportedOperationException("BasicCoffeeMachine can't make
// latte");
// // }

// @Override
// public void cleanMachine() {
// // реализация
// }
// }
