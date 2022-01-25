package virtual_pet;

public class Bird extends VirtualPet{
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
return playing;
    }

    @Override
    public String eat() {
String eating = "*Peck peck peck*";
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
