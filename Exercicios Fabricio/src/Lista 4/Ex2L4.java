import java.util.Scanner;

public class Ex2L4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Integer i = 1;
        Integer   n = 0 ;
        Integer resultado = 0;
        System.out.print("insira o valor de N:  ");
        n  =  sc1.nextInt();
        for(i = 1;i <=10; i++){
            resultado = n * i;
            System.out.println(n + "*" + i +"=" + resultado);
        }



    }
}

