import java.util.Scanner;

public class Menu {


    public void menuPrincipal() {


         Agenda agenda = new Agenda();

        int opc = 0;

        while (opc != 7) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Adicionar novo contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Mostrar todos contatos");
            System.out.println("5 - Apagar todos os contatos");
            System.out.println("6 - Sair");
            opc = new Scanner(System.in).nextInt();

            switch (opc) {
                case 1:
                    agenda.adicionaNovoContato(new Scanner(System.in));
                    break;
                case 2:
                    System.out.println("Digite o nome do contato que deseja remover:");
                    agenda.removerContato(agenda.buscarContato(new Scanner(System.in).nextLine()));
                    break;
                case 3:
                    System.out.println("Digite o nome do contato que deseja buscar:");
                    System.out.println(agenda.buscarContato(new Scanner(System.in).nextLine()));
                    break;
                case 4:
                    agenda.imprimir();
                    break;
                case 5:
                    agenda.apagarAgenda();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    }
}
