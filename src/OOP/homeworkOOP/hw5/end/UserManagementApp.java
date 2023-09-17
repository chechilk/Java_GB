package OOP.homeworkOOP.hw5.end;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagementApp {
    public static void main(String[] args) {
        UserView view = new UserView(new Scanner(System.in));
        List<UserModel> users = new ArrayList<>();

        UserPresenter presenter = new UserPresenter(view, users);

        presenter.menu();
    }
}
