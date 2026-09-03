package Exercicios.ex_3;

public class Main {
    public static void main(String[] args) {
        int idade = 5;
        if (idade <= 12) {
            System.out.println("Criança");
        }
        else if (idade > 14 && idade <= 17) {
            System.out.println("Adolescente");
        }
        else if (idade>=18 && idade < 58) {
            System.out.println("Adulto");
        }
        else if (idade >= 59) {
            System.out.println("Idoso");
    }
    
}
    
}
