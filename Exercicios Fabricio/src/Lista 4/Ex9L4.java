import javax.swing.*;

public class Ex9L4 {
    public static void main(String[] args) {
        Integer N;
        Integer i = 0;
        Integer fatorial = 1;
        N = Integer.parseInt(JOptionPane.showInputDialog("insira o valor de N"));
        for (i = 1  ; i <= N; i++) {
            fatorial = fatorial * i;
        }


        JOptionPane.showMessageDialog(null, "o fatorial de  " + N + " é:" + fatorial);
    }
}
