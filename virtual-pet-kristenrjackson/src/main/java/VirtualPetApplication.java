// Lyna, Brandon, and Kristen's Virtual Pet

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Intro statement
        System.out.println("Hi, my name is Cheetah the Flying Monkey. What's your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name + "! I love to play (often)\n" +
                "and bananas are my favorite treat. \n" +
                "In order to begin my day please choose from the list \n" +
                "of options below. Be mindful of my attribute levels as I \n" +
                "can be cranky when I’m hungry. It has also been said if \n" +
                "you choose the right combination my name may come true :blush: \n" +
                "(But who knows?)");
        System.out.println("");
        VirtualPet pet = new VirtualPet();

        int activity;

        //eat, sleep, play, and fly actions

        do {
            System.out.println("Choose an activity:");
            System.out.println("0 - Quit");
            System.out.println("1 - Feed Cheetah");
            System.out.println("2 - Put Cheetah to bed");
            System.out.println("3 - Play with Cheetah");
            System.out.println("4 - Ask Cheetah to fly");


            activity = input.nextInt();

            if (activity == 0) { // Quit the game
                System.out.println("Thanks for playing.");
                System.exit(0);
            } else if (activity == 1) { // Hunger/eating activity for Cheetah
                pet.getHunger();
                pet.displayStats();
                System.out.println();
            } else if (activity == 2) { // Sleep activity for Cheetah
                pet.getSleepy();
                pet.displayStats();
                System.out.println();
            } else if (activity == 3) { // Play activity selected
                pet.getPlay();
                pet.displayStats();
                System.out.println();
            } else if (activity == 4) { // Flying activity selected
                pet.getFlying();
                pet.displayStats();
                System.out.println();
            }
            pet.tick();
        } while (activity != 0);
    }
}