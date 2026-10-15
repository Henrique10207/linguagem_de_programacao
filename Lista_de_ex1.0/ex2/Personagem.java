public class Personagem {
    
    String nome = "";
    int vida = 0;
    Tipo[] tipo;
    Poder[] poder;

    
public Personagem(String nome, int vida, String tipo, String poder){
    this.nome = nome;
    this.vida = vida;
    Tipo tipo1 = new Tipo(tipo);
    this.tipo[0] = tipo1;
    Poder poder1 =new Poder(poder1);
    this.poder[0] = poder1;

}
    public static void main(String[] args){
        
    }
}
