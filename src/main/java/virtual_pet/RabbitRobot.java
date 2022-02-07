package virtual_pet;

public class RabbitRobot extends VirtualRobotPet {
    public RabbitRobot(String name, String animalType, String color, int modelYear, double weight) {
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
        result+="  ***       \n" +
                "  ** **\n" +
                " **   **\n" +
                " **   **         **** \n" +
                " **   **       **   ****\n" +
                " **  **       *   **   **\n" +
                "  **  *      *  **  ***  **\n" +
                "   **  *    *  **     **  *\n" +
                "    ** **  ** **        **\n" +
                "    **   **  **\n" +
                "   *           *\n" +
                "  *             *\n" +
                " *    0     0    *\n" +
                " *   /   @   \\   *\n" +
                " *   \\__/ \\__/   *\n" +
                "   *     W     *\n" +
                "     **     **   \n" +
                "       *****";

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
