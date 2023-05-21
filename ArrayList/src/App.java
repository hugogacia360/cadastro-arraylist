import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        if (Agenda.login(new Scanner(System.in)) != null) {
            Menu menu = new Menu();
            menu.menuPrincipal();
        }

    }

}
