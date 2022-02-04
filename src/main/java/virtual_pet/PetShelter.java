package virtual_pet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetShelter {
    private int numberOfBirds;
    private int numberOfCats;
    private int numberOfDogs;
    private int numberOfFish;
    private int numberOfMonkeys;
    private int numberOfRabbits;
    private int totalNumberOfAnimals;
    private String petShelterName;
    private ArrayList<VirtualPet> birds = new ArrayList<>();
    private ArrayList<VirtualPet> cats = new ArrayList<>();
    private ArrayList<VirtualPet> dogs = new ArrayList<>();
    private ArrayList<VirtualPet> fish = new ArrayList<>();
    private ArrayList<VirtualPet> monkeys = new ArrayList<>();
    private ArrayList<VirtualPet> rabbits = new ArrayList<>();
    private ArrayList<VirtualPet> allOfOurPets = new ArrayList<>();

    //TODO Create doctor method


    public PetShelter(String petShelterName) {
        this.numberOfBirds = numberOfBirds;
        this.numberOfCats = numberOfCats;
        this.numberOfDogs = numberOfDogs;
        this.numberOfFish = numberOfFish;
        this.numberOfMonkeys = numberOfMonkeys;
        this.numberOfRabbits = numberOfRabbits;
        this.totalNumberOfAnimals = totalNumberOfAnimals;

    }

    public int getNumberOfBirds() {
        int numberOfBirds = 0;
        for (VirtualPet pet : allOfOurPets) {

            if (pet.getAnimalType().equalsIgnoreCase("bird")) {
                numberOfBirds++;
            }

        }
        return numberOfBirds;
    }

    public int getNumberOfCats() {
        int numberOfCats = 0;
        for (VirtualPet pet : allOfOurPets) {
            if (pet.getAnimalType().equalsIgnoreCase("cat")) {
                numberOfCats++;
            }
        }
        return numberOfCats;
    }

    public int getNumberOfDogs() {
        int numberOfDogs = 0;
        for (VirtualPet pet : allOfOurPets) {

            if (pet.getAnimalType().equalsIgnoreCase("dog")) {
                numberOfDogs++;
            }
        }

        return numberOfDogs;
    }

    public int getNumberOfFish() {
        int numberOfFish = 0;
        for (VirtualPet pet : allOfOurPets) {

            if (pet.getAnimalType().equalsIgnoreCase("fish")) {
                numberOfFish++;
            }
        }

        return numberOfFish;
    }

    public int getNumberOfMonkeys() {
        int numberOfMonkeys = 0;
        for (VirtualPet pet : allOfOurPets) {

            if (pet.getAnimalType().equalsIgnoreCase("monkey")) {
                numberOfMonkeys++;
            }
        }

        return numberOfMonkeys;
    }

    public int getNumberOfRabbits() {
        int numberOfRabbits = 0;
        for (VirtualPet pet : allOfOurPets) {

            if (pet.getAnimalType().equalsIgnoreCase("rabbit")) {
                numberOfRabbits++;
            }
        }

        return numberOfRabbits;
    }

    public int getTotalNumberOfAnimals() {
        return totalNumberOfAnimals;
    }

    public String getPetShelterName() {
        return petShelterName;
    }

    public ArrayList<VirtualPet> getAllOfOurPets() {
        return allOfOurPets;
    }

    public String greetsYou() {
        String greeting = "Welcome to " + petShelterName + "!";
        return greeting;
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

            System.out.println("How many animals am I to create for you?");
            int numberOfAnimals = input.nextInt();
            input.nextLine();

            for (int count = 0; count < numberOfAnimals; count += 0) {
                int nameIndex = rand.nextInt(animalNames.size());
                String name = animalNames.get(nameIndex);

                int typeIndex = rand.nextInt(animals.size());
                String animalType = animals.get(typeIndex);

                int colorIndex = rand.nextInt(animalColors.size());
                String furColor = animalColors.get(colorIndex);

                int age = rand.nextInt(10) + 1;
                double weight = rand.nextInt(50) + 1;

                if (animalType.equalsIgnoreCase("dog")) {
                    Dog pet = new Dog(name, animalType, furColor, age, weight);
                    dogs.add(pet);
                    petList.add(pet);
                    count++;
                } else if (animalType.equalsIgnoreCase("bird")) {
                    Bird pet = new Bird(name, animalType, furColor, age, weight);
                    birds.add(pet);
                    petList.add(pet);
                    count++;
                } else if (animalType.equalsIgnoreCase("cat")) {
                    Cat pet = new Cat(name, animalType, furColor, age, weight);
                    cats.add(pet);
                    petList.add(pet);
                    count++;
                } else if (animalType.equalsIgnoreCase("fish")) {
                    Fish pet = new Fish(name, animalType, furColor, age, weight);
                    fish.add(pet);
                    petList.add(pet);
                    count++;
                } else if (animalType.equalsIgnoreCase("monkey")) {
                    Monkey pet = new Monkey(name, animalType, furColor, age, weight);
                    monkeys.add(pet);
                    petList.add(pet);
                    count++;
                } else if (animalType.equalsIgnoreCase("rabbit")) {
                    Rabbit pet = new Rabbit(name, animalType, furColor, age, weight);
                    rabbits.add(pet);
                    petList.add(pet);
                    count++;
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
            if (animalType.equalsIgnoreCase("dog")) {
                Dog pet = new Dog(name, animalType, furColor, age, weight);
                petList.add(pet);
            } else if (animalType.equalsIgnoreCase("cat")) {
                Bird pet = new Bird(name, animalType, furColor, age, weight);
                petList.add(pet);
            } else if (animalType.equalsIgnoreCase("bird")) {
                Cat pet = new Cat(name, animalType, furColor, age, weight);
                petList.add(pet);
            } else if (animalType.equalsIgnoreCase("fish")) {
                Fish pet = new Fish(name, animalType, furColor, age, weight);
                petList.add(pet);
            } else if (animalType.equalsIgnoreCase("monkey")) {
                Monkey pet = new Monkey(name, animalType, furColor, age, weight);
                petList.add(pet);
            } else if (animalType.equalsIgnoreCase("rabbit")) {
                Rabbit pet = new Rabbit(name, animalType, furColor, age, weight);
                petList.add(pet);
            }
            return petList;
        }
        return null;
    }

    //TODO Finish admit to shelter
    public void admitToShelter(VirtualPet petBeingGivenToShelter, ArrayList<VirtualPet> pets ) {
        System.out.println("Oh hi there! No need to worry about a thing! We will take great care of it!");
        pets.add(petBeingGivenToShelter);
        if (petBeingGivenToShelter.getAnimalType().equals("bird")) {
            birds.add(petBeingGivenToShelter);


        }
        if (petBeingGivenToShelter.getAnimalType().equals("cat")) {
            cats.add(petBeingGivenToShelter);
        }
        if (petBeingGivenToShelter.getAnimalType().equals("dog")) {
            dogs.add(petBeingGivenToShelter);
        }
        if (petBeingGivenToShelter.getAnimalType().equals("fish")) {
            fish.add(petBeingGivenToShelter);
        }
        if (petBeingGivenToShelter.getAnimalType().equals("monkey")) {
            monkeys.add(petBeingGivenToShelter);
        }
        if (petBeingGivenToShelter.getAnimalType().equals("rabbit")) {
            rabbits.add(petBeingGivenToShelter);
        }
    }

    //TODO Finish get from shelter
    public VirtualPet getFromShelter(ArrayList<VirtualPet> generatedShelterAnimals) {

        VirtualPet petBeingAdopted = null;
        boolean wantsToStay = true;

        while (wantsToStay) {
            Random rand = new Random();
            Scanner input = new Scanner(System.in);
            System.out.println("So, you want a pet? Which kind are you looking for?");
            System.out.println("If you need help, here are some of our options!");
            System.out.println("Press 1 if you want to look at the birds");
            System.out.println("Press 2 if you want to look at the cats");
            System.out.println("Press 3 if you want to look at the dogs");
            System.out.println("Press 4 if you want to look at the fish");
            System.out.println("Press 5 if you want to look at the monkeys");
            System.out.println("Press 6 if you want to look at the rabbits");
            System.out.println("Or press 0 if you want to leave!");

            int decision = input.nextInt();
            input.nextLine();
            if (decision == 0) {
                wantsToStay=false;
            } else if (decision == 1) {
                System.out.println("Here are our birds!");

                String animalGreeting =  birds.get(rand.nextInt(birds.size())).greeting();
                System.out.println(animalGreeting);
                System.out.println("Do you want to take this one home?");
                System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                decision = input.nextInt();
                input.nextLine();
                if(decision==1){
                    petBeingAdopted= birds.get(0);
                    wantsToStay=false;

                }

            } else if (decision == 2) {
                System.out.println("Here are our cats!");
                String animalGreeting = cats.get(rand.nextInt(cats.size())).greeting();
                System.out.println(animalGreeting);
                System.out.println("Do you want to take this one home?");
                System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");                decision = input.nextInt();
                input.nextLine();
                if(decision==1){
                    petBeingAdopted= cats.get(0);
                    wantsToStay=false;
                }

            } else if (decision == 3) {
                System.out.println("Here are our dogs!");
                String animalGreeting = dogs.get(rand.nextInt(dogs.size())).greeting();
                System.out.println(animalGreeting);
                System.out.println("Do you want to take this one home?");
                System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");                decision = input.nextInt();
                input.nextLine();
                if(decision==1){
                    petBeingAdopted= dogs.get(0);
                    wantsToStay=false;
                }

            } else if (decision == 4) {
                System.out.println("Here are our fish!");
                String animalGreeting = fish.get(rand.nextInt(fish.size())).greeting();
                System.out.println(animalGreeting);
                System.out.println("Do you want to take this one home?");
                System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");                decision = input.nextInt();
                input.nextLine();
                if(decision==1){
                    petBeingAdopted= fish.get(0);
                    wantsToStay=false;
                }

            } else if (decision == 5) {
                System.out.println("Here are our monkeys!");
                String animalGreeting = monkeys.get(rand.nextInt(monkeys.size())).greeting();
                System.out.println(animalGreeting);

                System.out.println("Do you want to take this one home?");
                System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");                decision = input.nextInt();
                input.nextLine();
                if(decision==1){
                    petBeingAdopted= monkeys.get(0);
                    wantsToStay=false;
                }


            } else if (decision == 6) {
                System.out.println("Here are our rabbits!");
                String animalGreeting = rabbits.get(rand.nextInt(rabbits.size())).greeting();
                System.out.println(animalGreeting);


                System.out.println("Do you want to take this one home?");
                System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");                decision = input.nextInt();
                input.nextLine();
                if(decision==1){
                   petBeingAdopted= rabbits.get(0);
                    wantsToStay=false;
                }

            }

            if (!wantsToStay) {
                System.out.println("Thanks for stopping by!");
            }

        }
        return petBeingAdopted;
    }
}