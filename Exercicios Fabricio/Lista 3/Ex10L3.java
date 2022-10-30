import javax.swing.*;

public class Ex10L3 {public static void main(String[] args) {

    Integer dia;
    dia = Integer.parseInt(JOptionPane.showInputDialog("insira um numero de 1 a 7"));

    if(dia == 1 ){JOptionPane.showMessageDialog(null,"domingo");}
    else if(dia == 2 ){JOptionPane.showMessageDialog(null,"segunda");}
    else if(dia == 3 ){JOptionPane.showMessageDialog(null,"terça");}
    else if(dia == 4 ){JOptionPane.showMessageDialog(null,"quarta");}
    else if(dia == 5 ){JOptionPane.showMessageDialog(null,"quinta");}
    else if(dia == 6 ){
        JOptionPane.showMessageDialog(null,"sexta");}
    else if(dia == 7 ){JOptionPane.showMessageDialog(null,"sabado");}
    else{JOptionPane.showMessageDialog(null,"não existe dia da semana com esse numero ");}
}
}
