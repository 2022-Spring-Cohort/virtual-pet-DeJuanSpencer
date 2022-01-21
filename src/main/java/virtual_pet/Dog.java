package virtual_pet;

public class Dog {

    private String name;
    private String furColor;
    private String favoriteToy;
    private String favoriteFood;
    private int age;
    private int weight;
    public String greeting;
    public int tick = 0;
    public boolean isAlive = true;
    public boolean wantsToStayWithYou = true;
    public boolean isHungry = false;
    public int hungerLevel = 0;
    public boolean isThirsty = false;
    public int thirstLevel = 0;
    public int boredomLevel = 0;
    public boolean wantsToPlay = false;


    public Dog(String name, String furColor, String favoriteToy, String favoriteFood, int age, int weight) {
        this.name = name;
        this.furColor = furColor;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.weight = weight;
        this.favoriteFood = favoriteFood;
    }


    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }


    public void tick() {

        this.hungerLevel++;
        this.thirstLevel++;
        this.boredomLevel++;
        this.hungerLevel++;
    }

    public void play() {
        this.tick++;
        this.wantsToPlay = false;
        this.hungerLevel++;
        this.thirstLevel++;
    }

    public boolean hunger() {
        boolean result = false;
        if (result) {
            System.out.println("I am hungry");
        } else if (!result) {
            System.out.println("I am not hungry");
        }
        return result;
    }

    public boolean thirst() {
        boolean result = false;
        if (result) {
            System.out.println("I am thirsty");
        } else if (!result) {
            System.out.println("I am not thirsty");
        }
        return result;
    }

    public String stats() {
      String myStats = "";

      myStats +="Here is my thirst level: " + thirstLevel;
        myStats +="Here is my hunger level: "+ hungerLevel;
        myStats +="Here is my boredom level: " + boredomLevel;

        return myStats;

    }


    public String greeting() {
        String hello = "";

        hello += "My name is " + name + ". ";
        hello += "I am " + getAge() + "years old. ";
        hello += "I am " + getWeight() + "lbs. ";
        hello += "My favorite toy(s) is/are " + favoriteToy + ". ";
        hello += "My favorite food is " + favoriteFood + ".";

        return hello;
    }
}
