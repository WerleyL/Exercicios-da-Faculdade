import javax.swing.*;

public class Ex6L2 {public static void main(String[] args) {

    Integer x= 0;
    Integer num = 0;
    Integer seq = 0;
    Integer exponente = 0 ;

    x= Integer.parseInt(JOptionPane.showInputDialog("insira o valor da base:"));
    exponente = Integer.parseInt(JOptionPane.showInputDialog("insira o valor do exponente:"));
    num = num  + x;
    for (seq = 1;seq  < exponente; seq++){num = x * num ;}
    JOptionPane.showMessageDialog(null,"a enesima potencia de x + " + num);


}
}
