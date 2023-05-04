package Semana01;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Digite o nome de um aluno ou escreva FIM para finalizar");
        Scanner scan = new Scanner(System.in);

        String nome;
        nome = scan.nextLine();

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Aluno " + nome);
            System.out.println("Digite o nome de um aluno ou escreva FIM para finalizar");
            nome = scan.nextLine();
        }
    }
}
