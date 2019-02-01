package Pcte2;
public class Motor {
    
private String tipMotor;
private float potencia;
private double preMotor;

    public String getTipMotor() {
        return tipMotor;
    }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public double getPreMotor() {
        return preMotor;
    }

    public void setPreMotor(double preMotor) {
        this.preMotor = preMotor;
    }

    public double preComp(float v1){
        
    if (potencia==1.0){
        System.out.println("Acressimo de 500 reais no valor final.");
        this.preMotor= this.preMotor+500;
        
    }else{
        if (potencia==2.0){
            System.out.println("Acressimo de 600 reais no valor final.");
            this.preMotor= this.preMotor+600;
        }else
            System.out.println("Não há acressimo.");
    }    
        
        return 0;
    }
    
    public String toString(){
      
     return "\nTipo do motor: "+this.tipMotor +
             "\nA potência é: "+ this.potencia +
             "\nPreço do motor é:  "+this.preMotor;   
      
    }









}
