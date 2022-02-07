package virtual_pet;

public class FishRobot extends VirtualRobotPet {
    public FishRobot(String name, String animalType, String color, int modelYear, double weight) {
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

        result+="|\\    \\ \\ \\ \\ \\ \\ \\      __   \n" +
                "|  \\    \\ \\ \\ \\ \\ \\ \\   | O~-_\n" +
                "|   >----|-|-|-|-|-|-|--|  __/\n" +
                "|  /    / / / / / / /   |__\\  \n" +
                "|/     / / / / / / /";

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
