package sp.senai.sp.jandira;

import sp.senai.sp.jandira.model.Jogador;

public class App {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        jogador.cadastrarJogador();

        System.out.println(jogador.getNome());
        System.out.println(jogador.getIdade());
        System.out.println(jogador.getNumeroCamisa());
        System.out.println(jogador.getPosicao());
        System.out.println(jogador.getCpf());
        System.out.println(jogador.getRg());
    }
}
