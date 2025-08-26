package MESCLA;

import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLogin;
        String login = "admin";
        String inputPassword;
        String password = "admin1234#";

        System.out.print("Usuario: ");
        inputLogin = scanner.nextLine();
        System.out.print("Senha: ");
        inputPassword = scanner.nextLine();

        if (inputLogin.equals(login) && inputPassword.equals(password)) {
                System.out.println("Entrou no sistema");
        }
        else {
            System.out.println("Senha ou usuario errado");
        }

        scanner.close();
    }
}
