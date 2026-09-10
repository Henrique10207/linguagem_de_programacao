public class Main {
    public static void main(String[] args){
        int[] notas = {8,6,5,3};
 
        for(int i = 0; i<=notas.length; i++){

            if(notas[i] < 4){
                System.out.println("Sua nota foi de:"+ notas[i] + " portanto esta Reprovado");
            }
            if(notas[i] <6 && notas[i] > 4){
                System.out.println("Sua nota foi de:"+ notas[i] + " portanto esta de Recuperacao");
            }
            if(notas[i] >= 6){
                System.out.println("Sua nota foi de:"+ notas[i] + " portanto esta Aprovado");
            }
            
        }
    }
}
