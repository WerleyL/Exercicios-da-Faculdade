import javax.swing.*;

public class Ex3L2 {public static void main(String[] args) {

    Integer entrada;
    Integer numeros = 0;
    Integer maior= 0 ;
    Integer menor= 0 ;

    for (numeros = 1; numeros <= 20; numeros++) {
        entrada = Integer.parseInt(JOptionPane.showInputDialog("insira um numero:"));
        if (entrada > maior)
            maior = entrada;
        else if (entrada < menor)
            menor = entrada;
    }
    JOptionPane.showMessageDialog(null, "o maior numero :" + maior + " e o menor" + menor);
}
}
