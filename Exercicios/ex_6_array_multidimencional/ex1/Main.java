package Exercicios.ex_6_array_multidimencional.ex1;

public class Main {
    public static void main(String[] args){
        int[][] matriz = {{5,9,6,7}, {78,89,54,24}, {62,25,34,69}, {51,30,29,81}};

        // System.out.println(matriz[2][3]);
        
        //     for(int x=0; x<=3; x++){
        //         for( int y=0; y <= 3; y++){
        //         System.out.println(matriz[x][y]);
        //     }
        // }
        
            for(int x=0; x<=3; x++){
                for( int y=0; y <= 3; y++){
                    matriz[x][y] = 0;
                System.out.println(matriz[x][y]);
            }
        }


    }
}




