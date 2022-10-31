import javax.swing.*;

public class Ex4L1 {
    public static void main(String[] args) {

        Integer num;
        String entrada;

        entrada = JOptionPane.showInputDialog("por favor insira um numero:");
        num = Integer.parseInt(entrada);
        if (num % 5 == 0) {
            JOptionPane.showMessageDialog(null, num + " é divisivel por 5");
        } else {
            JOptionPane.showMessageDialog(null, "este numero não é divisivel por 5");
        }

    }
}