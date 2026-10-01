public class Main {


    public static void main(String[] args){
        Veiculo car1 = new Veiculo("Fiat", "Uno");
        Veiculo car2 = new Veiculo("BYD", "Compact 2026");
        Veiculo car3 = new Veiculo("Honda", "Civic");
        Veiculo car4 = new Veiculo("Gurgel", "Gurgel 1960");

        // System.out.println("\nCarro 1: \n"+"         " + "A marca eh " + car1.marca + " e o modelo eh " + car1.modelo);
        // System.out.println("\nCarro 2: \n"+"         " + "A marca eh " + car2.marca + " e o modelo eh " + car2.modelo);
        // System.out.println("\nCarro 3: \n"+"         " + "A marca eh " + car3.marca + " e o modelo eh " + car3.modelo);
        // System.out.println("\nCarro 4: \n"+"         " + "A marca eh " + car4.marca + " e o modelo eh " + car4.modelo + "\n");

        Veiculo[] estacionamento = {car1, car2, car3, car4};
        
        for(Veiculo vagas : estacionamento){
            System.out.println("\nMarca: " + vagas.marca + "\n     Modelo: " + vagas.modelo);
        }

    }
    
}
