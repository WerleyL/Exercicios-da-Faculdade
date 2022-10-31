package scr;

import javax.swing.*;

public class Ex1L1 {
    public static void main(String[] args) {
        String entrada;
        int num;

        entrada = JOptionPane.showInputDialog("por favor insira um numero inteiro:");
        num = Integer.parseInt(entrada);

        if (num == 0) {
            JOptionPane.showMessageDialog(null, "O número é nulo");
        }
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo");
        }
        if (num < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo");
        }

    }
}