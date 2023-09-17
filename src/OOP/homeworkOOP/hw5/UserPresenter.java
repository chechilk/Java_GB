package OOP.homeworkOOP.hw5;


import java.util.ArrayList;
import java.util.List;

public class UserPresenter implements Message {

    private UserView view;
    private List<UserModel> usersList;

    private List<String> loginsUser = new ArrayList<>();
    private UserModel currentUser;
    private Integer choice = 0;

    UserPresenter(UserView view, List<UserModel> users) {
        this.view = view;
        this.usersList = users;
    }

    public void menu() {
        while (choice != 3) {
            view.showMessage(Message.START_MENU);
            view.showMessage(Message.INPUT_TEXT);
            choice = view.getInfoInt();
            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    inputUser();
                    view.showMessage(Message.USER_MENU);
                    setLoginPassword();
                    break;
                case 3:
                    break;
            }
        }
    }
    public void registerUser(){ // регистрация
        view.showMessage(Message.REGISTER_MESSAGE);
        String name = view.getInfoString(Message.ENTER_NAME);
        String login = view.getInfoString(Message.ENTER_LOGIN);
        String password = view.getInfoString(Message.ENTER_PASSWORD);
        if (!loginsUser.contains(login)) {
            loginsUser.add(login);
            UserModel newUser = new UserModel(name, login, password);
            usersList.add(newUser);
            currentUser = newUser;
        } else {
            view.showMessage(Message.ERROR_LOGIN);
        }
    }

    public void inputUser() {
        view.showMessage(Message.LOGIN_MESSAGE);
        String login = view.getInfoString(Message.ENTER_LOGIN);
        String password = view.getInfoString(Message.ENTER_PASSWORD);
        for (UserModel user : usersList) {
            if (user.getLoginUser().equals(login) && user.checkPasswordUser(password)) {
                currentUser = user;
                view.showMessage(Message.HELLO + user.getNameUser());
            } else {
                view.showMessage(Message.ERROR_MESSAGE);
            }
        }
    }

    public void setLoginPassword(){
        view.showMessage(Message.INPUT_TEXT);
        choice = view.getInfoInt();
        while (choice!=4){
            switch (choice){
                case 1:
                    String name = view.getInfoString(Message.ENTER_NAME);
                    currentUser.setNameUser(name);
                    break;
                case 2:
                    String login = view.getInfoString(Message.ENTER_LOGIN);
                    if (!loginsUser.contains(login)) {
                        loginsUser.add(login);
                        currentUser.setLoginUser(login);
                    } else {
                        view.showMessage(Message.ERROR_LOGIN);
                    }
                    break;
                case 3:
                    String password = view.getInfoString(Message.ENTER_PASSWORD);
                    currentUser.setPasswordUser(password);
                    break;
                case 4:
                    currentUser = null;
                    break;
            }
        }
    }


}
