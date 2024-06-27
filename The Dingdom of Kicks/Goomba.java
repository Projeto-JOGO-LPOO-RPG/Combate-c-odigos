public class Goomba extends Inimigo {
    public Goomba(String nomeInimigo, int dificuldadeInimigo) {
        super(1, "Goomba", 10, 
        9, 8, 20, 
        0, 0, 5, 
        0, true);
    
    }

    public void atacarEspecial() {
        this.setPontosAtaque(2 * getPontosAtaque());
    }
}