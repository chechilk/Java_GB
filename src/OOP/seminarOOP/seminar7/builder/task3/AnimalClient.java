package OOP.seminarOOP.seminar7.builder.task3;

// Класс животного с 10 полями
class Animal {
    private String species;
    private String name;
    private int age;
    private String color;
    private double weight;
    private String habitat;
    private boolean isDomestic;
    private String diet;
    private String sound;
    private String gender;

    public Animal(String species, String name, int age, String color, double weight,
                  String habitat, boolean isDomestic, String diet, String sound, String gender) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.habitat = habitat;
        this.isDomestic = isDomestic;
        this.diet = diet;
        this.sound = sound;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
                "Вид: %s, Имя: %s, Возраст: %d, Цвет: %s, Вес: %.2f, Среда обитания: %s, Домашнее: %b, Рацион: %s, Звук: %s, Пол: %s",
                species, name, age, color, weight, habitat, isDomestic, diet, sound, gender);
    }
}

// Строитель для создания животных
class AnimalBuilder {
    private String species;
    private String name;
    private int age;
    private String color;
    private double weight;
    private String habitat;
    private boolean isDomestic;
    private String diet;
    private String sound;
    private String gender;

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

    public AnimalBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public AnimalBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public AnimalBuilder setHabitat(String habitat) {
        this.habitat = habitat;
        return this;
    }

    public AnimalBuilder setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
        return this;
    }

    public AnimalBuilder setDiet(String diet) {
        this.diet = diet;
        return this;
    }

    public AnimalBuilder setSound(String sound) {
        this.sound = sound;
        return this;
    }

    public AnimalBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Animal build() {
        return new Animal(species, name, age, color, weight, habitat, isDomestic, diet, sound, gender);
    }
}

public class AnimalClient {
    public static void main(String[] args) {
        // Используем строитель для создания объекта Animal с заданными параметрами
        Animal animal1 = new AnimalBuilder()
                .setSpecies("Собака")
                .setName("Барон")
                .setAge(3)
                .setColor("Черный")
                .setWeight(20)
                .setHabitat("Город")
                .setDomestic(true)
                .setDiet("Корм")
                .setSound("Гав-гав")
                .setGender("Мужской")
                .build();

        Animal animal2 = new AnimalBuilder()
                .setSpecies("Кошка")
                .setName("Луна")
                .setAge(2)
                .setColor("Белая")
                .setWeight(4)
                .setHabitat("Город")
                .setDomestic(true)
                .setDiet("Корм")
                .setSound("Мяу")
                .setGender("Женский")
                .build();

        System.out.println(animal1);
        System.out.println(animal2);
    }
}
