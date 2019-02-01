package Questoes;
import java.util.Scanner;
public class Questao04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int resu=0,i=0,e=0;
        System.out.println("Programa para imprimir a soma dos números de 1 até 1000");
        System.out.println("Informe a opção desejada: ");
        System.out.println("1- Para fazer com FOR");
        System.out.println("2- Para fazer com DoWhile");
        System.out.println("3- Para fazer com While");
        e=sc.nextInt();
        System.out.println("_____________________");
        
switch(e){

//______________________________________________________________________________    
    case 1:
        
for (i=0;i<=1000;i++) {
        
resu+=i+1; 

    System.out.println(resu);
    }
break;

//______________________________________________________________________________
    case 2:
        
 do{
     resu+=i+1;
     i++;
     System.out.println(resu);
 }
 while(i<=1000);
 
 break;
 
 //_____________________________________________________________________________
    case 3:

 while(i<=1000){
     resu+=i+1;
     i++;
     System.out.println(resu);
    } 
 break;
    default:
        System.out.println("Opção inválida!");
 }
}
}
