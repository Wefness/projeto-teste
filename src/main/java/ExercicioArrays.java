public class ExercicioArrays {
    public static void main(String[] args) {
        System.out.println("Menor número: " + encontreMenorNumero());
    }

    public static int encontreMenorNumero(){
        int[] numeros = new int[]{88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};
        int menorValor = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(menorValor > numeros[i]) {
                menorValor = numeros[i];
            }
        }

        return menorValor;
    }
}
