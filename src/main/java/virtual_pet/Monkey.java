package virtual_pet;

public class Monkey extends VirtualOrganicPet {


    public Monkey(String name, String animalType, int id, double weight, String furColor, int age) {
        super(name, animalType, id, weight, furColor, age);
    }

    @Override
    public String potty() {
        String pottying = "EEEEEEE....OOOOO ";
        return pottying;
    }

    @Override
    public String play() {
        String playing = "Oooh ohhh eeeh oooh";
        this.hungerLevel++;
        this.boredomLevel = 0;
        this.thirstLevel++;
        this.wasteLevel--;
        return playing;
    }

    @Override
    public String eat() {
        String eating = "*Lip smacking noises*";
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
        String animalASCII = "   .--.  .-\"     \"-.  .--.\n" +
                "  / .. \\/  .-. .-.  \\/ .. \\\n" +
                " | |  '|  /   Y   \\  |'  | |\n" +
                " | \\   \\  \\ 0 | 0 /  /   / |\n" +
                "  \\ '- ,\\.-\"`` ``\"-./, -' /\n" +
                "   `'-' /_   ^ ^   _\\ '-'`\n" +
                "       |  \\._   _./  |\n" +
                "       \\   \\ `~` /   /\n" +
                "        '._ '-=-' _.'\n" +
                "           '~---~'";
        return animalASCII;
    }

    @Override
    public String talking() {
        String speaking = "AHH AHH AHH";
        return speaking;
    }

    @Override
    public String getLocation() {
        return "Cage";
    }
}
