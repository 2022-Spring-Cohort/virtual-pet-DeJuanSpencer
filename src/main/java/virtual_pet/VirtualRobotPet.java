package virtual_pet;

public abstract class VirtualRobotPet {
    private String name;
    private String animalType;
    private String color;
    private int modelYear;
    private double weight;
    public boolean needsCharging = true;
    private int batteryPercentage;

    public boolean needsOil = false;
    public int oilLevel = 5;

    //TODO Create some kinds of methods that addresses hunger, thirst etc....

    public VirtualRobotPet(String name, String animalType, String color, int modelYear, double weight) {
        this.name = name;
        this.animalType = animalType;
        this.color = color;
        this.modelYear = modelYear;
        this.weight = weight;
    }


    public abstract String play();

    public abstract String getOiled();
    public abstract String getCharged();
    public abstract String ASCIIArt();
    public abstract String talking();
    public abstract String getLocation();


    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getColor() {
        return color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public double getWeight() {
        return weight;
    }





    public boolean needsOil() {
        if (oilLevel <= 3) {
            System.out.println("You should consider giving it oil.");
            needsOil = true;
        }
        return needsOil;
    }

    public String checkup() {
        String petStats = "";
        petStats += "Oil-level: " + oilLevel;
        petStats+="Battery=level" + batteryPercentage;


        return petStats;
    }

    public String greeting() {
        String hello = this.ASCIIArt();
        hello += "My name is " + name + ". ";
        hello += "I am " + getModelYear() + " years old. ";
        hello += "I am " + getWeight() + " lbs. ";
        return hello;
    }
}
