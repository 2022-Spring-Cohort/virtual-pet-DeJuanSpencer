package virtual_pet;

public abstract class VirtualRobotPet extends VirtualPet {
    private String name;
    private final String animalType;

    public boolean isAlive = true;
    private final String color;
    private final int modelYear;
    private final double weight;
    public boolean needsCharging = false;
    boolean needsOil = false;
    public int batteryLevel=10;
    public int oilLevel = 10;


    public VirtualRobotPet(String name, String animalType, int id, double weight, String color, int modelYear) {
        super(name, animalType, id, weight);
        this.name = name;
        this.animalType = animalType;
        this.color = color;
        this.modelYear = modelYear;
        this.weight = weight;

    }
    //TODO Create some kinds of methods that addresses hunger, thirst etc....


    public abstract String play();

    public abstract String getOiled();

    public abstract String getCharged();

    public abstract String ASCIIArt();

    public abstract String talking();

    public abstract String getLocation();


    public String tick() {
        String concernsToAddress = "";
        if (getOilLevel() < 3) {
            needsOil = true;
            concernsToAddress+="Robot needs oil.\n";
        }
        if (getBatteryLevel() < 3) {
            needsCharging = true;
            concernsToAddress+="Robot needs charging.\n";
        }
        return concernsToAddress;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }



    public String getColor() {
        return color;
    }

    public int getModelYear() {
        return modelYear;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public boolean isNeedsCharging() {
        return needsCharging;
    }

    public boolean isNeedsOil() {
        return needsOil;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
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
        petStats += "Oil-level: " + getOilLevel()+"\n";
        petStats += "Battery-level:" + getBatteryLevel();
        return petStats;
    }

    public String greeting() {
        String hello = this.ASCIIArt();
        hello += "My name is " + name + ". ";
        hello += "I am " + getModelYear() + " years old. ";
        hello += "I am " + getWeight() + " lbs. ";
        return hello;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public boolean getIsOrganic() {
        return false;
    }
}
