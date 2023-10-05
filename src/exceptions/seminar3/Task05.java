package exceptions.seminar3;

class MyArraySizeException extends RuntimeException {

    MyArraySizeException() {
        super("Массив не 4х4 ");
    }
    MyArraySizeException(int a, int b) {
        super("Массив не 4х4 " + a + "x" + b);
    }
}

class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int indexI, int indexJ) {
        super("Не удалось преобразовать в число значение массива с индексами: " + indexI + ", " + indexJ);
    }
}

public class Task05 {
    public static void main(String[] args) {
        String[][] firstArray = { { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" } };
        String[][] secondArray = { { "1", "2", "3", "a" }, { "1", "2", "3", "4" }, { "1", "2", "3", "4" },
                { "1", "2", "3", "4" } };
        String[][] thirdArray = { { "1", "2", "3", "4" }, { "1", "2", "3", "4" }, { "1", "2", "3", "4" },
                { "1", "2", "3", "4" } };
        try {
            // int a = matrixSum(firstArray);
            // int b = matrixSum(secondArray);
            int c = matrixSum(thirdArray);
            System.out.println(c);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Integer matrixSum(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4) {
                throw new MyArraySizeException(array.length, array[i].length);
            }
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}
