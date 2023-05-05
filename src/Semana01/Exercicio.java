package Semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        ArrayList<String> listaAluno = new ArrayList<>();
        double [] notas = new double[3];
        String nome = "";
        int n=0;

        while (!nome.equalsIgnoreCase("FIM") && n<notas.length) {
            System.out.println("Digite o nome de um aluno ou escreva FIM para finalizar");
            nome = aluno.nextLine();
            System.out.println("Digite a nota do aluno");
            notas[n] = numero.nextDouble();

            if (!nome.equalsIgnoreCase("FIM")) {
                listaAluno.add(nome);
                System.out.println("Aluno " + nome + " cadastrado com sucesso!");

            }
            n++;
                    }
         for (int i=0; i< notas.length; i++){
            System.out.println("A nota do aluno " + listaAluno.get(i) + " é: " + notas[i]);
        }

        }
    }

