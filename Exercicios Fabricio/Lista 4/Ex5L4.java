import java.util.Scanner;

public class Ex5L4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Integer confirma ;
        Integer N  ;
        int i = 1;
        String desenho = "";

        System.out.print("por favor insira a quantidade de linhas: (maximo 20) ");
        N = scanner.nextInt();

        if (N < 0 || N > 20  ) {
            System.out.println("ERRO ERRO ERRO \n deseja continuar? \n (1)Sim\n (2)não   ");
            confirma = sc1.nextInt();
            while (confirma !=2 && N<0||N>20)  {
                {
                    System.out.println("por favor insira a quantidade de linhas: \n (0) para encerrar ");
                    N = scanner.nextInt();
                }

            }
            if (N == 0 || confirma == 2) {
                System.out.println("PROGRAMA ENCERRADO");N+=0;

            }

        }
            for (; i <= N && N <= 20 && N >= 0; i++) {
                desenho = desenho + "* ";
                System.out.println(desenho);}



    }
}

