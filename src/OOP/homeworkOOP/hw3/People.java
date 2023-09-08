package OOP.homeworkOOP.hw3;

import java.util.List;

public class People {
     String peopleName;
     int summMoney;
     int countProduct;

    public People(String peopleName, int summMoney, int countProduct) {
        this.peopleName = peopleName;
        this.summMoney = summMoney;
        this.countProduct = countProduct;
    }

    @Override
    public String toString() {
        return peopleName + " " + summMoney + " " + countProduct;
    }


    public String getPeopleName() {
        return peopleName;
    }

    public int getSummMoney() {
        return summMoney;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void info() {
        System.out.println("Заказ на имя " + peopleName + " принят!");
        System.out.println("Чек об операции:\n" +
                "Имя покупателя: " + peopleName + '\n' +
                "Количество продуктов: " + countProduct + '\n' +
                "Сумма к оплате: " + summMoney);
        System.out.println("Заказ оплачен!");
    }


}
