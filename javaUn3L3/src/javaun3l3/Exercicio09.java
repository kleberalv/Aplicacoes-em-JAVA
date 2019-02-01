package javaun3l3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio09 {

Scanner sc= new Scanner (System.in);
DecimalFormat df= new DecimalFormat("0.00");
int i=0,candidato,candidato1,candidato2,quantidade;

void Eleicoes(){       
    System.out.println("");
    System.out.println("Candidatos:");
    System.out.println("45 - Marina da malária.");
    System.out.println("13 - Luladrão");
    System.out.println("Em qual candidato você deseja votar?");
    System.out.println("");
    candidato=sc.nextInt();   
    while (candidato!=0){
        
        switch(candidato){
      
            case 45:
              candidato1= (candidato1+1);
              quantidade= (quantidade+1);
              System.out.println("Você votou no candidato: 45 - Marina da malária");
                System.out.println("");
                System.out.println("Para encerrar a votação, digite '0'"); 
                System.out.println("Candidatos:");
                System.out.println("45 - Marina da malária.");
                System.out.println("13 - Luladrão");
                System.out.println("Em qual candidato você deseja votar?");
                System.out.println("");
                  candidato=sc.nextInt();   
break;
            case 13:
              candidato2=(candidato2+1);
              quantidade= (quantidade+1);
              System.out.println("Você votou no candidato: 13 - Luladrão");
              System.out.println("");              
                System.out.println("Para encerrar a votação, digite '0' ");
                System.out.println("Candidatos:"); 
                System.out.println("45 - Marina da malária.");
                System.out.println("13 - Luladrão");
                System.out.println("Em qual candidato você deseja votar?");
                System.out.println("");
                  candidato=sc.nextInt();                
break;
 
            default: 
                System.out.println("Opção inválida!");
                  System.out.println("Para encerrar a votação, digite '0' ");
                  System.out.println("Candidatos:"); 
                  System.out.println("45 - Marina da malária.");
                  System.out.println("13 - Luladrão");
                  System.out.println("Em qual candidato você deseja votar?");
                  System.out.println("");
                    candidato=sc.nextInt();

        }
i++;

     }
    System.out.println("A quantidade que votou no candidato 45 - Marina da malária: "+candidato1);
    System.out.println("A quantidade que votou no candidato 13 - Luladrão: "+candidato2);
    System.out.println("A quantidade que votou nessas eleições é de: "+quantidade);

}
}