package Questoes;
import java.util.Scanner;
public class Questao05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

int total, imposto, dist, custofab;

        System.out.println("Informe o custo da fábrica de um carro: ");
        custofab=sc.nextInt();
        
        imposto=(45*custofab)/100;
        dist=(20*custofab)/100;
        
        total=(custofab+imposto+dist);
        
        System.out.println("O carro irá sair por: "+total);
     
    }
    
}
