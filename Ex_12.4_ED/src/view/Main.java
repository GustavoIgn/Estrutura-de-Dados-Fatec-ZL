package view;

import controller.PlayerController;
import javax.swing.JOptionPane;
import model.ListaSet;
import model.Musica;

public class Main {

    public static void main(String[] args) {

        PlayerController pCont = new PlayerController();
        ListaSet<Musica> lista = new ListaSet<>();

        int opc = 0;
        while (opc != 9) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n1- Adicionar música \n2- Remover música \n3- Reproduzir playlist \n9- Sair"));
            switch (opc) {
                case 1:
                    String musica = JOptionPane.showInputDialog("Digite o nome da música no formato 'Nome_da_musica;nome_artista;duracao':");
                    pCont.adicionarMusica(lista, musica);
                    break;
                case 2:
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música:"));
                    pCont.removerMusica(lista, posicao);
                    break;
                case 3:
                    pCont.executarPlaylist(lista);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número inválido!");
                    break;
            }
        }
    }

}
