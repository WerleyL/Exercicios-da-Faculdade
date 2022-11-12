import javax.swing.*;

public class ex11 {
    public static void main(String[] args) {
        int tipo = 0;
        int opcao = 0;
        int opcaopag = 0;

        while (opcao != 2) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    \s Escolha uma Opção:
                    1 - Comprar Ingresso
                    2 - Sair """));
            tipo = 0;
            opcaopag = 0;
// Variaveis da compra
            int quantMeia = 0;
            int quantInteira = 0;
            double totalInteira = 0;
            double totalMeia = 0;
            double meia = 15;
            double inteira = 30;
            double valorTotal = 0;

            if (opcao == 1) {
                while (tipo != 3 && tipo != 4) {
                    tipo = Integer.parseInt(JOptionPane.showInputDialog(" \nOpções de Ingresso: \n1 - Inteira = " +  inteira + " \n2 - Meia Entrada =" + meia + "\n3 - cancelar \n4 - concluir"));


                    if (tipo == 1) {
                        quantInteira = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de ingressos que deseja "));
                        totalInteira = quantInteira * inteira;
                    } else if (tipo == 2) {
                        quantMeia = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de ingressos que deseja "));
                        totalMeia = meia * quantMeia;
                    } else if (tipo == 3) {
                        JOptionPane.showMessageDialog(null, "Operaçao cancelada");
                        quantMeia = 0;
                        quantInteira = 0;
                        opcao = 0;
                    } else if (tipo == 4) {valorTotal = totalMeia + totalInteira;
                        JOptionPane.showMessageDialog(null, "O valor  total do pedido será: " + valorTotal + "$");

                        while (opcaopag != -1) {
                            opcaopag = Integer.parseInt(JOptionPane.showInputDialog("""
                                     \sInsira a forma de Pagamento:
                                     1 - Cartão de credito
                                     2 - Boleto
                                     3 - Pix
                                    """));
                            int numerodevezes = 0;

                            if (opcaopag == 1) {
                                numerodevezes = Integer.parseInt(JOptionPane.showInputDialog("insira o numero de parcelas "));
                                if (numerodevezes > 0) {
                                    JOptionPane.showMessageDialog(null, "o preço total a pagar é de:" + valorTotal * 1.05 + "$ dividido em: " + numerodevezes + "parcelas de " + (valorTotal * 1.05) / numerodevezes);
                                    opcaopag = -1;
                                } else {
                                    JOptionPane.showInputDialog("opçao invalida");
                                }
                            } else if (opcaopag == 2) {
                                JOptionPane.showMessageDialog(null,"O valor total a pagar é de:" + valorTotal + "$");
                                opcaopag = -1;
                            } else if (opcaopag == 3) {
                                JOptionPane.showMessageDialog(null,"O valor total a pagar é de:" + (valorTotal - (valorTotal * 0.05)));
                                opcaopag = -1;}
                            else {JOptionPane.showMessageDialog(null, "opção invalida");

                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "entrada invalida ");
                    }
                }


            }

        }

    }
}
