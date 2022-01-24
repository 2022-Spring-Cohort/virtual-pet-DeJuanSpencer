package virtual_pet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {
    @Test
    public void testGetName() {


        VirtualPet myTest = new VirtualPet("Brandy", "dog", "brown", 3, 10);

        String result = myTest.getName();


        assertEquals("Brandy", result);
    }

    @Test
    public void testGetAnimalType() {


        VirtualPet myTest = new VirtualPet("Brandy", "dog", "brown", 3, 10);

        String result = myTest.getAnimalType();


        assertEquals("dog", result);
    }

    @Test
    public void testGetFurColor() {


        VirtualPet myTest = new VirtualPet("Brandy", "dog", "brown", 3, 10);

        String result = myTest.getFurColor();


        assertEquals("brown", result);
    }

    @Test
    public void testGetAge() {


        VirtualPet myTest = new VirtualPet("Brandy", "dog", "brown", 3, 10);

        int result = myTest.getAge();


        assertEquals(3, result);
    }

    @Test
    public void testGetWeight() {


        VirtualPet myTest = new VirtualPet("Brandy", "dog", "brown", 3, 10);

        double result = myTest.getWeight();


        assertEquals(10, result);
    }


}


