import javax.swing.*;

public class Ex9 {
    public static void main(String[] args) {

        Double caixa = 1000.0;
        Integer fazer;
        Double dep = 0.0;
        Double saq = 0.0;
        for (fazer = 0; fazer != -1; ) {
            fazer = Integer.parseInt(JOptionPane.showInputDialog("insira qual operaçao deseja fazer \n(1) sacar\n(2)para depositar\n(-1)para encerrar"));
            if (fazer == 1) {
                saq = Double.parseDouble(JOptionPane.showInputDialog("qual o valor que deseja sacar: "));
                if (fazer == 1 && saq <= caixa) {
                    caixa = caixa - saq;
                    JOptionPane.showMessageDialog(null, "seu saldo agora é de: " + caixa + "$");
                    fazer=0;
                }
            }
            if (fazer == 1 && saq > caixa) {
                saq=0.0;
                fazer = Integer.parseInt(JOptionPane.showInputDialog("o valor que deseja sacar é maior que o seu saldo " +
                        "\n selecione o que deseja fazer:" +
                        "\n(1)sacar\n(2)depositar\n(-1)encerrar "));
                fazer=0;

            } else if (fazer == 2) {
                dep = Double.parseDouble(JOptionPane.showInputDialog("qual o valor que deseja depositar "));
                caixa = caixa + dep;
                JOptionPane.showMessageDialog(null, "o seu saldo agora é de:" + (caixa  ));
                fazer=0;
            }
            if (fazer != -1) {
                Integer.parseInt(JOptionPane.showInputDialog("desejar continuar\n(1)Sim\n(-1)Não"));
            }
            if (caixa == 0 && saq > caixa ){saq = 0.0;}
        } if (fazer == -1) {
            JOptionPane.showMessageDialog(null, "o seu saldo agora é de :" + caixa +"\n Operação encerrada");
        }
    }}


