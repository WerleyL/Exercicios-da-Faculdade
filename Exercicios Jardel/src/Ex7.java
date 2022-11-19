import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {

        Integer i = 0;
        Integer soma = 0;

        for (i = 0; i <= 100; i++) {
            soma = soma + i;
        }


        JOptionPane.showMessageDialog(null, "o resultado obtido da soma é " + soma);


    }
}