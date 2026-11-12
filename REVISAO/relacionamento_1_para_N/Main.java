import java.util.List;
import java.util.ArrayList;

public class Main{
    private static List<Professor> professor = new ArrayList<>();

    public static void main(String []args) {
        professor.add(new Professor("Kleber"));
        professor.add(new Professor("Jeremias"));
        professor.add(new Professor("Samuel"));
       
        for (Professor prof : professor) {
            System.out.println("Nome: " + prof.getNome());
        }
    }
}