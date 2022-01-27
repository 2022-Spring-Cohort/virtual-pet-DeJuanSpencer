package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualMonkeyTest {
    Monkey underTest = new Monkey("Caesar", "monkey","brown",15,70);

    @Test
    public void shouldBeInCage(){
        //Arrange
        //Action
        //Assert
        assertEquals("Cage",underTest.getLocation());
    }
}
