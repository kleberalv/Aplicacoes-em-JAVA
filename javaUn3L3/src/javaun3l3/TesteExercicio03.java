/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javaun3l3;
import java.util.Scanner;
public class TesteExercicio03 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Exercicio03 soma=new Exercicio03();

        System.out.println("Bem-Vindo a sua calculadora virtual!");
        System.out.println("Informe o que você deseja: ");
        System.out.println("1- Para: Média entre os números digitados.");
        System.out.println("2- Para: Produto entre os números digitados.");
        System.out.println("3- Para: Divisão entre os números digitados.");
        System.out.println("4- Para: Divisão do maior pelo menor.");
        soma.opcao= sc.nextInt();
        System.out.println("Digite o primeiro número e pressione ENTER: ");
        soma.n1=sc.nextInt();
        System.out.println("Digite o Segundo número e pressione ENTER: ");
        soma.n2=sc.nextInt();  
        
soma.mediaNumeros();
       
        
    }
    
}
