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
        VirtualPet pet = pets.get(rand.nextInt(pets.size()));


/*
        TODO
        Add something to interact with the pet if it needs something
        In regards to this while loop below,
        there needs to be something that can stop the loop if the user prefers so
*/
        int numberOfTimesPlayed = 0;
        while (play) {
            numberOfTimesPlayed++;
            int maxPetsToAdopt = numberOfTimesPlayed / 10;

/*
        TODO
        User can adopt one more pet after each 10 times played
*/

            int choice = -1;

            if (yourPetsInGame.size() == 0) {
                while (choice != 0 && choice != 1) {
                    System.out.println("Enter 1 to adopt a pet.");
                    System.out.println("Or... if you want to quit, enter 0.");
                    choice = input.nextInt();
                    input.nextLine();
                }

            } else if (yourPetsInGame.size() > 0) {
                if (maxPetsToAdopt - yourPetsInGame.size() > 0) {
                    while (choice != 0 && choice != 1 && choice != 2 && choice != 3) {

                        System.out.println("Would you like to adopt a pet or place one into the shelter?");
                        System.out.println("Press 1 for adopt, press 2 to place pet into the shelter,\n or press 3 to skip the shelter for now.");
                        System.out.println("If you want to quit, enter 0.");
                        choice = input.nextInt();
                        input.nextLine();

                    }
                } else if (maxPetsToAdopt - yourPetsInGame.size() == 0) {
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

            if (choice == 1) {
                System.out.println("Oh yay! Someone is going to have a very nice home!");
                /*

                 This petShelter method uses the previously generated animals
                 as a parameter to be used specifically for shelter interaction.
                 Not used for animal generation for play.

                 */
                VirtualPet adoptedPet = thePetShelter.getFromShelter(pets);
                yourPetsInGame.add(adoptedPet);
            } else if (choice == 2) {
                if (yourPetsInGame.size() == 0) {
                    System.out.println("This establishment doesn't admit imaginary animals!");
                    System.out.println("Maybe you'd like to adopt instead?\n");
                } else {
                    System.out.println("No need to worry about a thing. All animals are our family! ^_^");
                    int animalID = -1;

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

                    } else if (yourPetsInGame.size() > 1) {
                        for (VirtualPet aPet : yourPetsInGame) {
                            System.out.printf("Your pets are listed here by number. Enter their corresponding number to place them into the shelter. %d: %s", animalID, yourPetsInGame.get(animalID));
                            animalID++;
                        }
                        System.out.println("Choose the number associated with your pet to surrender it I mean... to give it a new home...");
                        int animalIDToGive = input.nextInt();
                        input.nextLine();
                        /* TODO
                          Ensure correct pet is adopted
                         */
                        thePetShelter.admitToShelter(yourPetsInGame.get(animalIDToGive), pets);
                        yourPetsInGame.remove(animalIDToGive);
                    }
                }
                    /*TODO

                      This looks a bit off. Consider adjustments
                      Anyway, this choice 3 gives the user the ability to interact with the pets

                     */
            } else if (choice == 3 && yourPetsInGame.size() > 0) {
                if (pet.hungerLevel >= 5 || pet.thirstLevel >= 5) {
                    petDies(pet);
                  //TODO verify correct pet dies
                    pet.isAlive = false;

                } else {
                    for (VirtualPet myPet : yourPetsInGame) {
                        myPet.tick();
                    }
                    String stats = yourPetsInGame.get(0).checkup();
                    System.out.println(stats);
                    ArrayList<String> interactionOptions = new ArrayList<String>();
                    interactionOptions.add("D");
                    interactionOptions.add("P");
                    interactionOptions.add("W");
                    interactionOptions.add("F");
                    interactionOptions.add("N");
                    System.out.println("Enter something for the pet to do. Type 'help' for some interaction options:");
                    String action = input.nextLine();

                        /* TODO
                        Create an array of action steps to interact with the animal
                         */
                    while (action.equalsIgnoreCase("help")) {
                        System.out.println("D for doctor.\n P for Play.\n W for water. \n F for food.\n N for nothing.");
                        action = input.nextLine();
                    }
                    System.out.println("Do you want this action to affect all pets?");
                    System.out.println("Type 'Y' for yes or 'N' for no.");
                    String oneOrAll = input.nextLine();


                    if (action.equalsIgnoreCase("D")) {

                        if (oneOrAll.equalsIgnoreCase("y")) {
                            for (int count = 0; count < yourPetsInGame.size(); count++) {

                                yourPetsInGame.get(count).thirstLevel = 0;
                                yourPetsInGame.get(count).boredomLevel = 0;
                                yourPetsInGame.get(count).hungerLevel = 0;
                                yourPetsInGame.get(count).wantsToPlay = false;
                                System.out.println("All pets are healed!");
                            }
                        } else if (oneOrAll.equalsIgnoreCase("n")) {
                            pet.thirstLevel = 0;
                            pet.boredomLevel = 0;
                            pet.hungerLevel = 0;
                            pet.wantsToPlay = false;
                            /* TODO
                            Create a method for going to the doctor
                            String animalTalks = pet.talking();
                            System.out.println(animalTalks);
                            */
                            System.out.println("Your pet has been healed!");
                        }


                    } else if (action.equalsIgnoreCase("P")) {

                        if (oneOrAll.equalsIgnoreCase("y")) {
                            for (int count = 0; count < yourPetsInGame.size(); count++) {

                                yourPetsInGame.get(count).thirstLevel++;
                                yourPetsInGame.get(count).boredomLevel--;
                                yourPetsInGame.get(count).hungerLevel++;
                                yourPetsInGame.get(count).wantsToPlay = false;
                                System.out.println("All pets are playing!");
                            }
                        } else if (oneOrAll.equalsIgnoreCase("n")) {
                            pet.thirstLevel++;
                            pet.boredomLevel--;
                            pet.hungerLevel++;
                            pet.wantsToPlay = false;
                            String petIsplaying = yourPetsInGame.get(0).play();
                            System.out.println(petIsplaying);
                        }
                    } else if (action.equalsIgnoreCase("W")) {


                        if (oneOrAll.equalsIgnoreCase("y")) {
                            for (int count = 0; count < yourPetsInGame.size(); count++) {
                                yourPetsInGame.get(count).thirstLevel = 0;
                                yourPetsInGame.get(count).boredomLevel = 0;
                                yourPetsInGame.get(count).hungerLevel = 0;
                                System.out.println("All pets have been \"watered\"!");
                            }

                        } else if (oneOrAll.equalsIgnoreCase("n")) {
                            pet.thirstLevel = 0;
                            pet.boredomLevel = 0;
                            pet.hungerLevel = 0;
                            System.out.println("Your pet has been \"watered\"!");
                        }
                    } else if (action.equalsIgnoreCase("F")) {

                        if (oneOrAll.equalsIgnoreCase("y")) {
                            for (int count = 0; count < yourPetsInGame.size(); count++) {
                                yourPetsInGame.get(count).thirstLevel--;
                                yourPetsInGame.get(count).boredomLevel--;
                                yourPetsInGame.get(count).hungerLevel++;
                                System.out.println("All pets have been fed!");
                            }
                        }
                    } else if (action.equalsIgnoreCase("N")) {
                        if (oneOrAll.equalsIgnoreCase("y")) {
                            for (int count = 0; count < yourPetsInGame.size(); count++) {
                                System.out.println("Doing nothing...");
                                yourPetsInGame.get(count).thirstLevel++;
                                yourPetsInGame.get(count).boredomLevel++;
                                yourPetsInGame.get(count).hungerLevel++;
                                yourPetsInGame.get(count).wantsToPlay = true;
                            }
                        } else if (oneOrAll.equalsIgnoreCase("n")) {
                            System.out.println("Doing nothing...");
                            pet.thirstLevel++;
                            pet.boredomLevel++;
                            pet.hungerLevel++;
                            pet.wantsToPlay = true;
                        }
                    }
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

    public String petDies(VirtualPet pet) {
        String result = "Your pet has died";
        return result;
    }

    /*TODO
    Create methods for all the interactions with the pets
    */
}













