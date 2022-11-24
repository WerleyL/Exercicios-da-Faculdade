import javax.swing.*;

public class Ex18 {
    public static void main(String[] args) {
        Double[] temperatura = new Double[7];
        int i = 0;
        String[] dia = new String[]{"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado"};
        double media = 0;
        for (i = 0; i < temperatura.length; i++) {
            temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog("INSIRA A TEMPERATURA"));
            media = (media + temperatura[i]) / 7;
        }
        for (i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > media) {
                System.out.println("As temperaturas que ficaram a cima da media foram: " + dia[i] + " que registrou:" + temperatura[i]);
            }
        }

    }
}
