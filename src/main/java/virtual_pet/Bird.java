package virtual_pet;

public class Bird extends VirtualPet implements Flight{
    public Bird(String name, String animalType, String furColor, int age, int id, double weight) {
        super(name, animalType, furColor, id, age, weight);
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
    public String drink() {
        String drinking = "*noises*";
        return drinking;
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

    @Override
    public String getLocation() {
        return "Cage";
    }


    @Override
    public String flyAround() {
String flyingAround = "*Woosh*";
return flyingAround;
    }

    @Override
    public String flyHome() {
String flyHome = "*Wooosh*";

        return null;
    }
}
