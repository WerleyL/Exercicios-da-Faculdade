import javax.swing.*;

public class Ex9L2 {
    public static void main(String[] args) {
        Integer quantidade = 0;
        Integer num;
        Integer i = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("insira um numero:"));

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                quantidade++;
            }
        }
        if (quantidade == 2) {
            JOptionPane.showMessageDialog(null, "esse numero é primo");
        } else
            JOptionPane.showMessageDialog(null, "esse numero não é primo");
    }

}