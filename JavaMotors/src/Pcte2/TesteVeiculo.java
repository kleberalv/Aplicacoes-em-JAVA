/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Professor: Regis Lima
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package Pcte2;
import Pcte1.Leves;
import Pcte1.Pesados;
import Pcte1.Veiculo;
import java.util.Scanner;

public class TesteVeiculo {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Leves lev = new Leves("",0,0);
    Pesados pes = new Pesados("",0,0);
    Veiculo vei = new Veiculo("");
    Motor mot = new Motor("",0);
    
int op;    
        
    System.out.println("PROGRAMAS PARA VEÍCULOS: ");
    System.out.println("Qual o tipo do seu veículo?");
      System.out.println("1- Para veículo LEVE");
      System.out.println("2- Para veículo PESADO");
      op=sc.nextInt();
      
      switch (op){
          case 1:
            System.out.println("***** Veículo LEVE *****");
            System.out.println("Digite a marca de seu veículo e pressione ENTER: ");
            vei.setMarca(sc.next());
              System.out.println("Digite o ano de seu veículo: "); 
              vei.setAno(sc.nextInt());
                System.out.println("Digite o ano de fabricação de seu motor: ");
                lev.moto.setFab(sc.next());          
                  System.out.println("Digite o preço de seu motor: ");
                  lev.moto.setPreco(sc.nextInt());
                    System.out.println("Digite o número de passageiros: ");
                      lev.setnPass(sc.nextInt());

            System.out.println("\n***** DADOS DO VEÍCULO *****");    
            System.out.println(vei);
            System.out.println(lev.toString());
          break;
          
          case 2:
            System.out.println("***** Veículo PESADO *****");
            System.out.println("Digite a marca de seu veículo e pressione ENTER: ");
            vei.setMarca(sc.next());
              System.out.println("Digite o ano de seu veículo: "); 
              vei.setAno(sc.nextInt());
                System.out.println("Digite o ano de fabricação de seu motor: ");
                pes.moto.setFab(sc.next());
                  System.out.println("Digite o preço de seu motor: ");
                   pes.moto.setPreco(sc.nextDouble());
                     System.out.println("Digite o número do chassi: ");
                       pes.setNchass(sc.nextInt());

            System.out.println("***** DADOS DO VEÍCULO *****");     
            System.out.println(vei);
            System.out.println(pes.toString());
          break;
          
          default:
            System.out.println("OPÇÃO INVÁLIDA!!");
              
            
      }         
    }
    
}
