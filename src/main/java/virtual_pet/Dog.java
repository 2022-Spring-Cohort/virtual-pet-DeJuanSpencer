package virtual_pet;

public class Dog extends VirtualOrganicPet {


    public Dog(String name, String animalType, int id, double weight, String furColor, int age) {
        super(name, animalType, id, weight, furColor, age);
    }

    @Override
    public String potty() {
        String pottying = "*Grunts*";
        return pottying;
    }

    @Override
    public String play() {
        String playing = "*Tail wags*";
        this.hungerLevel++;
        this.boredomLevel = 0;
        this.thirstLevel++;
        this.wasteLevel--;
        return playing;
    }

    @Override
    public String eat() {
        String eating = "*Munch munch munch*";
        this.hungerLevel = 0;
        this.boredomLevel--;
        this.thirstLevel++;
        this.wasteLevel++;
        return eating;
    }

    @Override
    public String drink() {
        String drinking = "*lapping noises";
        return drinking;
    }

    @Override
    public String ASCIIArt() {
        String animalASCII = "  __      _\n" +
                "o'')}____//\n" +
                " `_/      )\n" +
                " (_(_/-(_/";
        return animalASCII;
    }

    @Override
    public String talking() {
        String talking = "Woof woof... lick";
        return talking;
    }

    @Override
    public String getLocation() {
        return "Cage";
    }


}
