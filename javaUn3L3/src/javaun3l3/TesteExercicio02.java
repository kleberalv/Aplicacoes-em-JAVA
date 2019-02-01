/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javaun3l3;
import java.util.Scanner;
public class TesteExercicio02 {

    public static void main(String[] args) {
    Exercicio02 soma= new Exercicio02();
    Scanner sc=new Scanner(System.in);
   
        System.out.println("Digite o seu salario e pressione ENTER: ");
        soma.salario=sc.nextInt();
        
        soma.novoSalario();
        
        
    }
    
}
