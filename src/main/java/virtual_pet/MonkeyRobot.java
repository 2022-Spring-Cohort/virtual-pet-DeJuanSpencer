package virtual_pet;

public class MonkeyRobot extends VirtualRobotPet {


    public MonkeyRobot(String name, String animalType, int id, double weight, String color, int modelYear) {
        super(name, animalType, id, weight, color, modelYear);
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
result+="   .--.  .-'''-.  .--.\n" +
        "      /.\"\".v'.-. .-.`v.\"\"\\\\\n" +
        "      ||  / / O| | O\\ \\  ||\n" +
        "      \\\\_/| \\__| |__/ |\\_//\n" +
        "       `-'\\  .-n-n-.  /`-'\n" +
        "        _.-\\/       \\/-._\n" +
        "      .'   (\\`.___.'/)   `.\n" +
        "     /      \\`.___.'/      `.\n" +
        "    /        `.___.'         \\\n" +
        "    |     |             \\     \\\n" +
        "    |     |   .      .  |\\     \\\n" +
        "    |     |             | \\     \\\n" +
        "     \\     \\            |  \\     \\\n" +
        "      \\     \\           |.' `.    \\\n" +
        "       `.    \\         .'     `.   \\\n" +
        "  _.._   `.   `-. ___ /        /`.  `.\n" +
        "'    \"-._|`\\    `.__)       .'  /    `.\n" +
        "|         `-.\\     \\/      .'   / /\\  )|\\.\n" +
        " \\          _/ / /|/     .'    (_/ / / | \\)\n" +
        "  `._      (__/_/-/   ..'         (_/| |\\_)\n" +
        "     ``--._____.-(     `.            `-'\n" +
        "                  `--.   `.\n" +
        "                    (_/\\ \\\\\\\n" +
        "                       /_///";
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
