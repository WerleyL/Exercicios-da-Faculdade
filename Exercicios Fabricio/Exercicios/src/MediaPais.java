import javax.swing.*;
import java.text.DecimalFormat;

public class MediaPais {
    public static void main(String[] args) {
        double paisA = 5000000.0;
        double paisB = 7000000.0;

        int i = 0;

        DecimalFormat fA = new DecimalFormat("0.00");
        while (paisA < paisB) {
            i++;

            paisA = paisA + (paisA * 0.03);
            paisB = paisB + (paisB * 0.02);


        }
        //System.out.println("em   %lf  anos o pais A estara com uma populaçao de ",i);
        System.out.println("em " + i + " anos o pais A estara com uma populaçao de " + fA.format(paisA) + " e o pais B com " +
                " uma populaçao de " + fA.format(paisB));

    }
}
