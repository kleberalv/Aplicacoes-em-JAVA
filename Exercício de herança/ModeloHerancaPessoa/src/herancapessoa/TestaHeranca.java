package herancapessoa;

public class TestaHeranca {

    public static void main(String[] args) {
    Fornecedor f = new Fornecedor("Iocannam", "Ceilância", "18645486", "Brasil");
    deMoveis dm = new deMoveis("Lucas", "Águas Lindas", 145569, 3.000, "STAR Moveis", "Financeiro", 50.00);    
    deVeiculos dv = new deVeiculos("Marcis", "Santo Antônio", 1596873, 10.000, 10);   
    pessoaFisica pf = new pessoaFisica("Matheus", "Taguatinga", 22, "23698745820");
    pessoaJuridica pj = new pessoaJuridica("STAR Moveis", "Centro de Taguatinga", 20, "54661691498");
    
        System.out.println(f);
        System.out.println(dm); 
        System.out.println(dv);
        System.out.println(pf);
        System.out.println(pj);        
        
        
    }
    
}
