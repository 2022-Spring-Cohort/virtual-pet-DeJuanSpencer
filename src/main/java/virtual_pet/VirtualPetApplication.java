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
        System.out.println("How many turns do you want?");
        int turns = input.nextInt();
        input.nextLine();
        int count = 0;

        VirtualPet pet = petRoster();
        System.out.println(pet.greeting());

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


    //TODO Create checks that find conditions which determine where the game will go

    public VirtualPet petRoster() {
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

            int nameIndex = rand.nextInt(animalNames.size()) + 1;
            String name = animalNames.get(rand.nextInt(nameIndex));

            int typeIndex = rand.nextInt(animals.size()) + 1;
            String animalType = "";

            int colorIndex = rand.nextInt(animalColors.size()) + 1;
            String furColor = "";

            int age = rand.nextInt(10) + 1;
            int weight = rand.nextInt(50) + 1;


            VirtualPet pet = new VirtualPet(name, animalType, furColor, age, weight);
            return pet;
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
            int weight = input.nextInt();

            input.nextLine();

            VirtualPet pet = new VirtualPet(name, animalType, furColor, age, weight);
            return pet;
        }
       return null;
    }

    public String animalASCII(String animalType) {
        String animalASCII = "";
        if (animalType.equalsIgnoreCase("dog")) {
            animalASCII = "  __      _\n" +
                    "o'')}____//\n" +
                    " `_/      )\n" +
                    " (_(_/-(_/";
        } else if (animalType.equalsIgnoreCase("cat")) {
            animalASCII = " _._     _,-'\"\"`-._\n" +
                    "(,-.`._,'(       |\\`-/|\n" +
                    "    `-.-' \\ )-`( , o o)\n" +
                    "          `-    \\`_`\"'-";
        } else if (animalType.equalsIgnoreCase("bird")) {
            animalASCII = "   \\\\\n" +
                    "   (o>\n" +
                    "\\\\_//)\n" +
                    " \\_/_)\n" +
                    "  _|_";
        } else if (animalType.equalsIgnoreCase("fish")) {
            animalASCII = "O     O           ,       \n" +
                    "  o o          .:/    \n" +
                    "    o      ,,///;,   ,;/ \n" +
                    "      o   o)::::::;;///\n" +
                    "         >::::::::;;\\\\\\ \n" +
                    "           ''\\\\\\\\\\'\" ';\\ \n" +
                    "              ';\\";
        } else if (animalType.equalsIgnoreCase("monkey")) {
            animalASCII = "   .--.  .-\"     \"-.  .--.\n" +
                    "  / .. \\/  .-. .-.  \\/ .. \\\n" +
                    " | |  '|  /   Y   \\  |'  | |\n" +
                    " | \\   \\  \\ 0 | 0 /  /   / |\n" +
                    "  \\ '- ,\\.-\"`` ``\"-./, -' /\n" +
                    "   `'-' /_   ^ ^   _\\ '-'`\n" +
                    "       |  \\._   _./  |\n" +
                    "       \\   \\ `~` /   /\n" +
                    "        '._ '-=-' _.'\n" +
                    "           '~---~'";
        } else if (animalType.equalsIgnoreCase("rabbit")) {
            animalASCII = "     ((`\\\n" +
                    "            ___ \\\\ '--._\n" +
                    "         .'`   `'    o  )\n" +
                    "        /    \\   '. __.'\n" +
                    "       _|    /_  \\ \\_\\_\n" +
                    "      {_\\______\\-'\\__\\_\\";
        }


        return animalASCII;

    }


}





