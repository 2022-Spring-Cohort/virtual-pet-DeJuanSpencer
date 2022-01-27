package virtual_pet;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualBirdTest {
    Bird underTest = new Bird("Peter", "bird", "white", 5, 4) {

    };

    @Test
    public void shouldBeIncage() {
        //Arrange
        //Action

        //Assert
        assertEquals("Cage", underTest.getLocation());


    }
}
