package OOP.homeworkOOP.hw5.trash;

public class UserManagementApp {
    public static void main(String[] args) {
        UserView userView = new UserView();
        UserModel userModel = new UserModel();
        UserPresenter userPresenter = new UserPresenter(userModel, userView);

        userPresenter.loginToTheService();

    }
}
