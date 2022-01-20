package virtual_pet;

public class Dog {
    private String name;
    private String furColor;
    private String favoriteToy;
    private String favoriteFood;
    private int age;
    private int weight;
    public String greeting;
    public int tick;
    boolean isAlive = true;
    boolean wantsToStayWithYou = true;


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


    public int tick() {
        int time = 30;
        return time;
    }

    public boolean play() {

     boolean result = false;
        return result;
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

    public void stats() {
        System.out.println("My name is " + name);
        boolean hungerStatus = hunger();
        boolean thirstStatus = thirst();
        System.out.println("My name is " + name);
        System.out.println("My name is " + name);
        System.out.println("My name is " + name);

    }


    public String greeting() {
        String hello = "";

        hello += "My name is " + name + ". ";
        hello+= "I am " + getAge() + "years old. ";
        hello+= "I am " + getWeight() + "lbs. ";
        hello += "My favorite toy(s) is/are " + favoriteToy + ". ";
        hello += "My favorite food is " + favoriteFood + ".";
        
        return hello;
    }
}
