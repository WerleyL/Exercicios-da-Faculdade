import javax.swing.*;
import java.text.DecimalFormat;

public class Salario {
    public static void main(String[] args) {
        int operacao = 0;
        double salario ;
        double novoSalario = 0;
        int meses ;
        double inss ;
        DecimalFormat f = new DecimalFormat("0.00");

        while (operacao != 5) {
            operacao = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    \s1 - Salario
                      2 - Ferias
                      3 - Decimo Terceiro
                      4 - Calcular INSS
                      5 - Sair
                      Digite a Operaçao desejada""", "Menu de operaçoes:", JOptionPane.INFORMATION_MESSAGE));

            if (operacao == 1) {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor insira seu salario:"));
                if (salario < 3500) {
                    novoSalario = salario * 1.15;
                } else if (salario >= 3500 && salario < 6000) {
                    novoSalario = salario * 1.10;
                } else if (salario > 6000) {
                    novoSalario = salario * 1.05;
                }
                JOptionPane.showMessageDialog(null, "O seu salario antigo era de: " + f.format(salario) + "$" +
                        " E o seu novo Salario é de: " + f.format(novoSalario) + "$", "salario", JOptionPane.INFORMATION_MESSAGE);
                //Novo Salario
            } else if (operacao == 2) {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor insira seu salario:"));
                JOptionPane.showMessageDialog(null, "O valor das suas Ferias sera de:" + f.format((salario + salario / 3)) + "$");
           //Ferias
            }
            else if (operacao == 3) {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor insira seu salario:"));
                meses = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de meses trabalhados:"));
                if (meses <= 12 && meses > 0) {
                    JOptionPane.showMessageDialog(null, " O seu 13° vai ser de " + f.format((salario * meses) / 12) + "$");
                } else {
                    JOptionPane.showMessageDialog(null, "Operaçao invalida" + "\n Estamos voltando para o menu inicial");
                }
                //Decimo Terceiro
            } else if (operacao == 4) {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor insira seu salario:"));
                meses = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de meses trabalhados:"));
                if (meses > 0 && meses <= 12) {

                    if (salario > 0 && salario <= 1100) {
                        f.format(inss = salario * 0.075);
                        JOptionPane.showMessageDialog(null, "O total de INSS que ele pagara nesse ano é de : " +
                                (inss * meses) + "$ e o total de salario liquido é: " +
                                ((salario - inss) * meses) + "$");
                    } else if (salario > 1100 && salario <= 2203.48) {
                        f.format(inss = salario * 0.09);
                        JOptionPane.showMessageDialog(null, "O total de INSS que ele pagara nesse ano é de : " + (inss * meses) + "$ e o total de salario liquido é: " +
                                ((salario - inss) * meses) + "$");
                    } else if (salario > 2203.49 && salario <= 3305.22) {
                        f.format(inss = salario * 0.12);
                        JOptionPane.showMessageDialog(null, "O total de INSS que ele pagara nesse ano é de : " + (inss * meses) + "$ e o total de salario liquido é: " +
                                ((salario - inss) * meses) + "$");
                    } else if (salario > 3305.23 && salario <= 6433.57) {
                        f.format(inss = salario * 0.14);
                        JOptionPane.showMessageDialog(null, "O total de INSS que ele pagara nesse ano é de : " + (inss * meses) + "$ e o total de salario liquido é: " +
                                ((salario - inss) * meses) + "$");
                    } else if (salario > 6433.57) {
                        JOptionPane.showMessageDialog(null, "O total de INSS que ele pagara nesse ano é de: " + (751.97 * meses) + "$ e o total de salario liquido é:  " + ((salario - 751.97) * meses) + "$");
                    } else {
                        JOptionPane.showMessageDialog(null, "valor Invalido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "quantidade de meses invalia");
                }
                //Inss
            } else if (operacao == 5) {
                JOptionPane.showMessageDialog(null, "Saindo do aplicativo ");
                //Sair
            } else {
                JOptionPane.showMessageDialog(null, "Operaçao invalida");//Erro
            }
        }

    }
}