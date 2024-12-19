package exercice2;

public class ArabicRomanNumerls {

    public static String convert(int number) {
        StringBuilder roman = new StringBuilder();

        if (number >= 50) {
            roman.append("L");
            number = number - 50;
        }
        if (number >= 40) {
            roman.append("XL");
            number = number - 40;
        }
        while (number >= 10) {
            roman.append("X");
            number = number - 10;
        }
        if (number >= 9) {
            roman.append("IX");
            number = number - 9;
        }
        if (number >= 5) {
            roman.append("V");
            number = number - 5;
        }
        if (number >= 4) {
            roman.append("IV");
            number = number - 4;
        }
        while (number >= 1) {
            roman.append("I");
            number = number - 1;
        }

        return roman.toString();
    }
}

