package virtual_pet;

public class PetShelter {
    private int numberOfBirds;
    private int numberOfCats;
    private int numberOfDogs;
    private int numberOfFish;
    private int numberOfMonkeys;
    private int numberOfRabbits;

    public PetShelter(int numberOfBirds, int numberOfCats, int numberOfDogs, int numberOfFish, int numberOfMonkeys, int numberOfRabbits) {
        this.numberOfBirds = numberOfBirds;
        this.numberOfCats = numberOfCats;
        this.numberOfDogs = numberOfDogs;
        this.numberOfFish = numberOfFish;
        this.numberOfMonkeys = numberOfMonkeys;
        this.numberOfRabbits = numberOfRabbits;
    }

    public int getNumberOfBirds() {
        return numberOfBirds;
    }

    public int getNumberOfCats() {
        return numberOfCats;
    }

    public int getNumberOfDogs() {
        return numberOfDogs;
    }

    public int getNumberOfFish() {
        return numberOfFish;
    }

    public int getNumberOfMonkeys() {
        return numberOfMonkeys;
    }

    public int getNumberOfRabbits() {
        return numberOfRabbits;
    }
}
