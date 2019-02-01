package Vetor;
public class TestaVetor {

    public static void main(String[] args) {

    int [] vetor = new int[10];   
    vetor[1]=100;
    vetor[2]=1100;
    vetor[3]=11100;
    vetor[4]=10011;
    vetor[5]=10110;
    vetor[6]=10110;
    vetor[7]=10110;
    
        System.out.println("um teste! "+vetor[1]);
        System.out.println("um teste! "+vetor[2]);
        System.out.println("um teste! "+vetor[3]);
        System.out.println("um teste! "+vetor[4]);
        System.out.println("um teste! "+vetor[5]);
        System.out.println("um teste! "+vetor[6]);
        System.out.println("um teste! "+vetor[7]);
        System.out.println("um teste! "+vetor[8]);
        System.out.println("um teste! "+vetor[9]);
        
        for (int i=0; i<vetor.length;i++){
            System.out.println(vetor[i]);
            
        }
        
    }
    
}
