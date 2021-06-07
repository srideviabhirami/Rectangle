import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void shouldReturnTheAreaOfRectangleAs400WhenLengthIs40AndBreadthIs10() {
        //given
        float length = 40;
        float breadth = 10;
        float expectedArea = 400;
        Rectangle rectangle = new Rectangle(length, breadth);

        //actual
        float actualArea = rectangle.area();

        //expected
        assertEquals(actualArea, expectedArea);

    }

    @Test
    void shouldReturnTheAreaOfRectangleAsNegative1WhenLengthIsNegative40AndBreadthIs10() {
        //given
        float length = -40;
        float breadth = 10;
        float expectedArea = -1;
        Rectangle rectangle = new Rectangle(length, breadth);

        //actual
        float actualArea = rectangle.area();

        //expected
        assertEquals(actualArea, expectedArea);

    }

    @Test
    void shouldReturnTheAreaOfRectangleAsNegative1WhenLengthIs40AndBreadthIsNegative10() {
        //given
        float length = 40;
        float breadth = -10;
        float expectedArea = -1;
        Rectangle rectangle = new Rectangle(length, breadth);

        //actual
        float actualArea = rectangle.area();

        //expected
        assertEquals(actualArea, expectedArea);

    }

    @Test
    void shouldReturnTheAreaOfRectangleAsNegative1WhenLengthIsNegative40AndBreadthIsNegative10() {
        //given
        float length = -40;
        float breadth = -10;
        float expectedArea = -1;
        Rectangle rectangle = new Rectangle(length, breadth);

        //actual
        float actualArea = rectangle.area();

        //expected
        assertEquals(actualArea, expectedArea);

    }
}
