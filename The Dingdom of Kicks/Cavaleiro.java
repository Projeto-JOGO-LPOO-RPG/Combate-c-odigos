public class Cavaleiro extends Jogador {
    public Cavaleiro(String nomeJogador, int nivel, int pontosNivel) {
        super(nomeJogador, nivel, pontosNivel, "Cavaleiro", 10, 10, 9, 7, 50, 50, 6, 0, true);
    }

    public void atacarEspecial() {
        this.setPontosAtaque(2 * getPontosAtaque());
    }
}