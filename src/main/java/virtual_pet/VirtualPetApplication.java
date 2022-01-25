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

        ArrayList<VirtualPet> petList = petRoster();

        VirtualPet pet = petList.get(rand.nextInt(petList.size()));

        String petGreeting = pet.greeting();
        System.out.println(petGreeting);

        while (pet.isAlive) {
            if (pet.hungerLevel >= 5 || pet.thirstLevel >= 5) {
                System.out.println("Uh-Oh! Time to get a new one!");
                pet.isAlive = false;
            } else if (pet.hungerLevel < 5 || pet.thirstLevel < 5) {

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
                    System.out.println("P for Play.\n W for Walk.\n Wr for water. \n F for food.\n N for nothing.");
                    action = input.nextLine();
                }

                if (action.equalsIgnoreCase("P")) {
                    System.out.println("Playing!");
                    pet.thirstLevel++;
                    pet.boredomLevel--;
                    pet.hungerLevel++;
                    pet.wantsToPlay = false;
                    String petIsplaying =pet.play();
                    System.out.println(petIsplaying);

                } else if (action.equalsIgnoreCase("W")) {
                    System.out.println("Walking!");
                    pet.thirstLevel++;
                    pet.boredomLevel--;
                    pet.hungerLevel++;
                    pet.wantsToPlay = false;

                } else if (action.equalsIgnoreCase("Wr")) {
                    System.out.println("Drinking water!");
                    pet.thirstLevel++;
                    pet.boredomLevel--;
                    pet.hungerLevel--;

                } else if (action.equalsIgnoreCase("F")) {
                    System.out.println("Eating food!");
                    pet.thirstLevel--;
                    pet.boredomLevel--;
                    pet.hungerLevel++;

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


    //TODO Create a loop for how many animals the user wants. Create an array of pets?
    public ArrayList<VirtualPet> petRoster() {
        ArrayList<VirtualPet> petList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want pet features to be automatically generated?");
        System.out.println("Y/N?...");
        String choice = input.nextLine();

        while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
            System.out.println("Y/N?...");
            choice = input.nextLine();
        }

        if (choice.equalsIgnoreCase("Y")) {

            ArrayList<String> animalNames = new ArrayList<>();
            animalNames.add("PoofPoof");
            animalNames.add("Zeus");
            animalNames.add("Snuffles");
            animalNames.add("Snowball");

            ArrayList<String> animals = new ArrayList<>();
            animals.add("dog");
            animals.add("cat");
            animals.add("bird");
            animals.add("fish");
            animals.add("monkey");
            animals.add("rabbit");

            ArrayList<String> animalColors = new ArrayList<>();
            animalColors.add("Red");
            animalColors.add("Orange");
            animalColors.add("Yellow");
            animalColors.add("Green");
            animalColors.add("Blue");
            animalColors.add("Violet");
            animalColors.add("Black");
            animalColors.add("White");


            Random rand = new Random();

            System.out.println("How many animals am I to create for you? ***NOT DONE YET***");
            int numberOfAnimals = input.nextInt();

            input.nextLine();
            for (int count = 0; count < numberOfAnimals; count++) {


                int nameIndex = rand.nextInt(animalNames.size());
                String name = animalNames.get(nameIndex);

                int typeIndex = rand.nextInt(animals.size());
                String animalType = animals.get(typeIndex);

                int colorIndex = rand.nextInt(animalColors.size());
                String furColor = animalColors.get(colorIndex);

                int age = rand.nextInt(10) + 1;
                double weight = rand.nextInt(50) + 1;
                if(animalType.equalsIgnoreCase("dog")){
                    Dog pet = new Dog(name, animalType, furColor, age, weight);
                    petList.add(pet);
                }
                else if(animalType.equalsIgnoreCase("cat")){
                    Bird pet = new Bird(name, animalType, furColor, age, weight);
                    petList.add(pet);
                }
                else if(animalType.equalsIgnoreCase("bird")){
                    Cat pet = new Cat(name, animalType, furColor, age, weight);
                    petList.add(pet);
                }
                else if(animalType.equalsIgnoreCase("fish")){
                    Fish pet = new Fish(name, animalType, furColor, age, weight);
                    petList.add(pet);
                }
                else if(animalType.equalsIgnoreCase("monkey")){
                    Monkey pet = new Monkey(name, animalType, furColor, age, weight);
                    petList.add(pet);
                }
                else if(animalType.equalsIgnoreCase("rabbit")){
                    Rabbit pet = new Rabbit(name, animalType, furColor, age, weight);
                    petList.add(pet);
                }
            }
            return petList;
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Enter the name of your pet");
            String name = input.nextLine();

            ArrayList animals = new ArrayList<String>();
            animals.add("dog");
            animals.add("cat");
            animals.add("bird");
            animals.add("fish");
            animals.add("monkey");
            animals.add("rabbit");
            String animalType = "";
            boolean choiceDoesNotExist = true;
            while (choiceDoesNotExist) {
                System.out.println("Choose from the following for the animal type:");
                System.out.println("Dog, Cat, Bird, Fish, Monkey, or Rabbit");
                animalType = input.nextLine();

                if (animals.contains(animalType.toLowerCase())) {
                    choiceDoesNotExist = false;
                }
            }

            System.out.println("Fur Color?");
            String furColor = input.nextLine();

            System.out.println("Age?");
            int age = input.nextInt();

            System.out.println("Weight?");
            double weight = input.nextDouble();

            input.nextLine();
            if(animalType.equalsIgnoreCase("dog")){
                Dog pet = new Dog(name, animalType, furColor, age, weight);
                petList.add(pet);
            }
            else if(animalType.equalsIgnoreCase("cat")){
                Bird pet = new Bird(name, animalType, furColor, age, weight);
                petList.add(pet);
            }
            else if(animalType.equalsIgnoreCase("bird")){
                Cat pet = new Cat(name, animalType, furColor, age, weight);
                petList.add(pet);
            }
            else if(animalType.equalsIgnoreCase("fish")){
                Fish pet = new Fish(name, animalType, furColor, age, weight);
                petList.add(pet);
            }
            else if(animalType.equalsIgnoreCase("monkey")){
                Monkey pet = new Monkey(name, animalType, furColor, age, weight);
                petList.add(pet);
            }
            else if(animalType.equalsIgnoreCase("rabbit")){
                Rabbit pet = new Rabbit(name, animalType, furColor, age, weight);
                petList.add(pet);
            }


            return petList;
        }
        return null;
    }

    public ArrayList<String> guessWhatsWrong() {

        ArrayList<String> guess = new ArrayList<>();
        guess.add("walk");
        guess.add("food");
        guess.add("water");
        guess.add("play");
        guess.add("potty");


        return guess;
    }


}





