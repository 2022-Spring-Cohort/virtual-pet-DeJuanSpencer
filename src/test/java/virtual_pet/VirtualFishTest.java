package virtual_pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualFishTest {
    Fish underTest = new Fish("Oscar", "fish","green",3,1);

    @Test
    public void shouldBeInFishTank(){
        //Arrange
        //Action
        //Assert
        assertEquals("Fish-tank",underTest.getLocation());
    }
}
