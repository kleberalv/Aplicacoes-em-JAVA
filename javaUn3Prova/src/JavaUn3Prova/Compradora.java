package JavaUn3Prova;
import java.util.Scanner;
public class Compradora {
  Scanner sc= new Scanner(System.in); 
    
double n1,n2,produto,quadrado; 

void Numeros(){
    
    System.out.println("Entre com o primeiro número: ");
    n1=sc.nextDouble();
    System.out.println("Entre com o segundo número: ");
    n2=sc.nextDouble();
    
}

int Valores(){
    
if (n1==n2){
    
    quadrado=(int) Math.pow(n1, n2);
    System.out.println("Valores iguais!!");
    System.out.println("Quadrado do número "+n1+" é: "+quadrado);
}else

if (n1!=n2){
    
    produto=(int) Math.pow(n1, n2);  
    System.out.println("Valores diferentes!!");
    System.out.println("Produto entre os números: "+n1+" e "+n2+" é : "+produto);
    
    
}    
      
    
return 0;    
}
    
    
 /**
*Prática 2. (Use a classe Math )
*Crie uma classe Comparadora que leia dois valores decimais e compare se esses valores são iguais. 
* Caso positivo imprima “Valores iguais” e mostre o quadrado do numero, 
* senão imprima “Valores diferentes” e mostre o produto entre eles.
* O quadrado do numero e o produto entre eles deve ser mostrado como inteiro. 
*Sugestão: Faça o casting para int para obter as respostas.
*/
    
    
    
    
    
    
    
    
    
    
    
    
    
}
