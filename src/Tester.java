import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void firstTestCase() {

        //Testa hur många bokstäver

        String text = "some text";
        int actual = text.length();
        int expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    public void secondTestCase() {
        // Testar hur många siffror som finns i strängen
        String text = "Låt os räkna till fem 12345";
        long actual = text.chars().filter(Character::isDigit).count();
        long expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    public void thirdTestCase() {
        // Testar hur många blanksteg som finns
        String text = "Hej jag heter Ahmed";
        long actual = text.chars().filter(ch -> ch == ' ').count();
        long expected = 3;
        assertEquals(expected, actual);

    }

}




