public class Main {
    public static void main(String[] args){
        int positivos=0;
        int[] numeros = {6, 2,1,5, -5,-9,-7,-1};
        for(int  i=0; i<numeros.length; i++){
            
            if(numeros[i]<0){
                positivos++;
            }
            
        }
        System.out.println(positivos);
    }    
}
