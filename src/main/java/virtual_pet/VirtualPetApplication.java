package virtual_pet;

public class VirtualPetApplication {

private final Dog marchi = new Dog("Marchi", "brown", "squirrels", "steak",4, 45);

    public static void main(String[] args) {
       VirtualPetApplication myMethod = new VirtualPetApplication();


       myMethod.dogTestMethod();
    }

    public void dogTestMethod(){
        marchi.greeting();
    }

    public void alive(){

    }



}
