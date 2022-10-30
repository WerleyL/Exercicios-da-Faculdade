import javax.swing.*;

public class EX2L3 { public static void main(String[] args) {

    Double notaA;
    Double notaB;

    notaA = Double.parseDouble(JOptionPane.showInputDialog("por favor insira a nota A:"));
    notaB = Double.parseDouble(JOptionPane.showInputDialog("por favor insira a nota B:"));
    Double media = (notaA + notaB) / 2;
    if (media >= 7) {
        JOptionPane.showMessageDialog(null, "você foi aprovado");
    } else {
        JOptionPane.showMessageDialog(null, "você foi reprovado(a)");
    }

}
}
