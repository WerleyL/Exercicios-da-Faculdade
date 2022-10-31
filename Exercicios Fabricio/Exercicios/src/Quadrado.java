import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Integer N;
        int i = 1;
        int j;
        String exibiçao;
        Scanner scanner = new Scanner(System.in);
        System.out.print("por favor insira a quantidade de linhas: (maximo 20) ");
        N = scanner.nextInt();

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (j < i) {

                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }}
