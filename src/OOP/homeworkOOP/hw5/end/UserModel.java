package OOP.homeworkOOP.hw5.end;

public class UserModel {
    private String nameUser;
    private String loginUser;
    private String passwordUser;

    UserModel(String nameUser, String loginUser, String passwordUser) {
        this.nameUser = nameUser;
        this.loginUser = loginUser;
        this.passwordUser = passwordUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public boolean checkPasswordUser(String password) {
        return this.passwordUser.equals(password);
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
}
