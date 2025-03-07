public class MinhaClasse {

    public static void main (String [] args)  //Método
    {
        System.out.println("Olá Turma, bem vindos!"); // System é uma classe que possui o método out
        String primeiroNome = "Icaro";
        String segundoNome = "Kossmann";
        
        String nomeCompleto = concatenaNomes(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    

    public static String concatenaNomes (String first, String second)
    {
        return "Resultado do método "  + first.concat(" ").concat(second);
    }

}
