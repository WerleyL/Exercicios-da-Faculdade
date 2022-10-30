import javax.swing.*;

public class Ex5L2 {
public static void main(String[] args) {

    Integer base = 0;
    Integer num = 0;
    Integer seq = 0;
    Integer exponente = 0;

    base = Integer.parseInt(JOptionPane.showInputDialog("insira o valor da base:"));
    exponente = Integer.parseInt(JOptionPane.showInputDialog("insira o valor do exponente:"));
    num = num + base;
    for (seq = 1; seq < exponente; seq++) {
        num = base * num;
    }
    JOptionPane.showMessageDialog(null, "o resultado é:" + num);

}}
