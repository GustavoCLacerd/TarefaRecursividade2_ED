package view;

import java.util.Random;
import controller.MetodosInverter;

public class Main {
    public static void main(String[] args) {
        int[] vetor10 = new int[10];
        int[] vetor11 = new int[11];

        preencher(vetor10);
        preencher(vetor11);

        MetodosInverter metodos = new MetodosInverter();
        
        System.out.println("Vetor original de 10 posições:");
        exibirVetor(vetor10);
        metodos.inverterVetor(vetor10, 0, vetor10.length - 1);
        System.out.println("Vetor invertido de 10 posições:");
        exibirVetor(vetor10);
        
        System.out.println("\nVetor original de 11 posições:");
        exibirVetor(vetor11);
        metodos.inverterVetor(vetor11, 0, vetor11.length - 1);
        System.out.println("Vetor invertido de 11 posições:");
        exibirVetor(vetor11);
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void preencher(int[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }
    }
}
