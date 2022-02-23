package virtual_pet;

public class Cat extends VirtualOrganicPet {


    public Cat(String name, String animalType, int id, double weight, String furColor, int age) {
        super(name, animalType, id, weight, furColor, age);
    }

    @Override
    public String potty() {
        String pottying = "*...*";
        return pottying;
    }

    @Override
    public String play() {
        String playing = "*Hissing*";
        this.hungerLevel++;
        this.boredomLevel = 0;
        this.thirstLevel++;
        this.wasteLevel--;
        return playing;
    }

    @Override
    public String eat() {
        String eating = "*...*";
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
        String animalASCII = " _._     _,-'\"\"`-._\n" +
                "(,-.`._,'(       |\\`-/|\n" +
                "    `-.-' \\ )-`( , o o)\n" +
                "          `-    \\`_`\"'-";
        return animalASCII;
    }

    @Override
    public String talking() {
        String speaking = "Meow. Meow. Meoowwww";
        return speaking;
    }

    @Override
    public String getLocation() {
        return "Common room";
    }


}
