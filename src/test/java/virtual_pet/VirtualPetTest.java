package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void testGetName() {
        //Arrange
        Dog myTest = new Dog("Brandy", "dog", "brown", 3, 10);

        //Action
        String result = myTest.getName();

        //Assert
        assertEquals("Brandy", result);
    }

    @Test
    public void testGetAnimalType() {
        //Arrange
        Cat myTest = new Cat("Brandy", "cat", "brown", 3, 10);

        //Action
        String result = myTest.getAnimalType();

        //Assert
        assertEquals("dog", result);
    }

    @Test
    public void testGetFurColor() {
        //Arrange
        Bird myTest = new Bird("Brandy", "bird", "brown", 3, 10);

        //Action
        String result = myTest.getFurColor();

        //Assert
        assertEquals("brown", result);
    }

    @Test
    public void testGetAge() {
        //Arrange
        Fish myTest = new Fish("Brandy", "fish", "brown", 3, 10);

        //Action
        int result = myTest.getAge();

        //Assert
        assertEquals(3, result);
    }

    @Test
    public void testGetWeight() {
        //Arrange
        Monkey myTest = new Monkey("Brandy", "monkey", "brown", 3, 10);

        //Action
        double result = myTest.getWeight();

        //Assert
        assertEquals(10, result);
    }


}