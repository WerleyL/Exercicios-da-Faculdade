package Exercicios.src;

import javax.swing.*;

public class Media {
    public static void main(String[] args) {
        Double numeros = 1.0;
        int i = 0;
        Double media = 1.0;
        Double total = 0.0;
        while (numeros != 0.0) {

            numeros = Double.parseDouble(JOptionPane.showInputDialog("insira um numero positivo"));
            total = total + numeros;

            i++;
        }
        media = total / (i - 1);
        JOptionPane.showMessageDialog(null, media);
    }
}
