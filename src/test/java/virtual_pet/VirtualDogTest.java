package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualDogTest {
    Dog underTest = new Dog("Scrappy", "dog","brown",3,15, weight);

    @Test
    public void shouldBeInCage(){
        //Arrange
        //Action
        //Assert
        assertEquals("Cage",underTest.getLocation());
    }

}
