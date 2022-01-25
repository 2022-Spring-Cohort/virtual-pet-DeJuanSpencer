package virtual_pet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {
    @Test
    public void testGetName() {


        Dog myTest = new Dog("Brandy", "dog", "brown", 3, 10);

        String result = myTest.getName();


        assertEquals("Brandy", result);
    }

    @Test
    public void testGetAnimalType() {


        Cat myTest = new Cat("Brandy", "cat", "brown", 3, 10);

        String result = myTest.getAnimalType();


        assertEquals("dog", result);
    }

    @Test
    public void testGetFurColor() {


        Bird myTest = new Bird("Brandy", "bird", "brown", 3, 10);

        String result = myTest.getFurColor();


        assertEquals("brown", result);
    }

    @Test
    public void testGetAge() {


        Fish myTest = new Fish("Brandy", "fish", "brown", 3, 10);

        int result = myTest.getAge();


        assertEquals(3, result);
    }

    @Test
    public void testGetWeight() {


        Monkey myTest = new Monkey("Brandy", "monkey", "brown", 3, 10);

        double result = myTest.getWeight();


        assertEquals(10, result);
    }


}


