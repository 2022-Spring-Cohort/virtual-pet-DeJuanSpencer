package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameMethod();
    }

    public void gameMethod() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        PetShelter thePetShelter = new PetShelter("We love pets! (We prawmise)");
        ArrayList<VirtualPet> pets = thePetShelter.petRoster();
        ArrayList<VirtualPet> yourPetsInGame = null;
        VirtualPet pet = pets.get(rand.nextInt(pets.size()));


//TODO Add something to interact with the pet if it needs something
        //TODO In regards to this while loop below,
        // there needs to be something that can stop the loop if the user prefers so

        while (pet.isAlive) {
            int choice = -1;
            while (choice != 1 && choice != 2) {
                System.out.println("Would you like to adopt a pet or place one into the shelter?");
                System.out.println("Press 1 for adopt or press 2 to place pet into the shelter");
                choice = input.nextInt();


            }
            if (choice == 1) {
                System.out.println("Oh yay! Someone is going to have a very nice home!");
                System.out.println("Here are the pets you have so far...");




VirtualPet adoptedPet = thePetShelter.getFromShelter(pets);



            } else if (choice == 2) {
                System.out.println("No need to worry about a thing. All animals are our family! ^_^");

                int count = 0;
                for (VirtualPet aPet : yourPetsInGame) {
                    System.out.printf("%d: %s", count, yourPetsInGame.get(count));
                    count++;
                }
                System.out.println("Choose the number associated with your pet to surrender it I mean... to give it a new home...");
                int decision = input.nextInt();
                input.nextLine();
                if(yourPetsInGame.size()==0){
                    System.out.println("You don't have any pets to admit!");
                }
                else {
                    thePetShelter.admitToShelter(yourPetsInGame.get(decision));
                    yourPetsInGame.remove(decision);
                }
            }
//TODO This looks a bit off. Consider adjustments
            if (pet.hungerLevel >= 5 || pet.thirstLevel >= 5) {
                System.out.println("Uh-Oh! Time to get a new one!");
                pet.isAlive = false;
            } else if (pet.tick()) {
                String stats = pet.checkup();
                System.out.println(stats);
                ArrayList<String> interactionOptions = new ArrayList<String>();
                interactionOptions.add("P");
                interactionOptions.add("W");
                interactionOptions.add("F");
                interactionOptions.add("Wr");
                interactionOptions.add("N");
                System.out.println("Enter something for the pet to do. Type 'help' for some interaction options:");
                String action = input.nextLine();

                // TODO Create an array of action steps to interact with the animal
                while (action.equalsIgnoreCase("help")) {
                    System.out.println("P for Play.\n W for water. \n F for food.\n N for nothing.");
                    action = input.nextLine();
                }

                if (action.equalsIgnoreCase("P")) {
                    System.out.println("Playing!");
                    pet.thirstLevel++;
                    pet.boredomLevel--;
                    pet.hungerLevel++;
                    pet.wantsToPlay = false;
                    String petIsplaying = pet.play();
                    System.out.println(petIsplaying);
                } else if (action.equalsIgnoreCase("W")) {
                    System.out.println("Drinking water!");
                    pet.thirstLevel++;
                    pet.boredomLevel--;
                    pet.hungerLevel--;
                    String petIsDrinking = pet.drink();
                    System.out.println(petIsDrinking);

                } else if (action.equalsIgnoreCase("F")) {
                    System.out.println("Eating food!");
                    pet.thirstLevel--;
                    pet.boredomLevel--;
                    pet.hungerLevel++;
                    String petIsEating = pet.eat();
                    System.out.println(petIsEating);

                } else if (action.equalsIgnoreCase("N")) {
                    System.out.println("Doing nothing...");
                    pet.thirstLevel++;
                    pet.boredomLevel++;
                    pet.hungerLevel++;
                    pet.wantsToPlay = true;
                }
            }
        }
    }


    public ArrayList<String> guessWhatsWrong(boolean whatIsActuallyWrong) {
        ArrayList<String> guess = new ArrayList<>();

        guess.add("walk");
        guess.add("food");
        guess.add("water");
        guess.add("play");
        guess.add("potty");
        return guess;
    }
}





