public class ExercicioCodigoBarras {
    public static void main(String[] args) {
        validarCodigoBarras();
    }

    public static void validarCodigoBarras() {
        int[] codigoBarras = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 0, 6};
        int soma = 0;
        int unidade = 0;
        int decimal = 0;

        if (codigoBarras.length != 22) {
            System.err.println("* Tamanho deve ser igual a 22!");
            return;
        }

        for (int i = 1; i < 20; i++) {
            soma += codigoBarras[i];
        }

        unidade = soma % 10;

        if (soma > 99) {
            decimal = (soma / 10) % 10;
        }

        int[] codigosCalculados = {decimal, unidade};
        int[] codigosVerificadores = {codigoBarras[20], codigoBarras[21]};

        if (codigosCalculados[0] == codigosVerificadores[0] &&
                codigosCalculados[1] == codigosVerificadores[1]) {
            System.out.println("Código de barras aceito!");
        } else {
            System.out.println("Código de barras recusado!");
        }
    }
}
