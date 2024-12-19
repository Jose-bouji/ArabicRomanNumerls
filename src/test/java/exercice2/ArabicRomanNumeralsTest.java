package exercice2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {
    ArabicRomanNumerls arabicRomanNumerls = new ArabicRomanNumerls();



    @Test
    public void testConvert1ToRoman() {

        // GIVEN
        String expected = "I";

        // WHEN
        String resultat = ArabicRomanNumerls.convert(1);

        // THEN
        assertEquals(expected, resultat);
    }



    @Test
    public void testConvert2ToRoman() {

        // GIVEN
        String expected = "II";

        // WHEN
        String resultat2 = ArabicRomanNumerls.convert(2);

        // THEN
        assertEquals(expected, resultat2);
    }


    @Test
    public void testConvert3ToRoman() {

        // GIVEN
        String expected = "III";

        // WHEN
        String resultat3 = ArabicRomanNumerls.convert(3);

        // THEN
        assertEquals(expected, resultat3);
    }


    @Test
    public void testConvert10ToRoman() {

        // GIVEN
        String expected = "X";

        // WHEN
        String resultat10 = ArabicRomanNumerls.convert(10);

        // THEN
        assertEquals(expected, resultat10);
    }

    @Test
    public void testConvert20ToRoman() {

        // GIVEN
        String expected = "XX";

        // WHEN
        String resultat20 = ArabicRomanNumerls.convert(20);

        // THEN
        assertEquals(expected, resultat20);
    }

    @Test
    public void testConvert30ToRoman() {

        // GIVEN
        String expected = "XXX";

        // WHEN
        String resultat30 = ArabicRomanNumerls.convert(30);

        // THEN
        assertEquals(expected, resultat30);
    }

    @Test
    public void testConvert11ToRoman() {

        // GIVEN
        String expected = "XI";

        // WHEN
        String resultat11 = ArabicRomanNumerls.convert(11);

        // THEN
        assertEquals(expected, resultat11);
    }

    @Test
    public void testConvert5ToRoman() {

        // GIVEN
        String expected = "V";

        // WHEN
        String resultat5 = ArabicRomanNumerls.convert(5);

        // THEN
        assertEquals(expected, resultat5);
    }

    @Test
    public void testConvert4ToRoman() {

        // GIVEN
        String expected = "IV";

        // WHEN
        String resultat4 = ArabicRomanNumerls.convert(4);

        // THEN
        assertEquals(expected, resultat4);
    }


    @Test
    public void testConvert9ToRoman() {

        // GIVEN
        String expected = "IX";

        // WHEN
        String resultat9 = ArabicRomanNumerls.convert(9);

        // THEN
        assertEquals(expected, resultat9);
    }

    @Test
    public void testConvert40ToRoman() {

        // GIVEN
        String expected = "XL";

        // WHEN
        String resultat40 = ArabicRomanNumerls.convert(40);

        // THEN
        assertEquals(expected, resultat40);
    }


    @Test
    public void testConvert45ToRoman() {

        // GIVEN
        String expected = "XLV";

        // WHEN
        String resultat45 = ArabicRomanNumerls.convert(45);

        // THEN
        assertEquals(expected, resultat45);
    }


    @Test
    public void testConvert49ToRoman() {

        // GIVEN
        String expected = "XLIX";

        // WHEN
        String resultat49 = ArabicRomanNumerls.convert(49);

        // THEN
        assertEquals(expected, resultat49);
    }

    @Test
    public void testConvert50ToRoman() {

        // GIVEN
        String expected = "L";

        // WHEN
        String resultat50 = ArabicRomanNumerls.convert(50);

        // THEN
        assertEquals(expected, resultat50);
    }


}
