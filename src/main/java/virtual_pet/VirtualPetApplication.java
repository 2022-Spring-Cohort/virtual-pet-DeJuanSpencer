package virtual_pet;

import java.util.Scanner;


public class VirtualPetApplication {

    private Dog marchi = new Dog("Marchi", "brown", "squirrels", "steak", 4, 45);

    public static void main(String[] args) {
        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameMethod();
    }

    public void gameMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of your pet");
        String name = input.nextLine();
        System.out.println("Fur Color?");
        String furColor = input.nextLine();
        System.out.println("Favorite toy?");
        String favoriteToy = input.nextLine();
        System.out.println("Favorite food?");
        String favoriteFood = input.nextLine();
        System.out.println("Age?");
        int age = input.nextInt();
        System.out.println("Weight?");
        int weight = input.nextInt();
        input.nextLine();

        Dog doggo = new Dog(name,furColor,favoriteToy,favoriteFood,age,weight);
        System.out.println(doggo.greeting());

    }
}





