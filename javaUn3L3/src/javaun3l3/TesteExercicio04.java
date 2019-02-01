/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javaun3l3;
import java.util.Scanner;
public class TesteExercicio04 {

    public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    Exercicio04 soma= new Exercicio04();
    
        System.out.println("Bem- vindo ao programa de alteração salarial!");
        System.out.println("Informe seu salário e pressione ENTER: ");
        soma.salario=sc.nextInt();
        System.out.println("Informe o código de seu cargo e pressione ENTER: ");
        soma.conta=sc.nextInt();
        
soma.novoSalario();
    }
    
}
