package virtual_pet;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualBirdTest {
    Bird underTest = new Bird("Peter", "bird", "white", 5, 4);

    @Test
    public void shouldBeIncage() {
        //Arrange
        //Action

        //Assert
        assertEquals("Cage", underTest.getLocation());
    }

    @Test
    public void shouldBeAbleToFly() {
        //Arrange
        //Action
        //Assert
        assertTrue(underTest.flyAround().equalsIgnoreCase("*Woosh*"));
    }
}
