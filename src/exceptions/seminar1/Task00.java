package exceptions.seminar1;

import OOP.seminarOOP.seminar2.task1.SoundMaker;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.
public class Task00 {
    public static void main(String[] args) {
        Integer min = 4;
        Integer[] mass = {1,2,3,4,5};
        System.out.println(CheckLengthMass(mass, min));
    }

    public static Integer CheckLengthMass(Integer[] mass, Integer min){
        if(mass.length < min){
            return -1;
        } else return mass.length;
    }
}
