package REVISAO.pacotes.colaborador;

public class Vendedor {
    private String nome;

    Vendedor(String nome){
        this.nome = nome;
    }
    
   void setNome(String nome){
        this.nome = nome;
    }
    String getNome(){
        return this.nome;
    }
}
