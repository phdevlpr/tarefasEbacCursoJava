package br.com.phdevlpr;

import java.util.Scanner;

/*
  @author phdevlpr
 */

public class CalculaMedia2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        Double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        Double nota4 = scanner.nextDouble();

        scanner.close();

        double soma = nota1 + nota2 + nota3 + nota4;
        double resultado = soma / 4;

        if (resultado >= 7) {
            System.out.println("Parabéns, você está aprovado!");
        } else if (resultado >=5 && resultado <=6 ) {
            System.out.println("Você está de recuperação!");
        } else {
            System.out.println("Você está reprovado!");
        }

    }

}