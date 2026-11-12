import REVISAO.pacotes.colaborador.Vendedor;
import REVISAO.pacotes.cliente.Cliente;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Vendedor> vendedores = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>(); 
    public static void main(String[] args){

        vendedores.add(new Vendedor("Kleber"));
        
        clientes.add(new Cliente("Rafael"));
       
        for (Professor prof : professor) {
            System.out.println("Nome do professor: " + prof.getNome());
        }
        for (Aluno al : aluno) {
            System.out.println("Nome do aluno: " + al.getNome());
        }

    }
    
}
