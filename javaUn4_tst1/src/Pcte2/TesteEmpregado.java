/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package Pcte2;
import java.util.Scanner;
import Pcte1.Empregado;
public class TesteEmpregado {
    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      Empregado emp= new Empregado();
        
        System.out.println("Programa para situação dos empregados.");
        System.out.println("Nome: ");
        emp.setNome(sc.next());
        System.out.println("Digite seu salário: ");
        emp.setSalario(sc.nextDouble());
        System.out.println("Entre com a percentagem de sua bonificação: ");
        emp.bonifica(sc.nextDouble());
        System.out.println("Digite o departamento: ");
        emp.setDpto(sc.next());       
        System.out.println("Digite sua situação (True para ATIVO e FALSE para demitido: ");
        emp.demite(sc.nextBoolean());
        System.out.println(emp.toString());      
    }
    
}