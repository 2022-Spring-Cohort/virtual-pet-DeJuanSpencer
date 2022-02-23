package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameMethod();
    }

    public void gameMethod() {
        boolean play = true;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        PetShelter thePetShelter = new PetShelter("We love pets! (We prawmise)");
        /*
        The pets variable below generates all pets to be used in the game loop.
        Error if number of animals generated are less than number of animals available when adopting.
        */
        ArrayList<VirtualPet> pets = thePetShelter.petRoster();
        ArrayList<VirtualPet> yourPetsInGame = new ArrayList<>();
        ArrayList<VirtualOrganicPet> yourOrganicPetsInGame = new ArrayList<>();
        ArrayList<VirtualRobotPet> yourRobotPetsInGame = new ArrayList<>();
        VirtualPet pet = pets.get(rand.nextInt(pets.size()));

/*
        TODO
        Add something to interact with the pet if it needs something

        User can adopt one more pet after each 3 times played
*/
        int numberOfTimesPlayed = 0;
        while (play) {
            numberOfTimesPlayed++;
            int maxPetsToAdopt = numberOfTimesPlayed / 3;
            int choice = -1;
            if (yourPetsInGame.size() == 0) {
                while (choice != 0 && choice != 1) {
                    System.out.println("Enter 1 to adopt a pet.");
                    System.out.println("Or... if you want to quit, enter 0.");
                    choice = input.nextInt();
                    input.nextLine();
                }
            }
            else if (yourPetsInGame.size() > 0) {
                if (maxPetsToAdopt - yourPetsInGame.size() > 0) {
                    while (choice != 0 && choice != 1 && choice != 2 && choice != 3) {

                        System.out.println("Would you like to adopt a pet or place one into the shelter?");
                        System.out.println("Press 1 for adopt, press 2 to place pet into the shelter,\n or press 3 to skip the shelter for now.");
                        System.out.println("If you want to quit, enter 0.");
                        choice = input.nextInt();
                        input.nextLine();
                    }
                }
                else if (maxPetsToAdopt - yourPetsInGame.size() == 0) {
                    while (choice != 0 && choice != 2 && choice != 3) {

                        System.out.println("Would you like to place a pet into the shelter?");
                        System.out.println("2 to place pet into the shelter,\n or press 3 to skip the shelter for now.");
                        System.out.println("If you want to quit, enter 0.");
                        choice = input.nextInt();
                        input.nextLine();
                    }
                }
            }

            if (choice == 0) {
                System.out.println("Bye bye!");
                play = false;
            }
            else if (choice == 1) {
                System.out.println("Oh yay! Someone is going to have a very nice home!");
/*

                 This petShelter method uses the previously generated animals
                 as a parameter to be used specifically for shelter interaction.
                 Not used for animal generation for play.

*/
                VirtualPet adoptedPet = thePetShelter.getFromShelter(pets);
                yourPetsInGame.add(adoptedPet);

                if (adoptedPet.getIsOrganic()) {
                    yourOrganicPetsInGame.add((VirtualOrganicPet) adoptedPet);
                }
                else if (!adoptedPet.getIsOrganic()) {
                    yourRobotPetsInGame.add((VirtualRobotPet) adoptedPet);
                }
            }
            else if (choice == 2) {
                System.out.println("No need to worry about a thing. All animals are our family! ^_^");

                if (yourPetsInGame.size() == 1) {
                    System.out.println("Here is your pet! This is your only one... are you sure you want to place them back into the shelter?");
                    String decision = "-";
                    while (!decision.equalsIgnoreCase("Y") && !decision.equalsIgnoreCase("N")) {
                        System.out.println("(Y/N)?");
                        decision = input.nextLine();
                    }
                    if (decision.equalsIgnoreCase("Y")) {
                        thePetShelter.admitToShelter(yourPetsInGame.get(0), pets);
                        yourPetsInGame.remove(0);
                    }
                }
                else if (yourPetsInGame.size() > 1) {
                    for (VirtualPet aPet : yourPetsInGame) {
                        System.out.printf("Your pets are listed here by number. Enter their corresponding ID to place them into the shelter: %s\n", aPet.toString());
                    }
                    System.out.println("Choose the ID associated with your pet to surrender it I mean... to give it a new home...");
                    int animalIDToGive = -1;
                    boolean matchNotFound = true;
                    while (matchNotFound) {
                        animalIDToGive = input.nextInt();
                        input.nextLine();
                        for (VirtualPet aPet : yourPetsInGame) {
                            if (aPet.getID() == animalIDToGive) {
                                thePetShelter.admitToShelter(aPet, pets);
                                yourPetsInGame.remove(aPet);
                                matchNotFound = false;
                            }
                        }
                    }
                }
            }
/*          TODO
            This looks a bit off. Consider adjustments

*/
            else if (choice == 3 && yourPetsInGame.size() > 0) {
                pet = yourPetsInGame.get(rand.nextInt(yourPetsInGame.size()));
                if (pet.getIsOrganic()) {
                    if ((((VirtualOrganicPet) pet).hungerLevel >= 5 || ((VirtualOrganicPet) pet).thirstLevel >= 5)) {
                        petDies(pet);
                        ((VirtualOrganicPet) pet).isAlive = false;
                    }
                    else {
                        for (VirtualOrganicPet myPet : yourOrganicPetsInGame) {
                            myPet.tick();
                        }
                        String stats = ((VirtualOrganicPet) pet).checkup();
                        System.out.println(stats);
                        ArrayList<String> interactionOptions = new ArrayList<>();
                        interactionOptions.add("1");
                        interactionOptions.add("2");
                        interactionOptions.add("3");
                        interactionOptions.add("4");
                        interactionOptions.add("5");
                        interactionOptions.add("help");
                        System.out.println("Enter something for the pet to do. Type 'help' for some interaction options:");
                        String action = input.nextLine();

                        /* TODO
                        Create an array of action steps to interact with the animal
                         */
                        while (action.equalsIgnoreCase("help")) {
                            System.out.println("1 for doctor.\n 2 for Play.\n 3 for water. \n 4 for food.\n 5 for nothing.");
                            action = input.nextLine();
                        }
                        System.out.println("Do you want this action to affect all pets?");
                        System.out.println("Type 'Y' for yes or 'N' for no.");
                        String oneOrAll = input.nextLine();

                        if (action.equalsIgnoreCase("1")) {

                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourOrganicPetsInGame) {

                                    ((VirtualOrganicPet) aPet).thirstLevel = 0;
                                    ((VirtualOrganicPet) aPet).boredomLevel = 0;
                                    ((VirtualOrganicPet) aPet).hungerLevel = 0;
                                    ((VirtualOrganicPet) aPet).wantsToPlay = false;
                                }
                                System.out.println("All pets are healed!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                ((VirtualOrganicPet) pet).thirstLevel = 0;
                                ((VirtualOrganicPet) pet).boredomLevel = 0;
                                ((VirtualOrganicPet) pet).hungerLevel = 0;
                                ((VirtualOrganicPet) pet).wantsToPlay = false;
                            /* TODO
                            Create a method for going to the doctor
                            String animalTalks = pet.talking();
                            System.out.println(animalTalks);
                            */

                            }
                            System.out.println("Your pet has been healed!");

                        }
                        else if (action.equalsIgnoreCase("2")) {

                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourOrganicPetsInGame) {

                                    ((VirtualOrganicPet) aPet).thirstLevel++;
                                    ((VirtualOrganicPet) aPet).boredomLevel--;
                                    ((VirtualOrganicPet) aPet).hungerLevel++;
                                    ((VirtualOrganicPet) aPet).wantsToPlay = false;
                                }
                                System.out.println("All pets are playing!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                ((VirtualOrganicPet) pet).thirstLevel++;
                                ((VirtualOrganicPet) pet).boredomLevel--;
                                ((VirtualOrganicPet) pet).hungerLevel++;
                                ((VirtualOrganicPet) pet).wantsToPlay = false;
                                String petIsplaying = ((VirtualOrganicPet) pet).play();
                                System.out.println(petIsplaying);
                            }
                        }
                        else if (action.equalsIgnoreCase("3")) {
                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourOrganicPetsInGame) {
                                    ((VirtualOrganicPet) aPet).thirstLevel = 0;
                                    ((VirtualOrganicPet) aPet).wasteLevel++;
                                }
                                System.out.println("All pets have been \"watered\"!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                ((VirtualOrganicPet) pet).thirstLevel = 0;
                                ((VirtualOrganicPet) pet).wasteLevel++;
                                System.out.println("Your pet has been \"watered\"!");
                            }
                        }
                        else if (action.equalsIgnoreCase("4")) {
                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourOrganicPetsInGame) {
                                    ((VirtualOrganicPet) aPet).thirstLevel++;
                                    ((VirtualOrganicPet) aPet).hungerLevel--;
                                    ((VirtualOrganicPet) aPet).wasteLevel++;
                                }
                                System.out.println("All pets have been fed!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                ((VirtualOrganicPet) pet).thirstLevel++;
                                ((VirtualOrganicPet) pet).hungerLevel--;
                                ((VirtualOrganicPet) pet).wasteLevel++;
                                System.out.println("Your pet has been fed!");
                            }
                        }
                        else if (action.equalsIgnoreCase("5")) {
                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourOrganicPetsInGame) {
                                    ((VirtualOrganicPet) aPet).thirstLevel++;
                                    ((VirtualOrganicPet) aPet).boredomLevel++;
                                    ((VirtualOrganicPet) aPet).hungerLevel++;
                                    ((VirtualOrganicPet) aPet).wantsToPlay = true;
                                }
                                System.out.println("Doing nothing...");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                System.out.println("Doing nothing...");
                                ((VirtualOrganicPet) pet).thirstLevel++;
                                ((VirtualOrganicPet) pet).boredomLevel++;
                                ((VirtualOrganicPet) pet).hungerLevel++;
                                ((VirtualOrganicPet) pet).wantsToPlay = true;
                            }
                        }
                    }
                }
                /*TODO
                 *  Finish robot pet interaction*/
                else if (!pet.getIsOrganic()) {


                    if ((((VirtualRobotPet) pet).getOilLevel() == 0 || ((VirtualRobotPet) pet).getBatteryLevel() == 0)) {
                        petDies(pet);
                        ((VirtualRobotPet) pet).isAlive = false;

                        /*TODO
                         * Send robot to get the help it needs after 'dying'...
                         *
                         * And where does the tick method call below go?
                         * */
                    }
                    else {
                        for (VirtualRobotPet myPet : yourRobotPetsInGame) {
                            System.out.println(myPet.tick());
                        }
                        String stats = ((VirtualRobotPet) pet).checkup();
                        System.out.println(stats);
                        ArrayList<String> interactionOptions = new ArrayList<>();
                        interactionOptions.add("1");
                        interactionOptions.add("2");
                        interactionOptions.add("3");
                        interactionOptions.add("4");
                        interactionOptions.add("5");
                        interactionOptions.add("help");
                        System.out.println("Enter something for the pet to do. Type 'help' for some interaction options:");
                        String action = input.nextLine();

                        /* TODO
                        Create an array of action steps to interact with the animal
                         */
                        while (action.equalsIgnoreCase("help")) {
                            System.out.println("1 for repair.\n 2 for Play.\n 3 for oil. \n 4 for charging.\n 5 for nothing.");
                            action = input.nextLine();
                        }


                        System.out.println("Do you want this action to affect all pets?");
                        String oneOrAll = "";
                        while (!oneOrAll.equalsIgnoreCase("Y") && !oneOrAll.equalsIgnoreCase("N")) {
                            System.out.println("Type 'Y' for yes or 'N' for no.");
                            oneOrAll = input.nextLine();
                        }


                        if (action.equalsIgnoreCase("1")) {

                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourRobotPetsInGame) {


                                    ((VirtualRobotPet) aPet).oilLevel = 5;
                                    ((VirtualRobotPet) aPet).batteryLevel = 5;

                                }
                                System.out.println("All pets are healed!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                ((VirtualRobotPet) pet).oilLevel = 5;
                                ((VirtualRobotPet) pet).batteryLevel = 5;
                                ;

                            /* TODO
                            Create a method for going to the doctor
                            String animalTalks = pet.talking();
                            System.out.println(animalTalks);
                            */

                            }
                            System.out.println("Your pet has been healed!");

                        }
                        else if (action.equalsIgnoreCase("2")) {

                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourRobotPetsInGame) {

                                    ((VirtualRobotPet) aPet).oilLevel -= 1;
                                    ((VirtualRobotPet) aPet).batteryLevel -= 1;
                                    ;
                                }
                                System.out.println("All robots are playing!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                ((VirtualRobotPet) pet).oilLevel -= 1;
                                ((VirtualRobotPet) pet).batteryLevel -= 1;

                                System.out.println("Robot is playing");
                            }
                        }
                        else if (action.equalsIgnoreCase("3")) {
                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourRobotPetsInGame) {
                                    ((VirtualRobotPet) aPet).oilLevel = 5;

                                }
                                System.out.println("All robots have been \"oiled\"!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                ((VirtualRobotPet) pet).oilLevel = 5;

                                System.out.println("Your robot has been \"oiled\"!");
                            }
                        }
                        else if (action.equalsIgnoreCase("4")) {
                            if (oneOrAll.equalsIgnoreCase("y")) {
                                for (VirtualPet aPet : yourRobotPetsInGame) {

                                    ((VirtualRobotPet) aPet).batteryLevel = 5;
                                    ;
                                }
                                System.out.println("All robots have been charged!");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {

                                ((VirtualRobotPet) pet).batteryLevel = 5;
                                ;
                                System.out.println("Your robot has been charged!");
                            }
                        }
                        else if (action.equalsIgnoreCase("N")) {
                            if (oneOrAll.equalsIgnoreCase("y")) {

                                System.out.println("Doing nothing...");
                            }
                            else if (oneOrAll.equalsIgnoreCase("n")) {
                                System.out.println("Doing nothing...");

                            }
                        }
                    }
                }
            }
        }
    }
    /*TODO
     *Finish this guess what's wrong method
     *
     *
     * */

    public ArrayList<String> guessWhatsWrong(boolean whatIsActuallyWrong) {
        ArrayList<String> guess = new ArrayList<>();

        guess.add("walk");
        guess.add("food");
        guess.add("water");
        guess.add("play");
        guess.add("potty");
        return guess;
    }

    public String petDies(VirtualPet pet) {
        String result = "Your pet has died";
        return result;
    }

    /*TODO
    Create methods for all the interactions with the pets
    */
}