package virtual_pet;

import java.sql.Array;
import java.util.*;

public class PetShelter {
    private int numberOfBirds;
    private int numberOfCats;
    private int numberOfDogs;
    private int numberOfFish;
    private int numberOfMonkeys;
    private int numberOfRabbits;
    private int numberOfRobotBirds;
    private int numberOfRobotCats;
    private int numberOfRobotDogs;
    private int numberOfRobotFish;
    private int numberOfRobotMonkeys;
    private int numberOfRobotRabbits;
    private int totalNumberOfAnimals;
    private int totalNumberOfRobots;
    private int idNumber;
    private String petShelterName;
    private ArrayList<VirtualOrganicPet> birds = new ArrayList<>();
    private ArrayList<VirtualOrganicPet> cats = new ArrayList<>();
    private ArrayList<VirtualOrganicPet> dogs = new ArrayList<>();
    private ArrayList<VirtualOrganicPet> fish = new ArrayList<>();
    private ArrayList<VirtualOrganicPet> monkeys = new ArrayList<>();
    private ArrayList<VirtualOrganicPet> rabbits = new ArrayList<>();
    private ArrayList<VirtualRobotPet> birdRobots = new ArrayList<>();
    private ArrayList<VirtualRobotPet> catRobots = new ArrayList<>();
    private ArrayList<VirtualRobotPet> dogRobots = new ArrayList<>();
    private ArrayList<VirtualRobotPet> fishRobots = new ArrayList<>();
    private ArrayList<VirtualRobotPet> monkeyRobots = new ArrayList<>();
    private ArrayList<VirtualRobotPet> rabbitRobots = new ArrayList<>();
    private ArrayList<VirtualPet> allOfOurPets = new ArrayList<>();
    private ArrayList<VirtualPet> allOfOurRobots = new ArrayList<>();

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

        int firstHalf = numberOfAnimals / 2;
        int secondHalf = firstHalf;

        /*This makes the organic pet lineup*/
        int count = 0;
        while (count < firstHalf) {
            int id = count;
            int nameIndex = rand.nextInt(animalNames.size());
            String name = animalNames.get(nameIndex);

            int typeIndex = rand.nextInt(animals.size());
            String animalType = animals.get(typeIndex);

            int colorIndex = rand.nextInt(animalColors.size());
            String furColor = animalColors.get(colorIndex);

            int age = rand.nextInt(10) + 1;
            double weight = rand.nextInt(50) + 1;

            if (animalType.equalsIgnoreCase("dog")) {
                Dog pet = new Dog(name, animalType, id, weight, furColor, age);
                dogs.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("bird")) {
                Bird pet = new Bird(name, animalType, id, weight, furColor, age);
                birds.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("cat")) {
                Cat pet = new Cat(name, animalType, id, weight, furColor, age);
                cats.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("fish")) {
                Fish pet = new Fish(name, animalType, id, weight, furColor, age);
                fish.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("monkey")) {
                Monkey pet = new Monkey(name, animalType, id, weight, furColor, age);
                monkeys.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("rabbit")) {
                Rabbit pet = new Rabbit(name, animalType, id, weight, furColor, age);
                rabbits.add(pet);
                petList.add(pet);
                count++;
            }
        }

        /*This makes the robot pet lineup*/
        count = 0;
        while (count < secondHalf) {
            int id = count;
            int nameIndex = rand.nextInt(animalNames.size());
            String name = animalNames.get(nameIndex);

            int typeIndex = rand.nextInt(animals.size());
            String animalType = animals.get(typeIndex);

            int colorIndex = rand.nextInt(animalColors.size());
            String color = animalColors.get(colorIndex);

            int modelYear = rand.nextInt();


            int age = rand.nextInt(10) + 1;
            double weight = rand.nextInt(50) + 1;


            if (animalType.equalsIgnoreCase("dog")) {
                VirtualRobotPet pet = new DogRobot(name, animalType, id, weight, color, modelYear);
                dogRobots.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("bird")) {
                VirtualRobotPet pet = new BirdRobot(name, animalType, id, weight, color, modelYear);
                birdRobots.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("cat")) {
                VirtualRobotPet pet = new CatRobot(name, animalType, id, weight, color, modelYear);
                catRobots.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("fish")) {
                VirtualRobotPet pet = new FishRobot(name, animalType, id, weight, color, modelYear);
                fishRobots.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("monkey")) {
                VirtualRobotPet pet = new MonkeyRobot(name, animalType, id, weight, color, modelYear);
                monkeyRobots.add(pet);
                petList.add(pet);
                count++;
            }
            else if (animalType.equalsIgnoreCase("rabbit")) {
                VirtualRobotPet pet = new RabbitRobot(name, animalType, id, weight, color, modelYear);
                rabbitRobots.add(pet);
                petList.add(pet);
                count++;
            }


        }
        return petList;
    }



    /*TODO
     *
     * Finish admit to shelter
     *
     * Some still need to include if statement to be able to return robots as well
     *
     * */
    public void admitToShelter(VirtualPet petBeingGivenToShelter, ArrayList<VirtualPet> pets) {
        System.out.println("Oh hi there! No need to worry about a thing! We will take great care of it!");
        pets.add(petBeingGivenToShelter);
        if (petBeingGivenToShelter.getIsOrganic()) {
            if (petBeingGivenToShelter.getAnimalType().equals("bird")) {
                birds.add((VirtualOrganicPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("cat")) {
                cats.add((VirtualOrganicPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("dog")) {
                dogs.add((VirtualOrganicPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("fish")) {
                fish.add((VirtualOrganicPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("monkey")) {
                monkeys.add((VirtualOrganicPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("rabbit")) {
                rabbits.add((VirtualOrganicPet) petBeingGivenToShelter);
            }
        }
        else if (!petBeingGivenToShelter.getIsOrganic()) {
            if (petBeingGivenToShelter.getAnimalType().equals("bird")) {
                birdRobots.add((VirtualRobotPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("cat")) {
                catRobots.add((VirtualRobotPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("dog")) {
                dogRobots.add((VirtualRobotPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("fish")) {
                fishRobots.add((VirtualRobotPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("monkey")) {
                monkeyRobots.add((VirtualRobotPet) petBeingGivenToShelter);
            }
            if (petBeingGivenToShelter.getAnimalType().equals("rabbit")) {
                rabbitRobots.add((VirtualRobotPet) petBeingGivenToShelter);
            }
        }
    }

    //TODO Finish get from shelter
    public VirtualPet getFromShelter(ArrayList<VirtualPet> generatedShelterAnimals) {

        VirtualPet petBeingAdopted = null;
        boolean wantsToStay = true;


        while (wantsToStay) {
            Random rand = new Random();
            Scanner input = new Scanner(System.in);
            int type = -1;
            while (type != 0 && type != 1) {
                System.out.println("Would you like an organic or inorganic pet(robot)? Type 0 for robot or 1 for organic.");
                type = input.nextInt();
                input.nextLine();
            }
            if (type == 0) {
                int decision = -1;
                System.out.println("So, you want a robopet? Which kind are you looking for?");
                System.out.println("If you need help, here are some of our options!");
                System.out.println("Press 1 if you want to look at the birds");
                System.out.println("Press 2 if you want to look at the cats");
                System.out.println("Press 3 if you want to look at the dogs");
                System.out.println("Press 4 if you want to look at the fish");
                System.out.println("Press 5 if you want to look at the monkeys");
                System.out.println("Press 6 if you want to look at the rabbits");
                System.out.println("Or press 0 if you want to leave!");
                while (decision != 1 && decision != 2 && decision != 3 && decision != 4 && decision != 5 && decision != 6 && decision != 0) {
                    decision = input.nextInt();
                    input.nextLine();
                }
                if (decision == 0) {
                    wantsToStay = false;
                }
                else if (decision == 1) {
                    System.out.println("Here are our birds!");
                    String animalGreeting = birdRobots.get(rand.nextInt(birdRobots.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = birdRobots.get(0);
                        wantsToStay = false;
                    }
                }
                else if (decision == 2) {
                    System.out.println("Here are our cats!");
                    String animalGreeting = catRobots.get(rand.nextInt(catRobots.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = catRobots.get(0);
                        wantsToStay = false;
                    }

                }
                else if (decision == 3) {
                    System.out.println("Here are our dogs!");
                    String animalGreeting = dogRobots.get(rand.nextInt(dogRobots.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = dogRobots.get(0);
                        wantsToStay = false;
                    }

                }
                else if (decision == 4) {
                    System.out.println("Here are our fish!");
                    String animalGreeting = fishRobots.get(rand.nextInt(fishRobots.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = fishRobots.get(0);
                        wantsToStay = false;
                    }

                }
                else if (decision == 5) {
                    System.out.println("Here are our monkeys!");
                    String animalGreeting = monkeyRobots.get(rand.nextInt(monkeyRobots.size())).greeting();
                    System.out.println(animalGreeting);

                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = monkeyRobots.get(0);
                        wantsToStay = false;
                    }


                }
                else if (decision == 6) {
                    System.out.println("Here are our rabbits!");
                    String animalGreeting = rabbitRobots.get(rand.nextInt(rabbitRobots.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = rabbitRobots.get(0);
                        wantsToStay = false;
                    }
                }
            }
            else if (type == 1) {
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
                    wantsToStay = false;
                }
                else if (decision == 1) {
                    System.out.println("Here are our birds!");


                    String animalGreeting = birds.get(rand.nextInt(birds.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = birds.get(0);
                        wantsToStay = false;
                    }
                }
                else if (decision == 2) {
                    System.out.println("Here are our cats!");
                    String animalGreeting = cats.get(rand.nextInt(cats.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = cats.get(0);
                        wantsToStay = false;
                    }
                }
                else if (decision == 3) {
                    System.out.println("Here are our dogs!");
                    String animalGreeting = dogs.get(rand.nextInt(dogs.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = dogs.get(0);
                        wantsToStay = false;
                    }

                }
                else if (decision == 4) {
                    System.out.println("Here are our fish!");
                    String animalGreeting = fish.get(rand.nextInt(fish.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = fish.get(0);
                        wantsToStay = false;
                    }

                }
                else if (decision == 5) {
                    System.out.println("Here are our monkeys!");
                    String animalGreeting = monkeys.get(rand.nextInt(monkeys.size())).greeting();
                    System.out.println(animalGreeting);
                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = monkeys.get(0);
                        wantsToStay = false;
                    }


                }
                else if (decision == 6) {
                    System.out.println("Here are our rabbits!");
                    String animalGreeting = rabbits.get(rand.nextInt(rabbits.size())).greeting();
                    System.out.println(animalGreeting);


                    System.out.println("Do you want to take this one home?");
                    System.out.println("Press 1 for yes. Press anything else if you're not ready yet...");
                    decision = input.nextInt();
                    input.nextLine();
                    if (decision == 1) {
                        petBeingAdopted = rabbits.get(0);
                        wantsToStay = false;
                    }

                }
            }


            if (!wantsToStay) {
                System.out.println("Thanks for stopping by!");

            }

        }
        return petBeingAdopted;
    }
}