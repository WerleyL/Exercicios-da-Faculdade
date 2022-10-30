import javax.swing.*;

public class Ex7L4 {
    public static void main(String[] args) {

        Double peso;
        Double altura;
        Double imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("insira seu peso em Kg"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("insira sua altura em metros"));

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "você esta com  baixo  peso");
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null, "seu peso esta normal");
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, "você esta com excesso de peso");
        } else if (imc >= 30 && imc < 35) {
            JOptionPane.showMessageDialog(null, "você esta obesesidade de classe 1");
        } else if (imc >= 35 && imc < 40) {
            JOptionPane.showMessageDialog(null, "você esta com obesidade de classe 2");
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "você esta com obesidade de classe 3");


        }
    }
}

