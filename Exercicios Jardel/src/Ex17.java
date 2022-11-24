import javax.swing.*;

public class Ex17 {
    public static void main(String[] args) {

        Integer[] meses = new Integer[3];
        String[]id = new String[3];
        int i = 0;
        for (i = 0; i < meses.length; ) {
            id[i] = JOptionPane.showInputDialog("INSIRA SEU ID");
            meses[i] = Integer.parseInt(JOptionPane.showInputDialog("INSIRA A QUANTOS MESES ESTA NA EMPRESA "));
            if(meses[i] >= 0){i++;}
            else{JOptionPane.showMessageDialog(null,"valor incorreto");}

        }
        for (i = 0; i < meses.length; i++) {
            if (meses[i] <6){JOptionPane.showMessageDialog(null," O Funcionario de ID" + id[i] + " esta empregado a menos de 6 meses ");

            }}


    }
}
