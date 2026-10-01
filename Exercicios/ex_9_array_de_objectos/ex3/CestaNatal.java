public class CestaNatal {
    public static void main(String[] args){

        Itens iten1 = new Itens(2599, "chocolate", 3, 8.99);
        Itens iten2 = new Itens(25624, "bolinho", 2, 3.99);
        Itens iten3 = new Itens(25751, "vinho", 1, 12.99);
        Itens iten4 = new Itens(2356, "panetone", 1, 22.58);

        Itens[] catalogo={iten1, iten2, iten3, iten4};

        System.out.println("\n");

        for( Itens produtos : catalogo){
            System.out.println("Item " + produtos.nome + " adicionado a cesta. \n Preco: " + produtos.preco + "   Quant: " + produtos.quantidade + "   Cod.: " + produtos.codigo);
        }

        System.out.println("\n");

    }
}
