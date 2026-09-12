public class Main {
    public static void main(String[] args){

        int y=0;

        for(int i=0;i<=100; i++){
            System.out.print(i);

            if(i==100){
                System.out.print(" = ");
            }else{
                System.out.print(" + ");
            }

            y+=i;
        }

                System.out.print(y);
        
    }

}
