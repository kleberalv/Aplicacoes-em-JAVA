package javaun3tst1;
import java.util.Scanner;
/**
 * Teste JAVA
 * Escola Técnica de Brasilia
 * @author Kleber Alves Bezerra Junior
 * Turma: 2º "A"
 * GT5
 * Lista2 Exercício 02
 */
public class testeexercicio2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    
    exercicio2 leia = new exercicio2();
    
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        leia.n1=sc.nextFloat();
        System.out.println("Digite o segundo número e pressione ENTER: ");
        leia.n2=sc.nextFloat();
        System.out.println("Digite o terceito número e pressione ENTER: ");
        leia.n3=sc.nextFloat();
        
        System.out.println("O número digitado: "+leia.n1+" em decimal é: "+leia.Convertern1() );
        System.out.println("O número digitado: "+leia.n2+" em decimal é: "+leia.Convertern2() );
        System.out.println("O número digitado: "+leia.n3+" em decimal é: "+leia.Convertern3() );
    }
    
    
/**
 * Quando o usuário digitar números quebrados, o programa irá mostrar em
 * seu resultado o número que ele digitar mas em inteiro.
*/ 
}
