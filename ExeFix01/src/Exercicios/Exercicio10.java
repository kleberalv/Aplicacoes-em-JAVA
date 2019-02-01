package Exercicios;
import java.util.Scanner;
public class Exercicio10 {
    
    

    
    public static void main(String[] args) {        
    float fabrica,destribuidor,fabricante,LucroDistribuidor,ValorImposto,resultado;
        Scanner entrada= new Scanner(System.in);
     
     

     
        System.out.println("Digite o valor do preço da fabrica e pressione ENTER: ");
        fabrica=entrada.nextInt();
        
        System.out.println("Digite o valor do percentual do destribuidor e pressione ENTER: ");
        destribuidor=entrada.nextInt();
        
        System.out.println("Digite o imposto do fabricante e pressione ENTER: ");
        fabricante= entrada.nextInt();
        
        LucroDistribuidor= (fabrica*destribuidor)/100;
        ValorImposto= (fabrica*fabricante)/100;
        
       resultado= fabrica+(LucroDistribuidor+ValorImposto);
       
        System.out.println("O lucror do distribuidor é de: "+LucroDistribuidor);
        System.out.println("O valor dos impsotos é de; "+ValorImposto);
        System.out.println("O valor total da venda do veiculo é de: "+resultado);
        
    }
    
}
