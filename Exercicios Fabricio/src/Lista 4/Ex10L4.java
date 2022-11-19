import javax.swing.*;

public class Ex10L4 {
    public static void main(String[] args) {
        Integer quant = 0;
        Integer i;
        Integer num, numA = 1, numB = 0;
        String saida = " ";
        quant = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de numeros que deseja:"));

        for (i = 0; i <= quant; i++) {
            num = numA + numB;
            numB = numA;
            numA = num;
            saida = saida + num + "\n";
            JOptionPane.showMessageDialog(null, saida);


        }


    }
}
