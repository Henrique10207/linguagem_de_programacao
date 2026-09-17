package Exercicios.ex_7_functions.ex4.exercicio2;

public class Main {
    static void nome(String aluno, int nota){
        System.out.print("Nome do aluno: " + aluno +" " + "Situacao: ");
        if(nota>=7){
            System.out.print("Aprovado");
        }else{
            System.out.print("Reprovado");
        }

        
    }
    public static void main(String[] args){
        nome("Jorge", 6);
    }
    

}
