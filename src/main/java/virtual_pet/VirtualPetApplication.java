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
                interactionOptions.add("Play");
                interactionOptions.add("Walk");
                interactionOptions.add("Food");
                interactionOptions.add("Water");
                interactionOptions.add("Nothing");


                System.out.println("Enter something for the pet to do. Type 'help' for some interaction options:");

                String action = input.nextLine();

                // TODO Create an array of action steps to interact with the animal
                while (action.equalsIgnoreCase("help")) {
                    System.out.println("Play? Walk? Give water? Give food? Or leave it alone?");
                    action = input.nextLine();
                }

                if (action.equalsIgnoreCase("Play")) {
                    System.out.println("Playing!");
                    animal.thirstLevel++;
                    animal.boredomLevel--;
                    animal.hungerLevel++;
                    animal.wantsToPlay = false;

                } else if (action.equalsIgnoreCase("Walk")) {
                    animal.thirstLevel++;
                    animal.boredomLevel--;
                    animal.hungerLevel++;
                    animal.wantsToPlay = false;
                } else if (action.equalsIgnoreCase("Food")) {
                    animal.thirstLevel++;
                    animal.boredomLevel--;
                    animal.hungerLevel--;

                } else if (action.equalsIgnoreCase("Water")) {
                    animal.thirstLevel--;
                    animal.boredomLevel--;
                    animal.hungerLevel++;

                } else if (action.equalsIgnoreCase("Nothing")) {
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





