import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    ArrayList<Contato> lista = new ArrayList<Contato>();

    public static Agenda login(Scanner scan) {
        System.out.println("Digite o nome do usuário:");
        String nome = scan.nextLine();

        System.out.println("Digite a senha:");
        String senha = scan.nextLine();
        //equals() é um método da classe String que compara duas strings e retorna true se forem iguais
        if (nome.equals("admin") && senha.equals("admin")) {
            return new Agenda();
            //se o usuário e a senha estiverem corretos, cria e retorna um objeto agenda
        } else {
            System.out.println("Usuário ou senha incorretos!");
            return null;
        }
    }

    public void adicionaNovoContato(Scanner scan) {
        System.out.println("Digite o nome do novo contato:");
        String nome = scan.nextLine();

        System.out.println("Digite o e-mail do novo contato:");
        String email = scan.nextLine();

        System.out.println("Digite o telefone do novo contato:");
        String telefone = scan.nextLine();

        System.out.println("Digite o endereço do novo contato:");
        String endereco = scan.nextLine();

        lista.add(new Contato(nome, email, telefone, endereco));
        //add() é um método da classe ArrayList que adiciona um elemento na lista
    }

    public void removerContato(Contato contato) {
        lista.remove(contato);
        //remove() é um método da classe ArrayList que remove um elemento da lista
    }

    public void imprimir() {
        //forEach é um método da classe ArrayList que recebe como parâmetro uma função lambda
        // forEach percorre todos os elementos da lista e executa a função lambda para cada elemento
        //funções lamba são muito usadas em arrays e arraysLit 
        lista.forEach(contato -> System.out.println(contato.toString()));

        /*
          Outra forma de fazer o metodo imprimir:
          for(int i=0; i<lista.size(); i++){
          System.out.println(lista.get(i)); 
          }
        */
    }
   
  ////essa função retorna o contato que tem o nome igual ao nome passado como parâmetro mas se não encontrar retorna null
    public Contato buscarContato(String nome) {
        //size() é um método da classe ArrayList que retorna o tamanho da lista
        for(int i=0; i<lista.size(); i++){
            //equalsIgnoreCase compara duas strings ignorando se as letras são maiúsculas ou minúsculas
            if(lista.get(i).getNome().equalsIgnoreCase(nome)){
                //get(i) é um método da classe ArrayList que retorna o elemento da posição i
                //get(i) acessa o elemento da posição i depois de acessar esse elemento getNome() acessa o nome desse elemento
            return lista.get(i);
            }
        }
        return null;
    }

    public void apagarAgenda() {
        lista.clear();
        //clear() é um método da classe ArrayList que apaga todos os elementos do ArrayList
    }
}
