import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class PraticaFuncionario {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("src/main/resources/pessoas.csv"));
        String linha = "";
        String nome = "";
        float soma = 0.0F;
        StringBuffer stringBuffer = new StringBuffer();

        System.out.printf("\n%-20s \t %s \n\n", "Nome", "Salário+Benefícios");

        for (int i = 0; scanner.hasNext(); i++) {
            linha = scanner.nextLine();

            nome = obtemNomeCompleto(linha);
            soma = obtemSomaSalarioBeneficio(linha);

            stringBuffer.append(String.format("%-20s \t R$ %.2f \n", nome, soma));
        }

        System.out.print(stringBuffer.toString());
    }

    private static String obtemNomeCompleto(String linha) {
        String[] partes = linha.split(",");

        return new StringBuffer()
                .append(partes[0])
                .append(" ")
                .append(partes[1])
                .toString();
    }

    private static Float obtemSomaSalarioBeneficio(String linha) {
        String[] partes = linha.split(",");
        float salario = Float.parseFloat(partes[2]);
        float beneficio = Float.parseFloat(partes[3]);

        return (salario + beneficio);
    }
}
