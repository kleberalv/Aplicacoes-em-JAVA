package Figuras;
public class TrianguloEquil extends Figuras {
    
private int L1, L2,h;   

    public int getL1() {
        return L1;
    }

    public void setL1(int L1) {
        this.L1 = L1;
    }

    public int getL2() {
        return L2;
    }

    public void setL2(int L2) {
        this.L2 = L2;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
 
    public int A (int L1, int L2){
        L1=L2;
        return (L1*h/2);
    }  
    
    public int PE (int L1, int L2){
   
        return L1*3;       
    }
    
    @Override
    public String toString() {
        return "Perímetro do Triangulo equilátero: "+this.PE(L1, L2)+"m"+
                "\nÁrea do triangulo equilátero: "+this.A(L1, h)+"m³";
    }
}
