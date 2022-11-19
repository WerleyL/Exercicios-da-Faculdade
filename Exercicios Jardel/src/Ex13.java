import javax.swing.*;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.showInputDialog;

public class Ex13 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.00");
        int quantAlunos = 0;
        quantAlunos = Integer.parseInt(showInputDialog("insira a quantidade de alnos: "));

        int i = 0;
        Double[] notas = new Double[quantAlunos];
        double media = 0;
        double totalNotas = 0;
        int acimaMedia = 0;
        for (i = 0; i < quantAlunos; ) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do aluno"));
            if (notas[i] >= 0 && notas[i] <= 10) {
                totalNotas = totalNotas + notas[i];
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Valor Invalido");}}


                media = totalNotas / quantAlunos;
             for(i=0;i<notas.length;i++){
        if (notas[i] >= media) {
                    acimaMedia++;}
                } JOptionPane.showMessageDialog(null," A media total da turma é: "+format.format(media) +"\na quantidade de notas iguais ou  acima da media é: "+acimaMedia);
            }
        }





