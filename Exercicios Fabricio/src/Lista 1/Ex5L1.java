import javax.swing.*;

public class Ex5L1 {

    public static void main(String[] args) {

        double numA;
        double numB;
        double quadrado;
        double raiz;

        numA = Double.parseDouble(JOptionPane.showInputDialog("insira um numero:"));
        numB = Double.parseDouble(JOptionPane.showInputDialog("insira um numero:"));

        if (numA > numB) {
            JOptionPane.showMessageDialog(null, "o quadrado do menor é:" + (Math.pow(numB, 2)) + (" , a raiz do maior é ") + (Math.sqrt(numA)));
        } else {
            JOptionPane.showMessageDialog(null,
                    "o quadrado do menor é:  " + (Math.pow(numA, 2)) + (" ,a raiz do maior é ") + (Math.sqrt(numB)));
        }

    }
}