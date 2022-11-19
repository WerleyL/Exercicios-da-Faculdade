import javax.swing.*;

public class Ex9L1 {
    public static void main(String[] args) {


        double Dmaior;
        double Dmenor;
        double area;
        String entrada;

        entrada = JOptionPane.showInputDialog("iNSIRA A DIAGONAL MAIOR DO LOSANGOLO:");
        Dmaior = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("iNSIRA A DIAGONAL MENOR DO LOSANGOLO:");
        Dmenor = Integer.parseInt(entrada);

        area = ((Dmaior * Dmenor) / 2);

        JOptionPane.showMessageDialog(null, "A area do losangolo é" + area);


    }

}