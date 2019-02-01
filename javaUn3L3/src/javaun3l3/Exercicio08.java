package javaun3l3;
import java.util.Scanner;
public class Exercicio08 {
  Scanner sc= new Scanner (System.in);
int i=1,idade,r1,r2,r3,r4,r5,r6,r7,r8,r9;
float peso, altura;

//r1= Jogadores com menos de 20 anos
//r2= Media de idade do time
//r3= A média da altura dos jogadores com menos de 20 anos
//r4= A porcentagem de jogadores com mais de 70 kg
//r5= Faz a divisão do r2
//r6= Contador
void jogadores(){
          
    while (i<=3){
        
        System.out.println("");
        System.out.println("Dados do jogador Nº"+i);
        System.out.println("Digite sua idade e pressione ENTER:  ");
        idade=sc.nextInt();
        r2= (r2+idade); 
          if (idade < 20){  
            r1= (r1+1); 
          }
          
        System.out.println("Digite sua altura e pressione ENTER: ");
        altura=sc.nextFloat();
          if (idade< 20){  
            r6=(r6+1);  
            r3 =(int) (r3+altura);  
          }
          
        System.out.println("Digite seu peso e pressione ENTER: ");
        peso=sc.nextFloat();
        r8= (int) (r8+peso); 
 
i++;
r5= r2/11;
r7=r3/r6 ;
r9= r8/11;
        }
            System.out.println("");
            System.out.println("A quantidade de jogadores menores de 20 anos é de: "+r1);            
            System.out.println("A média de idade do time é de: "+r5);
            System.out.println("A média das altura dos jogadores com menos de 20 é de: "+r7);
            System.out.println("A porcentagem de jogadores com mais de 70kg é de: "+r9+"%");

}
}
