package virtual_pet;

public class Fish extends VirtualOrganicPet {


    public Fish(String name, String animalType, int id, double weight, String furColor, int age) {
        super(name, animalType, id, weight, furColor, age);
    }

    @Override
    public String potty() {
        return null;
    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public String eat() {
        String eating = "*Bubbles*";
        hungerLevel = 0;
        return eating;
    }

    @Override
    public String drink() {
      return null;
    }

    @Override
    public String ASCIIArt() {
        String animalASCII = "O     O           ,       \n" +
                "  o o          .:/    \n" +
                "    o      ,,///;,   ,;/ \n" +
                "      o   o)::::::;;///\n" +
                "         >::::::::;;\\\\\\ \n" +
                "           ''\\\\\\\\\\'\" ';\\ \n" +
                "              ';\\";
        return animalASCII;
    }

    @Override
    public String talking() {
        String speaking = "*Bubbles*";
        return speaking;
    }

    @Override
    public String getLocation() {
        return "Fish-tank";
    }
}
