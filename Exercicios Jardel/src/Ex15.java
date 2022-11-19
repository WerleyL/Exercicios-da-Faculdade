import javax.swing.*;
import java.util.ArrayList;

public class Ex15 {
    public static void main(String[] args) {


        ArrayList<String> livros = new ArrayList<String>();
        ArrayList<String> titulo = new ArrayList<String>();
        ArrayList<String> autor = new ArrayList<String>();
        ArrayList<String> edicao = new ArrayList<String>();
        ArrayList<String> editora = new ArrayList<String>();
        ArrayList<String> ano = new ArrayList<String>();
        ArrayList<String> genero = new ArrayList<String>();
        int i = -1;
        int parar = 0;
        int buscar = 0;


        while (parar != 3) {
            parar = Integer.parseInt(JOptionPane.showInputDialog("""
                    \sO que deseja  ?
                    1 - Cadastrar 
                    2 - Buscar Livros
                    3 - Sair"""));
            if (parar == 1) {
                for (; i < livros.size(); ) {
                    livros.add(JOptionPane.showInputDialog("Cadastre o livro "));
                    titulo.add(JOptionPane.showInputDialog("Cadastre o titulo "));
                    autor.add(JOptionPane.showInputDialog("Cadastre o autor "));
                    edicao.add(JOptionPane.showInputDialog("Cadastre o edicao "));
                    editora.add(JOptionPane.showInputDialog("Cadastre a editora "));
                    ano.add(JOptionPane.showInputDialog("Cadastre o ano de lançamento"));
                    genero.add(JOptionPane.showInputDialog("Cadastre o genero "));
                    i++;

                    break;
                }

            } else if (parar == 2) {
                buscar = Integer.parseInt(JOptionPane.showInputDialog("Qual livro deseja buscar as informações"));
                if (buscar >= 0 && buscar <= livros.size()) {
                    JOptionPane.showMessageDialog(null, "As informaloes sobre o livro: " + livros.get(buscar) + "são: " +
                            "\nTitulo: " + titulo.get(buscar) + "\n Autor: " + autor.get(buscar) + "\nEdição: " + edicao.get(buscar) + "\nEditora: " + editora.get(buscar) +
                            "\nAno de lançamento: " + ano.get(buscar) + "\nGenero: " + genero.get(buscar));
                } else {
                    JOptionPane.showMessageDialog(null, "valor invalido");
                }
            } else if (parar == 3) {
                JOptionPane.showMessageDialog(null, "Obrigado por usar");
            } else {
                JOptionPane.showMessageDialog(null, "opçao invalida");

            }
        }
    }
}


