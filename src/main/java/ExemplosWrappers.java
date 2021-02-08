public class ExemplosWrappers {
    public static void main(String[] args) {
        soComPrimitivos();
    }

    private static void soComPrimitivos() {
        int[] lista = new int[1];

        lista[0] = 25;

        int primeiroNumero = lista[0];
    }

    private static void soComWrapper() {
        Integer[] lista = new Integer[1];

        lista[0] = Integer.valueOf(25);

        Integer primeiroNumero = lista[0];
    }
}
