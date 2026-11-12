package REVISAO.pacotes.cliente;

public class Cliente {
    private String nome;

    Cliente(String nome){
        this.nome = nome;
    }
    
   void setNome(String nome){
        this.nome = nome;
    }
    String getNome(){
        return this.nome;
    }
    
}
