public class Main{

    private static Professor professor;

    public static void main(String []args){

        professor = new Professor("Jefferson");

        System.out.println("Nome: " + professor.getNome());
    }
}