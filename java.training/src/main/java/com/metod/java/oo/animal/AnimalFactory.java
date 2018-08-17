package com.metod.java.oo.animal;

public class AnimalFactory {
    public static IAnimal createAnimal(final int animalType) {
        switch (animalType) {
        case 1:
            return new Cat();
        case 2:
            return new Dog();
        case 3:
            return new Pigoen();
        case 4:
            return new Lion();
        case 5:
            return new Kangroo();
        default:
            return new Cat();
        }
    }

    public static void writeMenu() {
        System.out.println("1-Cat");
        System.out.println("2-Dog");
        System.out.println("3-Pigeon");
        System.out.println("4-Lion");
        System.out.println("5-Kangroo");
        System.out.println("Choose : ");

    }
}
