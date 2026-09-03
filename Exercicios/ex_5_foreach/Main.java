package Exercicios.ex_5_foreach;

public class Main {
    public static void main(String[] args){

        // String[] alunos = {"Miranata", "Savalo", "Aeronauta"};

        // alunos[0] ="Jorge";
        // System.out.println("Qntd de alunos" + alunos.length);

        // for(String estudante : alunos){
        //         System.out.println(estudante);
        //     }

        // String[] produtos = {"papel", "caneta", "borracha", "clips", "lapiseira"};

        // for(String papelaria : produtos){
        //     System.out.println(papelaria);
        // }

        // String[] produtos = {"papel", "caneta", "borracha", "clips", "lapiseira"};

        // for(int i = 0; i <  produtos.length; i++){
        //     System.out.println(produtos[i]);
        // }

        int[] notas = {9, 6, 0, -1, -6};

            for(int alunos : notas){
                if(alunos < 0)
                    System.out.println("O valor de:" + alunos  + "eh Negativo");
                if(alunos == 0)
                    System.out.println("O valor de:" + alunos + "eh Zero");
                if(alunos > 0)
                    System.out.println("O valor de:" + alunos + "eh Positivo");
             }
            
        
    }

}
