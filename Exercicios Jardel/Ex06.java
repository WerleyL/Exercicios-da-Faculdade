import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) {
        Integer i = 1;
        Double N;
        Double metade;
        String total = "";
        while (i <= 10) {
            i++;
            N = Double.parseDouble(JOptionPane.showInputDialog("por favor insira um numero "));
            metade = N / 2;
            total = total + "," + metade;
        }
        JOptionPane.showMessageDialog(null, total);

    }
}
