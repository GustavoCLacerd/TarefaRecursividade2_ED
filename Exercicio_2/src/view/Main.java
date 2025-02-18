package view;

import javax.swing.JOptionPane;
import controller.MetodosDivisao;

public class Main {
    public static void main(String[] args) {
        int dividendo, divisor;

        dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do dividendo: "));
        divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do divisor: "));

   

        MetodosDivisao metodos = new MetodosDivisao ();
        System.out.println (metodos.dividisubtrai(dividendo, divisor));
    }
}