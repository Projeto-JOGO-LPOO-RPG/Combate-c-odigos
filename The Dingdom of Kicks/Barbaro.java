public class Barbaro extends Jogador {
    public Barbaro(String nomeJogador, int nivel, int pontosNivel) {
        super(nomeJogador, nivel, pontosNivel, "Bárbaro", 12, 8, 11, 5, 50, 50, 7, 1, true);
    }

    public void atacarEspecial() {
        this.setPontosAtaque(2 * getPontosAtaque());
    }
}