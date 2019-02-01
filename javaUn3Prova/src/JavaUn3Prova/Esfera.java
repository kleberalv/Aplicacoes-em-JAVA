package JavaUn3Prova;
import java.util.Scanner;
public class Esfera {
  Scanner sc = new Scanner(System.in);
  TesteEsfera leia = new TesteEsfera();    
double raio;    
    
void RaiodaEsfera(){

         System.out.println("Digite o raio da esfera e pressione ENTER: ");    
         raio=sc.nextDouble();
         
             System.out.println("O Volume da esfera é: "+volume_esfera());
    
}
        
int volume_esfera(){
  
    return (int) ((4/3)*Math.PI*(raio*raio));    
}
    
    
}
