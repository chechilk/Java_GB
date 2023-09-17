package OOP.homeworkOOP.hw5;

import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in);

    UserView(Scanner scanner) {
        this.scanner = scanner;
    }
    public void showMessage(String text){
        System.out.println(text);
    }

    public String getInfoString(String text){
        System.out.println(text);
        return scanner.next();
    }

    public Integer getInfoInt(){
        return scanner.nextInt();
    }
}
