package view;

import javax.swing.JOptionPane;
import controller.MetodosFatorialDuplo;

public class Main {
    public static void main(String[] args) {
        int N;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ímpar: "));

        MetodosFatorialDuplo metodos = new MetodosFatorialDuplo();
        
        if (N % 2 != 0) {
            System.out.println("Fatorial duplo de " + N + " é: " + metodos.fatorialDuplo(N));
        } else {
            System.out.println("O número deve ser ímpar!");
        }
    }
}