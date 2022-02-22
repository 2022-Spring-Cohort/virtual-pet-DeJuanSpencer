package virtual_pet;

public abstract class VirtualPet {
    private String name;
    private String animalType;

    private String furColor;
    private int age;
    private int id;
    private double weight;


    //TODO Create a soiled cage/litter box
    //TODO Add an ascii stats box

    public VirtualPet(String name, String animalType, int id, double weight) {
        this.name = name;
        this.animalType = animalType;
        this.id = id;
        this.weight = weight;
    }


    public abstract boolean getIsOrganic();
    public abstract String ASCIIArt();

    public abstract String talking();

    public abstract String getLocation();



    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }



    public int getID() {
        return id;
    }

    public double getWeight() {
        return weight;
    }


}

