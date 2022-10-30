package scr;

import javax.swing.*;

public class Ex10L1 { public static void main(String[] args) {

    int polegadas;
    String entrada;
    double tamanho;
    entrada = JOptionPane.showInputDialog("por favor insira o tamanho em polegadas:");
    polegadas = Integer.parseInt(entrada);
    tamanho = polegadas * 2.54;
    JOptionPane.showMessageDialog(null, "o tamanho em centimetros é:" + tamanho);

}
}

