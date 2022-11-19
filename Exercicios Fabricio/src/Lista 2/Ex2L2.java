import javax.swing.*;

public class Ex2L2 {  public static void main(String[] args) {
    Integer N;
    Integer i = 0 ;
    Integer soma = 0;
    N = Integer.parseInt(JOptionPane.showInputDialog("insira o valor de N"));
    for (i = 0 + i; i <= N; i++) {
        soma = soma + i ;}


    JOptionPane.showMessageDialog(null, "o resultado obtido da soma é " + soma);


}
}
