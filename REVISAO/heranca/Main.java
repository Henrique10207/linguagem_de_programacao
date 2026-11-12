import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Professor> professores = new ArrayList<>();
    private static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args){

        professores.add(new Professor("prof1"));    
        professores.add(new Professor("prof2"));    
        professores.add(new Professor("prof3")); 
        
        alunos.add(new Aluno("al1"));    
        alunos.add(new Aluno("al2"));    
        alunos.add(new Aluno("al3")); 

        for (Professor prof : professores) {
            System.out.println("Esse eh o " + prof.getNome());
            
        }

        for (Aluno al : alunos) {
            System.out.println("Esse eh o " + al.getNome());
            
    }
    
}
}