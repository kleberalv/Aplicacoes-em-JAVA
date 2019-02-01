/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javal2un3;
import java.util.Scanner;
public class TesteExercicio04 {

    
    
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
   Exercicio04 soma= new Exercicio04();
        System.out.println("Digite a largura e pressione ENTER: ");
        soma.largura=sc.nextFloat();
        System.out.println("Digite o comprimento e pressione ENTER: ");
        soma.comprimento=sc.nextFloat();        
        System.out.println("Digite a altura e pressione ENTER: ");
        soma.altura=sc.nextFloat(); 
        
        
        System.out.println("O volume do objeto é igual a: "+soma.Volume()+" CM³");
    }
    
}
