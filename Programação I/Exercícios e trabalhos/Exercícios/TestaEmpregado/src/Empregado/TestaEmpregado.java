package Empregado;
public class TestaEmpregado {

    public static void main(String[] args) {
        
        Empregado c = new Chefe("Kleber Alves", "053.645.987-96", "25/08/1999", "25896", "147852", 5000.0);
        Empregado s = new Supervisor("João Victor", "022.456.987-85", "29/11/1998", "22697", "199534", 2500.0);
        Empregado e = new Diretor("Ramiro", "024.106.947-87", "09/01/1999", "25657", "14756", 1500.0);
       
        System.out.println(c);
        System.out.println(s);
        System.out.println(e);
        
        
    }
    
}
