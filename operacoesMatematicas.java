package MESCLA;

import java.util.Scanner;

public class operacoesMatematicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro num: ");
        double num1 = scanner.nextDouble();
        System.out.println("Operador: ");
        char op = scanner.next().charAt(0);
        System.out.println("Ultimo num: ");
        double num2 = scanner.nextDouble();
        double result;

        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Divisor invalido");
                }
                result = num1 / num2;
            }
        }
        System.out.println("Result: " + result);
    }
}
