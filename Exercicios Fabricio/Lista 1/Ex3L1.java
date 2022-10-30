package scr;

import javax.swing.JOptionPane;

public class Ex3L1 {
    public static void main(String[] args) {

        double num;
        String entrada;
        double raiz;
        double quadrado;
        entrada = JOptionPane.showInputDialog("por favor insira um numero  inteiro");
        num = Integer.parseInt(entrada);

        raiz = Math.sqrt(num);
        quadrado = Math.pow(num, 2);
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "a raiz de " + entrada + "  é: " + raiz);
        } else {
            JOptionPane.showMessageDialog(null, "a potencia quadrada  de " + entrada + "  é: " + quadrado);
        }

    }
}