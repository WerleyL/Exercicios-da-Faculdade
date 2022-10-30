import javax.swing.*;

public class Ex8L2 {


    public static void main(String[] args) {
        Double gasto;
        Integer vezes;
        Integer forma;

        gasto = Double.parseDouble(JOptionPane.showInputDialog("total gasto"));

        forma = Integer.parseInt(JOptionPane.showInputDialog(
                "escolha o metodo de pagamento:\n•1: a vista com 10% de desconto\n• 2: em duas vezes (preço da etiqueta)\n• 3: de 3 até 10 vezes com 3% de juros ao mês"));
        if (forma == 1) {
            JOptionPane.showMessageDialog(null, "o valor é de: " + (gasto - (gasto * 0.10)));
        } else if (forma == 2) {
            JOptionPane.showMessageDialog(null, "o valor do produto sera 2 prestaçoes de " + (gasto / 2));
        } else if (forma == 3) {
            vezes = Integer.parseInt(JOptionPane.showInputDialog("insira o numero de vezes que deseja dividir "));
            if (gasto <= 100) {
                JOptionPane.showMessageDialog(null, "o valor do produto sera em " + vezes + "vezes de " + gasto / vezes);
            } else {
                JOptionPane.showMessageDialog(null,
                        "o valor do produto sera em " + vezes + " vezes de " + ((gasto + (gasto * 00.3)) / vezes));
            }
        }
    }
}