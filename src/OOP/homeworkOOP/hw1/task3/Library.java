package OOP.homeworkOOP.hw1.task3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(Book book){
        this.catalog.add(book);
    }

    public void removeBook(Book book){
        System.out.println("~~ Книга " + book.getTitle() + " удалена! ~~");
        this.catalog.remove(book);
    }

    public void displayAvailableBooks(){
        System.out.println("Доступные книги: ");
        for (Book book : catalog){
            if(book.isAvailable()){
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author){
        System.out.println("~~ Список книг с автором " + author + "~~");
        for (Book book : catalog){
            if (book.getAuthor().equals(author)){
                book.displayInfo();
            }
        }
    }

    public void fullCatalog(){
        System.out.println("~~ Все книги каталога! ~~"); // Для проверки
        for (Book book : catalog){
            book.displayInfo();
        }
    }
}
