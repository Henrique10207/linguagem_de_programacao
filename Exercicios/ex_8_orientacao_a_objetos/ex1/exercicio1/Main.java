public class Main {
    public static void main(String[] args){

        System.out.println("\n");

        Carros carro = new Carros();

            carro.marca = "Chevrolet";
            carro.modelo = "Camaro";
            carro.combustivel = "odio";
            carro.cor = "amarelo";

                System.out.println(carro.marca);
                System.out.println(carro.modelo);
                System.out.println(carro.combustivel);
                System.out.println(carro.cor);
                    carro.ligarMotor();
                    carro.desligarMotor();
        
        System.out.println("\n");

        Moto motos = new Moto();

        motos.marca = "yamaha";
        motos.modelo = "R15";
        motos.combustivel = "gasolina";
        motos.cilindradas = 150;

        System.out.println(motos.marca);
        System.out.println(motos.modelo);
        System.out.println(motos.combustivel);
        System.out.println(motos.cilindradas);
        motos.ligarMoto();
        motos.desligarMoto();
        
        System.out.println("\n");

        Helicoptero voador = new Helicoptero();

        voador.marca = "Porsche";
        voador.modelo = "3 helices";
        voador.ano = 2000;

        System.out.println(voador.marca);
        System.out.println(voador.modelo);
        System.out.println(voador.ano);
        voador.ligarHelice();
        voador.desligarHelice();

        System.out.println("\n");

        Balao voador2 = new Balao();

        voador2.limite_pessoas = 6;


        System.out.println(voador2.limite_pessoas);
        voador2.acender();
        voador2.subir();
        voador2.descer();

    }
    
}
