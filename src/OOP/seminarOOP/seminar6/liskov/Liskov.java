package OOP.seminarOOP.seminar6.liskov;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
// class Rectangle {
// protected int width;
// protected int height;

// public void setWidth(int width) {
// this.width = width;
// }

// public void setHeight(int height) {
// this.height = height;
// }

// public int getArea() {
// return width * height;
// }
// }

// class Square extends Rectangle {
// @Override
// public void setWidth(int width) {
// this.width = width;
// this.height = width; // Квадрат требует, чтобы ширина была равна высоте
// }

// @Override
// public void setHeight(int height) {
// this.width = height;
// this.height = height; // Аналогично
// }
// }
