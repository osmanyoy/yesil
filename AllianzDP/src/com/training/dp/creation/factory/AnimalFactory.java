package com.training.dp.creation.factory;


public class AnimalFactory {

    public static Animal createAnimal(final int nextIntLoc) {
        Animal animalLoc;
        switch (nextIntLoc) {
            case 1:
                animalLoc = new Kopek();
                break;
            case 2:
                animalLoc = new Kedi();
                break;
            case 3:
                animalLoc = new Inek();
                break;

            default:
                animalLoc = new Kopek();
                break;
        }
        return animalLoc;
    }
}
