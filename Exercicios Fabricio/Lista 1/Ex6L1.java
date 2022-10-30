package scr;

import javax.swing.*;

public class Ex6L1 {
    public static void main(String[] args) {

        double numA;
        double numB;
        String numeros;
        numA = Double.parseDouble(JOptionPane.showInputDialog("insira um numero: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("insira um numero: "));

        if (numA < numB) {
            JOptionPane.showMessageDialog(null, numA + "," + numB);
        } else {
            JOptionPane.showMessageDialog(null, numB + "," + numA);
        }

    }
}
