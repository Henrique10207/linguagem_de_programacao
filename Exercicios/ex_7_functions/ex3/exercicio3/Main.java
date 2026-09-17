package Exercicios.ex_7_functions.ex3.exercicio3;

public class Main {
    static boolean ligarInterruptor(){
        if(passarEletricidade()==true){
            if(acenderLampada()==true){
            System.out.println("Lampada acendeu!");
            return true;
            }else{
            System.out.println("Lampada queimou!");
            return false;
            }
        } else {
            System.out.println("Problema no circuito!");
        }
        return false;

    }
        
    static boolean acenderLampada(){
        return true;
    }

    static boolean passarEletricidade(){
        return true;
    }

    public static void main(String[] args){
        if(ligarInterruptor()==true){
        System.out.println("Processo funcionou!");
        } else{
            System.out.println("Processo falhou!");
        }

    }

}
