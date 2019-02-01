package abstrataPessoa;

public class TestaPessoa {

    public static void main(String[] args) {

        Aluno a = new Aluno("Informática", "Kleber", 19, "Areal", 
                  new Filiacao ("Kleber Alves", "Maria do Socorro"));
        
        Professor p = new Professor("Mestre em Informática", "Área tecnológica", "Vinícius", 43, "QNL",
                      new Filiacao("Pedro", "Julia"));
        
        System.out.println(a);
        System.out.println(p);
        
    }
    
}
