/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javaun3l3;
import java.util.Scanner;
public class TesteExercicio01 {


    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Exercicio01 soma= new Exercicio01();
        System.out.println("Esse programa irá mostrar o maior número digitado.");
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1=sc.nextInt();
        System.out.println("Digite o segundo número e pressione ENTER: ");
        soma.n2=sc.nextInt();
        
        soma.maiorNumero();
        
        
        
    }
    
}
