import java.util.Scanner;

public class Ex4L4 {
    public static void main(String[] args) {
        Integer N;
        int i = 1;
        String desenho = "\n";
        Scanner scanner = new Scanner(System.in);
        System.out.print("por favor insira a quantidade de linhas: (maximo 20) ");
        N = scanner.nextInt();

        for (; i <= N; i++) {
            desenho = desenho + "*";
            System.out.print(desenho);
        }
    }
}
