package exceptions.homework3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int REQUIRED_DATA_COUNT = 6;

    public static void main(String[] args) {
        try {
            readUserData();
        } catch (InputMismatchException e) {
            System.out.println("Некорректный формат входных данных: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты рождения: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат номера телефона: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректное значение пола: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }

    private static void readUserData() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные (Фамилия Имя Отчество Дата рождения Номер телефона Пол):");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != REQUIRED_DATA_COUNT) {
            throw new InputMismatchException("Неверное количество данных");
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        LocalDate birthDate = parseDate(data[3]);
        long phoneNumber = parsePhoneNumber(data[4]);
        char gender = parseGender(data[5]);

        String fileName = "D:\\Coding\\Java_GB\\src\\exceptions\\homework3\\" + lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            String userData = "<" + lastName + ">" + "<" + firstName + ">" + "<" + middleName + ">" + "<" + birthDate + ">" + "<" +
                    phoneNumber + ">" + "<" + gender + ">";
            writer.write(userData);
            writer.newLine();
        }

        System.out.println("Данные успешно записаны в файл " + fileName);
    }

    private static LocalDate parseDate(String dateStr) {
        try {
            return LocalDate.parse(dateStr, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты рождения", dateStr, e.getErrorIndex());
        }
    }

    private static long parsePhoneNumber(String phoneNumberStr) {
        try {
            return Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат номера телефона");
        }
    }

    private static char parseGender(String genderStr) {
        char gender = genderStr.charAt(0);
        if (gender != 'm' && gender != 'w') {
            throw new IllegalArgumentException("Некорректное значение пола");
        }
        return gender;
    }
}