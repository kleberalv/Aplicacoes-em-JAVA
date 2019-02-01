package javal2un3;
public class Exercicio06 {
    
    double altura, base;
    
    float Area(){
      return (float) (altura*base);

    }
    
    float Perimetro(){
      return (float) (2*(altura*base));
    }
    
    float Diagonal(){
      float d2= (float) (Math.pow(base,2)
          +Math.pow(altura,2));
        
      return (float) (Math.sqrt(d2));  
    }
}
