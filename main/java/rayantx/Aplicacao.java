package rayantx;

import rayantx.modelo.Tabuleiro;
import rayantx.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(5,5, 5);
        new TabuleiroConsole(tabuleiro);
    }
}
