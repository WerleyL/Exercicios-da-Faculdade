import javax.swing.*;

public class Ex1L4 {
    public static void main(String[] args) {
        Integer i;
        String lista = "";

        for (i = 2; i <= 200; i += 2) {
            lista = lista + i + ", ";
        }
        JOptionPane.showMessageDialog(null, "a sequencia é " + lista);

    }

}
