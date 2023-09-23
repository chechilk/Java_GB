package OOP.seminarOOP.seminar6.dependency;

interface Device {
    void turnOn();

    void turnOff();
}

class LightBulb implements Device {
    @Override
    public void turnOn() {
        System.out.println("LightBulb turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb turned OFF");
    }
}

class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned OFF");
    }
}

class Switch {
    private Device device;

    Switch(Device device) {
        this.device = device;
    }

    void operate() {
        // ... какая-то логика
        device.turnOn();
        // ...
    }
}
// class LightBulb {
// void turnOn() {
// System.out.println("LightBulb turned ON");
// }

// void turnOff() {
// System.out.println("LightBulb turned OFF");
// }
// }

// class Switch {
// private LightBulb bulb;

// Switch(LightBulb bulb) {
// this.bulb = bulb;
// }

// void operate() {
// // ... какая-то логика
// bulb.turnOn();
// // ...
// }
// }
