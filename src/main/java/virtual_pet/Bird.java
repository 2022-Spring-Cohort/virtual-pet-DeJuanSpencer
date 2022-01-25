package virtual_pet;

public class Bird extends VirtualPet {
    public Bird(String name, String animalType, String furColor, int age, double weight) {
        super(name, animalType, furColor, age, weight);
    }

    @Override
    public String potty() {
        String pottying = "*Splat*";
        return pottying;
    }

    @Override
    public String play() {
        String playing = "Tweet tweet tweet!";
        this.hungerLevel++;
        this.boredomLevel = 0;
        this.thirstLevel++;
        this.wasteLevel--;
        return playing;
    }

    @Override
    public String eat() {
        String eating = "*Peck peck peck*";
        this.hungerLevel = 0;
        this.boredomLevel--;
        this.thirstLevel++;
        this.wasteLevel++;
        return eating;
    }

    @Override
    public String ASCIIArt() {
        String animalASCII = "   \\\\\n" +
                "   (o>\n" +
                "\\\\_//)\n" +
                " \\_/_)\n" +
                "  _|_";
        return animalASCII;
    }

    @Override
    public String talking() {
        String speaking = "Tweet tweet tweet- tweet tweet...";
        return speaking;
    }
}
