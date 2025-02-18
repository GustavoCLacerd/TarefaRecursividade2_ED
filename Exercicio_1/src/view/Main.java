package view;

import javax.swing.JOptionPane;
import controller.MetodosSomaMulti;

public class Main {
    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));

   

        MetodosSomaMulti metodos = new MetodosSomaMulti ();
        System.out.println (metodos.somatoriamulti(a, b));
    }
}