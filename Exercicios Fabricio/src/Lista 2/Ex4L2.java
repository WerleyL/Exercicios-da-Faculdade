import javax.swing.*;

public class Ex4L2 {


    public static void main(String[] args) {
        Integer marcos = 0;
        Integer paulo = 0;
        Integer bozo = 0;
        Integer lula = 0;
        Integer nulo = 0;
        Integer branco = 0;
        Integer urna = 0;
        while (urna != -1) {
            urna = Integer.parseInt(JOptionPane
                    .showInputDialog(
                            "insira seu voto: \n(1)marcos  \n(2)paulo \n(3)bozo \n(4)lula \n(0)nulo \n(5)branco , \n(-1)encerra a votaçao"));

            if (urna == 1) {
                marcos = marcos + 1;
            } else if (urna == 2) {
                paulo = paulo + 1;
            } else if (urna == 3) {
                bozo = bozo + 1;
            } else if (urna == 4) {
                lula = lula + 1;
            } else if (urna == 0) {
                nulo = nulo + 1;
            } else if (urna == 5) {
                branco = branco + 1;
            } else {
                JOptionPane.showMessageDialog(null,
                        "numero de votos: \nmarcos=" + marcos + "  votos \npaulo=" + paulo + " votos  \nbozo=" + bozo
                                + " votos \nlula=" + lula + " votos \nnulo=" + nulo + " votos  \nbranco=" + branco + " votos");

            }
        }

    }
}

