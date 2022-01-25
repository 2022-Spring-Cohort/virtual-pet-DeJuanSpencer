package virtual_pet;

public class Rabbit extends VirtualPet {
    public Rabbit(String name, String animalType, String furColor, int age, double weight) {
        super(name, animalType, furColor, age, weight);
    }

    @Override
    public String potty() {
String pottying = "Drop drop drop...";

return pottying;
    }

    @Override
    public String play() {
        String playing = "Hippity hoppity";
        this.hungerLevel++;
        this.boredomLevel--;
        this.thirstLevel++;
        this.wasteLevel--;
        return playing;
    }

    @Override
    public String eat() {
        String eating = "munch munch munch munch munch....";

        return eating;

    }

    @Override
    public String ASCIIArt() {
        String animalASCII = "       ((`\\\n" +
                "            ___ \\\\ '--._\n" +
                "         .'`   `'    o  )\n" +
                "        /    \\   '. __.'\n" +
                "       _|    /_  \\ \\_\\_\n" +
                "      {_\\______\\-'\\__\\_\\";
        return animalASCII;
    }

    @Override
    public String talking() {
        String speaking = "Buck buck meow";
        return speaking;
    }
}
