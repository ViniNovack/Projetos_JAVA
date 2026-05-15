public class Exercicio_2 {
    public static void main(String[] args){
        double saldo = 1000.00;
        saldo +=300;
        saldo -=950;
        if (saldo <= 0){
            System.out.println("Alerta: Sua conta está no cheque especial! Saldo: " + "[" + saldo + "]");
        } else{
            System.out.println("Conta positiva! Saldo: " + "[" + saldo + "]");
        }
    }
}
