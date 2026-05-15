public class Exercicio_4 {
    public static void main(String[] args){
        int pontos = 1000;
        boolean isBanido = false;
        //Ganhou uma partida
        pontos +=(int)250.5;
        if (isBanido == true){
            System.out.println("Jogador esta Banido! Sem Rank.");
        } else{
            if (pontos < 1000){
                System.out.println("BRONZE: " + pontos);
            }
            else if (pontos >= 1000 && pontos < 2000){
                System.out.println("PRATA: " + pontos);
            }
            else if (pontos >= 2000){
                System.out.println("OURO: "+ pontos);
            }
        }
    }
}
