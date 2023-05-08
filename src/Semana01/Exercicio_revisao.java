package Semana01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_revisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> listaAluno = new ArrayList<>();
        ArrayList<double[]> listaNotas = new ArrayList<>();
        String nome = "";

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Digite o nome de um aluno(a) ou escreva FIM para finalizar");
            nome = entrada.next();

            if (!nome.equalsIgnoreCase("FIM")) {
                listaAluno.add(nome);
                System.out.println("Digite a primeira nota de " + nome);
                double n1 = entrada.nextDouble();
                System.out.println("Digite a segunda nota de " + nome);
                double n2 = entrada.nextDouble();
                System.out.println("Digite a terceira nota de " + nome);
                double n3 = entrada.nextDouble();

                double[] notas = new double[3];
                notas[0] = n1;
                notas[1] = n2;
                notas[2] = n3;
                listaNotas.add(notas);

            }
        }

        ArrayList<String> listaAprovados = new ArrayList<>();
        ArrayList<String> listaReprovados = new ArrayList<>();

        for (int i = 0 ; i < listaAluno.size(); i++){
            System.out.println("Aluno " + listaAluno.get(i));
            System.out.println("Notas " + Arrays.toString(listaNotas.get(i)));
            double totalNotas = 0.0;
            for (int n = 0 ; n < listaNotas.get(i).length; n++) {
                totalNotas += listaNotas.get(i)[n];
            }
            double media = totalNotas / listaNotas.get(i).length;
            System.out.println("Média de " + listaAluno.get(i) + ": " + media);


            if (media >= 7.0){
                listaAprovados.add(listaAluno.get(i));
            } else {listaReprovados.add(listaAluno.get(i));}
        }

        System.out.println("_________________________________");
        System.out.println("Lista de alunos aprovados: " + listaAprovados);
        System.out.println("Lista de alunos reprovados: " + listaReprovados);
    }
}

