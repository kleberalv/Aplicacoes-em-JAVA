package Exercicio01;
import java.util.Scanner;

public class SomaDeQuatroNumeros {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
      Soma soma= new Soma();
        System.out.println("Digite quatro numeros e pressione ENTER: ");
            soma.n1=sc.nextInt();
            soma.n2=sc.nextInt();
            soma.n3=sc.nextInt();
            soma.n4=sc.nextInt();
            
            System.out.println(soma.CalculaAdicao());

    }
    
}