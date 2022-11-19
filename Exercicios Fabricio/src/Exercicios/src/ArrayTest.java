package Exercicios.src;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner tama = new Scanner(System.in);
        System.out.println("selecione o tamanho da array:");
        int tamanho = 0;
        tamanho = tama.nextInt();
        double somatorio = 0;

        int[] idade = new int[tamanho];
        int i = 0;
        double media = 0.0;
        int pares = 0;
        int impar = 0;
        Scanner s = new Scanner(System.in);

        for (i = 0; i < idade.length; i++) {
            System.out.println("Informe a " + (i + 1) + "º idade: ");
            idade[i] = s.nextInt();
            somatorio = somatorio + idade[i];

        }
        for (i = 0; i < idade.length; i++) {
            media = somatorio / idade.length;
            if (idade[i] % 2 == 0) {
                pares++;
            } else if (idade[i] % 2 == 1) {
                impar++;
            }
        }
        System.out.println("o somatorio das idades é" + somatorio +
                "\ne a media é das idades " + media +
                "\na quantidade de idades pares são" + pares + "\ne impares:" + impar);

    }
}

