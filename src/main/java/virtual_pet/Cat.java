package virtual_pet;

public class Cat extends VirtualPet {
    public Cat(String name, String animalType, String furColor, int age, double weight) {
        super(name, animalType, furColor, age, weight);
    }

    @Override
    public String potty() {
String pottying = "*...*";
return pottying;
    }

    @Override
    public String play() {
String playing = "*Hissing*";
return playing;
    }

    @Override
    public String eat() {
String eating = "*...*";
return eating;
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
}