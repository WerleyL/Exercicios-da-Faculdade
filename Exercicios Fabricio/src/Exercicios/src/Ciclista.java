package Exercicios.src;

public class Ciclista {
    public static void main(String[] args) {
        double ciclistaA = 0;
        double ciclistaB = 2000;
        double tempo;
      int distancia = 2000;
        for (tempo = 0;ciclistaA<ciclistaB; tempo++){

            ciclistaA = ciclistaA + 10;
            ciclistaB = ciclistaB - 15;


                }
                System.out.println("o tempo gasto foi " + tempo);
        System.out.println("distancia percorrida pelo ciclista A:" + ciclistaA);
        System.out.println("distancia percorrida pelo ciclista B:" + (distancia - ciclistaB) );
            }
        }



