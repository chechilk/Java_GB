package OOP.homeworkOOP.hw5.trash;

import java.util.Scanner;

public class UserView {
     Scanner scanner = new Scanner(System.in);
    public String inputInfo(String input ){
        System.out.println(input);
        return scanner.nextLine();
    }

    public void showMessageMenu(){
        System.out.println("Выберите действие: " +
                "\n1. Зарегистрироваться (Для новых пользователей)" +
                "\n2. Войти в существующую учётную запись." +
                "\n3. Поменять пароль");
    }

    public void showMessage(String message){
        System.out.println(message);
    }

}
