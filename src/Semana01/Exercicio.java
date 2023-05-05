package Semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> listaAluno = new ArrayList<>();
        String nome = "";

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Digite o nome de um aluno ou escreva FIM para finalizar");
            nome = scan.nextLine();

            if (!nome.equalsIgnoreCase("FIM")) {
                listaAluno.add(nome);
                System.out.println("Aluno " + nome + " cadastrado com sucesso!");
            }
        }
        listaAluno.forEach(System.out::println);
    }
}
