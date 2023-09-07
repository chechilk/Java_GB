package OOP.homeworkOOP.hw1.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Owner owner1 = new Owner("Вика");
        greet(cat1.getName(), cat1.getAge());
        greet(cat1.getName(), owner1.getName(), cat1.getAge());

        Cat cat2 = new Cat("Фиона", 6);
        greet(cat2.getName(), owner1.getName(), cat2.getAge());
    }

    public static void greet(String nameAnimal, int ageAnimal){
        System.out.println("Мяу! Меня зовут " + nameAnimal + ". Мне " + ageAnimal + " лет.");
    }
    public static void greet(String nameAnimal, String nameOwner, int ageAnimal){
        System.out.println("Мяу! Меня зовут " + nameAnimal + ". Мне " + ageAnimal + ". Мою хозяйку зовут " + nameOwner);
    }
}
