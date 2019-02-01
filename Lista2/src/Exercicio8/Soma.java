package Exercicio8;
public class Soma {
   
  int x,a,b,c,delta; 
    
   int Resultado(){
       
       return  (int) (a*Math.pow(b,2)+(-4*a*c));
   }
   
   int Raiz(){
       
      return (int) Math.sqrt(Resultado());
   }
   
   int x1(){
       
       return (int) ( -b+Math.sqrt(Raiz())/(2*a));
   }
   
   int x2(){
       
       return (int) ( -b-Math.sqrt(Raiz())/(2*a));
       
   }
   
}
/*
((a*x*x)+(b*x)+c);
ax2+ bx + c.
 */