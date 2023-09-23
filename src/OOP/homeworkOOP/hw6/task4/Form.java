package OOP.homeworkOOP.hw6.task4;

public class Form {
    protected int width;
    protected int height;

    public Form(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}
