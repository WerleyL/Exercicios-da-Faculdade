import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {
        Double numA;
        Double numB;
        Integer operacao = 0;

        numA = Double.parseDouble(JOptionPane.showInputDialog("informe o numero A"));
        numB = Double.parseDouble(JOptionPane.showInputDialog("informe o numero B"));
        while (operacao != 6) {
            operacao = Integer.parseInt(JOptionPane.showInputDialog("digite qual operaçao deseja fazer \n(1)somar, " +
                    "\n(2)subtrair ,\n(3)multiplicar, \n(4)dividir, \n(5)Resto da divisão\n(6)sair"));

            if (operacao == 1) {
                JOptionPane.showMessageDialog(null, numA + "+" + numB + "=" + (numA + numB));
            } else if (operacao == 2) {
                JOptionPane.showMessageDialog(null, numA + "-" + numB + "=" + (numA - numB));
            } else if (operacao == 3) {
                JOptionPane.showMessageDialog(null, numA + "*" + numB + "=" + (numA * numB));
            } else if (operacao == 4) {
                JOptionPane.showMessageDialog(null, numA + "/" + numB + "=" + (numA / numB));
            } else if (operacao == 5) {
                JOptionPane.showMessageDialog(null, "O RESTO DA DIVISÃO DE " +
                        numA + " por " + numB + " é: " + (numA % numB));
            } else if (operacao == 6) {
                JOptionPane.showMessageDialog(null, "saindo");
            } else {
                JOptionPane.showMessageDialog(null, "Opçao invalida");
                operacao = 0;
            }
        }
    }
}