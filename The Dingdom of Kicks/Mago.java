public class Mago extends Jogador {
    public Mago(String nomeJogador, int nivel, int pontosNivel) {
        super(nomeJogador, nivel, pontosNivel, "Mago", 8, 7, 
        5, 12, 50, 50, 5, 2, true);
    }

    public void atacarEspecial() {
        this.setPontosMagia(2 * getPontosMagia());
    }
}
