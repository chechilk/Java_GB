package BASE.homework.hw6;

import java.util.Objects;

public class LaptopConfig {
    private long id;
    private String model;
    private String color;
    private String cpu;
    private double frequency;
    private int ram;
    private int ssd;
    private String videoCard;
    private String os;

    // Геттеры
    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public Double getFrequency() {
        return frequency;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getOs() {
        return os;
    }

    // Все вариации конструкторов
    public LaptopConfig(long id, String model, String color, String cpu,
                               double frequency, int ram, int ssd, String videoCard, String os) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.cpu = cpu;
        this.frequency = frequency;
        this.ram = ram;
        this.ssd = ssd;
        this.videoCard = videoCard;
        this.os = os;
    }

    @Override
    public String toString() {
        return "\n Ноутбук: " + "Id = " + id + "/" +
                " Модель: " + model + " /" +
                " Цвет: " + color + " /" +
                " Процессор: " + cpu + " /" +
                " Тактовая частота: " + frequency + " /" +
                " Оперативная память: " + ram + " /" +
                " Объем накопителя: " + ssd + " /" +
                " Видеокарта: " + videoCard + " /" +
                " Операционная система: " + os;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LaptopConfig laptops = (LaptopConfig) o;
        return id == laptops.id &&
                model == laptops.model &&
                color == laptops.color &&
                cpu == laptops.cpu &&
                frequency == laptops.frequency &&
                ram == laptops.ram &&
                ssd == laptops.ssd &&
                videoCard == laptops.videoCard &&
                os == laptops.os;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, cpu, frequency, ram, ssd, videoCard, os);
    }
}