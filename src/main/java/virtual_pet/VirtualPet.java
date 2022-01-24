package virtual_pet;



public class VirtualPet {

    private String name;
    private String animalType;
    private String furColor;
    private String favoriteToy;
    private String favoriteFood;
    private int age;
    private int weight;
    public String greeting;
    public String animalSound;
    public int tick = 0;
    public boolean isAlive = true;
    public boolean wantsToStayWithYou = true;
    public boolean isHungry = false;
    public int hungerLevel = 0;
    public boolean isThirsty = false;
    public int thirstLevel = 0;
    public int boredomLevel = 0;
    public boolean wantsToPlay = false;
    public int wasteLevel = 0;
    public boolean needsToWaste = false;




    public VirtualPet(String name, String animalType, String furColor, String favoriteToy, String favoriteFood, int age, int weight) {
        this.name = name;
        this.animalType = animalType;
        this.furColor = furColor;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.weight = weight;
        this.favoriteFood = favoriteFood;


    }


    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
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

    public void play() {
        this.wantsToPlay = false;
        this.hungerLevel++;
        this.thirstLevel++;
    }

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
        petStats += "Hunger: " + hungerLevel;
        petStats += "Boredom: " + boredomLevel;

        return petStats;

    }


    public String greeting() {
        String hello = "";

        hello += "My name is " + name + ". ";
        hello += "I am " + getAge() + "years old. ";
        hello += "I am " + getWeight() + "lbs. ";
        hello += "My favorite toy(s) is/are " + favoriteToy + ". ";
        hello += "My favorite food is " + favoriteFood + ".";

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


    public String talking() {

        String animalSound = "A lot of animal gibberish to get your attention ";
        return animalSound;

    }
}
