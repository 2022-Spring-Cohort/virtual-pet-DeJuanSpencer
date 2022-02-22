package virtual_pet;

public abstract class VirtualOrganicPet extends VirtualPet {

    private String name;
    private final String animalType;
    private final String furColor;
    private int age;
    private final int id;
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
    public boolean animalNeedsSomething;


    //TODO Create a soiled cage/litter box
    //TODO Add an ascii stats box


    public VirtualOrganicPet(String name, String animalType, int id, double weight, String furColor, int age) {
        super(name, animalType, id, weight);
        this.name = name;
        this.animalType = animalType;
        this.furColor = furColor;
        this.age = age;
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }


    public int getHungerLevel() {
        for(int i =0;i<hungerLevel;i++){
            System.out.println("-");
        }
        return hungerLevel;
    }

    public boolean isThirsty() {
        return isThirsty;
    }

    public int getThirstLevel() {
        for(int i =0;i<thirstLevel;i++){
            System.out.println("-");
        }

        return thirstLevel;
    }

    public int getBoredomLevel() {
        for(int i =0;i<boredomLevel;i++){
            System.out.println("-");
        }
        return boredomLevel;
    }

    public boolean wantsToPlay() {
        return wantsToPlay;
    }

    public int getWasteLevel() {
        return wasteLevel;
    }

    public boolean needsToWaste() {
        return needsToWaste;
    }

    public boolean animalNeedsSomething() {
        return animalNeedsSomething;
    }

    public abstract String potty();

    public abstract String play();

    public abstract String eat();

    public abstract String drink();

    public abstract String ASCIIArt();

    public abstract String talking();

    public abstract String getLocation();



    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getID() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean tick() {
        boolean animalNeedsSomething = false;
        if (hungerLevel >= 3) {
            animalNeedsSomething = true;
            System.out.println("You should consider giving it food.");
            talking();
        }

        if (wasteLevel >= 3) {
            animalNeedsSomething = true;
            talking();
            if (wasteLevel == 5) {
                System.out.println(soiledCage());
                wasteLevel=0;
                System.out.println("You now must clean the animal's living quarters");
            }
        }
        if (thirstLevel >= 3) {
            animalNeedsSomething = true;
            System.out.println("You should consider giving it water.");
            talking();
        }
        if (boredomLevel >= 3) {
            animalNeedsSomething = true;
            System.out.println("You should consider playing with it.");
            talking();
        }
        return animalNeedsSomething;
    }

    public boolean hunger() {
        if (hungerLevel >= 3) {

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
        String hello = this.ASCIIArt();
        hello += "My name is " + name + ". ";
        hello += "I am " + getAge() + " years old. ";
        hello += "I am " + getWeight() + " lbs. ";
        return hello;
    }

    public String soiledCage() {
        String result = this.ASCIIArt();
        result += this.potty();
        this.wasteLevel = 0;
        return result;
    }

    @Override
    public boolean getIsOrganic() {
        return true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isHungry() {
        return isHungry;
    }
}



