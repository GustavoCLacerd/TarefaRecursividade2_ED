package view;

import javax.swing.JOptionPane;
import controller.MetodosMDC;

public class Main {
    public static void main(String[] args) {
        int x, y;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número (x): "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número (y): "));

        MetodosMDC metodos = new MetodosMDC();
        int mdc = metodos.calcularMDC(x, y);

        System.out.println("O MDC de " + x + " e " + y + " é: " + mdc);
    }
}
