import javax.swing.*;

public class Ex8L3 {
    public static void main(String[] args) {



            Integer idade;

            idade = Integer.parseInt(JOptionPane.showInputDialog("insira sua idade"));
            if(idade <= 7){
                JOptionPane.showMessageDialog(null, "sua categoria é infantil");}
            else if(idade >= 8 && idade <= 10 ){JOptionPane.showMessageDialog(null, "sua categoria é Juvenil");}
            else if(idade >= 11 && idade <= 15 ){JOptionPane.showMessageDialog(null, "sua categoria é Adolescente");}
            else if(idade >= 16 && idade <= 30 ){JOptionPane.showMessageDialog(null, "sua categoria é adulto");}
            else {JOptionPane.showMessageDialog(null, "sua categoria é Senior");}



        }
    }

