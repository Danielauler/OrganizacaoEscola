package aula11;
public class Aula11 {

    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(21);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());*/
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(20);
        a1.setMatricula(1111);
        a1.setCurso("Matematica");
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Joao");
        b1.setMatricula(1111);
        b1.setBolsa(2.5f);
        b1.pagarMensalidade();
                
    }
    
}
