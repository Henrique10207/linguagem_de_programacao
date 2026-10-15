public class Personagem {
    
    String nome;
    int vida;
    List<Tipo> tipo;
    List<Poder> poder;

    
public Personagem(String nome, int vida, String tipo, String poder){
    this.nome = nome;
    this.vida = vida;
    Tipo tipo1 = new Tipo(tipo);
    this.tipo.add(tipo1);
    Poder poder1 = new Poder(poder);
    this.poder.add(poder1);

}

    public void setNome(String nome){
        this.nome = nome;
    }
    String getvida(){
        return this.nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }
    int getNome(){
        return this.vida;
    }
    public static void main(String[] args){

        Personagem person1 = new Personagem("Jorge", 45, "lutador", "super força");
        Personagem person2 = new Personagem("Flash", 78, "velocista", "Super velocidade");
        

        List<Personagem> personagens;
        personagens.add(
            new Personagem ("Jorge", 45, "lutador", "super força"),
            new Personagem ("Flash", 78, "velocista", "Super velocidade")
        );
        
        for(Personagem persona : personagens){
            System.out.println("Nome: ", + persona.getNome());
        }

    }
}
