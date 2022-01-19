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


    public Dog(String name, String furColor, String favoriteToy, String favoriteFood, int age, int weight) {
        this.name = name;
        this.furColor = furColor;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.weight = weight;
        this.favoriteFood = favoriteFood;
    }

    public Dog() {

    }

    public int tick() {
        int time = 30;
        return time;
    }

    public boolean play(){

        boolean result = false;
        return result;
    }

    public boolean hunger(){
        boolean result = false;
        return result;
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

    public void greeting(){
        System.out.println("My name is " + name);
        System.out.println("My favorite toy(s) is/are " +favoriteToy);
        System.out.println("My favorite food is " + favoriteFood);


    }






}
