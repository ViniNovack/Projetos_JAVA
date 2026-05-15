public class Exercicio_1 {
    public static void main(String[] args){
        String nome = "Vinicius";
        int nivel = 30;
        boolean chave = true;

        System.out.println("Personagem: " + nome + "\nTem nivel: " + nivel + "\nChave: " + chave);

        if (nivel >= 30 && chave == true){
            System.out.println("O " + nome + " pode entrar na masmora.");
        } else{
            System.out.println("O " + nome + " não pode entar na masmora.");
        }
    }
}
