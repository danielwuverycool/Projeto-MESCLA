package MESCLA;

import java.sql.*;
import java.util.Scanner;

public class userLoginSQL {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/userinfo",
                    "root",
                    "1234"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM userinfotable");


            while (resultSet.next()) {
                String inputLogin;
                String login = resultSet.getString("username");
                String inputPassword;
                String password = resultSet.getString("password");

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

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}


