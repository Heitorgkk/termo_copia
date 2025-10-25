package utilidade;

public class Cores {

    public static final String reset = "\u001B[0m";
    public static final String vermelho = "\u001B[31m";
    public static final String verde = "\u001B[32m";
    public static final String amarelo = "\u001B[33m";
    public static final String azul = "\u001B[34m";
    public static final String roxo = "\u001B[35m";
    public static final String ciano = "\u001B[36m";
    public static final String branco = "\u001B[37m";

    String[] cores = new String[]{
            "\u001B[0m",
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m",
    };

    public static void cor_reset(){
        System.out.print(reset);
    }
    public static void cor_verm(){
        System.out.print(vermelho);
    }
    public static void cor_verde(){
        System.out.print(verde);
    }
    public static void cor_amar(){
        System.out.print(amarelo);
    }
    public static void cor_azul(){
        System.out.print(azul);
    }
    public static void cor_roxo(){
        System.out.print(roxo);
    }
    public static void cor_cian(){
        System.out.print(ciano);
    }
    public static void cor_bran(){
        System.out.print(branco);
    }

}
