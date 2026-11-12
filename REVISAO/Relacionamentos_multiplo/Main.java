import java.util.List;
import java.util.ArrayList;

public class Main{
    private static List<Professor> professor = new ArrayList<>();
    private static List<Aluno> aluno = new ArrayList<>();

    public static void main(String []args) {
        professor.add(new Professor("Kleber"));
        professor.add(new Professor("Jeremias"));
        professor.add(new Professor("Samuel"));

        aluno.add(new Aluno("Leleu"));
        aluno.add(new Aluno("Rafael"));
       
        for (Professor prof : professor) {
            System.out.println("Nome do professor: " + prof.getNome());
        }
        for (Aluno al : aluno) {
            System.out.println("Nome do aluno: " + al.getNome());
        }
    }
}