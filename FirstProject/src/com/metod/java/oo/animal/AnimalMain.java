package com.metod.java.oo.animal;

import java.util.Scanner;

public class AnimalMain {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            AnimalFactory.writeMenu();
            int nextInt = scanner.nextInt();
            IAnimal createAnimal = AnimalFactory.createAnimal(nextInt);
            DailyLife dailyLife = new DailyLife(createAnimal);
            dailyLife.liveADay();
        }

        // scanner.close();

    }
}
