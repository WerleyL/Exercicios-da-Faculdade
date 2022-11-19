import javax.swing.*;

public class Ex8L1 {
    public static void main(String[] args) {

        int idade;
        int contador = 0;

        for (int pessoas = 1; pessoas <= 20; pessoas++) {

            idade = Integer.parseInt(JOptionPane.showInputDialog(" insira a idade das pessoas :"));

            if (idade >= 18) {
                contador = contador + 1;
            }
        }
        JOptionPane.showMessageDialog(null,
                "dentre as 20 pessoas selecionadas " + contador + "  tem idade superior a 18 anos");

    }
}

