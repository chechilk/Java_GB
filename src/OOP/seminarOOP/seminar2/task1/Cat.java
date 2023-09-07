package OOP.seminarOOP.seminar2.task1;

class Cat implements SoundMaker{

    private String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " meows");
    }
}
