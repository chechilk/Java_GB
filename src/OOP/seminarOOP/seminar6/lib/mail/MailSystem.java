package OOP.seminarOOP.seminar6.lib.mail;

import java.util.List;

/**
 * Класс, представляющий почтовую систему.
 */
public class MailSystem {

    private List<User> users;

    /**
     * Отправляет электронное письмо.
     *
     * @param from  Отправитель.
     * @param to    Получатель.
     * @param email Письмо.
     */
    public void sendEmail(User from, User to, Email email) {
        // логика отправки письма...
    }

    // другие методы...
}