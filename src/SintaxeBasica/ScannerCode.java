package SintaxeBasica;

import java.util.Scanner;

public class ScannerCode {
    public static void main(String[] args) {

        Scanner caixa = new Scanner(System.in);

        System.out.println("Digite o nome do seu ninja: ");
        String nome = caixa.nextLine();

        System.out.println("Digite a idade do seu ninja: ");
        int idade = caixa.nextInt();

        System.out.println("--------------------");
        System.out.println("O nome do ninja é: " + nome + ".");
        System.out.println("A idade do ninja é: " + idade + " anos.");

        if (idade >= 18) {
            System.out.println("Parabéns! O seu ninja já é maior de idade.");
        } else {
            System.out.println("Seu ninja ainda é de menor!");
        }

        caixa.close();
    }
}
