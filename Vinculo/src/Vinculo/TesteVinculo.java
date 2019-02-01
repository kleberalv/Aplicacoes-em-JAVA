/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package Vinculo;
public class TesteVinculo {

    public static void main(String[] args) {    
    Conta cor = new Conta();   
    
     cor.dono.setNome("Kleber");
     cor.dono.setEndereco("Areal");
     cor.dono.setCPF("070-329-641-84");
     cor.setLimite(1000);
     cor.setNumero(1);
     cor.Depositar(500);
        System.out.println(cor);
    }
    
}
