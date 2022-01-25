package virtual_pet;

public class Dog extends VirtualPet {
    public Dog(String name, String animalType, String furColor, int age, double weight) {
        super(name, animalType, furColor, age, weight);
    }

    @Override
    public String potty() {
String pottying = "*Grunts*";
return pottying;
    }

    @Override
    public String play() {
String playing = "*Tail wags*";
return playing;
    }

    @Override
    public String eat() {
String eating = "*Munch munch munch*";
return eating;
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
}
