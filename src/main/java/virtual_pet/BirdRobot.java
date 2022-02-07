package virtual_pet;

public class BirdRobot extends VirtualRobotPet{
    public BirdRobot(String name, String animalType, String color, int modelYear, double weight) {
        super(name, animalType, color, modelYear, weight);
    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public String getOiled() {
        return null;
    }

    @Override
    public String getCharged() {
        return null;
    }

    @Override
    public String ASCIIArt() {
        String result = "           _           _   \n" +
                "          | |         | |  \n" +
                " _ __ ___ | |__   ___ | |_ \n" +
                "| '__/ _ \\| '_ \\ / _ \\| __|\n" +
                "| | | (_) | |_) | (_) | |_ \n" +
                "|_|  \\___/|_.__/ \\___/ \\__|\n" +
                "                           \n";

        result+="         .--.\n" +
                "                        /   o\\_\n" +
                "                        \\   ___\\\n" +
                "      __________________/   \\_________________\n" +
                "      \\_______         /     \\        _______/\n" +
                "         \\________     |     |     ________/\n" +
                "             \\_______  \\     / ________/\n" +
                "                 \\_____/\\   /\\_____/\n" +
                "                        /A A\\\n" +
                "                  jgs  /     \\\n" +
                "                       `\"===\"`";

        return result;
    }

    @Override
    public String talking() {
        return null;
    }

    @Override
    public String getLocation() {
        return null;
    }
}
