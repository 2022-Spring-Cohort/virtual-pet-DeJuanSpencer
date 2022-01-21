package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        VirtualPetApplication myGame = new VirtualPetApplication();
        VirtualPetApplication Dog = new VirtualPetApplication();

        myGame.gameMethod();
    }

    public void gameMethod() {

        Scanner input = new Scanner(System.in);

        Dog animal = animalRoster();
        System.out.println(animal.greeting());

        while (animal.isAlive) {
            if (animal.hungerLevel >= 5 || animal.thirstLevel >= 5) {
                System.out.println("Uh-Oh! Time to get a new one!");
                animal.isAlive = false;
            } else if (animal.hungerLevel < 5 || animal.thirstLevel < 5) {

                String stats = animal.stats();

                System.out.println(stats);

                ArrayList<String> interactionOptions = new ArrayList<String>();
                interactionOptions.add("P");
                interactionOptions.add("W");
                interactionOptions.add("F");
                interactionOptions.add("W");
                interactionOptions.add("N");


                System.out.println("Enter something for the pet to do. Type 'help' for some interaction options:");

                String action = input.nextLine();

                // TODO Create an array of action steps to interact with the animal
                while (action.equalsIgnoreCase("help")) {
                    System.out.println("P for Play.\n W for Walk.\n Wr for water. \n F for food.\n N for nothing.");
                    action = input.nextLine();
                }

                if (action.equalsIgnoreCase("P")) {
                    System.out.println("Playing!");
                    animal.thirstLevel++;
                    animal.boredomLevel--;
                    animal.hungerLevel++;
                    animal.wantsToPlay = false;

                } else if (action.equalsIgnoreCase("W")) {
                    System.out.println("Walking!");
                    animal.thirstLevel++;
                    animal.boredomLevel--;
                    animal.hungerLevel++;
                    animal.wantsToPlay = false;
                } else if (action.equalsIgnoreCase("Wr")) {
                    System.out.println("Drinking water!");
                    animal.thirstLevel++;
                    animal.boredomLevel--;
                    animal.hungerLevel--;

                } else if (action.equalsIgnoreCase("F")) {
                    System.out.println("Eating food!");
                    animal.thirstLevel--;
                    animal.boredomLevel--;
                    animal.hungerLevel++;

                } else if (action.equalsIgnoreCase("N")) {
                    System.out.println("Doing nothing...");
                    animal.thirstLevel++;
                    animal.boredomLevel++;
                    animal.hungerLevel++;
                    animal.wantsToPlay = true;
                }
            }
        }
    }
            //TODO Create checks that find conditions which determine where the game will go

    public Dog animalRoster() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your pet");
        String name = input.nextLine();
        System.out.println("Fur Color?");
        String furColor = input.nextLine();
        System.out.println("Favorite toy?");
        String favoriteToy = input.nextLine();
        System.out.println("Favorite food?");
        String favoriteFood = input.nextLine();
        System.out.println("Age?");
        int age = input.nextInt();
        System.out.println("Weight?");
        int weight = input.nextInt();
        input.nextLine();

        Dog doggo = new Dog(name, furColor, favoriteToy, favoriteFood, age, weight);

        return doggo;


    }
}





