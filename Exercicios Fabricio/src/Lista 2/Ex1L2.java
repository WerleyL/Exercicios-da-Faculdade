import javax.swing.*;

public class Ex1L2 {public static void main(String[] args) {
    Integer n;
    Integer i = 0;
    String lista="";
    n = Integer.parseInt(JOptionPane.showInputDialog("informe N"));

    for (i = 0; i <= n; i++) {
        lista = lista + "," + i;
    }
    JOptionPane.showMessageDialog(null, "a sequencia é " + lista);
}

}


