package virtual_pet;

public abstract class VirtualPet {

    private String name;
    private String animalType;
    private String furColor;
    private int age;
    private double weight;
    public boolean isAlive = true;
    public boolean isHungry = false;
    public int hungerLevel = 0;
    public boolean isThirsty = false;
    public int thirstLevel = 0;
    public int boredomLevel = 0;
    public boolean wantsToPlay = false;
    public int wasteLevel = 0;
    public boolean needsToWaste = false;

    public VirtualPet(String name, String animalType, String furColor, int age, double weight) {
        this.name = name;
        this.animalType = animalType;
        this.furColor = furColor;
        this.age = age;
        this.weight = weight;
    }

    public abstract String potty();
    public abstract String play();
    public abstract String eat();
    public abstract String ASCIIArt();
    public abstract String talking();



    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }


    public void tick() {
        if (hungerLevel >= 3) {
            talking();
        }
        if (wasteLevel >= 3) {
            talking();
        }
        if (thirstLevel >= 3) {
            talking();
        }

    }

//    public void play() {
//        this.wantsToPlay = false;
//        this.hungerLevel++;
//        this.thirstLevel++;
//    }

    public boolean hunger() {
        if (hungerLevel >= 3) {
            System.out.println("You should consider giving it food.");
            isHungry = true;
        }

        return isHungry;
    }

    public boolean thirst() {
        if (thirstLevel >= 3) {
            System.out.println("You should consider giving it water.");
            isThirsty = true;
        }


        return isThirsty;
    }

    public String checkup() {
        String petStats = "";

        petStats += "Thirst: " + thirstLevel;
        petStats += " Hunger: " + hungerLevel;
        petStats += " Boredom: " + boredomLevel;

        return petStats;

    }


    public String greeting() {
        String hello = "";

        System.out.println(animalASCII(animalType));

        hello += "My name is " + name + ". ";
        hello += "I am " + getAge() + " years old. ";
        hello += "I am " + getWeight() + " lbs. ";


        return hello;
    }

    public void eatFood() {
        this.wantsToPlay = true;
        this.hungerLevel--;
        this.thirstLevel++;
    }

    public void drinkWater() {
        this.wantsToPlay = true;
        this.thirstLevel--;
    }

    public int wasteLevel() {
        if (wasteLevel >= 3) {
            needsToWaste = true;
            String message = talking();
            System.out.println(message);
        }

        return wasteLevel;
    }


    public void goWaste() {

        needsToWaste = false;

    }


//    public String talking() {
//
//        String animalSound = "A lot of animal gibberish to get your attention ";
//        return animalSound;
//
//    }

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
            animalASCII = "       ((`\\\n" +
                    "            ___ \\\\ '--._\n" +
                    "         .'`   `'    o  )\n" +
                    "        /    \\   '. __.'\n" +
                    "       _|    /_  \\ \\_\\_\n" +
                    "      {_\\______\\-'\\__\\_\\";
        }


        return animalASCII;

    }
}
