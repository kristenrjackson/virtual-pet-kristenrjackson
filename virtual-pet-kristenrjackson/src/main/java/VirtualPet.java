public class VirtualPet {

    private int sleepy;
    private int hunger;
    private int play;
    private int flying;

    public VirtualPet() {
        sleepy = 1;
        hunger = 1;
        play = 3;
        flying = 1;
    }

    public int getHunger() {
        if (hunger > 3) { // If Cheetah is hungry
            System.out.println("That was a great banana!");
            modifyHunger();
        } else { // If Cheetah isn't hungry yet
            System.out.println("I'm not hungry yet.");
        }

        // Other vitals
        if (sleepy > 5) System.out.println("I'm so tired - I'm ready to sleep.");
        if (play > 7) System.out.println("I'm bored - let's play a game!");
        return hunger;
    }

    public int modifyHunger() {
        hunger = 1;
        return hunger;
    }

    public int getSleepy() {
        if (sleepy > 4) { // If Cheetah is ready to sleep
            System.out.println("After my beauty rest, I feel so much better!");
            modifySleepy();
        } else { //If Cheetah isn't ready to sleep
            System.out.println("I'm still wide awake!");

        }

        // Other vitals
        if (hunger > 10)
            System.out.println("Your finger looks tasty. If you don't feed me soon, I'm going to snack on it!");
        if (hunger > 5) System.out.println("Can I please have a banana?");
        if (play > 7) System.out.println("I'm bored - let's play a game!");
        return sleepy;
    }

    public int modifySleepy() {
        sleepy = 1;
        return sleepy;
    }

    public int getPlay() {
        if (play > 4) { // If Cheetah is ready to play
            System.out.println("That was fun!");
            modifyPlay();
        } else { // If Cheetah isn't ready to play
            System.out.println("I'm not ready to play yet.");
        }

        // Other vitals
        if (hunger > 10)
            System.out.println("Your finger looks tasty. If you don't feed me soon, I'm going to snack on it!");
        if (hunger > 5) System.out.println("Can I please have a banana?");
        if (sleepy > 10) System.out.println("I'm so tired - I'm ready to sleep.");
        return play;
    }

    public int modifyPlay() {
        play = play - 2;
        return play;
    }

    public int getFlying() {
        if (flying > 3) {
            System.out.println("Okay, fine - I'll take off!!!");
            System.out.println("");
            modifyFlying();
        } else {
            System.out.println("I'm a monkey - I can't fly!");
            System.out.println("");
            modifyFlying();
        }
        return flying;
    }

    public int modifyFlying() {
        flying++;
        return flying;
    }

    public void displayStats() {
        System.out.println("");
        System.out.println("Hunger Level: " + hunger);
        System.out.println("Sleep Level: " + sleepy);
        System.out.println("Play Level: " + play);
    }

    public void tick() {
        sleepy += 1;
        hunger += 2;
        play += 1;
    }
}

