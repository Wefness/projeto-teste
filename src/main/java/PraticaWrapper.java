import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class PraticaWrapper {
    public static void main(String[] args) {
        int[] numeros = {
                86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111,
                108, 117, 99, 97, 111, 32, 101, 115, 116, 97, 104,
                32, 99, 111, 114, 114, 101, 116, 97, 33, 33, 32, 78,
                97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111,
                115, 32, 100, 101, 109, 97, 105, 115, 32, 58, 41
        };

        autoboxingUnboxing(numeros);
        maiusculaMinuscula('V');
        minusculaMaiuscula('c');
    }

    private static void autoboxingUnboxing(int[] numeros) {
        for (int numero: numeros) {
            System.out.println(Character.toChars(numero));
        }
    }

    private static void maiusculaMinuscula(char character) {
        System.out.print(Character.toLowerCase(character));
    }

    private static void minusculaMaiuscula(char character) {
        System.out.print(Character.toUpperCase(character));
    }
}
