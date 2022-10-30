import javax.swing.*;


public class Maquina {
    public static void main(String[] args) {
        Double dinheiroInserido = 0.0;
        Double biscoito = 5.0, refrigerante = 7.0, salgado = 4.0;
        int quantR = 0, quantB = 0, quantS = 0;
        Integer produto = 0;
        Double valorTotal = 0.0;
        int i = 0;
        Integer continuar = 0;
        for (i = 0; i == 0; ) {

            valorTotal = (quantB * biscoito) + (quantR * refrigerante) + (quantS * salgado);
            produto = Integer.parseInt(JOptionPane.showInputDialog(null, "selecione o produto que você deseja:" +
                    "\n(1)Biscoito: " + biscoito + "$" +
                    "\n (2)Refrigerante 350ml: " + refrigerante + "$" +
                    "\n (3)Salgado: " + salgado + "$" +
                    "\n O valor total é: " + valorTotal + "$" +
                    "\n Digite (-2) para cancelar compra " +
                    "\n Digite (-1) para finalizar compra ", "Produtos", JOptionPane.QUESTION_MESSAGE));
            if (produto == -2) {
                i += 2;
                JOptionPane.showMessageDialog(null, "operaçao cancelada");
            } else if (produto == 1) {
                quantB = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de biscoito que  deseja "));
            } else if (produto == 2) {
                quantR = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de latas de Refrigerante que deseja:"));
            } else if (produto == 3) {
                quantS = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de Salgados  que voce deseja: "));
            } else if (produto == -1) {
                JOptionPane.showMessageDialog(null, "hora do pagamento ");
                i++;
            }else{JOptionPane.showMessageDialog(null,"produto invalido ");};
            produto = 0;

        }
        if(valorTotal < 0){JOptionPane.showMessageDialog(null, "ERRO: valor negativo" +
                " \n COMPRA CANCELADA");}
       else  if (i  == 1 && valorTotal >=0) {
            for (continuar = 0; continuar <3;) {
                dinheiroInserido = Double.parseDouble(JOptionPane.showInputDialog("PAGAMENTO" +
                        "\n O valor total é de " + valorTotal + "$" +
                        "\n Por favor insira o dinheiro na maquina "));

                if (dinheiroInserido >= valorTotal) {
                    JOptionPane.showMessageDialog(null, "PRODUTOS LIBERADOS\n Seu troco é de:  " + (dinheiroInserido - valorTotal) + "$");
                    continuar += 3;
                } else if (dinheiroInserido <= valorTotal) {
                    continuar = Integer.parseInt(JOptionPane.showInputDialog("A quantidade de dinheiro inserida é menor que o valor total" +
                            "\n Estamos te retornando o valor inserido \n DESEJA INSERIR UMA NOVA QUANTIA EM DINHEIRO?\n(1)SIM\n(2)NÂO"));

                    if (continuar == 1) {
                        JOptionPane.showMessageDialog(null, "vamos retornar a tela para inserir o dinheiro");
                    } else if (continuar == 2) {
                        JOptionPane.showMessageDialog(null, "estamos cancelando a compra");continuar =+3;
                    }
                }


            }
        }
    }
}




