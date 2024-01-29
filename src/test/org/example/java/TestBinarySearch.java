import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBinarySearch {

    @Test
    public void testSearchElementFound() {
        // Arrange
        Main binarySearch = new Main();
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int expectedIndex = 3; // índice del elemento 10 en el array

        // Act
        int result = binarySearch.search(array, target);

        // Assert
        assertEquals(expectedIndex, result, "El método search debería encontrar el índice del elemento buscado.");
    }

    @Test
    public void testSearchElementNotFound() {
        // Arrange
        Main binarySearch = new Main();
        int[] array = {2, 3, 4, 10, 40};
        int target = 6; // Este elemento no existe en el array

        // Act
        int result = binarySearch.search(array, target);

        // Assert
        assertEquals(-1, result, "El método search debería retornar -1 si el elemento no se encuentra.");
    }

    @Test
    public void testSearchWithEmptyArray() {
        // Arrange
        Main binarySearch = new Main();
        int[] array = {};
        int target = 1;

        // Act
        int result = binarySearch.search(array, target);

        // Assert
        assertEquals(-1, result, "El método search debería retornar -1 si el array está vacío.");
    }

    @Test
    public void testSearchWithOneElementArrayElementFound() {
        // Arrange
        Main binarySearch = new Main();
        int[] array = {5};
        int target = 5;

        // Act
        int result = binarySearch.search(array, target);

        // Assert
        assertEquals(0, result, "El método search debería retornar el índice 0 si el elemento está presente en un array de un solo elemento.");
    }

    @Test
    public void testSearchWithOneElementArrayElementNotFound() {
        // Arrange
        Main binarySearch = new Main();
        int[] array = {5};
        int target = 3;

        // Act
        int result = binarySearch.search(array, target);

        // Assert
        assertEquals(-1, result, "El método search debería retornar -1 si el elemento no está presente en un array de un solo elemento.");
    }

}
