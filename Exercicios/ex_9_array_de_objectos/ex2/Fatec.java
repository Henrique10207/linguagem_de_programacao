public class Fatec {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Jorge", "Jorge@gmailcom");
        Aluno aluno2 = new Aluno("Jorja", "Jorja@gmailcom");
        Aluno aluno3 = new Aluno("Jegue", "Jegue@gmailcom");
        Aluno aluno4 = new Aluno("Savalo", "Savalo@gmailcom");
       
        Aluno[] banco_de_dados = {aluno1,aluno2,aluno3,aluno4};

        for(Aluno dados : banco_de_dados){
            System.out.println("\nO nome do aluno eh " + dados.nome + "e seu email eh " + dados.email);
        }
        System.out.println("\n");
    }
    
}
