import java.util.Scanner;

public class Ex6L4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner scm= new Scanner(System.in);
        Scanner scf= new Scanner(System.in);
        Double idadem = 0.0 ;
        Double sexo;
        Double idadef = 0.0;
        Double totalM = 0.0;
        Double totalF = 0.0;
        Double i = 0.0;
        Double m = 1.0;
        Double f = 1.0;
        Double mediaM = 0.0;
        Double mediaF = 0.0;


        for(i = 1.0; i <= 4; i++){
            System.out.print("por favor insira seu sexo: \n(1)masculino \n(2)feminino \n ");
            sexo = sc1.nextDouble();
            if (sexo == 1.0 ){System.out.print("agora sua idade:  "); idadem = scm.nextDouble();
                m++;
                totalM = totalM  + idadem;}

            else if  (sexo == 2.0){System.out.print("agora sua idade: ");
                idadef = scf.nextDouble(); f++;
                totalF = totalF + idadef;}
        }

        mediaM =  totalM/(m-1);
        mediaF = totalF/(f-1);
        System.out.format("%.2f", mediaM, mediaF);
        System.out.print( " A media da idade masculina é:  " + mediaM + "\n e a feminina é: " + mediaF );

    }
}
