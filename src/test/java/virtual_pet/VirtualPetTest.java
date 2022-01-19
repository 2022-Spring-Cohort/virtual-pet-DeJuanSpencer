package virtual_pet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {
    @Test
    public void testTick() {


        Dog myTest = new Dog();

        int result = myTest.tick;

        assertEquals(0, result);
    }

        @Test

        public void testingName() {
            Dog hungerTest = new Dog();

            boolean result = hungerTest.hunger();


        }
    @Test
    public void testAlive() {


        VirtualPetApplication myTest = new VirtualPetApplication();

        boolean result = myTest.alive();

        assertEquals(true, result);
    }


    }


