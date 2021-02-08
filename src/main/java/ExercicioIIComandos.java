public class ExercicioIIComandos {
    public static void main(String[] args) {
//        imprimirSoma1ate1000();
        imprimirMultiplos3ate100();
//        imprimirFatoriais1a100();
    }

    public static void imprimirSoma1ate1000() {
        int soma = 0;

        System.out.print("Imprime soma de 1 até 1000: ");

        for (int i = 1; i <= 1000; i++) {
            soma += i;
            System.out.println("i = " + i + "-> " + soma);
        }

        System.out.println("------------------------------");
    }

    public static void imprimirMultiplos3ate100() {
        StringBuilder retorno = new StringBuilder("3");

        System.out.print("Múltiplos de 3 entre 1 e 1000: ");

        for (int i = 3; i <= 1000; i += 3) {
            if (i != 3) {
                retorno.append(", ").append(i);
            }
        }

        System.out.println(retorno);
        System.out.println("------------------------------");
    }

    public static void imprimirFatoriais1a100() {
        int fatorial = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Fatorial de " + i + ": ");

            fatorial *= i;

            System.out.println(fatorial); // Aqui exibira o valor final do Fatorial
        }
    }
}