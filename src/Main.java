import java.util.Scanner;

public class Main {
    private static final String API_KEY = "11a200ef08d7821467f6b102";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas conversor = new ConversorDeMoedas(API_KEY);
        Menu menu = new Menu(conversor);

        try {
            while (true) {
                menu.exibirMenu();
                int opcode = Integer.parseInt(scanner.nextLine());
                if (opcode == 0) {
                    System.out.println("Saindo...");
                    return;
                }
                menu.processarOpcao(opcode);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
