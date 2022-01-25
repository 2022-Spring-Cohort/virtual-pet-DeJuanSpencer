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

    public boolean tick() {
        boolean animalNeedsSomething = false;
        if (hungerLevel >= 3) {
            animalNeedsSomething = true;
            talking();
        }
        if (wasteLevel >= 3) {
            animalNeedsSomething = true;
            talking();
        }
        if (thirstLevel >= 3) {
            animalNeedsSomething = true;
            talking();
        }
        if (boredomLevel >= 3) {
            animalNeedsSomething = true;
            talking();
        }
        return animalNeedsSomething;
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
}

