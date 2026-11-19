public class Moto {
    int valor_Moto = 12;

    private String marca;
    private String modelo;
    private String placa;

    
    public Moto(String marca,String modelo,String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    //____________________________________________________
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
   //___________________________________________________ 
   
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }

    
}
