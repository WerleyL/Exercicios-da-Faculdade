import javax.swing.*;

public class vetorPratica {
    public static void main(String[] args) {
        int tamanho = 0;
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("insira o tamanho do vetor"));
        Integer[] vetor = new Integer[tamanho];
        int funcao = 0;
        int i = 0;
        String ordemC = "";
        String ordemD = "";
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("INSIRA O VETOR"));
        }
        while (funcao != 4) {
            funcao = Integer.parseInt(JOptionPane.showInputDialog("insira a funçao que deseja:" +
                    "\n 1 - mostrar ordem crescente" +
                    " \n2 - mostrar ordem decresnte" +
                    "\n 3 - buscar o vetor que determinado valor esta armazenado " +
                    "\n 4 - Sair "));
            //ORDEM CRESCENTE
            if (funcao == 1) {
                for (i = 0; i < vetor.length; i++) {

                    ordemC = ordemC + "," + vetor[i];
                }
                JOptionPane.showMessageDialog(null, "o vetor em ordem crescente é " + ordemC);

            } else if (funcao == 2) {


                for (i = vetor.length - 1; i >= 0; i--) {
                    ordemD = ordemD + "," + vetor[i];
                }
                JOptionPane.showMessageDialog(null, "o vetor em ordem decrescente é " + ordemD);

            } else if (funcao == 3) {
                Integer buscar = 0;
                Integer a = 1;
                while (buscar != -1) {
                    buscar = Integer.parseInt(JOptionPane.showInputDialog("Insira qual numero deseja buscar"));
                    i = 0;
                    a = 1;
                    for (i = 0; i < vetor.length; i++) {


                        if (buscar == vetor[i]) {
                            JOptionPane.showMessageDialog(null, "o vetor " + buscar + " esta no espaço: " + i);
                            a++;
                            ;
                            break;


                        }
                        if (a == 1) {
                            JOptionPane.showMessageDialog(null, "o numero: " + buscar + " não foi cadastrado");
                            break;

                        }


                    }
                }
            } else if (funcao == 4) {
                JOptionPane.showMessageDialog(null, "Obrigado por usar");

            } else {
                JOptionPane.showMessageDialog(null, "valor invalido");
            }
        }
    }
}


