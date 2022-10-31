import javax.swing.*;

public class Ex2L1 {
    public static void main(String[] args) {

        int num;
        String entrada;

        entrada = JOptionPane.showInputDialog("por favor insira um numero inteiro");
        num = Integer.parseInt(entrada);
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "ele é par");
        } else {
            JOptionPane.showMessageDialog(null, "ele é impar");
        }


    }
}