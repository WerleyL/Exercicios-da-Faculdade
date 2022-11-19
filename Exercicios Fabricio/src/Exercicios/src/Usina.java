package Exercicios.src;

import javax.swing.*;

public class Usina {
    public static void main(String[] args) {

        double massa = 0;
        double totalmassa = 0;
        int  i = 1;
        int tempo = 1 ;
        massa= Double.parseDouble(JOptionPane.showInputDialog("insira a massa do material radioativo em gramas "));
        for(i= 1; massa > 0.10; i++ ){
            massa = massa - (massa*0.25);
            tempo = i* 30;

            System.out.println(massa + "  " + tempo);

        }
        System.out.println("o tempo gasto para que a massa seja menor que 0.10 gramas é "+ tempo+ " segundos");



    }
}
