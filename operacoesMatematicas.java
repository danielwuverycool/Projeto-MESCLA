package MESCLA;

import java.util.Scanner;

public class operacoesMatematicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro num: ");
        double num1 = scanner.nextDouble();
        System.out.print("Operador: ");
        char op = scanner.next().charAt(0);
        System.out.print("Ultimo num: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        boolean validOperator = true;

        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Divisor invalido");
                    validOperator = false;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("Operacao invalida");
                validOperator = false;
            }
        }
        if (validOperator) {
            System.out.println("Resultado: " + result);
        }
    }
}
