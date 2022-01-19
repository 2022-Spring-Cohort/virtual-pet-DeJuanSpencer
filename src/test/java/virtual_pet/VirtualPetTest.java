package virtual_pet;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {
    @Test
    public void testTick() {


        Dog myTest = new Dog();

        int result = myTest.tick;

        assertEquals(30, result);
    }

        @Test

        public void testingName() {
            Dog hungerTest = new Dog();

            boolean result = hungerTest.hunger();


        }


    }

}
