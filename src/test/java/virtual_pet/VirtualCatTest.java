package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualCatTest {
    Cat underTest = new Cat("Tom", "cat","grey",5,30);

    @Test
    public void shouldBeInCommonRoom(){
        //Arrange
        //Action
        //Assert
        assertEquals("Common room",underTest.getLocation());
    }
}
