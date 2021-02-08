import java.util.Locale;
import java.util.Scanner;

public class ExemplosStrings {
    static String texto = "";

    public static void main(String[] args) {
//        exercicioSplit();
//        exercicioSubstring();
//        exercicioLowerUpperCase();
//        exercicioIndexOf();
//        praticaCompareToTrimIsEmpty();
        praticaStringBuffer();
    }

    public static void exercicioSplit() {
        String[] palavras = separaTexto();

        System.out.print("Digite o texto: ");

        texto = new Scanner(System.in).nextLine();

        if (palavras.length > 13) {
            for (String palavra : palavras) {
                System.out.println(palavra);
            }
        } else {
            System.out.println(palavras);
        }
    }

    private static String[] separaTexto() {
        String[] palavras;

        System.out.print("Digite o texto: ");

        texto = new Scanner(System.in).nextLine();
        palavras = texto.split(" ");
        return palavras;
    }

    public static void exercicioSubstring() {
        System.out.print("Digite o texto: ");

        texto = new Scanner(System.in).nextLine();

        System.out.println(texto.substring(0, 12));
    }

    public static void exercicioLowerUpperCase() {
        int primeiroEspaco = 0;

        System.out.print("Digite o texto: ");

        texto = new Scanner(System.in).nextLine();

        primeiroEspaco = texto.indexOf(" ");

        System.out.print(texto.substring(0, primeiroEspaco).toUpperCase());
        System.out.print(texto.substring(primeiroEspaco).toLowerCase());
    }

    public static void exercicioIndexOf() {
        int primeiraVirgula = 0;

        System.out.print("Digite o texto: ");

        texto = new Scanner(System.in).nextLine();
        primeiraVirgula = texto.indexOf(",");

        System.out.print(texto.substring(0, primeiraVirgula));
    }

    public static void praticaCompareToTrimIsEmpty() {
        System.out.print("Digite o texto: ");

        texto = new Scanner(System.in).nextLine();

        texto.trim();

        if (texto.isEmpty()) {
            System.out.println("É necessário informar seu e-mail!");
        } else {
            if (texto.equals("seuemail@mail.com")) {
                System.out.println("Bem vindo " + texto);
            }
        }
    }

    public static void praticaStringBuffer() {
        StringBuffer buffer = new StringBuffer();

        do {
            System.out.print("Digite o texto: ");

            texto = new Scanner(System.in).nextLine();

            if(!texto.equalsIgnoreCase("sair")) {
                if(buffer.length() > 0) {
                    buffer.append(" ");
                }

                buffer.append(texto);
            }
        } while (!texto.equalsIgnoreCase("sair"));

        System.out.println(buffer);
    }
}
