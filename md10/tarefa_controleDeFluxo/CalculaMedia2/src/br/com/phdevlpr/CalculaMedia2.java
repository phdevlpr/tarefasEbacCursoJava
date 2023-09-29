package br.com.phdevlpr;

import java.util.Scanner;

/*
  @author phdevlpr
 */

public class CalculaMedia2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_______________________________________________________________");

        System.out.println("Para calcular sua nota, digite um valor entre 0(zero) e 10(dez).");

        System.out.println("_______________________________________________________________");

        System.out.println("Digite a primeira nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        Double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        Double nota4 = scanner.nextDouble();

        scanner.close();

        Double soma = nota1 + nota2 + nota3 + nota4;
        Double resultado = soma / 4;

        System.out.println("Sua média é: " + resultado);

        if (resultado >= 7) {
            System.out.println("Parabéns, você está aprovado!");
        } else if (resultado >=5 && resultado <=6 ) {
            System.out.println("Você está de recuperação!");
        } else {
            System.out.println("Você está reprovado!");
        }

    }

}