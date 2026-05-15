public class Exercicio_3 {
    public static void main(String[] args){
        double salario = 4500.50;
        double imposto = 0;
        if (salario <= 2000){
            imposto = 0;
        } else if (2000 < salario && salario <= 4000){                         //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!IMPORTANTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            imposto = salario * 0.15;
        } else if (salario > 4000){
            imposto = salario * 0.2;
        }

        System.out.println("O salário é R$" + "[" + (int)salario + "]" + " e o imposto a ser pago ao Rei é de " + "[" + (int)imposto + "]" + " moedas de ouro.");
    }
}
