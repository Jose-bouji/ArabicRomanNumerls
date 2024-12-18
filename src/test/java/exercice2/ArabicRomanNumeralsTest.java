package exercice2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {
    ArabicRomanNumerls arabicRomanNumerls = new ArabicRomanNumerls();

    @Test
    public void testConvert1ToRoman() {

        String resultat = ArabicRomanNumerls.convert(1);
        assertEquals("I", resultat);
    }


    @Test
    public void testConvert2ToRoman() {

        String resultat2 = ArabicRomanNumerls.convert(2);
        assertEquals("II", resultat2);
    }

    @Test
    public void testConvert3ToRoman() {

        String resultat3 = ArabicRomanNumerls.convert(3);
        assertEquals("III", resultat3);
    }

    @Test
    public void testConvert10ToRoman() {

        String resultat10 = ArabicRomanNumerls.convert(10);
        assertEquals("X", resultat10);
    }

    @Test
    public void testConvert20ToRoman() {

        String resultat20 = ArabicRomanNumerls.convert(20);
        assertEquals("XX", resultat20);
    }

    @Test
    public void testConvert30ToRoman() {

        String resultat30 = ArabicRomanNumerls.convert(30);

        assertEquals("XXX", resultat30);
    }

    @Test
    public void testConvert11ToRoman() {

        String resultat11 = ArabicRomanNumerls.convert(11);

        assertEquals("XI", resultat11);
    }

    @Test
    public void testConvert5ToRoman() {

        String resultat5 = ArabicRomanNumerls.convert(5);

        assertEquals("V", resultat5);
    }


    @Test
    public void testConvert4ToRoman() {

        String resultat4 = ArabicRomanNumerls.convert(4);

        assertEquals("IV", resultat4);
    }

    @Test
    public void testConvert9ToRoman() {

        String resultat9 = ArabicRomanNumerls.convert(9);

        assertEquals("IX", resultat9);
    }


    @Test
    public void testConvert40ToRoman() {

        String resultat40 = ArabicRomanNumerls.convert(40);

        assertEquals("IX", resultat40);
    }


}
