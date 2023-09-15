package OOP.homeworkOOP.hw5.trash;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private String userName;
    private String userLogin;
    private String userPassword;


    public UserModel() {
    }

    public UserModel(String userName, String userLogin, String userPassword) {
        this.userName = userName;
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return
                "Имя пользователя: " + userName + '\n' +
                "Логин: " + userLogin + '\n' +
                "Пароль: " + userPassword + '\n';
    }
}
