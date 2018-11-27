package com.training.dp.creation.factory;

import java.util.Scanner;

public class FactoryRunner {

    public static void main(final String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        int nextIntLoc = scannerLoc.nextInt();
        Animal animalLoc = AnimalFactory.createAnimal(nextIntLoc);
        System.out.println("Eat : " + animalLoc.eat());
        System.out.println("Voice : " + animalLoc.voice());
        System.out.println("Sleep : " + animalLoc.sleep());
    }
}
