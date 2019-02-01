package javal2un3;
public class Exercicio08 {
   
  int a,b,c,delta; 
    
   int Formula(){
       
       return  (int) (a*Math.pow(b,2)+(-4*a*c));
   }
   
   int Raiz(){
       
      return (int) Math.sqrt(Formula());
   }
   
   int x1(){
       
       return (int) ( -b+Math.sqrt(Raiz())/(2*a));
   }
   
   int x2(){
       
       return (int) ( -b-Math.sqrt(Raiz())/(2*a));
       
   }
   
}
