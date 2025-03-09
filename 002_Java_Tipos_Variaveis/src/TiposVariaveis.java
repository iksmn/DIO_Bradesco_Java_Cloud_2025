//Oito tipos primitivos:
//int
//byte
//short
//long
//float
//double
//boolean
//char


public class TiposVariaveis {
   
    public static void main(String[] args) throws Exception {
        
        byte idade = 123;
        short ano = 2025;
        int cep = 21070333; //se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; //se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F; //float necessário encerrar com F
        double salarioMinimo = 2500.45;
        System.out.println(cpf);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; // possibilidade de erro de perda de valores, pois short armazena menos bits que int
    
        int numero = 1;

        numero = 2;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // representação de uma constante em Java

        System.out.println(VALOR_DE_PI);
    
    }
}
