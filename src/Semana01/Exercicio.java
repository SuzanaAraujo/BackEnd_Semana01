package Semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        ArrayList<String> listaAluno = new ArrayList<>();
        ArrayList<Double> listaNotas = new ArrayList<>();
       // double [] notas = new double[3];
        String nome = "";
        Double nota;

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Digite o nome de um aluno ou escreva FIM para finalizar");
            nome = aluno.nextLine();

            if (!nome.equalsIgnoreCase("FIM")) {
                listaAluno.add(nome);
                System.out.println("Digite a nota do aluno");
                nota = numero.nextDouble();
                listaNotas.add(nota);
                System.out.println("Aluno " + nome + " cadastrado com sucesso!");

            }

        }
         for (int i=0; i< listaNotas.size(); i++){
            System.out.println("A nota do aluno " + listaAluno.get(i) + " é: " + listaNotas.get(i));
        }

    }
}

