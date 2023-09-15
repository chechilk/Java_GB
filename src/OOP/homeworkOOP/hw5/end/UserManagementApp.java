package OOP.homeworkOOP.hw5.end;

import Test.hw5.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagementApp {
    public static void main(String[] args) {
        UserView view = new UserView(new Scanner(System.in));
        List<UserModel> users = new ArrayList<>();

//        users.add(new UserModel("Ivan123","123","Иван"));
//        users.add(new UserModel("Peter456","456","Петр"));

        UserPresenter presenter = new UserPresenter(view, users);

        presenter.loginToTheService();
    }
}
