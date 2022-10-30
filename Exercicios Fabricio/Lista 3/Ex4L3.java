import javax.swing.*;

public class Ex4L3 { public static void main(String[] args) {

    double X;
    double Y;
    double Z;

    X = Double.parseDouble(JOptionPane.showInputDialog("insira o valor do lado X:"));
    Y = Double.parseDouble(JOptionPane.showInputDialog("insira o valor do lado Y:"));
    Z = Double.parseDouble(JOptionPane.showInputDialog("insira o valor do lado Z:"));

    if (X + Y > Z && X + Z > Y && Y + Z > X) {
        JOptionPane.showMessageDialog(null, " Esses valores representam os lados de um triangulo");
    } else {
        JOptionPane.showMessageDialog(null, "esses valores não representam os lados de um triangulo ");
    }
}
}
