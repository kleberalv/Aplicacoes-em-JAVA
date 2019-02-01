package javaun3l3;
import java.util.Scanner;
public class Exercicio10 {

Scanner sc= new Scanner (System.in);
int i,matricula=1,matriculanova,idade,ec,r1,r2,r3,r4,s1,s2,maior=0,menor=9999;

void EnqueteEmpresa(){    
 
while (matricula>0){ 
  System.out.println("Para encerrar a enquete, digite um número menor que 0");
  System.out.println("Bem-vindo!"); 
  
          System.out.println("Digite sua matricula e pressione ENTER: ");
          matricula=sc.nextInt();  
          if (matricula>0){
              
          
    System.out.println("Digite sua idade e pressione ENTER: ");
    idade=sc.nextInt();
      System.out.println("Por gentileza, informe seu estado civil: ");
      System.out.println("");
      System.out.println("1- Para casado");
      System.out.println("2- Para solteiro");
      System.out.println("3- Para viúvo");
      System.out.println("4- Para desquitado");
      ec=sc.nextInt();
      System.out.println("=====================================================");
   

      
        if (ec==1){
          r1=(r1+1);
          
          }
     
        if (ec==2 && idade>=20 && idade<=30){ 
          r2=(r2+1);
             
         }

        if (ec==3){
          r3=(r3+1);
          s1=(s1+1);   
         }

        if (ec==4){
          r4=(r4+1);
         }
        if (maior<idade){
          maior=idade;
        }
        
         if (menor>idade){
             maior=idade;
             matriculanova=matricula;
         }
i++;
}
          else{
         System.out.println("Fim do programa...");
          }
          }
}

double porcent(){
    return (r4*100)/i;
}

double media(){
    return (s2/r3);
}

void resultado(){

         System.out.println("Quantidade de casados: "+r1);
         System.out.println("Quantidade de solteiros entre 20 e 30 anos: "+r2);
         System.out.println("A média de pessoas viuvas: "+media());
         System.out.println("A porcentagem de pessoas desquilitadas entre todas as analisadas: "+porcent()+"%");
         System.out.println("A idade da pessoa mais velha: "+maior);
         System.out.println("A matricula da pessoa mais nova: "+matriculanova);    
}


}