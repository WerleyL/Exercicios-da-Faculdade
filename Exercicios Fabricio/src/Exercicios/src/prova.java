package Exercicios.src;

import javax.swing.*;

import java.text.DecimalFormat;

public class prova {
    public static void main(String[] args) {
        double salarioMin;
        double salarioUsuario;
        DecimalFormat fA = new DecimalFormat("0.00");
        int parar = 0;
        while (parar != 1) {
            salarioMin = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário mínimo atual:"));
            salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Agora, insira o valor do seu salário:"));

            if (salarioMin <= 0 || salarioUsuario < 0) {
                JOptionPane.showMessageDialog(null, "Valores incorretos, insira-os  novamente");
            } else if (salarioMin > salarioUsuario) {
                JOptionPane.showMessageDialog(null, " Seu salario é menor que um salario minimo. Faltam  " + fA.format(salarioMin - salarioUsuario) + "R$ para que você ganhe um salario minimo ");
                parar = 1;
            } else if (salarioMin < salarioUsuario) {
                JOptionPane.showMessageDialog(null, "Seu salario é de:" + fA.format(salarioUsuario) + "R$. O que equivale á " + fA.format(salarioUsuario / salarioMin) + " vezes o salario minimo ");
                parar = 1;
            } else if (salarioMin == salarioUsuario) {
                JOptionPane.showMessageDialog(null, " Seu salario é equivalente ao salario minimo ");
                parar = 1;
            }


        }
    }
}
