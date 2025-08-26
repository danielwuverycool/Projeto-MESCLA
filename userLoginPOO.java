package MESCLA;

import java.util.Scanner;


public class userLoginPOO {
    private final String login = "admin";
    private final String password = "admin1234#";


    String getLogin() {
        return login;
    }

    String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLogin;
        String inputPassword;

        System.out.println();

        userLoginPOO User = new userLoginPOO();

        System.out.print("Login: ");
        inputLogin = scanner.nextLine();
        System.out.print("Senha: ");
        inputPassword = scanner.nextLine();

        if (inputLogin.equals(User.getLogin())&&inputPassword.equals(User.getPassword())) {
                System.out.println("Entrou no sistema");
        }
        else {
            System.out.println("Usuario e/ou senha incorretos");
        }
    }
}

