package OOP.homeworkOOP.hw5.trash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserPresenter {
    private UserModel modelUser;
    private UserView viewUser;
    List<Object> usersList = new ArrayList<>();

    List<String> loginList = new ArrayList<>();
    int input;

    Scanner scanner = new Scanner(System.in);

    public UserPresenter(UserModel modelUser, UserView viewUser) {
        this.modelUser = modelUser;
        this.viewUser = viewUser;
    }

    // регистрация пользователя
    public void registerUser() {
        String userName = viewUser.inputInfo("Введите имя: ");
        String userLogin = viewUser.inputInfo("Введите логин: ");

        // проверка на существующий логин
        if (searchLogin(userLogin)){
            viewUser.showMessage("Такой логин уже существует!");
            return;
        }else {
            loginList.add(userLogin);
            String userPassword = viewUser.inputInfo("Введите пароль: ");
            UserModel modelUser = new UserModel(userName, userLogin, userPassword);
            modelUser.setUserName(userName);
            modelUser.setUserLogin(userLogin);
            modelUser.setUserPassword(userPassword);
            usersList.add(modelUser);
            System.out.println("Вы успешно зарегистрировались!");
        }
    }

    // вход пользователя
    public void loginUser() {
        String login = viewUser.inputInfo("Введите логин: ");
        String password = viewUser.inputInfo("Введите пароль: ");
        if (login.equals(modelUser.getUserLogin()) && password.equals(modelUser.getUserPassword())) {
            viewUser.showMessage("Успешный вход");
        } else viewUser.showMessage("Логин или пароль не верны");
    }

    // смена пароля
    public void changePassword() {

    }

    public void loginToTheService() {
        while (input != 4){
            viewUser.showMessageMenu();
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    changePassword();
                    break;
                case 4:
                    break;
                default:
                    viewUser.showMessage("Введите корректное число!");
                    break;
            }
        }
    }

    public boolean searchLogin(String userLogin){
        return loginList.contains(userLogin);
    }


}
