import javax.swing.*;

public class Ex6L3{

    public static void main(String[] args) {


        Double peso;
        Double altura;
        Double imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("insira seu peso em Kg"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("insira sua altura em metros"));

        imc = peso / (altura * altura);

        if (imc < 20) {
            JOptionPane.showMessageDialog(null, "esta abaixo do peso");
        } else if (imc >= 20 && imc < 25) {
            JOptionPane.showMessageDialog(null, "seu peso esta normal");
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, "você esta com sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            JOptionPane.showMessageDialog(null, "você esta obeso");
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "você esta com obesidade morbida");
        }


    }
}