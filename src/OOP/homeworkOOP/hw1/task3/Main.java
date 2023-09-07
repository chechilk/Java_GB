package OOP.homeworkOOP.hw1.task3;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Сказка о рыбаке и рыбке", "Пушкин", true);
        Book book1 = new Book("Евгений Онегин", "Пушкин", false);
        Book book2 = new Book("Герой нашего времени", "Лермонтов", true);
        Book book3 = new Book("Название", "автор", true);

        Library library = new Library();

        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayAvailableBooks();
        // library.fullCatalog();
        library.removeBook(book3);
        library.searchByAuthor("Пушкин");

    }
}
