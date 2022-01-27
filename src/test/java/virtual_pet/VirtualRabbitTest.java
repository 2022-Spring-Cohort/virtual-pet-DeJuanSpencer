package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class VirtualRabbitTest {
    Rabbit underTest = new Rabbit("Bugs", "rabbit","white",37,60);

    @Test
    public void shouldBeInCage(){
        //Arrange
        //Action
        //Assert
        assertEquals("Cage",underTest.getLocation());
    }
}