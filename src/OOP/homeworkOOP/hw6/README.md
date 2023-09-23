### 1) Переписать код в соответствии с Single Responsibility Principle:

```
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        //calculate in otherway
        return baseSalary - tax;
    }
}
```
### 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

```
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        } return 0.0;
    }
}

class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
```
### 3) Переписать код в соответствии с Interface Segregation Principle:

```
interface Shape {
    double area();

    double volume();
}

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException();
    }
}

class Cube implements Shape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
```
### 4) Переписать код в соответствии с Liskov Substitution Principle:

```
public class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
```
### 5) Переписать код в соответствии с Dependency Inversion Principle:
```
public class Car {
    private PetrolEngine engine;

    public Car(PetrolEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

class PetrolEngine {
    public void start() {
    }
}
```