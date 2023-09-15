package OOP.homeworkOOP.hw5.end;

import Test.hw5.Model;
import Test.hw5.User;
import Test.hw5.View;

import java.util.List;

public class UserPresenter {

    private UserView view;
    private List<UserModel> users;

    public UserPresenter(UserView view, List<UserModel> users) {
        this.view = view;
        this.users = users;
    }

    public void loginToTheService(){

    }
}
