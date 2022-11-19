import javax.swing.*;

public class DeltaL3 {
    public static void main(String[] args) {

        double Delta;
        double B;
        double A;
        double C;
        double X1;
        double X2;


        String entrada;

        entrada = JOptionPane.showInputDialog("por favor insira um numero  inteiro");
        A = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("por favor insira um numero  inteiro");
        B = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("por favor insira um numero  inteiro");
        C = Integer.parseInt(entrada);


        Delta = (B * B) - (4 * A * C);
        X1 = (-B + Math.sqrt(Delta)) / (2 * A);
        X2 = (-B - Math.sqrt(Delta)) / (2 * A);
        if (Delta < 0) {
            JOptionPane.showMessageDialog(null, " não existe raiz real");
        } else if (Delta == 0) {
            JOptionPane.showMessageDialog(null, " existe somente uma raiz real que é X  = (-B + Math.sqrt(Delta)) /  (2 * A), que X = " + X1);
        } else


            JOptionPane.showMessageDialog(null, "existem duas raizes reais que tem como resultado X1 =" + X1 + "X2=" + X2);
    }
}


