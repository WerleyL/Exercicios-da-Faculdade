import javax.swing.*;

public class Ex12 {
    public static void main(String[] args) {

        String livros = "";
        String todosLivros = "";
        int i = 0;
        int quantidade = 0;

        JOptionPane.showMessageDialog(null, "Esse programa é voltado ao cadastro de livros");
        while (i != 2) {
            i = Integer.parseInt(JOptionPane.showInputDialog("""
                    \sDeseja Continuar ?
                    1 - Sim
                    2 - Não"""));
            if (i == 1) {
                livros = JOptionPane.showInputDialog("Cadastre o filme ");
                quantidade++;
                todosLivros = todosLivros + ", " + livros;
                JOptionPane.showInputDialog("Insira agora as informaçoes do livro na ordem que for requisitada: Titulo, autor, ediçao, editora, ano de lançamento e genero \n Utilize a (,) para separar cada item");
            } else if (i == 2) {
                JOptionPane.showMessageDialog(null, "O total de livros é: " + quantidade + "São eles: " + todosLivros);
                i = 2;
            } else {
                JOptionPane.showMessageDialog(null, "opçao invalida");

            }
        }


    }
}
