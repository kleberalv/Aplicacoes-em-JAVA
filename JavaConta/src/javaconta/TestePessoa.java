/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package javaconta;
import java.util.Scanner;
public class TestePessoa {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    Pessoa pessoa = new Pessoa();
    
        System.out.println("Digite o nome e pressione ENTER: ");
        pessoa.setNome(sc.nextLine());
        
        System.out.println("Digite a idade e pressione ENTER: ");
        pessoa.setIdade(sc.nextInt());
        
        System.out.println("Nome digitado: "+pessoa.getNome());
        System.out.println("Idade digitada: "+pessoa.getIdade());
    }
    
}
