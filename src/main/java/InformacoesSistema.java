public class InformacoesSistema {
    //Atalho digite psvm
    public static void main(String[] args) {
        //Atalho digite sout
//        System.out.print("Processadores disponiveis: ");
//        System.out.println(Runtime.getRuntime().availableProcessors());

        //printf ("template %s %d", "variavel 1", "variavel 2", ...)
        //%s - digito
        //%d - texto
        //%f - numero com virgula
        System.out.printf("Processadores disponiveis: %d \n",
                Runtime.getRuntime().availableProcessors());
        System.out.printf("Memória máxima utilizada pela JVM (HEAP): %d MB \n",
                Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.printf("Memória utilizada pela JVM (HEAP): %d MB",
                Runtime.getRuntime().totalMemory()/1024/1024);
    }
}
