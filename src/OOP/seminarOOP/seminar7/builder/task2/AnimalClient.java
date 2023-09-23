package OOP.seminarOOP.seminar7.builder.task2;

// Класс животного
class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Вид: " + species + ", Имя: " + name + ", Возраст: " + age;
    }
}

// Строитель для создания животных
class AnimalBuilder {
    private String species;
    private String name;
    private int age;

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Animal build() {
        return new Animal(species, name, age);
    }
}

public class AnimalClient {
    public static void main(String[] args) {
        Animal animal = new AnimalBuilder()
                .setSpecies("Собака")
                .setName("Барон")
                .setAge(3)
                .build();

        System.out.println(animal); // Вывод: Вид: Собака, Имя: Барон, Возраст: 3
    }
}
