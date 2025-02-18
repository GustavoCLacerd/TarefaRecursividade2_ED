package view;

import javax.swing.JOptionPane;
import controller.MetodosPares;

public class Main {
    public static void main(String[] args) {
        int vt[] = new int[5];
        int i;

        for (i = 0; i < 5; i++) {
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural (diferente de zero): "));
        }

        MetodosPares metodos = new MetodosPares();
        System.out.println("Quantidade de números pares no vetor: " + metodos.contarPares(vt, 4, 0));
    }
}