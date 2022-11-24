import javax.swing.*;

public class Ex16 {
    public static void main(String[] args) {
        double media = 0;
        Double[] altura = new Double[10];
        int i = 0;
        for (i = 0; i < altura.length; i++) {
            altura[i] = Double.parseDouble(JOptionPane.showInputDialog("INSIRA A ALTURA DOS ATLETAS "));
            media = (media + altura[i]) / altura.length;

        }
        for (i = 0; i < altura.length; i++) {
            if (altura[i] > media){JOptionPane.showMessageDialog(null," O atleta " + (i + 1) + " tem a altura maior que a media ");

        }}


    }
}
